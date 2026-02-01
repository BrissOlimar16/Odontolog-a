
package Controlador;

import javax.swing.JOptionPane;

public class Ticket {
    
    public static void generaTicket(){
        try {
        // Datos de ejemplo
        int idVenta = 12345;
        String nombreCliente = "MARÍA GUADALUPE";
        String apellidoCliente = "MARTÍNEZ HERNÁNDEZ";
        String matricula = "2024005678";
        String tipoCliente = "ESTUDIANTE UNSIS";
        
        // Construir ticket
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
        ticket.append("FECHA: ").append(new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date())).append("\n");
        ticket.append("-".repeat(45)).append("\n");
        
        
        // DETALLES DE LA COMPRA
        ticket.append("CONCEPTO                     CANT    P.UNIT    IMPORTE\n");
        ticket.append("-".repeat(45)).append("\n");
        ticket.append(String.format("%-25s %4d %9.2f %10.2f\n", "CONSULTA ODONTOLÓGICA", 1, 250.00, 250.00));
        ticket.append(String.format("%-25s %4d %9.2f %10.2f\n", "RADIOGRAFÍA PERIAPICAL", 2, 75.00, 150.00));
        ticket.append(String.format("%-25s %4d %9.2f %10.2f\n", "AMALGAMA DENTAL", 1, 120.00, 120.00));
        ticket.append(String.format("%-25s %4d %9.2f %10.2f\n", "PROFILAXIS DENTAL", 1, 300.00, 300.00));
        ticket.append("-".repeat(45)).append("\n");
        
        // TOTALES
        double subtotal = 820.00;
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        
        ticket.append(String.format("%33s %12.2f\n", "SUBTOTAL:", subtotal));
        ticket.append(String.format("%33s %12.2f\n", "IVA (16%):", iva));
        ticket.append(String.format("%33s %12.2f\n", "TOTAL:", total));
        ticket.append("-".repeat(45)).append("\n");
        
        // INFORMACIÓN DE PAGO
        ticket.append("EFECTIVO RECIBIDO: $850.00\n");
        ticket.append("CAMBIO: $").append(String.format("%.2f", 850.00 - total)).append("\n");
        ticket.append("ATENDIÓ: Dra. Ana Rodríguez\n");
        ticket.append("-".repeat(45)).append("\n");
        
        // PIE CON DATOS DEL CLIENTE (ANTES DE GRACIAS)
        // DATOS DEL CLIENTE (SECCIÓN ESPECIAL)
        ticket.append("<< DATOS DEL PACIENTE >>\n");
        ticket.append("NOMBRE: ").append(nombreCliente).append("\n");
        ticket.append("APELLIDOS: ").append(apellidoCliente).append("\n");
        ticket.append("MATRÍCULA/FOLIO: ").append(matricula).append("\n");
        ticket.append("TIPO: ").append(tipoCliente).append("\n");
        
        ticket.append("-".repeat(45)).append("\n");
        ticket.append(centrarTexto("¡GRACIAS POR SU PREFERENCIA!", 45)).append("\n");
        ticket.append(centrarTexto("VUELVA PRONTO", 45)).append("\n");
        ticket.append("*".repeat(45)).append("\n");
        ticket.append(centrarTexto("SERVICIO ODONTOLÓGICO UNIVERSITARIO", 45)).append("\n");
        ticket.append(centrarTexto("TEL: UNS-951 572 4100", 45)).append("\n");
        ticket.append("*".repeat(45)).append("\n");
        
        // Guardar archivo
        String nombreArchivo = "TICKET_" + matricula + "_" + idVenta + ".txt";
        java.io.FileWriter fw = new java.io.FileWriter(nombreArchivo);
        fw.write(ticket.toString());
        fw.close();
        
        // Mostrar
        System.out.println(ticket.toString()); // Para ver en consola
        JOptionPane.showMessageDialog(null, 
            "Ticket generado: " + nombreArchivo + "\n" +
            "Cliente: " + nombreCliente + " " + apellidoCliente + "\n" +
            "Matrícula: " + matricula,
            "Ticket Generado",
            JOptionPane.INFORMATION_MESSAGE);
            
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }
    
    public static String centrarTexto(String texto, int ancho) {
    if (texto.length() >= ancho) return texto;
    int espacios = (ancho - texto.length()) / 2;
    return " ".repeat(espacios) + texto;
}
    
}
