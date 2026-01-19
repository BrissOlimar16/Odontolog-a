package Controlador;

import java.awt.Color;
import java.awt.Component;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            // Aquí podrías actualizar tu JTable para que ya no aparezca
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

    
     
}
