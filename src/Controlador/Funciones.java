package Controlador;

import static Controlador.Conectar.getConexion;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import odontologia.Interfaz;
import static odontologia.Nuevo_Cliente.t2;
import odontologia.Productos;

public class Funciones extends Interfaz {
    public static void limpiaTabla(DefaultTableModel t){
        int a=t.getRowCount();  
        while(a!=0){ // Ciclo para Borrar la Tabla 1
            if(a!=0)
                t.removeRow(0);                      
            a=t.getRowCount();        
        }          
    }
    
    public static void consultarU(String query, DefaultTableModel t){
        java.sql.ResultSet r= new Controlador.Conectar().consultas(query); 
        int i=1;
        try{                      
            while(r.next())
            {
                String x=r.getString("nombre")+" "+evaluarnull(r.getString("descripcion"));
                id=r.getString("id_producto");
                linea[0]=id;
                linea[1]=x;
                linea[2] = String.valueOf(r.getDouble("Costo"));
                linea[3] = String.valueOf(r.getDouble("Precio"));
                linea[4]=r.getString("existencias");
                t.addRow(linea);   
                i=i+1;
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    public static void consultarP(String query, DefaultTableModel t){
        java.sql.ResultSet r= new Controlador.Conectar().consultas(query); 
        int i=1;
        try{                      
            while(r.next())
            {
                String x=r.getString("nombre")+" "+evaluarnull(r.getString("descripcion"));
                id=r.getString("id_producto");
                linea[0]=id;
                linea[1]=x;
                linea[2] = String.valueOf(r.getDouble("precio"));
                linea[3]=r.getString("existencias");
                t.addRow(linea);   
                i=i+1;
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    public static void consultarC (String query, DefaultTableModel t){
        java.sql.ResultSet r= new Controlador.Conectar().consultas(query); 
        int i=1;
        try{                      
            while(r.next())
            {
                id=r.getString("id_cliente");
                linea[0]=id;
                linea[1]=r.getString("nombre_completo");
                t.addRow(linea);   
                i=i+1;
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    private static String evaluarnull(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "";
        }
        return " - " + value;
    }
    
    public static int generarNum() {
        return ThreadLocalRandom.current().nextInt(10_000_000, 100_000_000);
    }
    
    public static void buscando(String buscar) {
        limpiaTabla(t1);
        if (!buscar.trim().isEmpty()) {
            String query = "SELECT p.id_producto, p.nombre, p.descripcion, p.existencias, pp.precio " +
                           "FROM producto p JOIN precioproducto pp ON p.id_producto = pp.id_producto " +
                           "WHERE pp.tipoCliente = 'externo' AND (p.id_producto ILIKE '%" + buscar + "%' OR " +
                           "p.nombre ILIKE '%" + buscar + "%' OR " + "p.descripcion ILIKE '%" + buscar + "%') ORDER BY p.id_producto";
            consultarP(query, t1);
        }
    }
    
    public static void buscandoCliente(String busca){
        limpiaTabla(t2);
        if (!busca.trim().isEmpty()) {
            String query = "SELECT id_cliente, nombre || ' ' || apellido AS nombre_completo, correo, telefono FROM cliente " +
                            "WHERE CAST(id_cliente AS TEXT) LIKE '%" + busca + "%' " +
                            "OR nombre ILIKE '%" + busca + "%' OR apellido ILIKE '%" + busca + "%' " +
                            "OR (nombre || ' ' || apellido) ILIKE '%" + busca + "%' ORDER BY nombre ASC";
            consultarC(query, t2);
        }
    }
    
    public static void registrarEmpleado(boolean matutinoSeleccionado,
        Date horaInicio,
        Date horaFin,
        int idEmpleado,
        String nombre,
        String apellidos,
        String telefono,
        String correo,
        String rolSeleccionado,
        String contraseña,
        Component jdialog ){
         
        try {
            // 1. TURNO
            String turno = matutinoSeleccionado ? "Matutino" : "Vespertino";
            Time hora = new Time(horaInicio.getTime());
            Time hora1 = new Time(horaFin.getTime());

            int idTurno = Controlador.Conectar.turnoBD(turno, hora, hora1);

            if (idTurno == -1) {
                JOptionPane.showMessageDialog(jdialog, "Error al crear turno");
                return;
            }

            // 2. EMPLEADO
            Controlador.Conectar.datosEmpleado(
                    idEmpleado,
                    nombre,
                    apellidos,
                    telefono,
                    correo,
                    idTurno
            );

            // 3. USUARIO Y ROL
            String nombreUsuario = nombre.toLowerCase().trim() + idEmpleado;

            Controlador.Conectar.CrearRol(
                    nombreUsuario,
                    contraseña,
                    rolSeleccionado,
                    idEmpleado
            );

            JOptionPane.showMessageDialog(
                    jdialog,
                    "¡Guardado con éxito!\nUsuario: " + nombreUsuario
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(jdialog, "La matrícula debe ser numérica.");
        } catch (Exception e) {
            if (e.getMessage().contains("duplicate key")) {
                JOptionPane.showMessageDialog(jdialog, "Esa matrícula ya está registrada.");
            } else {
                JOptionPane.showMessageDialog(jdialog, "Error inesperado: " + e.getMessage());
            }
        }
    
    } 
    
    
    public static void eliminarEmpleado(String Matricula, Component jdialog){
        int id = Integer.parseInt(Matricula);
        int respuesta = JOptionPane.showConfirmDialog(jdialog, "¿Estás seguro de eliminar al empleado y su acceso?");

        if (respuesta == JOptionPane.YES_OPTION) {
            Controlador.Conectar.eliminarEmpleadoCompleto(id);
        }
    }
    

    
    public static void editarEmpleado(
            int idEmpleado,
            String nombre,
            String apellidos,
            String telefono,
            String correo,
            Component jdialog
    ) {
        try {
            boolean actualizado = Controlador.Conectar.actualizarEmpleado(
                    idEmpleado,
                    nombre,
                    apellidos,
                    telefono,
                    correo
            );

            if (actualizado) {
                JOptionPane.showMessageDialog(
                        jdialog,
                        "Datos del empleado actualizados correctamente"
                );
            } else {
                JOptionPane.showMessageDialog(
                        jdialog,
                        "No se encontró el empleado para actualizar"
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    jdialog,
                    "Error al actualizar empleado: " + e.getMessage()
            );
        }
    }
    
    public static void cargarEmpleadosEnTabla(JTable tabla) {

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setRowCount(0);

            modelo.addColumn("Matrícula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Correo");
            modelo.addColumn("Turno");

            try (ResultSet rs = Conectar.consultarEmpleados()) {

                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getInt("id_empleado"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefonoo"),
                        rs.getString("correo"),
                        rs.getString("nombreturno")
                    });
                }

                tabla.setModel(modelo);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error al consultar empleados: " + e.getMessage()
                );
            }
        }

    public static void eliminarProducto(String idProducto, Component jdialog) throws SQLException{
        //int id = Integer.parseInt(Matricula);
        int respuesta = JOptionPane.showConfirmDialog(jdialog, "¿Estás seguro de eliminar el producto?");
        if (respuesta == JOptionPane.YES_OPTION) {
            Controlador.Conectar.eliminarProducto(idProducto);
            JOptionPane.showMessageDialog(jdialog, "Producto eliminado ");
        }
    }
    
    public static List<Producto> obtenerProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT id_producto, nombre FROM producto";

        try (Connection con = Controlador.Conectar.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getString("id_producto"));
                p.setNombre(rs.getString("nombre"));
                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    

    public static void TablaPaquetes(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Tratamiento");
        modelo.addColumn("Grupo");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Externo");
        modelo.addColumn("Precio Interno");

        String sql = """
            SELECT 
                p.id_paquete AS codigo,
                p.nombre AS tratamiento,
                p.grupo,
                MIN(FLOOR(pr.existencias / dp.cantidad)) AS cantidad,
                MAX(pe.precio) AS precio_externo,
                MAX(pi.precio) AS precio_interno
            FROM paquete p
            JOIN detallepaquete dp ON p.id_paquete = dp.id_paquete
            JOIN producto pr ON dp.id_producto = pr.id_producto
            LEFT JOIN preciopaquete pe 
                ON p.id_paquete = pe.id_paquete AND pe.tipo_cliente = 'Externo'
            LEFT JOIN preciopaquete pi 
                ON p.id_paquete = pi.id_paquete AND pi.tipo_cliente = 'Interno'
            GROUP BY p.id_paquete, p.nombre, p.grupo
        """;

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("codigo"),
                    rs.getString("tratamiento"),
                    rs.getString("grupo"),
                    rs.getInt("cantidad"),           // 👈 paquetes disponibles
                    rs.getDouble("precio_externo"),
                    rs.getDouble("precio_interno")
                };
                modelo.addRow(fila);
            }

            tabla.setModel(modelo);
            tabla.revalidate();
            tabla.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    
}
