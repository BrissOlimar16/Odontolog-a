package Controlador;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
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
}
