
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
    private String dbname="Odontología";
    private String passwd="101621";
  
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
    
    public void creaBD(String stm){
        try {
            MENSAJE="";
            c2 = server_con;
            Statement s = c2.createStatement();
            s.executeUpdate(stm);
            c2.close();
        } catch (SQLException ex) {
            MENSAJE=ex.getMessage();
        }  
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
    
    
}
