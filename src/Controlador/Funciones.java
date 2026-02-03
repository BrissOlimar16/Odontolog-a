package Controlador;

//import static Controlador.Conectar.getConexion;
//import java.awt.Color;
import static Controlador.Conectar.conectaBD;
import static Controlador.Conectar.c;
import static Controlador.Conectar.getConexion;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import odontologia.BusquedaInventario;
import odontologia.Interfaz;
import static odontologia.Nuevo_Cliente.t2;
//import odontologia.Productos;

public class Funciones extends Interfaz {
    public static void limpiaTabla(DefaultTableModel t){
        int a=t.getRowCount();  
        while(a!=0){
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
    
    public static boolean consultarVenta(String query, DefaultTableModel t) {
        java.sql.ResultSet r = new Controlador.Conectar().consultas(query);
        try {
            if (r.next()) {
                String idProductoNuevo = r.getString("id_producto");
                double precio = r.getDouble("Precio");

                for (int fila = 0; fila < t.getRowCount(); fila++) {
                    String idEnTabla = t.getValueAt(fila, 0).toString();

                    if (idEnTabla.equals(idProductoNuevo)) {
                        int cantActual = Integer.parseInt(t.getValueAt(fila, 4).toString());
                        int nuevaCant = cantActual + 1;
                        t.setValueAt(nuevaCant, fila, 4);
                        t.setValueAt(nuevaCant * precio, fila, 5);
                        return true;
                    }
                }
                Object[] linea = new Object[6];
                String nombreFull = r.getString("nombre") + " " + (r.getString("descripcion") == null ? "" : r.getString("descripcion"));

                linea[0] = idProductoNuevo;
                linea[1] = nombreFull;
                linea[2] = precio;
                linea[3] = r.getDouble("existencias");
                linea[4] = 1;
                linea[5] = precio;         
                t.addRow(linea);
                return true;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
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
    
    public static double obtenerTotalImporte(DefaultTableModel t) {
    double total = 0;
    for (int i = 0; i < t.getRowCount(); i++) {
        total += Double.parseDouble(t.getValueAt(i, 5).toString());
    }
    return total;
}
    
    public static boolean existeRegistro(String tabla, String columna, String id) {
        String sql = "SELECT COUNT(*) FROM " + tabla + " WHERE " + columna + " = ?";
        try (Connection cn = Controlador.Conectar.getConexion(); 
            PreparedStatement pst = cn.prepareStatement(sql)) {       
            pst.setString(1, id);
        try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al validar duplicado en " + tabla + ": " + e.getMessage());
        }
        return false;
    }
    
    //buscar productos
    public static void buscando(String buscar) {
        limpiaTabla(t1);
        if (!buscar.trim().isEmpty()) {
            String query = "SELECT p.id_producto, p.nombre, p.descripcion, p.costo, pp.precio, p.existencias " +
                       "FROM producto p JOIN precioproducto pp ON p.id_producto = pp.id_producto " +
                       "WHERE pp.tipo_cliente = 'Externo' AND (p.id_producto ILIKE '%" + buscar + "%' OR " +
                       "p.nombre ILIKE '%" + buscar + "%' OR p.descripcion ILIKE '%" + buscar + "%') " +
                       "ORDER BY p.id_producto";
            consultarP(query, t1);
        }
    }
    
    public static void buscandoExistencias(String n) {
        String query = "SELECT p.nombre, p.costo, p.existencias, " +
                       "MAX(CASE WHEN pp.tipo_cliente = 'Externo' THEN pp.precio END) as precio_externo, " +
                       "MAX(CASE WHEN pp.tipo_cliente = 'Interno' THEN pp.precio END) as precio_interno " +
                       "FROM producto p " +
                       "LEFT JOIN precioproducto pp ON p.id_producto = pp.id_producto " +
                       "WHERE p.id_producto = '" + n + "' " +
                       "GROUP BY p.id_producto, p.nombre, p.costo, p.existencias";

        BusquedaInventario.traerExistencias(query);
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
    
    public static boolean buscandoVenta(String buscar, DefaultTableModel t) {
        if (!buscar.trim().isEmpty()) {
            String query ="SELECT p.id_producto, p.nombre, p.descripcion, p.costo AS Costo, pp.precio AS Precio, p.existencias " +
                          "FROM producto p INNER JOIN precioproducto pp ON p.id_producto = pp.id_producto " +
                          "WHERE pp.tipo_cliente = 'Externo' AND p.id_producto = '" + buscar + "'";

            return consultarVenta(query, t);
        }
        return false;
    }
    
    public static void registrarEmpleado( boolean matutinoSeleccionado,
        Date horaInicio, Date horaFin, int idEmpleado, String nombre,
        String apellidos, String telefono, String correo, String rolSeleccionado,
        String contraseña, Component jdialog ){
         
        try {
            String turno = matutinoSeleccionado ? "Matutino" : "Vespertino";
            Time hora = new Time(horaInicio.getTime());
            Time hora1 = new Time(horaFin.getTime());

            int idTurno = turnoBD(turno, hora, hora1);

            if (idTurno == -1) {
                JOptionPane.showMessageDialog(jdialog, "Error al crear turno");
                return;
            }

            datosEmpleado(
                    idEmpleado,
                    nombre,
                    apellidos,
                    telefono,
                    correo,
                    idTurno
            );
            String nombreUsuario = nombre.toLowerCase().trim() + idEmpleado;

            CrearRol(
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
            eliminarEmpleadoCompleto(id);
        }
    }
     
    public static void editarEmpleado( int idEmpleado, String nombre,
        String apellidos, String telefono, String correo, Component jdialog) {
        try {
            boolean actualizado = actualizarEmpleado(
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

            try (ResultSet rs = consultarEmpleados()) {

                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getInt("id_empleado"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
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
        int respuesta = JOptionPane.showConfirmDialog(jdialog, "¿Estás seguro de eliminar el producto?");
        if (respuesta == JOptionPane.YES_OPTION) {
            eliminarProducto(idProducto);
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
    
    public static void TablaPaquetes() {
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

        try (Connection con = Controlador.Conectar.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("codigo"),
                    rs.getString("tratamiento"),
                    rs.getString("grupo"),
                    rs.getInt("cantidad"),
                    rs.getDouble("precio_externo"),
                    rs.getDouble("precio_interno")
                };
                modelo.addRow(fila);
            }

            odontologia.Tratamientos.tratamientos.setModel(modelo);
            odontologia.Tratamientos.tratamientos.revalidate();
            odontologia.Tratamientos.tratamientos.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String validarUsuario(String user, String pass) {
    String sql = "SELECT rol FROM usuarios WHERE username = ? AND password = ?";
    try (Connection con = Controlador.Conectar.conectaBD();
         PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, user);
        pst.setString(2, pass);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return rs.getString("rol");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}
    
    public static int turnoBD(String turno, java.sql.Time hora, java.sql.Time hora1){
        try {
            if (c == null || c.isClosed()) {
                new Controlador.Conectar().conectaBD(); 
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión previa: " + e.getMessage());
        }

        String sql = "INSERT INTO turno (nombreturno, horainicio, horafin) VALUES (?, ?, ?);";

        try (PreparedStatement pstm = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, turno);
            pstm.setTime(2, hora);
            pstm.setTime(3, hora1);

            pstm.executeUpdate();

            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("ERROR REAL EN TURNO_BD: " + e.getMessage());
            e.printStackTrace(); 
        }
        return -1;
}

    public static void datosEmpleado(int matricula, String nombre, String apellidos, String telefono, String correo, int idTurno){
    String sql = "INSERT INTO empleado (id_empleado, nombre, apellido, telefono, correo, id_turno) VALUES (?, ?, ?, ?, ?, ?);";
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
       
    public static void CrearRol(String usuario, String contraseña, String rol, int idEmpleado) {
        String sql = "INSERT INTO usuarios (username, password, rol, id_empleado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, contraseña);
            pstm.setString(3, rol);
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
    
    public static void eliminarEmpleadoCompleto(int idEmpleado) {
        try {
            if (c == null || c.isClosed()) new Conectar().conectaBD();
            int idTurno = obtenerTurnoDeEmpleado(idEmpleado);
            String sqlUsuario = "DELETE FROM usuarios WHERE id_empleado = ?";
            try (PreparedStatement pstU = c.prepareStatement(sqlUsuario)) {
                pstU.setInt(1, idEmpleado);
                pstU.executeUpdate();
                System.out.println("Usuario de acceso eliminado.");
            }

            String sqlEmpleado = "DELETE FROM empleado WHERE id_empleado = ?";
            try (PreparedStatement pstE = c.prepareStatement(sqlEmpleado)) {
                pstE.setInt(1, idEmpleado);
                pstE.executeUpdate();
                System.out.println("Datos del empleado eliminados.");
            }

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
          
    public static boolean actualizarEmpleado(int idEmpleado, String nombre,
        String apellidos, String telefono, String correo) throws SQLException {

        String sql = "UPDATE empleado SET nombre = ?, apellido = ?, telefonoo = ?, correo = ? WHERE id_empleado = ?";

        try (PreparedStatement ps = getConexion().prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, telefono);
            ps.setString(4, correo);
            ps.setInt(5, idEmpleado);

            return ps.executeUpdate() > 0;
        }
    }
            
    public static ResultSet consultarEmpleados() throws SQLException {

            String sql = """
                SELECT 
                    e.id_empleado,
                    e.nombre,
                    e.apellido,
                    e.telefono,
                    e.correo,
                    t.nombreturno
                FROM empleado e
                JOIN turno t ON e.id_turno = t.id_turno
                ORDER BY e.id_empleado
            """;

            PreparedStatement ps = getConexion().prepareStatement(sql);
            return ps.executeQuery();
        }        
        
    public static boolean guardarProducto( String idProducto, String nombre,
        String descripcion, int existencias, double costo, double precioExterno, double precioInterno){

        String sqlProducto = "INSERT INTO producto (id_producto, nombre, descripcion, existencias, costo) VALUES (?, ?, ?, ?, ?)";
        String sqlPrecio = "INSERT INTO precioproducto (tipo_cliente, precio, id_producto) VALUES (?, ?, ?)";
        
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

    
    public static boolean modificarProducto(String idProducto, String nombre, String descripcion, 
                                        int existencias, double costo, double precioExterno, double precioInterno) {

        String sqlProducto = "UPDATE producto SET nombre = ?, descripcion = ?, existencias = ?, costo = ? WHERE id_producto = ?";
        String sqlPrecio = "UPDATE precioproducto SET precio = ? WHERE id_producto = ? AND tipo_cliente = ?";
        Connection con = null;
        try {
            con = getConexion();
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
            if (con != null) {
                try {
                    con.rollback();
                    System.err.println("Transacción revertida debido a un error.");
                } catch (SQLException ex) {ex.printStackTrace();}
            }
            e.printStackTrace();
            return false;
        } finally {
            try { if(con != null) con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    
    public static boolean eliminarProducto(String idProducto) throws SQLException {
        String sqlDetalleVenta = "DELETE FROM detalle_producto_venta WHERE id_producto = ?";
        String sqlPrecio = "DELETE FROM precioproducto WHERE id_producto = ?";
        String sqlProducto = "DELETE FROM producto WHERE id_producto = ?";
        if (c == null || c.isClosed()) {
            c = new Controlador.Conectar().conectaBD();
        }
        try {
            c.setAutoCommit(false); 
            try (PreparedStatement ps3 = c.prepareStatement(sqlDetalleVenta)) {
                ps3.setString(1, idProducto);
                ps3.executeUpdate();
            }
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
            if (c != null) c.rollback(); throw e;
        } finally {
            if (c != null) c.setAutoCommit(true);
        }
    }
    
    
    public static void ModificarExistencias(String id, String nombre, double costo, int stockNuevo, double pExterno, double pInterno) {
        Conectar con = new Conectar();

        String queryProducto = "UPDATE producto SET nombre = '" + nombre + "', " + "costo = " + costo + ", " +
                               "existencias = existencias + " + stockNuevo + " " + "WHERE id_producto = '" + id + "'";
        String queryPrecioExt = "UPDATE precioproducto SET precio = " + pExterno + " " + "WHERE id_producto = '" + id + "' AND tipo_cliente = 'Externo'";
        String queryPrecioInt = "UPDATE precioproducto SET precio = " + pInterno + " " + "WHERE id_producto = '" + id + "' AND tipo_cliente = 'Interno'";

        try {
            con.ejecutar(queryProducto);
            con.ejecutar(queryPrecioExt);
            con.ejecutar(queryPrecioInt);
            if(Conectar.MENSAJE.equals("")) {
                 JOptionPane.showMessageDialog(null, "¡Cambios guardados y stock actualizado!");
            } else {
                 JOptionPane.showMessageDialog(null, "Error al procesar: " + Conectar.MENSAJE);
            }
        } catch (Exception e) {
            System.out.println("Error en ModificarExistencias: " + e.getMessage());
        }
    }
    
    
    public static boolean guardarTratamiento( String nombre, String descripcion,String grupo, 
        double precioExterno, double precioInterno, List<DetallePaquete> productos) {

        String sqlPaquete = "INSERT INTO paquete (nombre, descripcion, grupo) VALUES (?, ?, ?) RETURNING id_paquete";
        String sqlPrecio = "INSERT INTO preciopaquete (tipo_cliente, precio, id_paquete) VALUES (?, ?, ?)";
        String sqlDetalle = "INSERT INTO detallepaquete (id_paquete, id_producto, cantidad) VALUES (?, ?, ?)";

        try (Connection c = getConexion()) {
            c.setAutoCommit(false);
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

  
    public static boolean modificarPaquete( int idPaquete, String nombre,
        String descripcion, String grupo, double precioExterno, double precioInterno) {

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
            try (PreparedStatement ps = con.prepareStatement(sqlDetalle)) {
                ps.setInt(1, idPaquete);
                ps.executeUpdate();
            }
            try (PreparedStatement ps = con.prepareStatement(sqlPrecio)) {
                ps.setInt(1, idPaquete);
                ps.executeUpdate();
            }
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

    
    public static Integer registrarAperturaCaja(Double monto, Integer idEmpleado, Integer idTurno) {
        String sql = "INSERT INTO caja (fecha, hora_apertura, monto_inicial, estado, id_empleado, id_turno) "
                   + "VALUES (CURRENT_DATE, CURRENT_TIME, ?, 'ABIERTA', ?, ?)";

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setDouble(1, monto);

            if (idEmpleado != null) {
                ps.setInt(2, idEmpleado);
            } else {
                ps.setNull(2, java.sql.Types.INTEGER);
            }

            if (idTurno != null) {
                ps.setInt(3, idTurno);
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL al abrir caja: " + e.getMessage());
        }

        return null;
}

    

    public static Integer obtenerIdEmpleado(String username) {
        String sql = "SELECT id_empleado FROM usuarios WHERE username = ?";
        try (Connection con = getConexion()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_empleado");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID de empleado: " + e.getMessage());
        }
        return null;
    }
    

    public static String obtenerUsuarioDesdeRol(String rol) {
        String sql = "SELECT username FROM usuarios WHERE rol = ?";

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, rol);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("username");
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener usuario desde rol: " + e.getMessage());
        }
        return null;
    }
    
    
     public static boolean registrarMovimientoCaja(Integer idCaja, String tipo, String descripcion, double monto) {
        String sql = "INSERT INTO movimiento_caja (id_caja, tipo, concepto, monto, fecha_hora) VALUES (?, ?, ?, ?, CURRENT_DATE)";

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCaja);
            ps.setString(2, tipo);
            ps.setString(3, descripcion);
            ps.setDouble(4, monto);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("Error al registrar movimiento: " + e.getMessage());
            return false;
        }
    }

    
    public static double obtenerMontoInicial(int idCaja) {
        String sql = "SELECT monto_initial FROM caja WHERE id_caja = ?";
        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCaja);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getDouble("monto_initial");
        } catch (SQLException e) { e.printStackTrace(); }
        return 0;
    }

    public static double obtenerTotalVentas(int idCaja) {
        String sql = "SELECT SUM(total) FROM venta WHERE id_caja = ?";
        try (Connection con = getConexion();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCaja);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getDouble(1);
        } catch (SQLException e) { e.printStackTrace(); }
        return 0;
    }

    public static double obtenerTotalMovimientos(int idCaja, String tipo) {
        String sql = "SELECT SUM(monto) FROM movimiento_caja WHERE id_caja = ? AND tipo = ?";
        try (Connection con = getConexion();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCaja);
            ps.setString(2, tipo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getDouble(1);
        } catch (SQLException e) { e.printStackTrace(); }
        return 0;
    }

        public static void llenarTablaProductos(int idCaja, DefaultTableModel modelo) {
            
            modelo.setRowCount(0); 

            String sql = "SELECT p.nombre, SUM(dv.cantidad) as cant, dv.precio_aplicado, SUM(dv.subtotal) as sub " +
                         "FROM detalle_producto_venta dv " +
                         "JOIN producto p ON dv.id_producto = p.id_producto " +
                         "JOIN venta v ON dv.id_venta = v.id_venta " +
                         "WHERE v.id_caja = ? GROUP BY p.nombre, dv.precio_aplicado";

            try (Connection con = getConexion();
            PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idCaja);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("nombre"),
                        rs.getInt("cant"),
                        rs.getDouble("precio_aplicado"),
                        rs.getDouble("sub")
                    });
                }
            } catch (SQLException e) { e.printStackTrace(); }
        }
    
    public static boolean finalizarTurno(int idCaja, double montoCalculado) {
        String sql = "UPDATE caja SET hora_cierre = CURRENT_TIME, monto_final = ?, estado = 'CERRADA' WHERE id_caja = ?";
        try (Connection con = getConexion();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, montoCalculado);
            ps.setInt(2, idCaja);
            int filasAfectadas = ps.executeUpdate(); 
            return filasAfectadas > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }

}
