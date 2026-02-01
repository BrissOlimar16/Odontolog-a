package Controlador;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ticket {
    
    public static void generaTicket() {
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rsDetalle = null;
        
        try {
            // 1. OBTENER EL ID DE LA ÚLTIMA VENTA
            conexion = Conectar.getConexion();
            String sqlUltimaVenta = "SELECT MAX(id_venta) as ultima_id FROM venta";
            ps = conexion.prepareStatement(sqlUltimaVenta);
            rs = ps.executeQuery();
            
            if (!rs.next() || rs.getInt("ultima_id") == 0) {
                JOptionPane.showMessageDialog(null, 
                    "No hay ventas registradas en la base de datos.",
                    "Sin ventas",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            int idVenta = rs.getInt("ultima_id");
            rs.close();
            ps.close();
            
            // 2. OBTENER DATOS DE LA ÚLTIMA VENTA
            String sqlVenta = "SELECT v.*, e.nombre as emp_nombre, e.apellido as emp_apellido, " +
                             "c.nombre as cli_nombre, c.apellido as cli_apellido, c.tipo_cliente " +
                             "FROM venta v " +
                             "LEFT JOIN empleado e ON v.id_empleado = e.id_empleado " +
                             "LEFT JOIN cliente c ON v.id_cliente = c.id_cliente " +
                             "WHERE v.id_venta = ?";
            
            ps = conexion.prepareStatement(sqlVenta);
            ps.setInt(1, idVenta);
            rs = ps.executeQuery();
            
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, 
                    "No se encontró la venta con ID: " + idVenta,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Datos de la venta
            Timestamp fechaHora = rs.getTimestamp("fechahora");
            double totalVenta = rs.getDouble("total");
            String nombreEmpleado = rs.getString("emp_nombre");
            String apellidoEmpleado = rs.getString("emp_apellido");
            String nombreCliente = rs.getString("cli_nombre");
            String apellidoCliente = rs.getString("cli_apellido");
            String tipoCliente = rs.getString("tipo_cliente");
            
            rs.close();
            ps.close();
            
            // 3. OBTENER DETALLES DE LA ÚLTIMA VENTA
            // Primero intentar con productos individuales
            String sqlDetalle = "SELECT dpv.*, p.nombre as producto_nombre " +
                               "FROM detalle_producto_venta dpv " +
                               "JOIN producto p ON dpv.id_producto = p.id_producto " +
                               "WHERE dpv.id_venta = ?";
            
            ps = conexion.prepareStatement(sqlDetalle);
            ps.setInt(1, idVenta);
            rsDetalle = ps.executeQuery();
            
            // Si no hay productos, buscar paquetes
            if (!rsDetalle.isBeforeFirst()) {
                rsDetalle.close();
                ps.close();
                
                sqlDetalle = "SELECT dpv.*, paq.nombre as producto_nombre " +
                            "FROM detalle_paquete_venta dpv " +
                            "JOIN paquete paq ON dpv.id_paquete = paq.id_paquete " +
                            "WHERE dpv.id_venta = ?";
                
                ps = conexion.prepareStatement(sqlDetalle);
                ps.setInt(1, idVenta);
                rsDetalle = ps.executeQuery();
            }
            
            // Verificar si hay detalles
            if (!rsDetalle.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, 
                    "La última venta no tiene detalles registrados.",
                    "Sin detalles",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            // 4. CONSTRUIR EL TICKET
            StringBuilder ticket = new StringBuilder();
            
            // ENCABEZADO INSTITUCIONAL
            ticket.append("*".repeat(45)).append("\n");
            ticket.append(centrarTexto("UNIVERSIDAD DE LA SIERRA SUR", 45)).append("\n");
            ticket.append(centrarTexto("CLÍNICA ODONTOLÓGICA", 45)).append("\n");
            ticket.append("*".repeat(45)).append("\n");
            ticket.append("Calle Guillermo Rojas Mijangos S/N\n");
            ticket.append("Esq. Av. Universidad, Col. Ciudad Universitaria\n");
            ticket.append("Miahuatlán de Porfirio Díaz, Oaxaca, México\n");
            ticket.append("-".repeat(45)).append("\n");
            
            // INFORMACIÓN DE VENTA
            ticket.append("FOLIO: ").append(String.format("TKT-%08d", idVenta)).append("\n");
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fechaFormateada = sdf.format(fechaHora);
            ticket.append("FECHA: ").append(fechaFormateada).append("\n");
            
            if (nombreEmpleado != null) {
                String nombreCompletoEmpleado = nombreEmpleado;
                if (apellidoEmpleado != null) {
                    nombreCompletoEmpleado += " " + apellidoEmpleado;
                }
                ticket.append("ATENDIÓ: ").append(nombreCompletoEmpleado).append("\n");
            }
            
            ticket.append("-".repeat(45)).append("\n");
            
            // DETALLES DE LA COMPRA
            ticket.append("CONCEPTO                     CANT    P.UNIT    IMPORTE\n");
            ticket.append("-".repeat(45)).append("\n");
            
            double totalCalculado = 0.0;
            
            // Procesar cada detalle
            while (rsDetalle.next()) {
                String nombreProducto = rsDetalle.getString("producto_nombre");
                int cantidad = rsDetalle.getInt("cantidad");
                double precioUnitario = rsDetalle.getDouble("precio_aplicado");
                
                // CALCULAR IMPORTE = PRECIO UNITARIO × CANTIDAD
                double importe = precioUnitario * cantidad;
                totalCalculado += importe;
                
                // Truncar descripción si es muy larga
                String descripcionTicket = nombreProducto.length() > 25 ? 
                    nombreProducto.substring(0, 22) + "..." : nombreProducto;
                
                ticket.append(String.format("%-25s %4d %9.2f %10.2f\n", 
                    descripcionTicket, cantidad, precioUnitario, importe));
            }
            
            rsDetalle.close();
            ps.close();
            
            ticket.append("-".repeat(45)).append("\n");
            
            // USAR EL TOTAL DE LA BASE DE DATOS
            double totalFinal = totalVenta;
            
            // Verificar si hay diferencia entre el total calculado y el de la BD
            if (Math.abs(totalCalculado - totalVenta) > 0.01) {
                System.out.println("Aviso: Hay diferencia entre total calculado y BD");
                System.out.println("Calculado: " + totalCalculado + " | BD: " + totalVenta);
                // Usar el de la BD como referencia principal
                totalFinal = totalVenta;
            }
            
            // SOLO MOSTRAR EL TOTAL (sin subtotal ni IVA)
            ticket.append(String.format("%33s %12.2f\n", "TOTAL:", totalFinal));
            ticket.append("-".repeat(45)).append("\n");
            
            // INFORMACIÓN DE PAGO
            ticket.append("MONTO TOTAL: $").append(String.format("%.2f", totalFinal)).append("\n");
            ticket.append("FORMA DE PAGO: Registrada en sistema\n");
            ticket.append("-".repeat(45)).append("\n");
            
            // DATOS DEL PACIENTE (si existe)
            if (nombreCliente != null && !nombreCliente.isEmpty()) {
                ticket.append("<< DATOS DEL PACIENTE >>\n");
                ticket.append("NOMBRE: ").append(nombreCliente);
                
                if (apellidoCliente != null && !apellidoCliente.isEmpty()) {
                    ticket.append(" ").append(apellidoCliente);
                }
                ticket.append("\n");
                
                if (tipoCliente != null && !tipoCliente.isEmpty()) {
                    ticket.append("TIPO: ").append(tipoCliente).append("\n");
                }
                
                ticket.append("-".repeat(45)).append("\n");
            }
            
            ticket.append(centrarTexto("¡GRACIAS POR SU PREFERENCIA!", 45)).append("\n");
            ticket.append(centrarTexto("VUELVA PRONTO", 45)).append("\n");
            ticket.append("*".repeat(45)).append("\n");
            ticket.append(centrarTexto("SERVICIO ODONTOLÓGICO UNIVERSITARIO", 45)).append("\n");
            ticket.append(centrarTexto("TEL: UNS-951 572 4100", 45)).append("\n");
            ticket.append("*".repeat(45)).append("\n");
            
            // 5. GUARDAR EL TICKET EN ARCHIVO
            JFileChooser chooser = new JFileChooser();
            
            // Nombre predeterminado del archivo
            String nombrePredeterminado = "TICKET_" + idVenta + ".txt";
            chooser.setSelectedFile(new File(nombrePredeterminado));
            
            // Configurar el diálogo de guardado
            chooser.setDialogTitle("Guardar ticket de la última venta");
            chooser.setApproveButtonText("Guardar Ticket");
            
            // Mostrar el diálogo de guardado
            int opcion = chooser.showSaveDialog(null);
            
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = chooser.getSelectedFile();
                
                // Asegurar que tenga extensión .txt
                if (!archivo.getName().toLowerCase().endsWith(".txt")) {
                    archivo = new File(archivo.getAbsolutePath() + ".txt");
                }
                
                // Guardar el archivo
                try (FileWriter fw = new FileWriter(archivo)) {
                    fw.write(ticket.toString());
                    
                    // Mostrar mensaje de confirmación
                    JOptionPane.showMessageDialog(null, 
                        "✅ Ticket generado exitosamente\n" +
                        "🎫 Folio: TKT-" + String.format("%08d", idVenta) + "\n" +
                        "💰 Total: $" + String.format("%.2f", totalFinal) + "\n" +
                        "📅 Fecha: " + fechaFormateada + "\n" +
                        "📄 Archivo: " + archivo.getName(),
                        "Ticket Generado",
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    // Mostrar en consola
                    System.out.println("=== TICKET GENERADO ===");
                    System.out.println("Venta ID: " + idVenta);
                    System.out.println("Fecha: " + fechaFormateada);
                    System.out.println("Total: $" + totalFinal);
                    System.out.println("Guardado en: " + archivo.getAbsolutePath());
                    System.out.println("=======================\n");
                    
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, 
                        "❌ Error al guardar el archivo:\n" + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Mostrar información aunque no se guarde
                JOptionPane.showMessageDialog(null, 
                    "Información de la última venta:\n" +
                    "Folio: TKT-" + String.format("%08d", idVenta) + "\n" +
                    "Fecha: " + fechaFormateada + "\n" +
                    "Total: $" + String.format("%.2f", totalFinal) + "\n" +
                    "Ticket no guardado en archivo.",
                    "Información de Venta",
                    JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                "❌ Error de base de datos:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "❌ Error inesperado:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            
        } finally {
            // Cerrar recursos
            try {
                if (rsDetalle != null) rsDetalle.close();
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static String centrarTexto(String texto, int ancho) {
        if (texto.length() >= ancho) return texto;
        int espacios = (ancho - texto.length()) / 2;
        return " ".repeat(espacios) + texto;
    }
}