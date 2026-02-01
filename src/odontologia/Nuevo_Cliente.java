package odontologia;

import Controlador.Funciones;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class Nuevo_Cliente extends javax.swing.JPanel {
    public java.sql.Connection c = null;
    public static DefaultTableModel t2 = new DefaultTableModel();
    static String quer="SELECT id_cliente, nombre || ' ' || apellido AS nombre_completo FROM cliente";
    String tipo="",ocupa="",busca="";
    long folio=0;
    public Nuevo_Cliente() {
        initComponents();
        c = new Controlador.Conectar().conectaBD();
        t2 = (DefaultTableModel)tablaCliente.getModel();
        btnModificaciarCliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel16 = new javax.swing.JPanel();
        lbTitulo6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        ib = new javax.swing.JLabel();
        ib1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        ib2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        ib3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jpExtras = new javax.swing.JPanel();
        ib4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        ib5 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        ib6 = new javax.swing.JLabel();
        Externo = new javax.swing.JRadioButton();
        Interno = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        btnSeleccionarModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        txtBuscarCliente = new javax.swing.JTextField();
        lbTitulo7 = new javax.swing.JLabel();
        btnModificaciarCliente = new javax.swing.JButton();

        jPanel16.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo6.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo6.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo6.setText("CLIENTE ");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ib.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib.setText("Nombres:");

        ib1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib1.setText("Apellidos:");

        ib2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib2.setText("Telefono:");

        ib3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib3.setText("Correo:");

        jpExtras.setBackground(new java.awt.Color(232, 230, 230));

        ib4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib4.setText("Matricula:");

        ib5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib5.setText("Ocupacion:");

        javax.swing.GroupLayout jpExtrasLayout = new javax.swing.GroupLayout(jpExtras);
        jpExtras.setLayout(jpExtrasLayout);
        jpExtrasLayout.setHorizontalGroup(
            jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtrasLayout.createSequentialGroup()
                .addGroup(jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExtrasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ib4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpExtrasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ib5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpExtrasLayout.setVerticalGroup(
            jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtrasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ib4))
                .addGap(18, 18, 18)
                .addGroup(jpExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ib5)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        ib6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ib6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ib6.setText("Tipo de Cliente:");

        buttonGroup1.add(Externo);
        Externo.setText("Externo");
        Externo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExternoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Interno);
        Interno.setText("Interno");
        Interno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnGuardarCliente.setText("Guardar Cliente");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnSeleccionarModificarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnSeleccionarModificarCliente.setText("Modificar Cliente");
        btnSeleccionarModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(btnSeleccionarModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeleccionarModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaCliente);
        if (tablaCliente.getColumnModel().getColumnCount() > 0) {
            tablaCliente.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablaCliente.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        txtBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbTitulo7.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo7.setText("NUEVO CLIENTE ");

        btnModificaciarCliente.setText("Guardar Cliente Modificado");
        btnModificaciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaciarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ib, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ib1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ib2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ib3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jpExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ib6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(Externo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Interno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnModificaciarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbTitulo7)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ib)
                                .addGap(18, 18, 18)
                                .addComponent(ib1)
                                .addGap(24, 24, 24)
                                .addComponent(ib2)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ib3)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(ib6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Externo)
                            .addComponent(Interno))
                        .addGap(18, 18, 18)
                        .addComponent(jpExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificaciarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Interfaz.Pantalla.setVisible(true);
        this.setVisible(false);
        limpia();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if (Interno.isSelected()){
            ocupa=txtOcupacion.getText().trim();
            try {
                String texto = txtMatricula.getText().trim(); 
                folio = Long.parseLong(texto);
                System.out.println("Folio convertido: " + folio);
            } catch (NumberFormatException e) {
                System.out.println("Error: El campo no contiene un número válido.");
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo números");
            }
        }
        if (vacio()){           
            JOptionPane.showMessageDialog(null, "Error: Hay un campo vacío");
        } else {
            
            insertarCliente("INSERT INTO cliente (id_cliente,nombre,apellido, correo,telefono,tipo_cliente,ocupacion) VALUES " +
                            "("+folio+", '"+txtNombre.getText()+"', '"+txtApellidos.getText()+"', '"+txtCorreo.getText()+"', '"+txtTelefono.getText()+"', '"+tipo+"', '"+ocupa+"')");
            buttonGroup1.clearSelection();
            jpExtras.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void ExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExternoActionPerformed
        jpExtras.setVisible(false);
        tipo="externo";
        ocupa="ciudadano";
        folio=Controlador.Funciones.generarNum();
    }//GEN-LAST:event_ExternoActionPerformed

    private void InternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternoActionPerformed
        jpExtras.setVisible(true);
        tipo="interno";
        ocupa="";
        folio=0;
    }//GEN-LAST:event_InternoActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if(seleccionado()){
            JLabel x = new JLabel("Confirma que desea eliminar al cliente "+ tablaCliente.getValueAt(tablaCliente.getSelectedRow(),1));
            Object[] x1={"",x};
            int si = JOptionPane.showConfirmDialog(null,x1,"Alerta",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(si==JOptionPane.OK_OPTION){
                try{
                    String c="DELETE FROM cliente WHERE id_cliente = "+ tablaCliente.getValueAt(tablaCliente.getSelectedRow(),0);
                    new Controlador.Conectar().ejecutar(c);
                    System.out.println(c);
                    Funciones.buscandoCliente(busca);
                    if (!Controlador.Conectar.MENSAJE.equals("")){
                        JOptionPane.showMessageDialog(null, "Error: El cliente "+ tablaCliente.getValueAt(tablaCliente.getSelectedRow(),1)+" no se pudo eliminar!");
                    }
                }catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
                txtBuscarCliente.setText("");
                Funciones.limpiaTabla(t2);
                Funciones.consultarC(quer,t2);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione el cliente en la lista.");
            Funciones.buscandoCliente(busca);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        busca=txtBuscarCliente.getText();
        Funciones.buscandoCliente(busca);
        if(txtBuscarCliente.getText().equals("")){
            Funciones.limpiaTabla(t2);
            Funciones.consultarC(quer,t2);
        }
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void btnSeleccionarModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarModificarClienteActionPerformed
    int fila = tablaCliente.getSelectedRow();
    if (fila != -1) {
        String id = tablaCliente.getValueAt(fila, 0).toString();
        
        String sql = "SELECT * FROM cliente WHERE id_cliente = '" + id + "'";
        java.sql.ResultSet rs = new Controlador.Conectar().consultas(sql);
        txtMatricula.setEditable(false);
        try {
            if (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtApellidos.setText(rs.getString("apellido"));
                txtTelefono.setText(rs.getString("telefono"));
                txtCorreo.setText(rs.getString("correo"));
                txtMatricula.setText(rs.getString("id_cliente"));
                txtOcupacion.setText(rs.getString("ocupacion"));
                btnModificaciarCliente.setVisible(true);
                String tipoC = rs.getString("tipo_cliente");
                if ("Interno".equalsIgnoreCase(tipoC)) {
                    Interno.setSelected(true);
                    tipo="interno";
                    jpExtras.setVisible(true);
                } else {
                    Externo.setSelected(true);
                    folio= Long.parseLong(rs.getString("id_cliente"));
                    tipo="externo";
                    ocupa="ciudadano";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un cliente de la lista.");
    }
    }//GEN-LAST:event_btnSeleccionarModificarClienteActionPerformed

    private void btnModificaciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaciarClienteActionPerformed
        if (vacio()){           
            JOptionPane.showMessageDialog(null, "Error: Hay un campo vacío");
        } else {
            if(seleccionado()){
                int fila = tablaCliente.getSelectedRow();
                try {
                    String idOriginal = tablaCliente.getValueAt(fila, 0).toString();
                    String sql = "UPDATE cliente SET " +
                                 "nombre='" + txtNombre.getText().trim() + "', " +
                                 "apellido='" + txtApellidos.getText().trim() + "', " +
                                 "telefono='" + txtTelefono.getText().trim() + "', " +
                                 "correo='" + txtCorreo.getText().trim() + "', " +
                                 "id_cliente='" + idOriginal + "', " +
                                 "tipo_cliente='" + tipo + "', " +
                                 "ocupacion='" + txtOcupacion.getText().trim() + "' " +
                                 "WHERE id_cliente='" + idOriginal + "'";
                    new Controlador.Conectar().ejecutar(sql);
                    if (Controlador.Conectar.MENSAJE.equals("")) {
                        JOptionPane.showMessageDialog(null, "Cliente actualizado con éxito");
                        txtMatricula.setEditable(true);
                        Funciones.limpiaTabla(t2);
                        Funciones.consultarC(quer, t2);
                        limpia();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error en BD: " + Controlador.Conectar.MENSAJE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione el cliente en la tabla");
            }
        }
    }//GEN-LAST:event_btnModificaciarClienteActionPerformed
    
    public void insertarCliente(String x){   
        try{            
            new Controlador.Conectar().ejecutar(x);
            System.out.println(x);
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el cliente");
            limpia();
            Funciones.limpiaTabla(t2);
            Funciones.consultarC(quer,t2);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void limpia(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTelefono.setText(""); 
        txtCorreo.setText("");
        txtMatricula.setText("");
        txtOcupacion.setText("");
        Externo.setSelected(false);
        Interno.setSelected(false);
        btnModificaciarCliente.setVisible(false);
        tipo="";
        ocupa=""; 
        folio=0;
    }
    
    private boolean vacio() {
    if (txtNombre.getText().trim().isEmpty() || 
        txtApellidos.getText().trim().isEmpty() || 
        txtTelefono.getText().trim().isEmpty() || 
        txtCorreo.getText().trim().isEmpty() || 
        tipo=="" || ocupa=="" || folio==0) {       
        return true; 
    }
        return false;
    }
    
    public boolean seleccionado(){
        if (tablaCliente.getSelectedRow()!=-1){
           return true;
        }else return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Externo;
    private javax.swing.JRadioButton Interno;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnModificaciarCliente;
    private javax.swing.JButton btnSeleccionarModificarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel ib;
    private javax.swing.JLabel ib1;
    private javax.swing.JLabel ib2;
    private javax.swing.JLabel ib3;
    private javax.swing.JLabel ib4;
    private javax.swing.JLabel ib5;
    private javax.swing.JLabel ib6;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JPanel jpExtras;
    private javax.swing.JLabel lbTitulo6;
    private javax.swing.JLabel lbTitulo7;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
