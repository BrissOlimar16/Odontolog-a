package odontologia;

import Controlador.Funciones;
import static Controlador.Funciones.limpiaTabla;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static odontologia.BusquedaInventario.txtPrecioCosto2;

/**
 *
 * @author Brisa
 */
public class Interfaz extends javax.swing.JFrame {
    //Tablas
    public static DefaultTableModel t = new DefaultTableModel();
    public static DefaultTableModel t1 = new DefaultTableModel();
    public static DefaultTableModel tv = new DefaultTableModel();
    //Paneles
    BusquedaInventario bi;
    Productos p;
    Corte ct;
    Nuevo_Cliente nc;
    Tratamientos tm;
    Empleados Em;
    Configuracion conf;
    public static Object[] linea=new Object[8];
    public static String id="", codi="";
    public String buscar="";
    public static String query="SELECT p.id_producto, p.nombre, p.descripcion, p.costo AS Costo, pp.precio AS Precio, p.existencias " +
                      "FROM producto p INNER JOIN precioproducto pp ON p.id_producto = pp.id_producto WHERE pp.tipo_cliente = 'Externo'";
    
//   String query2 = "SELECT p.id_producto, p.nombre, p.descripcion, p.costo, p.existencias, " +
//                "pp_ext.precio AS precio_externo, pp_int.precio AS precio_interno FROM producto p " +
//                "LEFT JOIN precioproducto pp_ext ON p.id_producto = pp_ext.id_producto AND pp_ext.tipocliente = 'externo' " +
//                "LEFT JOIN precioproducto pp_int ON p.id_producto = pp_int.id_producto AND pp_int.tipocliente = 'interno' " +
//                "WHERE CAST(p.id_producto AS TEXT) = '" + codi + "'";
    String query2 = "SELECT p.id_producto, p.nombre, p.descripcion, p.costo, p.existencias, " +
                "pp_ext.precio AS precio_externo, pp_int.precio AS precio_interno FROM producto p " +
                "LEFT JOIN precioproducto pp_ext ON p.id_producto = pp_ext.id_producto AND pp_ext.tipo_cliente = 'Externo' " +
                "LEFT JOIN precioproducto pp_int ON p.id_producto = pp_int.id_producto AND pp_int.tipo_cliente = 'Interno' " +
                "WHERE p.id_producto = ?";
    
    Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
    
