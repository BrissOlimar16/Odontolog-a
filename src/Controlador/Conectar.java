
package Controlador;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    public java.sql.Connection conectaServidor(){
        try {
            MENSAJE="";
            //String url = "jdbc:postgresql://"+host;
            //server_con=java.sql.DriverManager.getConnection(url,"postgres",passwd);
            server_con=java.sql.DriverManager.getConnection(url, user, passwd);
            System.out.println(url);
        }catch (SQLException ex) {
            MENSAJE=ex.getMessage();
        }
        return server_con;
    }
    
    public java.sql.Connection conectaBD(){
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
            java.sql.Statement stm= c.createStatement();
            r = stm.executeQuery(consul); 
        }catch(SQLException e){
           System.out.println(e.getMessage());
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
    
//    public static boolean ConectarUsuario(String usuario, String contraseña){
//        
//        if(usuario == null || usuario.isEmpty()){
//            JOptionPane.showMessageDialog(null, "Ingrese un usuario");
//            return false;
//        }
//        if(contraseña.isEmpty()){
//            JOptionPane.showMessageDialog(null, "Ingrese su contraseña");
//            return false;
//        }
//        //try (Connection con = DriverManager.getConnection("jdbc:postgresql://\"+host+\"/\"+dbname",usuario,contraseña)){
//         try (Connection con = DriverManager.getConnection(URL,usuario,contraseña)){  
//            u=con;
//            System.out.println("Conexión establecida correctamente");
//            return true;
//        }
//        catch(SQLException e){
//            System.out.println("Error al conectar: " + e.getMessage());
//            return false;
//        }
//    }
    
    public String validarUsuario(String user, String pass) {
    String sql = "SELECT rol FROM usuarios WHERE username = ? AND password = ?";
    try (Connection con = conectaBD();
         PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, user);
        pst.setString(2, pass);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return rs.getString("rol"); // Retorna 'Administrador' o 'Cajero'
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Usuario o clave incorrecta
}
    
    
    public static int turnoBD(String turno, java.sql.Time hora, java.sql.Time hora1){
    String sql = "INSERT INTO turno (nombreturno, horainicio, horafin) VALUES (?, ?, ?);";
    try(PreparedStatement pstm = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        pstm.setString(1, turno);
        pstm.setTime(2, hora);
        pstm.setTime(3, hora1);
        pstm.executeUpdate();
        ResultSet rs = pstm.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);  // se obtiene el id_turno generado
        }
    } catch (SQLException e) {
        System.out.println("Error al insertar turno: " + e.getMessage());
    }
    return -1; 
}


   public static void datosEmpleado(int matricula, String nombre, String apellidos, String telefono, String correo, int idTurno){
    String sql = "INSERT INTO empleado (id_empleado, nombre, apellido, telefonoo, correo, id_turno) VALUES (?, ?, ?, ?, ?, ?);";
    try(PreparedStatement pstm = c.prepareStatement(sql)) {
        pstm.setInt(1, matricula);
        pstm.setString(2, nombre);
        pstm.setString(3, apellidos);
        pstm.setString(4, telefono);
        pstm.setString(5, correo);
        pstm.setInt(6, idTurno);
        pstm.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error al insertar empleado: " + e.getMessage());
    }
}

    
//    public static void CrearRol(String usuario, String contraseña){
//        String sql = "CREATE ROLE " + usuario + " WITH LOGIN PASSWORD '" + contraseña + "' CREATEROLE;";
//        try (PreparedStatement pstm = c.prepareStatement(sql)) {
//            pstm.executeUpdate();
//            System.out.println("Se creó el nuevo rol");
//        } 
//        catch (SQLException e) {
//            System.out.println("Error al crear el rol: " + e.getMessage());
//        }
//    }
    
   
   public static void CrearRol(String usuario, String contraseña, String rol, int idEmpleado) {
        String sql = "INSERT INTO usuarios (username, password, rol, id_empleado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, contraseña);
            pstm.setString(3, rol); // 'Administrador' o 'Cajero'
            pstm.setInt(4, idEmpleado);
            
            pstm.executeUpdate();
            System.out.println("Usuario " + usuario + " registrado con éxito en la tabla.");
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }
   
   
   
   
    public static int obtenerTurnoDeEmpleado(int idEmpleado) {
        String sql = "SELECT id_turno FROM empleado WHERE id_empleado = ?";
        try (PreparedStatement pstm = c.prepareStatement(sql)) {
            pstm.setInt(1, idEmpleado);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_turno");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener turno: " + e.getMessage());
        }
        return -1; 
    }
    
    public static void EliminarEmpleado(int id){
        String sql="DELETE FROM empleado WHERE id_empleado=?;";
        try(PreparedStatement pstm = c.prepareStatement(sql)){
            pstm.setInt(1, id);
            int filas = pstm.executeUpdate();
            if (filas > 0) {
                System.out.println("Empleado eliminado correctamente");
            } else {
                System.out.println("No existe un empleado con ese ID");
            }
        }
        catch(SQLException e){
            System.out.println("Error al eliminar los datos del empleado: " + e.getMessage());
        }
    }
    
    public static void eliminarTurno(int idTurno) {
        String sql = "DELETE FROM turno WHERE id_turno = ?";
        try (PreparedStatement pstm = c.prepareStatement(sql)) {
            pstm.setInt(1, idTurno);
            pstm.executeUpdate();
            System.out.println("Turno eliminado");
        } catch (SQLException e) {
            System.out.println("Error al eliminar turno: " + e.getMessage());
        }
    }
    
    public static void eliminarET(int idEmpleado) {
    int idTurno = obtenerTurnoDeEmpleado(idEmpleado);
    if (idTurno == -1) {
        System.out.println("No se encontró turno para ese empleado");
        return;
    }
    EliminarEmpleado(idEmpleado);
    eliminarTurno(idTurno);
}
    
//   public static void EliminarRol(String usuario) {
//        String sql = "DROP ROLE \"" + usuario + "\";";
//        try (Statement stmt = c.createStatement()) {
//            stmt.executeUpdate(sql);
//            System.out.println("Rol eliminado correctamente");
//        } catch (SQLException e) {
//            System.out.println("Error al eliminar el rol: " + e.getMessage());
//        }
//    }
    
    public static void EliminarRol(String usuario) {
        String sql = "DELETE FROM usuarios WHERE username = ?";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, usuario);
            int filas = pstm.executeUpdate();
            if (filas > 0) System.out.println("Usuario eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar el usuario: " + e.getMessage());
        }
    }
    
    
   
        public static void EditarEmpleado(int id, String nombre, String apellido, String telefono, String correo) {
            String sql = "UPDATE empleado SET nombre = ?, apellido = ?, telefono = ?,correo=?, id_turno = ? WHERE id_empleado = ?";
            try (PreparedStatement pstm = c.prepareStatement(sql)) {
                pstm.setString(1, nombre);
                pstm.setString(2, apellido);
                pstm.setString(3, telefono);
                pstm.setString(4, correo);
                pstm.setInt(6, id);
                int filas = pstm.executeUpdate();
                if (filas > 0) {
                    System.out.println("Empleado actualizado correctamente");
                } else {
                    System.out.println("No se encontró el empleado con ese ID");
                }
            } 
            catch (SQLException e) {
                System.out.println("Error al actualizar el empleado: " + e.getMessage());
            }
        }
        

}

