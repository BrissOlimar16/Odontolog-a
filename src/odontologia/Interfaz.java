package odontologia;

import Controlador.Funciones;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Brisa
 */

public class Interfaz extends javax.swing.JFrame {
    public static DefaultTableModel t = new DefaultTableModel();
    public static DefaultTableModel t1 = new DefaultTableModel();
    public static Object[] linea=new Object[8];
    public static int id=0;
    public String buscar="";
    public java.sql.Connection cp = null;
    String query= "SELECT * FROM inventario_dental";
    public Interfaz() {
        initComponents();
        t = (DefaultTableModel)tablaInventario.getModel();
        t1 = (DefaultTableModel)tablaBusqueda.getModel();
        cp = new Controlador.Conectar().conectaBD();
        NombreUsuario.setText("Ingresar Usuario");
        NombreUsuario.setForeground(Color.GRAY);
        ContraseñaUsuario.setText("Contraseña");
        ContraseñaUsuario.setForeground(Color.GRAY);
        ContraseñaUsuario.setEchoChar((char) 0);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setResizable(false);
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
        jLabel12 = new javax.swing.JLabel();
        IngresarApp = new javax.swing.JButton();
        cancelarIngreso = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Caja = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        MontoInicial = new javax.swing.JTextField();
        mensajeDinero = new javax.swing.JLabel();
        registroDinero = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        Inventario = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        BusquedaInventario = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        btnAgregarI = new javax.swing.JButton();
        btnReporteI = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtAgregarI = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPrecioMayore = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
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
        Corte = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CorteTurno = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        corteDia = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        CerrarCorte = new javax.swing.JButton();
        Tratamientos = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Reporte = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        Productos = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        lbTitulo5 = new javax.swing.JLabel();
        lbCodigo_Barras = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        lbPrecioCosto = new javax.swing.JLabel();
        lbGanancia = new javax.swing.JLabel();
        lbPrecioVenta = new javax.swing.JLabel();
        lbPorcentaje = new javax.swing.JLabel();
        txtCodigoBarras = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecioCosto1 = new javax.swing.JTextField();
        txtPrecioVenta1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbDescripcion1 = new javax.swing.JLabel();
        txtInsumo = new javax.swing.JTextField();
        lbDescripcion2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner3 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        Entrada_Dinero = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        lbCantidadEntrada = new javax.swing.JLabel();
        txtCantidadEntrada = new javax.swing.JTextField();
        lbDesEntrada = new javax.swing.JLabel();
        txtDesEntrada = new javax.swing.JTextField();
        btnGuardarEntrada = new javax.swing.JButton();
        btnCancelarEntrada = new javax.swing.JButton();
        Salida_Dinero = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        lbTitulo2 = new javax.swing.JLabel();
        lbCantidadSalida = new javax.swing.JLabel();
        txtCantidadSalida = new javax.swing.JTextField();
        lbDesSalida = new javax.swing.JLabel();
        txtDesSalida = new javax.swing.JTextField();
        btnGuardarSalida = new javax.swing.JButton();
        btnCancelarSalida = new javax.swing.JButton();
        Nuevo_Clientes = new javax.swing.JDialog();
        txtApellidos1 = new javax.swing.JTextField();
        txtDomicilio1 = new javax.swing.JTextField();
        txtColonia1 = new javax.swing.JTextField();
        txtCodigoPostal1 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        lbTitulo3 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        cboxMunicipio = new javax.swing.JComboBox<>();
        lbApellido = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        lbDomicilio = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        lbColonia = new javax.swing.JLabel();
        lbMuni_Esta = new javax.swing.JLabel();
        lbCodigoPostal = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbNotas = new javax.swing.JLabel();
        lbCarrera = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        cboxEstado = new javax.swing.JComboBox<>();
        cboxTipo = new javax.swing.JComboBox<>();
        cboxCarrera = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaNotas = new javax.swing.JTextArea();
        lbSemestre = new javax.swing.JLabel();
        cboxSemestre = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnAgrgar = new javax.swing.JButton();
        btnReimprimir = new javax.swing.JButton();
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
        btnDevoluciones = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        CorteCaja = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();

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
        ContraseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaUsuarioActionPerformed(evt);
            }
        });

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

        NombreUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        NombreUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombreUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreUsuarioFocusLost(evt);
            }
        });
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Documentos\\NetBeansProjects\\Odontolog-a\\src\\Icon\\odontologia.png")); // NOI18N
        jLabel1.setText("\n");

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Documentos\\NetBeansProjects\\Odontolog-a\\src\\Icon\\avatar (1).png")); // NOI18N
        jLabel27.setText("jLabel27");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Documentos\\NetBeansProjects\\Odontolog-a\\src\\Icon\\cerrar.png")); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Documentos\\NetBeansProjects\\Odontolog-a\\src\\Icon\\UNSIS (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(IngresarApp)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelarIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cancelarIngreso)
                                .addComponent(IngresarApp))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        MontoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoInicialActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jLabel66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registroDinero)
                    .addComponent(mensajeDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensajeDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(registroDinero)
                .addContainerGap(67, Short.MAX_VALUE))
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

        Inventario.setTitle("INVENTARIO");

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio venta", "Existencia", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaInventario);
        if (tablaInventario.getColumnModel().getColumnCount() > 0) {
            tablaInventario.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        jPanel19.setBackground(new java.awt.Color(0, 0, 102));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Reporte de inventario");

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

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setText("Costo de inventario");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setText("Cantiadad de productos en inventario");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setText("$00.00");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setText("00.00");

        javax.swing.GroupLayout InventarioLayout = new javax.swing.GroupLayout(Inventario.getContentPane());
        Inventario.getContentPane().setLayout(InventarioLayout);
        InventarioLayout.setHorizontalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(InventarioLayout.createSequentialGroup()
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel52)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel67))
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        InventarioLayout.setVerticalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        );

        BusquedaInventario.setTitle("Punto de  Venta");
        BusquedaInventario.setModal(true);
        BusquedaInventario.setSize(new java.awt.Dimension(500, 500));

        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("AGREGAR INVENTARIO");

        jLabel16.setText("Código del producto");

        txtCodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPActionPerformed(evt);
            }
        });

        btnAgregarI.setText("Agregar");

        btnReporteI.setText("Reporte de inventario");
        btnReporteI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteIActionPerformed(evt);
            }
        });

        jLabel19.setText("Hay");

        jLabel21.setText("Agregar");

        txtAgregarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarIActionPerformed(evt);
            }
        });

        jLabel22.setText("Precio Costo");

        txtPrecioCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCostoActionPerformed(evt);
            }
        });

        jLabel23.setText("Precio Venta");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jLabel24.setText("Precio Mayoreo");

        txtPrecioMayore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMayoreActionPerformed(evt);
            }
        });

        jLabel25.setText("Descripción");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgregarI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel25))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24)))
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioMayore, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtAgregarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtPrecioMayore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jButton1.setText("Agregar cantidad a Inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(0, 0, 102));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Agregar inventario");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout BusquedaInventarioLayout = new javax.swing.GroupLayout(BusquedaInventario.getContentPane());
        BusquedaInventario.getContentPane().setLayout(BusquedaInventarioLayout);
        BusquedaInventarioLayout.setHorizontalGroup(
            BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                .addGroup(BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                                .addComponent(btnAgregarI)
                                .addGap(18, 18, 18)
                                .addComponent(btnReporteI))
                            .addComponent(jLabel15)
                            .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        BusquedaInventarioLayout.setVerticalGroup(
            BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaInventarioLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarI)
                    .addComponent(btnReporteI))
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        BusquedaProducto.setModal(true);
        BusquedaProducto.setSize(new java.awt.Dimension(600, 650));

        jLabel26.setText("Teclea las primeras letras o código del producto...");

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
        if (tablaBusqueda.getColumnModel().getColumnCount() > 0) {
            tablaBusqueda.getColumnModel().getColumn(0).setPreferredWidth(45);
            tablaBusqueda.getColumnModel().getColumn(0).setMaxWidth(45);
            tablaBusqueda.getColumnModel().getColumn(1).setPreferredWidth(250);
            tablaBusqueda.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaBusqueda.getColumnModel().getColumn(3).setPreferredWidth(70);
            tablaBusqueda.getColumnModel().getColumn(3).setMaxWidth(70);
        }

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
                .addContainerGap(74, Short.MAX_VALUE))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BusquedaProductoLayout.createSequentialGroup()
                .addGroup(BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BusquedaProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarP)
                    .addGroup(BusquedaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarP)
                        .addComponent(btnEliminarP)
                        .addComponent(btnAceptarP)))
                .addGap(97, 97, 97))
        );

        Corte.setTitle("Corte");
        Corte.setModal(true);
        Corte.setSize(new java.awt.Dimension(600, 500));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(0, 0, 102));
        jPanel11.setForeground(new java.awt.Color(0, 0, 102));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cortes de caja ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Corte de turno");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Corte del día");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CorteTurno.setBackground(new java.awt.Color(232, 239, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "cantidad", "Precio", "Total por producto"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel30.setText("Ventas");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel31.setText("Total en caja");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setText("Monto Inicial");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel33.setText("Total de ventas");

        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jButton4.setText("Imprimir corte");

        jButton5.setText("Cerrar turno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CorteTurnoLayout = new javax.swing.GroupLayout(CorteTurno);
        CorteTurno.setLayout(CorteTurnoLayout);
        CorteTurnoLayout.setHorizontalGroup(
            CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorteTurnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorteTurnoLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CorteTurnoLayout.createSequentialGroup()
                        .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorteTurnoLayout.createSequentialGroup()
                                .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorteTurnoLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))))
            .addGroup(CorteTurnoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CorteTurnoLayout.setVerticalGroup(
            CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorteTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CorteTurnoLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorteTurnoLayout.createSequentialGroup()
                        .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CorteTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        corteDia.setBackground(new java.awt.Color(232, 239, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "cantidad", "Precio", "Total por producto"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel37.setText("Ventas");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel38.setText("Total en caja");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel39.setText("Monto Inicial");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel40.setText("Total de ventas");

        jLabel41.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jLabel42.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jLabel43.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jButton6.setText("Imprimir corte");

        CerrarCorte.setText("Cerrar");
        CerrarCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarCorteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout corteDiaLayout = new javax.swing.GroupLayout(corteDia);
        corteDia.setLayout(corteDiaLayout);
        corteDiaLayout.setHorizontalGroup(
            corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corteDiaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corteDiaLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(corteDiaLayout.createSequentialGroup()
                        .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(corteDiaLayout.createSequentialGroup()
                                .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel38))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corteDiaLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CerrarCorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))))
            .addGroup(corteDiaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );
        corteDiaLayout.setVerticalGroup(
            corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corteDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(corteDiaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corteDiaLayout.createSequentialGroup()
                        .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(corteDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CerrarCorte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CorteTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(corteDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CorteTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(corteDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CorteLayout = new javax.swing.GroupLayout(Corte.getContentPane());
        Corte.getContentPane().setLayout(CorteLayout);
        CorteLayout.setHorizontalGroup(
            CorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CorteLayout.setVerticalGroup(
            CorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tratamientos.setTitle("Tratamientos Generales");
        Tratamientos.setModal(true);
        Tratamientos.setSize(new java.awt.Dimension(814, 497));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(0, 0, 102));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Tratamientos dentales");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(16, 16, 16))
        );

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel45.setText("General");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel46.setText("Operatoria Dental");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel47.setText("Preventiva");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel48.setText("Exodoncia");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel49.setText("Reabilitacion");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel50.setText("Radiografias");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel51.setText("Terapia Pulpar");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("Tomografias");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel51))
                .addGap(92, 92, 92)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel50))
                .addGap(104, 104, 104)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel48))
                .addGap(54, 54, 54))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48))
                .addGap(186, 186, 186)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel53))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TratamientosLayout = new javax.swing.GroupLayout(Tratamientos.getContentPane());
        Tratamientos.getContentPane().setLayout(TratamientosLayout);
        TratamientosLayout.setHorizontalGroup(
            TratamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TratamientosLayout.setVerticalGroup(
            TratamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Reporte.setTitle("Reporte");

        jPanel18.setBackground(new java.awt.Color(0, 0, 102));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Reporte");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout ReporteLayout = new javax.swing.GroupLayout(Reporte.getContentPane());
        Reporte.getContentPane().setLayout(ReporteLayout);
        ReporteLayout.setHorizontalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteLayout.setVerticalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 429, Short.MAX_VALUE))
        );

        Productos.setTitle("Nuevo producto");
        Productos.setModal(true);
        Productos.setSize(new java.awt.Dimension(500, 500));

        jPanel15.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo5.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo5.setText("NUEVO PRODUCTO ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbCodigo_Barras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbCodigo_Barras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCodigo_Barras.setText("Código de Barras");

        lbDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion.setText("Descripción");

        lbPrecioCosto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioCosto.setText("Precio Costo");

        lbGanancia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbGanancia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGanancia.setText("Ganancia");

        lbPrecioVenta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioVenta.setText("Precio Venta");

        lbPorcentaje.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPorcentaje.setText("%");

        txtPrecioVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVenta1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, null, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar Producto");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbDescripcion1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion1.setText("Insumo");

        lbDescripcion2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion2.setText("Presentación");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Caja", "Bote", "Jeringa", "Bolsas" }));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2.0d, 2.0d, 300.0d, 1.0d));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Piezas", "Hojas", "Diques", "ml", "g", " " }));

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos.getContentPane());
        Productos.getContentPane().setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ProductosLayout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancelar))
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosLayout.createSequentialGroup()
                                .addComponent(lbDescripcion)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProductosLayout.createSequentialGroup()
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCodigo_Barras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDescripcion1))
                                .addGap(18, 18, 18)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoBarras)
                                    .addComponent(txtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProductosLayout.createSequentialGroup()
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ProductosLayout.createSequentialGroup()
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbDescripcion2)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo_Barras)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion1))
                .addGap(26, 26, 26)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion))
                .addGap(21, 21, 21)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioCosto)
                    .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPorcentaje)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioVenta)
                    .addComponent(txtPrecioVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Entrada_Dinero.setModal(true);
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

        lbDesEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbDesEntrada.setText("Descripción:");

        btnGuardarEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnGuardarEntrada.setText("Guardar");

        btnCancelarEntrada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCancelarEntrada.setText("Cancelar");
        btnCancelarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEntradaActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Entrada_DineroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(Entrada_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEntrada)
                    .addComponent(btnCancelarEntrada))
                .addContainerGap())
        );

        Salida_Dinero.setModal(true);
        Salida_Dinero.setSize(new java.awt.Dimension(350, 250));

        jPanel21.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo2.setText("Salida de Efectivo");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbCantidadSalida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbCantidadSalida.setText("Cantidad:");

        lbDesSalida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lbDesSalida.setText("Descripción:");

        btnGuardarSalida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnGuardarSalida.setText("Guardar");
        btnGuardarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSalidaActionPerformed(evt);
            }
        });

        btnCancelarSalida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCancelarSalida.setText("Cancelar");
        btnCancelarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Salida_DineroLayout = new javax.swing.GroupLayout(Salida_Dinero.getContentPane());
        Salida_Dinero.getContentPane().setLayout(Salida_DineroLayout);
        Salida_DineroLayout.setHorizontalGroup(
            Salida_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Salida_DineroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Salida_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Salida_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Salida_DineroLayout.createSequentialGroup()
                            .addComponent(btnGuardarSalida)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelarSalida)
                            .addGap(6, 6, 6))
                        .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        Salida_DineroLayout.setVerticalGroup(
            Salida_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Salida_DineroLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Salida_DineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarSalida)
                    .addComponent(btnCancelarSalida))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Nuevo_Clientes.setModal(true);
        Nuevo_Clientes.setSize(new java.awt.Dimension(500, 550));

        txtColonia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColonia1ActionPerformed(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setText("NUEVO CLIENTE");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNombre.setText("Nombres");

        cboxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbApellido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbApellido.setText("Apellidos");

        lbTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTelefono.setText("Telefono");

        btnGuardar1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnGuardar1.setText("Guardar ");

        lbDomicilio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDomicilio.setText("Domicilio");

        btnCancelar1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnCancelar1.setText("Cancelar");

        lbColonia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbColonia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbColonia.setText("Colonia");

        lbMuni_Esta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbMuni_Esta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMuni_Esta.setText("Municipio / Estado");

        lbCodigoPostal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbCodigoPostal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCodigoPostal.setText("Código Postal");

        lbTipo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTipo.setText("Tipo");

        lbNotas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbNotas.setText("Notas / Comentarios");

        lbCarrera.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbCarrera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCarrera.setText("Carrera");

        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtaNotas.setColumns(20);
        txtaNotas.setRows(5);
        jScrollPane5.setViewportView(txtaNotas);

        lbSemestre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbSemestre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSemestre.setText("Semestre");

        cboxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout Nuevo_ClientesLayout = new javax.swing.GroupLayout(Nuevo_Clientes.getContentPane());
        Nuevo_Clientes.getContentPane().setLayout(Nuevo_ClientesLayout);
        Nuevo_ClientesLayout.setHorizontalGroup(
            Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNotas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Nuevo_ClientesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbMuni_Esta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nuevo_ClientesLayout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addComponent(btnGuardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar1)
                        .addGap(40, 40, 40))
                    .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addComponent(cboxCarrera, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtColonia1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDomicilio1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTelefono1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtApellidos1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboxSemestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Nuevo_ClientesLayout.createSequentialGroup()
                            .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboxTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 136, Short.MAX_VALUE)
                                .addComponent(txtCodigoPostal1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboxMunicipio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        Nuevo_ClientesLayout.setVerticalGroup(
            Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nuevo_ClientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellido)
                    .addComponent(txtApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDomicilio))
                .addGap(12, 12, 12)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColonia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMuni_Esta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoPostal)
                    .addComponent(txtCodigoPostal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCarrera)
                    .addComponent(cboxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSemestre)
                    .addComponent(cboxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Nuevo_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar1)
                    .addComponent(btnGuardar1))
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de Venta");

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));

        jLabel54.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Documentos\\NetBeansProjects\\Odontolog-a\\src\\Icon\\UNSIS (1).png")); // NOI18N
        jLabel54.setText("\n\n");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnConfiguracion.setText("Configuración");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        btnAgrgar.setText("Agregar producto");
        btnAgrgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrgarActionPerformed(evt);
            }
        });

        btnReimprimir.setText("Reimprimir último ticket");
        btnReimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReimprimirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Total:");

        jLabel4.setText("Pagó con:");

        jLabel5.setText("Cambio:");

        btnCobrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCobrar.setText("cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("$00.00");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("$0.00");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("$0.00");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("$0.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(927, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6)
                    .addComponent(jLabel29))
                .addGap(0, 40, Short.MAX_VALUE))
            .addComponent(btnCobrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnDevoluciones.setText("Ventas del día y Devoluciones");

        btnServicios.setText("Servicios");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

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
            tablaVenta.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaVenta.getColumnModel().getColumn(1).setPreferredWidth(500);
            tablaVenta.getColumnModel().getColumn(3).setPreferredWidth(30);
            tablaVenta.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEntradas)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalidas)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBorrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConfiguracion)))
                                .addGap(18, 18, 18)
                                .addComponent(btnAgrgar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnReimprimir)
                                .addGap(44, 44, 44)
                                .addComponent(btnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 252, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInventario)
                                .addGap(18, 18, 18)
                                .addComponent(btnClientes)
                                .addGap(19, 19, 19)
                                .addComponent(btnProductos)
                                .addGap(18, 18, 18)
                                .addComponent(btnServicios)
                                .addGap(18, 18, 18)
                                .addComponent(CorteCaja)
                                .addGap(18, 18, 18)
                                .addComponent(btnReporte)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes)
                    .addComponent(btnProductos)
                    .addComponent(btnInventario)
                    .addComponent(btnReporte)
                    .addComponent(btnServicios)
                    .addComponent(CorteCaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgrgar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEntradas)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalidas)
                    .addComponent(btnConfiguracion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReimprimir)
                    .addComponent(btnDevoluciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ContraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaUsuarioActionPerformed

    private void IngresarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAppActionPerformed
        IngresasUsuario.setVisible(false);
        Caja.setLocationRelativeTo(null);
        Caja.setVisible(true);

    }//GEN-LAST:event_IngresarAppActionPerformed

    private void NombreUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreUsuarioFocusGained
        if (NombreUsuario.getText().equals("Ingresar Usuario")) {
            NombreUsuario.setText("");
            NombreUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_NombreUsuarioFocusGained

    private void NombreUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreUsuarioFocusLost
        if (NombreUsuario.getText().isEmpty()) {
            NombreUsuario.setText("Ingresar Usuario");
            NombreUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_NombreUsuarioFocusLost

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void txtCodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnReimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReimprimirActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        Entrada_Dinero.setVisible(true);
        Entrada_Dinero.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BusquedaProducto.setLocation(900, 150);
        BusquedaProducto.setVisible(true);
        Funciones.limpiaTabla(t1);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Nuevo_Clientes.setVisible(true);
        Nuevo_Clientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        Salida_Dinero.setVisible(true);
        Salida_Dinero.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos.setLocationRelativeTo(null);
        Productos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        Reporte.setVisible(true);
        Reporte.setSize(this.getSize());
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        BusquedaInventario.setLocationRelativeTo(null);
        BusquedaInventario.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnReporteIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteIActionPerformed
        BusquedaInventario.setVisible(false);
        Inventario.setVisible(true);
        Inventario.setSize(this.getSize());
        Inventario.setLocationRelativeTo(null);       
        Funciones.limpiaTabla(t);
        Funciones.consultarU(query,t);
    }//GEN-LAST:event_btnReporteIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BusquedaInventario.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        txtBusquedaP.setText("");
        Funciones.limpiaTabla(t1);        
        BusquedaProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarPActionPerformed

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

    private void cancelarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarIngresoActionPerformed
        
    }//GEN-LAST:event_cancelarIngresoActionPerformed

    private void MontoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontoInicialActionPerformed

    private void registroDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroDineroActionPerformed
        Caja.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Funciones.limpiaTabla(t1);
    }//GEN-LAST:event_registroDineroActionPerformed

    private void CorteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorteCajaActionPerformed
        CorteTurno.setVisible(false);
        corteDia.setVisible(false);
        Corte.setVisible(true);
        Corte.setLocationRelativeTo(null);
    }//GEN-LAST:event_CorteCajaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CorteTurno.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        corteDia.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CorteTurno.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CerrarCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarCorteActionPerformed
        corteDia.setVisible(false);
    }//GEN-LAST:event_CerrarCorteActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
            Tratamientos.setVisible(true);
            Tratamientos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void txtPrecioMayoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMayoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioMayoreActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void txtPrecioCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCostoActionPerformed

    private void txtAgregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarIActionPerformed

    private void btnCancelarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarEntradaActionPerformed

    private void btnCancelarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarSalidaActionPerformed

    private void txtColonia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColonia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColonia1ActionPerformed

    private void btnGuardarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarSalidaActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgrgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrgarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgrgarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        String buscar = txtCodigo.getText().trim();    
            try {
                int n = Integer.parseInt(buscar);
                Funciones.buscando(n+"");
                txtBusquedaP.setText(n+"");
                txtCodigo.setText("");
                BusquedaProducto.setLocation(900, 150);
                BusquedaProducto.setVisible(true);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de formato: El Código debe ser un número entero válido.");
                txtCodigo.setText("");
            }        
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtBusquedaPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaPKeyReleased
        buscar = txtBusquedaP.getText();     
        Funciones.buscando(buscar);
    }//GEN-LAST:event_txtBusquedaPKeyReleased

    private void txtPrecioVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVenta1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    if (txtCodigoBarras.getText().trim().isEmpty() || txtInsumo.getText().trim().isEmpty() || txtDescripcion.getText().trim().isEmpty()){ 
            //|| txtPrecioCosto1.getText().trim().isEmpty() || txtPrecioVenta1.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: Hay un campo vacío");
    } else {
//        String cont=(String)jComboBox1.getSelectedItem();
//        String piez=(String)jComboBox1.getSelectedItem();
//        if (jSpinner2.getValue().toString().isEmpty() || jSpinner3.getValue().toString().isEmpty() || 
//                cont.equals("Selecciona") || piez.equals("Selecciona")) {
//            JOptionPane.showMessageDialog(null, "Error: Hay un campo vacío");
//        } else {
            insertar();
        //}
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        double precio= Integer.parseInt(txtPrecioCosto1.getText());
        double porcentaje= Integer.parseInt(jSpinner1.getValue().toString());
        try {
            double precioFinal = precio * (1 + (porcentaje / 100.0));
            txtPrecioVenta1.setText(precioFinal+"");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato: El Código debe ser un número entero válido.");
            txtPrecioCosto1.setText("");
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Productos.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        if(seleccionado()){
            JLabel x = new JLabel("Confirma que desea eliminar el usuario "+ tablaBusqueda.getValueAt(tablaBusqueda.getSelectedRow(),1)); 
            Object[] x1={"",x};
            int si = JOptionPane.showConfirmDialog(null,x1,"Ejemplo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(si==JOptionPane.OK_OPTION){
                try{
                    String c="delete from inventario_dental where no_item="+ tablaBusqueda.getValueAt(tablaBusqueda.getSelectedRow(),0)+"";
                    new Controlador.Conectar().ejecutar(c);
                    System.out.println(c);
                    Funciones.buscando(buscar);
                    if (!Controlador.Conectar.MENSAJE.equals("")){
                        JOptionPane.showMessageDialog(null, "Error: El producto "+ tablaBusqueda.getValueAt(tablaBusqueda.getSelectedRow(),1)+" no se pudo eliminar!");
                    }
                }catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }        
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un producto en la tabla");
            Funciones.buscando(buscar);
        }
    }//GEN-LAST:event_btnEliminarPActionPerformed
    
    public boolean seleccionado(){
        if (tablaBusqueda.getSelectedRow()!=-1){
           return true;
        }
        else return false;
    }
    public void insertar(){
        String insert="INSERT INTO inventario_dental(no_item,insumo,descripcion, presentacion, total_de_piezas)VALUES "
                + "("+txtCodigoBarras.getText()+",'"+txtInsumo.getText()+"','"+txtDescripcion.getText()+"',"+"'null1234'"+","+1+")";       
        try{            
            new Controlador.Conectar().ejecutar(insert);
            System.out.println(insert);
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el producto");
            Productos.setVisible(false);
            //limpiaTabla();
            //consultarU(query);
            txtCodigoBarras.setText("");
            txtInsumo.setText("");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//             UIManager.setLookAndFeel( "com.jtattoo.plaf.mint.MintLookAndFeel");
//        //</editor-fold>
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BusquedaInventario;
    private javax.swing.JDialog BusquedaProducto;
    private javax.swing.JDialog Caja;
    private javax.swing.JButton CerrarCorte;
    private javax.swing.JPasswordField ContraseñaUsuario;
    private javax.swing.JDialog Corte;
    private javax.swing.JButton CorteCaja;
    private javax.swing.JPanel CorteTurno;
    private javax.swing.JDialog Entrada_Dinero;
    private javax.swing.JButton IngresarApp;
    private javax.swing.JDialog IngresasUsuario;
    private javax.swing.JDialog Inventario;
    private javax.swing.JTextField MontoInicial;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JDialog Nuevo_Clientes;
    private javax.swing.JDialog Productos;
    private javax.swing.JDialog Reporte;
    private javax.swing.JDialog Salida_Dinero;
    private javax.swing.JDialog Tratamientos;
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnAgregarI;
    private javax.swing.JButton btnAgrgar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelarEntrada;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCancelarSalida;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardarEntrada;
    private javax.swing.JButton btnGuardarSalida;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReimprimir;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnReporteI;
    private javax.swing.JButton btnSalidas;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton cancelarIngreso;
    private javax.swing.JComboBox<String> cboxCarrera;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JComboBox<String> cboxMunicipio;
    private javax.swing.JComboBox<String> cboxSemestre;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JPanel corteDia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCantidadEntrada;
    private javax.swing.JLabel lbCantidadSalida;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbCodigoPostal;
    private javax.swing.JLabel lbCodigo_Barras;
    private javax.swing.JLabel lbColonia;
    private javax.swing.JLabel lbDesEntrada;
    private javax.swing.JLabel lbDesSalida;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDescripcion1;
    private javax.swing.JLabel lbDescripcion2;
    private javax.swing.JLabel lbDomicilio;
    private javax.swing.JLabel lbGanancia;
    private javax.swing.JLabel lbMuni_Esta;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNotas;
    private javax.swing.JLabel lbPorcentaje;
    private javax.swing.JLabel lbPrecioCosto;
    private javax.swing.JLabel lbPrecioVenta;
    private javax.swing.JLabel lbSemestre;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JLabel lbTitulo5;
    private javax.swing.JLabel mensajeDinero;
    private javax.swing.JButton registroDinero;
    private javax.swing.JTable tablaBusqueda;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtAgregarI;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtBusquedaP;
    private javax.swing.JTextField txtCantidadEntrada;
    private javax.swing.JTextField txtCantidadSalida;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtCodigoPostal1;
    private javax.swing.JTextField txtColonia1;
    private javax.swing.JTextField txtDesEntrada;
    private javax.swing.JTextField txtDesSalida;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDomicilio1;
    private javax.swing.JTextField txtInsumo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioCosto1;
    private javax.swing.JTextField txtPrecioMayore;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtPrecioVenta1;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextArea txtaNotas;
    // End of variables declaration//GEN-END:variables
}
