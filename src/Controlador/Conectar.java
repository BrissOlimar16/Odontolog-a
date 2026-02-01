
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
//    String sql = "INSERT INTO turno (nombreturno, horainicio, horafin) VALUES (?, ?, ?);";
//    try(PreparedStatement pstm = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
//        pstm.setString(1, turno);
//        pstm.setTime(2, hora);
//        pstm.setTime(3, hora1);
//        pstm.executeUpdate();
//        ResultSet rs = pstm.getGeneratedKeys();
//        if (rs.next()) {
//            return rs.getInt(1);  // se obtiene el id_turno generado
//        }
//    } catch (SQLException e) {
//        System.out.println("Error al insertar turno: " + e.getMessage());
//    }
//    return -1; 


        try {
            if (c == null || c.isClosed()) {
                // Aquí intenta conectar si la conexión se perdió o no existe
                new Conectar().conectaBD(); 
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión previa: " + e.getMessage());
        }

        String sql = "INSERT INTO turno (nombreturno, horainicio, horafin) VALUES (?, ?, ?);";

        // El RETURN_GENERATED_KEYS es para obtener el ID que Render asigne automáticamente
        try (PreparedStatement pstm = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, turno);
            pstm.setTime(2, hora);
            pstm.setTime(3, hora1);

            pstm.executeUpdate();

            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // Retorna el ID generado por la secuencia
            }
        } catch (SQLException e) {
            // ¡ESTO ES LO MÁS IMPORTANTE! Revisa la consola de NetBeans para ver este mensaje:
            System.out.println("ERROR REAL EN TURNO_BD: " + e.getMessage());
            e.printStackTrace(); 
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
    
    
    public static void eliminarEmpleadoCompleto(int idEmpleado) {
        try {
            // Asegurar conexión
            if (c == null || c.isClosed()) new Conectar().conectaBD();

            // 1. Obtener el ID del turno antes de borrar al empleado
            int idTurno = obtenerTurnoDeEmpleado(idEmpleado);

            // 2. Eliminar de la tabla USUARIOS (el hijo más lejano)
            String sqlUsuario = "DELETE FROM usuarios WHERE id_empleado = ?";
            try (PreparedStatement pstU = c.prepareStatement(sqlUsuario)) {
                pstU.setInt(1, idEmpleado);
                pstU.executeUpdate();
                System.out.println("Usuario de acceso eliminado.");
            }

            // 3. Eliminar de la tabla EMPLEADO
            String sqlEmpleado = "DELETE FROM empleado WHERE id_empleado = ?";
            try (PreparedStatement pstE = c.prepareStatement(sqlEmpleado)) {
                pstE.setInt(1, idEmpleado);
                pstE.executeUpdate();
                System.out.println("Datos del empleado eliminados.");
            }

            // 4. Eliminar de la tabla TURNO (el padre original)
            if (idTurno != -1) {
                String sqlTurno = "DELETE FROM turno WHERE id_turno = ?";
                try (PreparedStatement pstT = c.prepareStatement(sqlTurno)) {
                    pstT.setInt(1, idTurno);
                    pstT.executeUpdate();
                    System.out.println("Turno del empleado eliminado.");
                }
            }

            JOptionPane.showMessageDialog(null, "Empleado y todos sus registros eliminados con éxito.");

        } catch (SQLException e) {
            System.out.println("Error crítico al eliminar: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo eliminar: " + e.getMessage());
        }
    }
    
    
   
//        public static void EditarEmpleado(int id, String nombre, String apellido, String telefono, String correo) {
//            String sql = "UPDATE empleado SET nombre = ?, apellido = ?, telefono = ?,correo=?, id_turno = ? WHERE id_empleado = ?";
//            try (PreparedStatement pstm = c.prepareStatement(sql)) {
//                pstm.setString(1, nombre);
//                pstm.setString(2, apellido);
//                pstm.setString(3, telefono);
//                pstm.setString(4, correo);
//                pstm.setInt(6, id);
//                int filas = pstm.executeUpdate();
//                if (filas > 0) {
//                    System.out.println("Empleado actualizado correctamente");
//                } else {
//                    System.out.println("No se encontró el empleado con ese ID");
//                }
//            } 
//            catch (SQLException e) {
//                System.out.println("Error al actualizar el empleado: " + e.getMessage());
//            }
//        }
        
        
        public static boolean actualizarEmpleado(int idEmpleado, String nombre,
        String apellidos,
            String telefono,
            String correo) throws SQLException {

        String sql = """
            UPDATE empleado
            SET nombre = ?, apellido = ?, telefonoo = ?, correo = ?
            WHERE id_empleado = ?
        """;

        try (PreparedStatement ps = getConexion().prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, telefono);
            ps.setString(4, correo);
            ps.setInt(5, idEmpleado);

            return ps.executeUpdate() > 0;
        }
    }
        
        
        public static Connection getConexion() throws SQLException {
            if (c == null || c.isClosed()) {
                c = DriverManager.getConnection(url, user, passwd);
            }
            return c;
        }

        
        public static ResultSet consultarEmpleados() throws SQLException {

            String sql = """
                SELECT 
                    e.id_empleado,
                    e.nombre,
                    e.apellido,
                    e.telefonoo,
                    e.correo,
                    t.nombreturno
                FROM empleado e
                JOIN turno t ON e.id_turno = t.id_turno
                ORDER BY e.id_empleado
            """;

            PreparedStatement ps = getConexion().prepareStatement(sql);
            return ps.executeQuery();
        }        
        
        public void llenarComboUsuarios(JComboBox combo) {
        String sql = "SELECT rol FROM usuarios";
        java.sql.ResultSet rs = consultas(sql);
        try{                
            combo.removeAllItems(); // Limpia lo que haya (ej. "Item 1", "Item 2")
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
        // Ajusta los nombres de las columnas a como estén en tu tabla Postgres
        String sql = "SELECT rol FROM usuarios WHERE rol = ? AND password = ?";
        try (Connection cn = conectaBD();
             PreparedStatement pst = cn.prepareStatement(sql)){

            pst.setString(1, usuario);
            pst.setString(2, pass);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                rol = rs.getString("rol");
            }
        } catch (SQLException e) {
            System.err.println("Error en la validación: " + e.getMessage());
        }
        return rol; // Retorna el rol o null si no lo encuentra
    }    
    
    public static boolean guardarProducto(
            String idProducto,
            String nombre,
            String descripcion,
            int existencias,
            double costo,
            double precioExterno,
            double precioInterno){

        String sqlProducto = """
            INSERT INTO producto (id_producto, nombre, descripcion, existencias, costo)
            VALUES (?, ?, ?, ?, ?)
        """;

        String sqlPrecio = """
            INSERT INTO precioproducto (tipo_cliente, precio, id_producto)
            VALUES (?, ?, ?)
        """;
        try (Connection con = Conectar.getConexion()){
            con.setAutoCommit(false);
            try (PreparedStatement psProducto = con.prepareStatement(sqlProducto)) {
                psProducto.setString(1, idProducto);
                psProducto.setString(2, nombre);
                psProducto.setString(3, descripcion);
                psProducto.setInt(4, existencias);
                psProducto.setDouble(5, costo);
                psProducto.executeUpdate();
            }
            try (PreparedStatement psPrecio = con.prepareStatement(sqlPrecio)) {
                psPrecio.setString(1, "Externo");
                psPrecio.setDouble(2, precioExterno);
                psPrecio.setString(3, idProducto);
                psPrecio.executeUpdate();
            }
            try (PreparedStatement psPrecio = con.prepareStatement(sqlPrecio)) {
                psPrecio.setString(1, "Interno");
                psPrecio.setDouble(2, precioInterno);
                psPrecio.setString(3, idProducto);
                psPrecio.executeUpdate();
            }
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public static boolean modificarProducto(
                String idProducto,
                String nombre,
                String descripcion,
                int existencias,
                double costo,
                double precioExterno,
                double precioInterno){

            String sqlProducto = "UPDATE producto SET nombre = ?, descripcion = ?, existencias = ?, costo = ? WHERE id_producto = ?";
            String sqlPrecio = "UPDATE precioproducto SET precio = ? WHERE id_producto = ? AND tipo_cliente = ?";

            try (Connection con = getConexion()) {
                con.setAutoCommit(false);
                try (PreparedStatement ps = con.prepareStatement(sqlProducto)) {
                    ps.setString(1, nombre);
                    ps.setString(2, descripcion);
                    ps.setInt(3, existencias);
                    ps.setDouble(4, costo);
                    ps.setString(5, idProducto);
                    ps.executeUpdate();
                }

                try (PreparedStatement ps = con.prepareStatement(sqlPrecio)) {
                    ps.setDouble(1, precioExterno);
                    ps.setString(2, idProducto);
                    ps.setString(3, "Externo");
                    ps.executeUpdate();
                }

                try (PreparedStatement ps = con.prepareStatement(sqlPrecio)) {
                    ps.setDouble(1, precioInterno);
                    ps.setString(2, idProducto);
                    ps.setString(3, "Interno");
                    ps.executeUpdate();
                }

                con.commit();
                return true;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }

    
    public static boolean eliminarProducto(String idProducto) throws SQLException {
        String sqlPrecio = "DELETE FROM precioproducto WHERE id_producto = ?";
        String sqlProducto = "DELETE FROM producto WHERE id_producto = ?";
        if (c == null || c.isClosed()) {
            //System.out.println("La conexión estaba cerrada. Reintentando conectar...");
            c = new Controlador.Conectar().conectaBD();
        }
        try {
            c.setAutoCommit(false);
            try (PreparedStatement ps2 = c.prepareStatement(sqlPrecio)) {
                ps2.setString(1, idProducto);
                ps2.executeUpdate();
            }
            try (PreparedStatement ps = c.prepareStatement(sqlProducto)) {
                ps.setString(1, idProducto);
                ps.executeUpdate();
            }
            c.commit();
            return true;

        } catch (SQLException e) {
            if (c != null) c.rollback();
            System.out.println("Error al eliminar: " + e.getMessage());
            return false;
        } finally {
            if (c != null) c.setAutoCommit(true);
        }
    }
    
    //Modifiacar producto solo el precio y las existencias
    public static void ModificarExistencias(String id, String nombre, double costo, int stockNuevo, double pExterno, double pInterno) {
    // Usamos la instancia para acceder a los métodos de ejecución
    Conectar con = new Conectar();
    
    // 1. Query para actualizar producto (nombre, costo y suma de existencias)
    String queryProducto = "UPDATE producto SET nombre = '" + nombre + "', " +
                           "costo = " + costo + ", " +
                           "existencias = existencias + " + stockNuevo + " " +
                           "WHERE id_producto = '" + id + "'";
    
    // 2. Querys para actualizar los dos tipos de precios
    String queryPrecioExt = "UPDATE precioproducto SET precio = " + pExterno + " " +
                            "WHERE id_producto = '" + id + "' AND tipo_cliente = 'Externo'";
    
    String queryPrecioInt = "UPDATE precioproducto SET precio = " + pInterno + " " +
                            "WHERE id_producto = '" + id + "' AND tipo_cliente = 'Interno'";

    try {
        // Ejecutamos las tres actualizaciones
        con.ejecutar(queryProducto);
        con.ejecutar(queryPrecioExt);
        con.ejecutar(queryPrecioInt);
        
        // Verificamos si la variable estática MENSAJE quedó vacía (significa éxito)
        if(Conectar.MENSAJE.equals("")) {
             JOptionPane.showMessageDialog(null, "¡Cambios guardados y stock actualizado!");
        } else {
             JOptionPane.showMessageDialog(null, "Error al procesar: " + Conectar.MENSAJE);
        }
    } catch (Exception e) {
        System.out.println("Error en ModificarExistencias: " + e.getMessage());
    }
}
    
    
    public static boolean guardarTratamiento(
        String nombre,
        String descripcion,
        String grupo,
        double precioExterno,
        double precioInterno,
        List<DetallePaquete> productos) {

        String sqlPaquete = "INSERT INTO paquete (nombre, descripcion, grupo) VALUES (?, ?, ?) RETURNING id_paquete";
        String sqlPrecio = "INSERT INTO preciopaquete (tipo_cliente, precio, id_paquete) VALUES (?, ?, ?)";
        String sqlDetalle = "INSERT INTO detallepaquete (id_paquete, id_producto, cantidad) VALUES (?, ?, ?)";

        try (Connection c = getConexion()) {
            c.setAutoCommit(false);

            // 1️⃣ Guardar paquete
            int idPaquete;
            try (PreparedStatement ps = c.prepareStatement(sqlPaquete)) {
                ps.setString(1, nombre);
                ps.setString(2, descripcion);
                ps.setString(3, grupo);

                ResultSet rs = ps.executeQuery();
                rs.next();
                idPaquete = rs.getInt("id_paquete");
            }

            try (PreparedStatement ps = c.prepareStatement(sqlPrecio)) {
                ps.setString(1, "Interno");
                ps.setDouble(2, precioInterno);
                ps.setInt(3, idPaquete);
                ps.executeUpdate();

                ps.setString(1, "Externo");
                ps.setDouble(2, precioExterno);
                ps.setInt(3, idPaquete);
                ps.executeUpdate();
            }
            
            try (PreparedStatement ps = c.prepareStatement(sqlDetalle)) {
                for (DetallePaquete d : productos) {
                    ps.setInt(1, idPaquete);
                    ps.setString(2, d.getIdProducto());
                    ps.setInt(3, d.getCantidad());
                    ps.executeUpdate();
                }
            }

            c.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


  
    public static boolean modificarPaquete(
        int idPaquete,
        String nombre,
        String descripcion,
        String grupo,
        double precioExterno,
        double precioInterno) {

        String sqlPaquete = "UPDATE paquete SET nombre = ?, descripcion = ?, grupo = ? WHERE id_paquete = ?";
        String sqlPrecio  = "UPDATE preciopaquete SET precio = ? WHERE id_paquete = ? AND tipo_cliente = ?";

        try (Connection con = getConexion()) {
            con.setAutoCommit(false);
            try (PreparedStatement ps = con.prepareStatement(sqlPaquete)) {
                ps.setString(1, nombre);
                ps.setString(2, descripcion);
                ps.setString(3, grupo);
                ps.setInt(4, idPaquete); 
                ps.executeUpdate();
            }
            try (PreparedStatement ps = con.prepareStatement(sqlPrecio)) {
                ps.setDouble(1, precioExterno);
                ps.setInt(2, idPaquete);
                ps.setString(3, "Externo");
                ps.executeUpdate();
            }

            try (PreparedStatement ps = con.prepareStatement(sqlPrecio)) {
                ps.setDouble(1, precioInterno);
                ps.setInt(2, idPaquete);
                ps.setString(3, "Interno");
                ps.executeUpdate();
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static boolean eliminarPaquete(int idPaquete) {

        String sqlDetalle = "DELETE FROM detallepaquete WHERE id_paquete = ?";
        String sqlPrecio  = "DELETE FROM preciopaquete WHERE id_paquete = ?";
        String sqlPaquete = "DELETE FROM paquete WHERE id_paquete = ?";

        try (Connection con = getConexion()) {
            con.setAutoCommit(false);

            // 1. Eliminar productos del paquete
            try (PreparedStatement ps = con.prepareStatement(sqlDetalle)) {
                ps.setInt(1, idPaquete);
                ps.executeUpdate();
            }

            // 2. Eliminar precios del paquete
            try (PreparedStatement ps = con.prepareStatement(sqlPrecio)) {
                ps.setInt(1, idPaquete);
                ps.executeUpdate();
            }

            // 3. Eliminar el paquete
            try (PreparedStatement ps = con.prepareStatement(sqlPaquete)) {
                ps.setInt(1, idPaquete);
                ps.executeUpdate();
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    

    
}
