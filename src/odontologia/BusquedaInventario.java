package odontologia;

import Controlador.Funciones;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static odontologia.Interfaz.Pantalla;
import static odontologia.Interfaz.*;

/**
 *
 * @author David
 */
public class BusquedaInventario extends javax.swing.JPanel {
    public java.sql.Connection cp = null;
    
    public BusquedaInventario() {       
        initComponents();     
        cp = new Controlador.Conectar().conectaBD();
        t = (DefaultTableModel)tablaInventario.getModel();
        txtPrecioCosto2.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        public void insertUpdate(javax.swing.event.DocumentEvent e) { calcularPrecio(); }
        public void removeUpdate(javax.swing.event.DocumentEvent e) { calcularPrecio(); }
        public void changedUpdate(javax.swing.event.DocumentEvent e) { calcularPrecio(); } });
        panel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inventario = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbDisponibles1 = new javax.swing.JLabel();
        lbTexto1 = new javax.swing.JLabel();
        lbPrecioCosto1 = new javax.swing.JLabel();
        lbMinimo1 = new javax.swing.JLabel();
        lbGanancia1 = new javax.swing.JLabel();
        lbPorcentaje1 = new javax.swing.JLabel();
        txtPrecioCosto2 = new javax.swing.JTextField();
        txtPrecioExterno = new javax.swing.JTextField();
        txtDisponible = new javax.swing.JTextField();
        txtMasExistencias = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        lbPrecioVenta1 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        lbMinimo2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbPrecioVenta2 = new javax.swing.JLabel();
        txtPrecioVentaInterno = new javax.swing.JTextField();
        txtCodigoBarras1 = new javax.swing.JTextField();
        lbCodigo_Barras1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        Inventario.setTitle("INVENTARIO");

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción del producto", "Costo", "Precio venta", "Existencia"
            }
        ));
        jScrollPane1.setViewportView(tablaInventario);
        if (tablaInventario.getColumnModel().getColumnCount() > 0) {
            tablaInventario.getColumnModel().getColumn(0).setPreferredWidth(170);
            tablaInventario.getColumnModel().getColumn(0).setMaxWidth(170);
            tablaInventario.getColumnModel().getColumn(1).setPreferredWidth(550);
            tablaInventario.getColumnModel().getColumn(1).setMaxWidth(550);
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
        jLabel69.setText("$00.00");

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
                .addContainerGap(262, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(506, 580));
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel7.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("MÁS PRODUCTO ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre.setText("Nombre");
        panel.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 290, -1));

        lbDisponibles1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDisponibles1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDisponibles1.setText("Hay");
        panel.add(lbDisponibles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 70, -1));

        lbTexto1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbTexto1.setText("en este momento.");
        panel.add(lbTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 117, -1));

        lbPrecioCosto1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioCosto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioCosto1.setText("Precio Costo");
        panel.add(lbPrecioCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 97, -1));

        lbMinimo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbMinimo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMinimo1.setText("al inventario.");
        panel.add(lbMinimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 110, -1));

        lbGanancia1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbGanancia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGanancia1.setText("Ganancia");
        panel.add(lbGanancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 97, -1));

        lbPorcentaje1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPorcentaje1.setText("%");
        panel.add(lbPorcentaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 21, -1));
        panel.add(txtPrecioCosto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 118, -1));
        panel.add(txtPrecioExterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 118, -1));
        panel.add(txtDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 71, -1));
        panel.add(txtMasExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 71, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(20, null, null, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        panel.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 118, -1));

        lbPrecioVenta1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioVenta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioVenta1.setText("Precio Venta Externo");
        panel.add(lbPrecioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, -1));

        lb.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb.setText("Nombre");
        panel.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 133, -1));

        lbMinimo2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbMinimo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMinimo2.setText("Agregar");
        panel.add(lbMinimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 80, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 550, 10));

        lbPrecioVenta2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioVenta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioVenta2.setText("Precio Venta Interno");
        panel.add(lbPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        panel.add(txtPrecioVentaInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, -1));

        txtCodigoBarras1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoBarras1KeyPressed(evt);
            }
        });

        lbCodigo_Barras1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbCodigo_Barras1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCodigo_Barras1.setText("Código de Barras");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("AGREGAR INVENTARIO");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jButton2.setText("Reporte de Inventario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnGuardar1.setText("Agregar Inventario");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lbCodigo_Barras1)
                                .addGap(26, 26, 26)
                                .addComponent(txtCodigoBarras1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigo_Barras1)
                            .addComponent(txtCodigoBarras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inventario.setVisible(true);
        Inventario.setSize(Pantalla.getSize());
        Inventario.setLocationRelativeTo(null);       
        Funciones.limpiaTabla(t);
        Funciones.consultarU(query,t);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String buscar = txtCodigoBarras1.getText().trim(); 
        if(buscar.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: El campo de código está vacío");
        } else {
            try {
                // No es estrictamente necesario convertirlo a int si tu id_producto es String (varchar)
                // pero lo mantenemos para validar que sean solo números según tu requisito
                Integer.parseInt(buscar); 

                // Llamamos al nuevo método
                Funciones.buscandoExistencias(buscar);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de formato: El Código debe ser un número entero válido.");
                txtCodigoBarras1.setText("");
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Interfaz.Pantalla.setVisible(true);
        this.setVisible(false);
        panel.setVisible(false);
        txtCodigoBarras1.setText("");
        limpia();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        calcularPrecio();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
    try {
        String id = txtCodigoBarras1.getText().trim();
        String nombre = lbNombre.getText();
        double costo = Double.parseDouble(txtPrecioCosto2.getText());
        double pExterno = Double.parseDouble(txtPrecioExterno.getText());
        double pInterno = Double.parseDouble(txtPrecioVentaInterno.getText());
        
        String masExistencias = txtMasExistencias.getText().trim();
        int cantidadSumar = masExistencias.isEmpty() ? 0 : Integer.parseInt(masExistencias);

        Controlador.Funciones.ModificarExistencias(id, nombre, costo, cantidadSumar, pExterno, pInterno);
        
        panel.setVisible(false);
        txtCodigoBarras1.setText("");
        limpia();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Asegúrese de que los precios y cantidades sean números.");
    }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtCodigoBarras1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarras1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {btnbuscar.doClick();}
    }//GEN-LAST:event_txtCodigoBarras1KeyPressed
    
    private void calcularPrecio() {
        try {
            double precio = txtPrecioCosto2.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtPrecioCosto2.getText());
            double porcentaje = Double.parseDouble(jSpinner2.getValue().toString());       
            double precioFinal = precio * (1 + (porcentaje / 100.0));
            txtPrecioExterno.setText(String.format("%.2f", precioFinal));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato: El Código debe ser un número entero válido.");
            txtPrecioCosto2.setText("");
        }
    }

    public static void traerExistencias(String query) {
        java.sql.ResultSet r = new Controlador.Conectar().consultas(query);
        try {
            if (r.next()) {            
                lbNombre.setText(r.getString("nombre"));
                txtPrecioCosto2.setText(String.valueOf(r.getDouble("costo")));
                txtPrecioExterno.setText(String.valueOf(r.getDouble("precio_externo")));
                txtPrecioVentaInterno.setText(String.valueOf(r.getDouble("precio_interno")));
                txtDisponible.setText(r.getString("existencias"));           
                JOptionPane.showMessageDialog(null, "Producto encontrado con éxito.");
                panel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "El código de producto no existe.");
            }
        } catch (Exception ex) {
            System.out.println("Error al extraer datos: " + ex.getMessage());
        }
    }
    
    public void limpia(){
        lbNombre.setText("");
        txtPrecioCosto2.setText("");
        txtPrecioExterno.setText("");
        txtPrecioVentaInterno.setText("");
        txtDisponible.setText("");
        txtMasExistencias.setText("");   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Inventario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbCodigo_Barras1;
    private javax.swing.JLabel lbDisponibles1;
    private javax.swing.JLabel lbGanancia1;
    private javax.swing.JLabel lbMinimo1;
    private javax.swing.JLabel lbMinimo2;
    public static javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPorcentaje1;
    private javax.swing.JLabel lbPrecioCosto1;
    private javax.swing.JLabel lbPrecioVenta1;
    private javax.swing.JLabel lbPrecioVenta2;
    private javax.swing.JLabel lbTexto1;
    private javax.swing.JLabel lbTitulo;
    public static javax.swing.JPanel panel;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtCodigoBarras1;
    public static javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtMasExistencias;
    public static javax.swing.JTextField txtPrecioCosto2;
    public static javax.swing.JTextField txtPrecioExterno;
    public static javax.swing.JTextField txtPrecioVentaInterno;
    // End of variables declaration//GEN-END:variables
}
