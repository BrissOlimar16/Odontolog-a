
package Controlador;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conectar {
    public static  Connection c;   
    private static Connection c2;
    public static Connection server_con;
    public static String MENSAJE="";
    private String host="localhost:5432";
    private String dbname="Odontologia";
    private String passwd="101621";
    
    String url="jdbc:postgresql://"+host+"/"+dbname;
  
    public java.sql.Connection conectaServidor(){
        try {
            MENSAJE="";
            String url = "jdbc:postgresql://"+host;
            server_con=java.sql.DriverManager.getConnection(url,"postgres",passwd);
            System.out.println(url);
        }catch (SQLException ex) {
            MENSAJE=ex.getMessage();
        }
        return server_con;
    }
    
    public java.sql.Connection conectaBD(){
        String url="jdbc:postgresql://"+host+"/"+dbname;
        MENSAJE="";
        try{
            c=DriverManager.getConnection(url,"postgres",passwd);
        }catch(SQLException ex) {
            MENSAJE=ex.getMessage();
            System.out.println(MENSAJE);
        }        
        return c;
    }
    
    public java.sql.ResultSet consulta(String consul){
        java.sql.ResultSet r=null;
        MENSAJE="";
        try {
            java.sql.Statement stm= c.createStatement();
            r = stm.executeQuery(consul);
            System.out.println(consul);
        }catch(SQLException e){
            MENSAJE=e.getMessage();
        }
        return r;
    }
    
    public void ejecutar(String stm){
        try{
            MENSAJE="";
            Statement s=c.createStatement();
            s.executeUpdate(stm);
        }catch(SQLException e ){
            MENSAJE=e.getMessage();
        }
    }
    
    public static boolean ConectarAdmin(String usuario, String contraseña){
        if(usuario == null || usuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un usuario");
            return false;
        }
        if(contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese su contraseña");
            return false;
        }
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Odontologia",usuario,contraseña)){
            System.out.println("Conexión establecida correctamente");
            return true;
        }
        catch(SQLException e){
            System.out.println("Error al conectar: " + e.getMessage());
            return false;
        }
    }

}