    Controlador.Conectar con = new Controlador.Conectar();
    public Interfaz() {
        initComponents();
//        NombreUsuario.setText("Ingresar Usuario");
//        NombreUsuario.setForeground(Color.GRAY);
        ContraseñaUsuario.setText("Contraseña");
        ContraseñaUsuario.setForeground(Color.GRAY);
        ContraseñaUsuario.setEchoChar((char) 0);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setResizable(false);
        con.llenarComboUsuarios(Usuario);
        t1 = (DefaultTableModel)tablaBusqueda.getModel();
        tv = (DefaultTableModel)tablaVenta.getModel();
        inicializarPanels();
        Funciones.limpiaTabla(tv);
        jPanel1.setVisible(false);
        jButton3.setVisible(false);
        txtEfectivo.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        public void insertUpdate(javax.swing.event.DocumentEvent e) { calcularCambio(); }
        public void removeUpdate(javax.swing.event.DocumentEvent e) { calcularCambio(); }
        public void changedUpdate(javax.swing.event.DocumentEvent e) { calcularCambio(); }});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresasUsuario = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ContraseñaUsuario = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IngresarApp = new javax.swing.JButton();
        cancelarIngreso = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Usuario = new javax.swing.JComboBox<>();
        Caja = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        MontoInicial = new javax.swing.JTextField();
        mensajeDinero = new javax.swing.JLabel();
        registroDinero = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        Entrada_Dinero = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        lbCantidadEntrada = new javax.swing.JLabel();
        txtCantidadEntrada = new javax.swing.JTextField();
        lbDesEntrada = new javax.swing.JLabel();
        txtDesEntrada = new javax.swing.JTextField();
        btnGuardarEntrada = new javax.swing.JButton();
        btnCancelarEntrada = new javax.swing.JButton();
        btnGuardarSalida1 = new javax.swing.JButton();
        BusquedaProducto = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        txtBusquedaP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        btnModificarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        btnAceptarP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        Cobrar = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        txtPersona = new javax.swing.JTextField();
        ib = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ib4 = new javax.swing.JLabel();
        ib5 = new javax.swing.JLabel();
        ib1 = new javax.swing.JLabel();
        ib2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        ib8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ib6 = new javax.swing.JLabel();
        ib7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnAgrgar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnServicios = new javax.swing.JButton();
        CorteCaja = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        btnEmpleado = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();

        IngresasUsuario.setTitle("Ingresar Usuario ");
        IngresasUsuario.setResizable(false);
        IngresasUsuario.setSize(new java.awt.Dimension(400, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 102));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Punto de Venta");

        jLabel8.setBackground(new java.awt.Color(0, 0, 102));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Usuario");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Contraseña");

        ContraseñaUsuario.setText("jPasswordField1");
        ContraseñaUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        ContraseñaUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñaUsuarioFocusLost(evt);
            }
        });
        ContraseñaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaUsuarioKeyPressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/UNSIS (1).png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Ingrese el usuario en turno");

        IngresarApp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        IngresarApp.setText("Ingresar");
        IngresarApp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        IngresarApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAppActionPerformed(evt);
            }
        });

        cancelarIngreso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelarIngreso.setText("Cancelar");
        cancelarIngreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        cancelarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarIngresoActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/odontologia.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/avatar (1).png"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cerrar.png"))); // NOI18N

        Usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(IngresarApp)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelarIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Usuario, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE)
                            .addComponent(ContraseñaUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(87, 87, 87))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(25, 25, 25)
                                .addComponent(ContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel10))))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarIngreso)
                        .addComponent(IngresarApp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout IngresasUsuarioLayout = new javax.swing.GroupLayout(IngresasUsuario.getContentPane());
        IngresasUsuario.getContentPane().setLayout(IngresasUsuarioLayout);
        IngresasUsuarioLayout.setHorizontalGroup(
            IngresasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        IngresasUsuarioLayout.setVerticalGroup(
            IngresasUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Caja.setTitle("Caja Inicial");
        Caja.setResizable(false);
        Caja.setSize(new java.awt.Dimension(350, 250));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        MontoInicial.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        MontoInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MontoInicial.setText("$0.00");
        MontoInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        MontoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MontoInicialKeyPressed(evt);
            }
        });

        mensajeDinero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mensajeDinero.setText("Ingrese el monto inicial:");

        registroDinero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registroDinero.setText("Registrar");
        registroDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroDineroActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(0, 0, 102));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Efectivo en caja");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel66)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(mensajeDinero)
                        .addGap(18, 18, 18)
                        .addComponent(MontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(registroDinero)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(MontoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mensajeDinero)
                        .addGap(35, 35, 35)))
                .addComponent(registroDinero)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout CajaLayout = new javax.swing.GroupLayout(Caja.getContentPane());
        Caja.getContentPane().setLayout(CajaLayout);
        CajaLayout.setHorizontalGroup(
            CajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CajaLayout.setVerticalGroup(
            CajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Entrada_Dinero.setResizable(false);
        Entrada_Dinero.setSize(new java.awt.Dimension(350, 250));

        jPanel14.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo1.setText("Entrada de Efectivo");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo1)
                .addGap(14, 14, 14))
        );

        lbCantidadEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbCantidadEntrada.setText("Cantidad:");

        txtCantidadEntrada.setText("$ 0.00");

        lbDesEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbDesEntrada.setText("Descripción:");

        btnGuardarEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnGuardarEntrada.setText("Guardar");
        btnGuardarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEntradaActionPerformed(evt);
            }
        });

        btnCancelarEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCancelarEntrada.setText("Cancelar");
        btnCancelarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEntradaActionPerformed(evt);
            }
        });

        btnGuardarSalida1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnGuardarSalida1.setText("Guardar");
        btnGuardarSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSalida1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Entrada_DineroLayout = new javax.swing.GroupLayout(Entrada_Dinero.getContentPane());
        Entrada_Dinero.getContentPane().setLayout(Entrada_DineroLayout);
        Entrada_DineroLayout.setHorizontalGroup(
            Entrada_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entrada_DineroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Entrada_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCantidadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDesEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Entrada_DineroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarSalida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarEntrada)
                .addGap(31, 31, 31))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Entrada_DineroLayout.setVerticalGroup(
            Entrada_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entrada_DineroLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCantidadEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDesEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(Entrada_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEntrada)
                    .addComponent(btnCancelarEntrada)
                    .addComponent(btnGuardarSalida1))
                .addGap(20, 20, 20))
        );

        BusquedaProducto.setModal(true);
        BusquedaProducto.setSize(new java.awt.Dimension(600, 650));

        jLabel26.setText("Teclea las primeras letras o código del producto...");

        txtBusquedaP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBusquedaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaPKeyReleased(evt);
            }
        });

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cód.", "Descripción del Producto", "Precio Venta", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaBusqueda);

        btnModificarP.setText("Modificar Producto");
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });

        btnEliminarP.setText("Elimanar Producto");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        btnAceptarP.setText("Aceptar");

        btnCancelarP.setText("Cancelar");
        btnCancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(0, 0, 102));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Búsqueda de productos");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout BusquedaProductoLayout = new javax.swing.GroupLayout(BusquedaProducto.getContentPane());
        BusquedaProducto.getContentPane().setLayout(BusquedaProductoLayout);
        BusquedaProductoLayout.setHorizontalGroup(
            BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaProductoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnModificarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarP)
                .addContainerGap(71, Short.MAX_VALUE))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BusquedaProductoLayout.createSequentialGroup()
                .addGroup(BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BusquedaProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(BusquedaProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtBusquedaP, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BusquedaProductoLayout.setVerticalGroup(
            BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaProductoLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarP)
                    .addGroup(BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarP)
                        .addComponent(btnEliminarP)
                        .addComponent(btnAceptarP)))
                .addGap(97, 97, 97))
        );

        Cobrar.setMinimumSize(new java.awt.Dimension(500, 520));
        Cobrar.setModal(true);
        Cobrar.setSize(new java.awt.Dimension(500, 530));

        jPanel19.setBackground(new java.awt.Color(0, 0, 102));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Cobrar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addGap(16, 16, 16))
        );

        txtPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPersonaKeyPressed(evt);
            }
        });

        ib.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib.setText("Ingresa Nombre apellidos, Matricula o Folio del cliente");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        ib4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib4.setText("Nombre :");

        ib5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ib5.setText("Folio/Matricula :");

        ib1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ib1.setText("Folio/Matricula :");

        ib2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ib5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ib4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ib1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ib2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ib4)
                    .addComponent(ib1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ib5)
                    .addComponent(ib2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton3.setText("Buscar cliente o agregar nuevo cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Cobrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ib8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ib8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ib8.setText("Cambio");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("00.00");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("$");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ib8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(ib8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ib6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ib6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib6.setText("Total a pagar");

        ib7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ib7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib7.setText("Pago con efectivo");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("$");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("00.00");

        txtEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("$");

        javax.swing.GroupLayout CobrarLayout = new javax.swing.GroupLayout(Cobrar.getContentPane());
        Cobrar.getContentPane().setLayout(CobrarLayout);
        CobrarLayout.setHorizontalGroup(
            CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CobrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CobrarLayout.createSequentialGroup()
                        .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPersona))
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CobrarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CobrarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ib6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CobrarLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ib7))
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        CobrarLayout.setVerticalGroup(
            CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CobrarLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ib)
                .addGap(12, 12, 12)
                .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ib6)
                    .addComponent(ib7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1138, 580));
        setSize(new java.awt.Dimension(1200, 800));

        Pantalla.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/UNSIS (1).png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/satisfaccion-del-consumidor.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/herramientas-de-dentista.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/inventario(1).png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEntradas.setText("Entradas");
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnSalidas.setText("Salidas");
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Codigo de producto:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        btnAgrgar.setText("Agregar producto");
        btnAgrgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrgarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(1, 85));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Total venta:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("Pagó con:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("Cambio:");

        btnCobrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCobrar.setText("Vender");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("$");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("$0.00");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("$0.00");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("$0.00");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("00.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );

        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/silla-de-dentista.png"))); // NOI18N
        btnServicios.setText("Servicios");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        CorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/informe-de-venta.png"))); // NOI18N
        CorteCaja.setText("Corte");
        CorteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorteCajaActionPerformed(evt);
            }
        });

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Barras", "Descripción del producto", "Precio Venta", "Existencia", "Cant.", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablaVenta.getColumnModel().getColumn(0).setMaxWidth(150);
            tablaVenta.getColumnModel().getColumn(1).setPreferredWidth(600);
            tablaVenta.getColumnModel().getColumn(1).setMaxWidth(600);
            tablaVenta.getColumnModel().getColumn(4).setPreferredWidth(70);
            tablaVenta.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/empleado.png"))); // NOI18N
        btnEmpleado.setText("Empleado");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/configuracion-de-sincronizacion.png"))); // NOI18N
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setDisabledIcon(null);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnInventario)
                        .addGap(18, 18, 18)
                        .addComponent(btnClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnProductos)
                        .addGap(24, 24, 24)
                        .addComponent(btnServicios)
                        .addGap(12, 12, 12)
                        .addComponent(CorteCaja)
                        .addGap(18, 18, 18)
                        .addComponent(btnEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfiguracion))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnAgrgar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInventario)
                    .addComponent(btnClientes)
                    .addComponent(btnProductos)
                    .addComponent(btnServicios)
                    .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CorteCaja)
                        .addComponent(btnEmpleado)
                        .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgrgar))))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnEntradas)
                    .addComponent(btnSalidas)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Pantalla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void IngresarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAppActionPerformed
        String rolSeleccionado = Usuario.getSelectedItem().toString();
        String contraseña = new String(ContraseñaUsuario.getPassword());

        String usuarioReal = Controlador.Funciones.obtenerUsuarioDesdeRol(rolSeleccionado);

        if (usuarioReal == null) {
            JOptionPane.showMessageDialog(null, 
                "No se encontró un usuario para el rol seleccionado.");
            return;
        }
        String rolEncontrado = con.validarUser(usuarioReal, contraseña);
        if(!rolEncontrado.equals("Administrador")){
            btnEmpleado.setVisible(false);
            btnConfiguracion.setVisible(false);
            Nuevo_Cliente.btnEliminarCliente.setVisible(false);
            Tratamientos.EliminarTratamiento.setVisible(false);
            btnEliminarP.setVisible(false);
        }
        if (rolEncontrado != null) {
            Controlador.Sesion.usuarioActual = usuarioReal;
            Controlador.Sesion.rolActual = rolEncontrado;

            if (rolEncontrado.equalsIgnoreCase("Administrador")) {
                Controlador.Sesion.idEmpleadoActual = null;
            } else {
                Controlador.Sesion.idEmpleadoActual =
                    Controlador.Funciones.obtenerIdEmpleado(usuarioReal);
            }
            if (!rolEncontrado.equalsIgnoreCase("Administrador") 
                && Controlador.Sesion.idEmpleadoActual == null) {

                JOptionPane.showMessageDialog(null, "Este usuario no tiene empleado asignado.");
                return;
            }
            IngresasUsuario.dispose();
            Caja.setLocationRelativeTo(null);
            Caja.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null,  "Contraseña incorrecta para el rol " + rolSeleccionado);
        }
    }//GEN-LAST:event_IngresarAppActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        btnGuardarSalida1.setVisible(false);
        Entrada_Dinero.setVisible(true);
        Entrada_Dinero.setLocationRelativeTo(null);
        lbTitulo1.setText("Entradas de Efectivo");
        btnGuardarEntrada.setVisible(true);
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiaTabla(t1);
        BusquedaProducto.setLocation(800, 150);
        BusquedaProducto.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Pantalla.setVisible(false);        
        this.add(nc);
        nc.setBounds(0, 0, this.getWidth(), this.getHeight());
        nc.setVisible(true);
        nc.jpExtras.setVisible(false);
        Funciones.limpiaTabla(Nuevo_Cliente.t2);
        Funciones.consultarC(Nuevo_Cliente.quer,Nuevo_Cliente.t2);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        btnGuardarEntrada.setVisible(false);
        Entrada_Dinero.setVisible(true);
        Entrada_Dinero.setLocationRelativeTo(null);
        lbTitulo1.setText("Salida de Efectivo");
        btnGuardarSalida1.setVisible(true);
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Pantalla.setVisible(false);        
        this.add(p);
        p.setBounds(0, 0, this.getWidth(), this.getHeight());
        p.setVisible(true);
        p.txtCodigoBarras.setEditable(true);
        p.lbTitulo6.setText("NUEVO PRODUCTO");
        Productos.btnGuardar.setVisible(true);
        Productos.btnModificar.setVisible(false);
        p.limpia();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Pantalla.setVisible(false);        
        this.add(bi);
        bi.setBounds(0, 0, this.getWidth(), this.getHeight());
        bi.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void ContraseñaUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaUsuarioFocusGained
        if (String.valueOf(ContraseñaUsuario.getPassword()).equals("Contraseña")) {
            ContraseñaUsuario.setText(""); 
            ContraseñaUsuario.setForeground(Color.BLACK);
            ContraseñaUsuario.setEchoChar('*');
        }
    }//GEN-LAST:event_ContraseñaUsuarioFocusGained

    private void ContraseñaUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaUsuarioFocusLost
        if (ContraseñaUsuario.getPassword().length == 0) {
            ContraseñaUsuario.setText("Contraseña"); 
            ContraseñaUsuario.setForeground(Color.GRAY); 
            ContraseñaUsuario.setEchoChar((char) 0); 
        }
    }//GEN-LAST:event_ContraseñaUsuarioFocusLost

    private void registroDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroDineroActionPerformed
       Integer idEmp = Controlador.Sesion.idEmpleadoActual;
        double monto = Double.parseDouble(MontoInicial.getText().replaceAll("[^0-9.]", ""));
        Integer idTur = Controlador.Sesion.idTurnoActual;
        Integer idCaja = Controlador.Funciones.registrarAperturaCaja(monto, idEmp, idTur);
        if (idCaja != null) {
            Controlador.Sesion.idCajaActual = idCaja;
            Caja.setVisible(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            Pantalla.setSize(tamanio.width, tamanio.height);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo abrir la caja.");
        }
    }//GEN-LAST:event_registroDineroActionPerformed

    private void CorteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorteCajaActionPerformed
        Pantalla.setVisible(false);
        this.add(ct);
        ct.setBounds(0, 0, 556, 770);
        ct.setVisible(true);
    }//GEN-LAST:event_CorteCajaActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        Pantalla.setVisible(false);
        this.add(tm);
        tm.setBounds(0, 0, this.getWidth(), this.getHeight());
        tm.setVisible(true);
        Controlador.Funciones.TablaPaquetes();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void txtBusquedaPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaPKeyReleased
        buscar = txtBusquedaP.getText();
        Controlador.Funciones.buscando(buscar);
    }//GEN-LAST:event_txtBusquedaPKeyReleased

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        int filaSeleccionada = tablaBusqueda.getSelectedRow();
        if (filaSeleccionada != -1) {
            String idProducto = tablaBusqueda.getValueAt(filaSeleccionada, 0).toString();
            String nombreProducto = tablaBusqueda.getValueAt(filaSeleccionada, 1).toString();
            int confirmar = JOptionPane.showConfirmDialog(null, 
                "¿Confirma que desea eliminar el producto: " + nombreProducto + "?", 
                "Alerta", JOptionPane.OK_CANCEL_OPTION);
            if (confirmar == JOptionPane.OK_OPTION) {
                try {
                    Controlador.Funciones.eliminarProducto(idProducto, this);
                    Funciones.buscando(buscar);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un producto de la tabla.");
        }      
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        txtBusquedaP.setText("");
        BusquedaProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarPActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        Pantalla.setVisible(false);        
        this.add(Em);
        Em.setBounds(0, 0, this.getWidth(), this.getHeight());
        Em.setVisible(true);
        Controlador.Funciones.limpiaTabla(Empleados.modelo);
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        if (seleccionado()) {
            int fila = tablaBusqueda.getSelectedRow();
            codi = tablaBusqueda.getValueAt(fila, 0).toString().trim();
            Pantalla.setVisible(false);
            BusquedaProducto.setVisible(false);

            this.add(p);
            p.setBounds(0, 0, this.getWidth(), this.getHeight());
            p.setVisible(true);
            p.txtCodigoBarras.setEditable(false);
            p.lbTitulo6.setText("MODIFICAR PRODUCTO");
            Productos.btnModificar.setVisible(true);
            Productos.btnGuardar.setVisible(false);
            p.traerProducto(codi); 
            txtBusquedaP.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto en la tabla");
            Funciones.buscando(buscar);
        }
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void btnGuardarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEntradaActionPerformed
        Integer idCaja = Controlador.Sesion.idCajaActual;
        if (idCaja == null) {
            JOptionPane.showMessageDialog(this, "No hay una caja abierta. Abre caja primero.");
            return;
        }

        String textoMonto = txtCantidadEntrada.getText().trim();
        if (textoMonto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un monto válido.");
            return;
        }

        double monto;
        try {
            monto = Double.parseDouble(textoMonto.replaceAll("[^0-9.]", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de monto inválido.");
            return;
        }
        String descripcion = txtDesEntrada.getText().trim();
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa una descripción.");
            return;
        }
        boolean ok = Controlador.Funciones.registrarMovimientoCaja(idCaja, "ENTRADA", descripcion, monto);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Entrada registrada correctamente.");
            txtCantidadEntrada.setText("");
            txtDesEntrada.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la entrada.");
        }

    }//GEN-LAST:event_btnGuardarEntradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarIngresoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarIngresoActionPerformed

    private void btnAgrgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrgarActionPerformed
        String cod = txtCodigo.getText().trim();   
        if(!cod.isEmpty()){
            boolean encontrado = Funciones.buscandoVenta(cod, tv); 

            if(encontrado) {
                double importeTotal = 0;
                for (int i = 0; i < tv.getRowCount(); i++) {
                    importeTotal += Double.parseDouble(tv.getValueAt(i, 5).toString());
                }
                jLabel20.setText(String.format("%.2f", importeTotal));
                jLabel16.setText(String.format("%.2f", importeTotal));
                jLabel6.setText(String.format("$%.2f", importeTotal));
            } else {
                JOptionPane.showMessageDialog(null, "El producto con código [" + cod + "] no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            txtCodigo.setText("");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnAgrgarActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Pantalla.setVisible(false);
        this.add(conf);
        conf.setBounds(0, 0, this.getWidth(), this.getHeight());
        conf.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        Cobrar.setLocationRelativeTo(null);
        Cobrar.setVisible(true);
        txtPersona.setText("");
        jPanel1.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void ContraseñaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {IngresarApp.doClick();}
    }//GEN-LAST:event_ContraseñaUsuarioKeyPressed

    private void MontoInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MontoInicialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {registroDinero.doClick();}
    }//GEN-LAST:event_MontoInicialKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {btnAgrgar.doClick();}
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Funciones.limpiaTabla(Nuevo_Cliente.t2);
        Funciones.consultarC(Nuevo_Cliente.quer,Nuevo_Cliente.t2);
        if(txtPersona.getText().trim().equals("")){return;}
        String nombreBuscado = txtPersona.getText().trim();
        boolean encontrado = false;

        for (int i = 0; i < Nuevo_Cliente.tablaCliente.getRowCount(); i++) {
            Object val0 = Nuevo_Cliente.tablaCliente.getValueAt(i, 0);
            Object val1 = Nuevo_Cliente.tablaCliente.getValueAt(i, 1);

            String textoCol0 = (val0 != null) ? val0.toString() : "";
            String textoCol1 = (val1 != null) ? val1.toString() : "";

            if (textoCol0.equalsIgnoreCase(nombreBuscado) || textoCol1.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;

                Nuevo_Cliente.tablaCliente.setRowSelectionInterval(i, i);
                Nuevo_Cliente.tablaCliente.scrollRectToVisible(Nuevo_Cliente.tablaCliente.getCellRect(i, 0, true));

                if (textoCol0.trim().isEmpty() || textoCol1.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Esta bacio", "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    ib1.setText(val1+"");
                    ib2.setText(val0+"");
                    jPanel1.setVisible(true);
                }
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró a: " + nombreBuscado);
            jButton3.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cobrar.setVisible(false);
        Pantalla.setVisible(false);        
        this.add(nc);
        nc.setBounds(0, 0, this.getWidth(), this.getHeight());
        nc.setVisible(true);
        nc.jpExtras.setVisible(false);
        Funciones.limpiaTabla(Nuevo_Cliente.t2);
        Funciones.consultarC(Nuevo_Cliente.quer,Nuevo_Cliente.t2);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jLabel16.getText().equals(txtEfectivo.getText()) || !jLabel18.getText().equals("00.00") && !ib2.getText().equals("")) {
            try {
                List<Controlador.DetalleVenta> listaParaGuardar = new ArrayList<>();
                for (int i = 0; i < tv.getRowCount(); i++) {
                    String id = tv.getValueAt(i, 0).toString();
                    String desc = tv.getValueAt(i, 1).toString();
                    double precio = Double.parseDouble(tv.getValueAt(i, 2).toString());
                    int cant = Integer.parseInt(tv.getValueAt(i, 4).toString());
                    listaParaGuardar.add(new Controlador.DetalleVenta(id, desc, cant, precio));
                }
                double total = Double.parseDouble(jLabel16.getText());
                int idEmpleado = 1;
                int idCliente = Integer.parseInt(ib2.getText());

                Controlador.Conectar control = new Controlador.Conectar();
                boolean guardadoExitoso = Controlador.Conectar.finalizarVenta(total, idEmpleado, idCliente, listaParaGuardar);

                if (!guardadoExitoso) {
                    JOptionPane.showMessageDialog(null, "Error al guardar en BD: " + control.MENSAJE);
                    return;
                }   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al procesar datos: " + e.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(null, "GRACIAS POR TU COMPRA :)");
            Controlador.Ticket.generaTicket();

            jLabel16.setText("00.00");
            txtEfectivo.setText("");
            jLabel18.setText("00.00");
            jPanel1.setVisible(false);
            jButton3.setVisible(false);
            jLabel6.setText("0.00");
            jLabel20.setText("00.00");
            Controlador.Funciones.limpiaTabla(tv);       
        } else {
            JOptionPane.showMessageDialog(null, "NO PUEDO REALIZAR ESTA VENTA...");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {jButton2.doClick();}
    }//GEN-LAST:event_txtPersonaKeyPressed

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void btnGuardarSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSalida1ActionPerformed
        Integer idCaja = Controlador.Sesion.idCajaActual;
        if (idCaja == null) {
            JOptionPane.showMessageDialog(this, "No hay una caja abierta. Abre caja primero.");
            return;
        }

        String textoMonto = txtCantidadEntrada.getText().trim();
        if (textoMonto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un monto válido.");
            return;
        }

        double monto;
        try {
            monto = Double.parseDouble(textoMonto.replaceAll("[^0-9.]", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de monto inválido.");
            return;
        }
        String descripcion = txtDesEntrada.getText().trim();
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa una descripción.");
            return;
        }
        boolean ok = Controlador.Funciones.registrarMovimientoCaja(idCaja, "SALIDA", descripcion, monto);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Salida registrada correctamente.");
            txtCantidadEntrada.setText("");
            txtDesEntrada.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la salida.");
        }

    }//GEN-LAST:event_btnGuardarSalida1ActionPerformed

    private void btnCancelarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEntradaActionPerformed
        Entrada_Dinero.setVisible(false);
    }//GEN-LAST:event_btnCancelarEntradaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Controlador.Funciones.limpiaTabla(tv);
    }//GEN-LAST:event_btnBorrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // UIManager.setLookAndFeel( "com.jtattoo.plaf.mint.MintLookAndFeel");
        //</editor-fold>
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        /* Create and display the form */
        final Interfaz principal = new Interfaz();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Interfaz().setVisible(true);
                principal.setVisible(false);
                principal.IngresasUsuario.pack();
                principal.IngresasUsuario.setLocationRelativeTo(null);
                principal.IngresasUsuario.setVisible(true);
                
            }
        });
    }
     
    private void calcularCambio() {
        try {
            String textoTotal = jLabel16.getText().trim();
            double totalAPagar = Double.parseDouble(textoTotal);
            String textoEfectivo = txtEfectivo.getText().trim().replace(",", ".");
            double efectivo = textoEfectivo.isEmpty() ? 0.0 : Double.parseDouble(textoEfectivo);
            double cambio = efectivo - totalAPagar;
            if (cambio < 0) {
                jLabel18.setText("00.00");
            } else {
                jLabel18.setText(String.format("%.2f", cambio));
            }

        } catch (NumberFormatException e) {
            jLabel18.setText("00.00");
        }
    }
    
    public void inicializarPanels(){
        bi = new BusquedaInventario();
        p = new Productos();
        ct = new Corte();
        nc = new Nuevo_Cliente();
        tm = new Tratamientos();
        Em= new Empleados();
        conf = new Configuracion();
    }

    public boolean seleccionado(){
        if (tablaBusqueda.getSelectedRow()!=-1){
           return true;
        }
        else return false;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BusquedaProducto;
    private javax.swing.JDialog Caja;
    private javax.swing.JDialog Cobrar;
    private javax.swing.JPasswordField ContraseñaUsuario;
    private javax.swing.JButton CorteCaja;
    private javax.swing.JDialog Entrada_Dinero;
    private javax.swing.JButton IngresarApp;
    private javax.swing.JDialog IngresasUsuario;
    private javax.swing.JTextField MontoInicial;
    public static javax.swing.JPanel Pantalla;
    private javax.swing.JComboBox<String> Usuario;
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnAgrgar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarEntrada;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnGuardarEntrada;
    private javax.swing.JButton btnGuardarSalida1;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalidas;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton cancelarIngreso;
    private javax.swing.JLabel ib;
    private javax.swing.JLabel ib1;
    private javax.swing.JLabel ib2;
    private javax.swing.JLabel ib4;
    private javax.swing.JLabel ib5;
    private javax.swing.JLabel ib6;
    private javax.swing.JLabel ib7;
    private javax.swing.JLabel ib8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCantidadEntrada;
    private javax.swing.JLabel lbDesEntrada;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel mensajeDinero;
    private javax.swing.JButton registroDinero;
    public javax.swing.JTable tablaBusqueda;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtBusquedaP;
    private javax.swing.JTextField txtCantidadEntrada;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesEntrada;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtPersona;
    // End of variables declaration//GEN-END:variables
}