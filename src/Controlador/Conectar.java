
package Controlador;
import java.sql.*;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conectar {
    public static  Connection c;   
    private static Connection c2;
    public static Connection server_con;
    private static Connection u;
    public static String MENSAJE="";
    //private String host="localhost:5432";
    //private String dbname="Odontologia";
    //private String passwd="101621";
   // private String passwd="david";
//    String url="jdbc:postgresql://"+host+"/"+dbname;
    public static String url="jdbc:postgresql://dpg-d5i8d6l6ubrc738ejqi0-a.oregon-postgres.render.com:5432/odontologia_826x?sslmode=require";
    public static String user = "odontologia_826x_user";
    public static String passwd="I5znXKCM0OmDQxu5oFbYtdavNJp6XMXs";
    public static String URL="jdbc:postgresql://dpg-d5i8d6l6ubrc738ejqi0-a.oregon-postgres.render.com:5432/odontologia_826x?sslmode=require";

    
    public static java.sql.Connection conectaBD(){
        //String url="jdbc:postgresql://"+host+"/"+dbname;
        MENSAJE="";
        try{
           // c=DriverManager.getConnection(url,"postgres",passwd);
           c=DriverManager.getConnection(url, user,passwd);
        }catch(SQLException ex) {
            MENSAJE=ex.getMessage();
            System.out.println(MENSAJE);
        }        
        return c;
    }
    

    public java.sql.ResultSet consultas(String consul){
        java.sql.ResultSet r=null;
        try {
            java.sql.Statement stm= getConexion().createStatement();
            r = stm.executeQuery(consul); 
        }catch(SQLException e){
           System.out.println(e.getMessage());
        }
        return r;
    }
    
    public void ejecutar(String stm){
        try{
            MENSAJE="";
            Statement s=getConexion().createStatement();
            s.executeUpdate(stm);
        }catch(SQLException e ){
            MENSAJE=e.getMessage();
        }
    }
    
      
    public static Connection getConexion() throws SQLException {
        if (c == null || c.isClosed()) {
            c = DriverManager.getConnection(url, user, passwd);
        }
        return c;
    }

    public void llenarComboUsuarios(JComboBox combo) {
        String sql = "SELECT rol FROM usuarios";
        java.sql.ResultSet rs = consultas(sql);
        try{                
            combo.removeAllItems(); 
            combo.addItem("Seleccione un usuario");
            while (rs.next()) {
                combo.addItem(rs.getString("rol"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar usuarios: " + e.getMessage());
        }
    }   

    public String validarUser(String usuario, String pass) {
        String rol = null;
        String sql = "SELECT rol FROM usuarios WHERE username = ? AND password = ?";

        try (Connection cn = conectaBD();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, usuario);
            pst.setString(2, pass);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                rol = rs.getString("rol");
            }

        } catch (SQLException e) {
            System.err.println("Error en la validación: " + e.getMessage());
        }
        return rol;
    }

    public static boolean finalizarVenta(double total, int idEmpleado, int idCliente, List<DetalleVenta> productos) {
        String sqlVenta = "INSERT INTO venta (fechahora, total, id_empleado, id_cliente) VALUES (NOW(), ?, ?, ?) RETURNING id_venta";
        String sqlDetalle = "INSERT INTO detalle_producto_venta (id_venta, id_producto, cantidad, precio_aplicado, subtotal) VALUES (?, ?, ?, ?, ?)";

        Connection cn = null;
        try {
            cn = getConexion();
            cn.setAutoCommit(false); 

            PreparedStatement pstVenta = cn.prepareStatement(sqlVenta);
            pstVenta.setDouble(1, total);
            pstVenta.setInt(2, idEmpleado);
            pstVenta.setInt(3, idCliente);
            ResultSet rs = pstVenta.executeQuery();

            int idVenta = 0;
            if (rs.next()) idVenta = rs.getInt(1);

            PreparedStatement pstDetalle = cn.prepareStatement(sqlDetalle);
            for (DetalleVenta p : productos) {
                pstDetalle.setInt(1, idVenta);
                pstDetalle.setString(2, p.getId());
                pstDetalle.setInt(3, p.getCantidad());
                pstDetalle.setDouble(4, p.getPrecio());
                pstDetalle.setDouble(5, p.getSubtotal());
                pstDetalle.addBatch();
            }
            pstDetalle.executeBatch();
            cn.commit();
            return true;
        } catch (SQLException e) {
            try { if(cn != null) cn.rollback(); } catch (SQLException ex) {}
            MENSAJE = e.getMessage();
            return false;
        }
    }
}