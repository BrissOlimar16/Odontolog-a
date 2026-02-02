
package odontologia;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Productos extends javax.swing.JPanel {
    
    public Productos() {
        initComponents();
        txtPrecioCosto1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        public void insertUpdate(javax.swing.event.DocumentEvent e) { calcularPrecio(); }
        public void removeUpdate(javax.swing.event.DocumentEvent e) { calcularPrecio(); }
        public void changedUpdate(javax.swing.event.DocumentEvent e) { calcularPrecio(); } });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoBarras = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        txtPrecioCosto1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        lbTitulo6 = new javax.swing.JLabel();
        txtPrecioVentaExterno = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        lbCodigo_Barras = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        lbPrecioCosto = new javax.swing.JLabel();
        lbDescripcion1 = new javax.swing.JLabel();
        lbGanancia = new javax.swing.JLabel();
        txtInsumo = new javax.swing.JTextField();
        lbPrecioVenta = new javax.swing.JLabel();
        lbDescripcion2 = new javax.swing.JLabel();
        lbPorcentaje = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        lbPrecioVenta1 = new javax.swing.JLabel();
        txtPrecioVentaInterno = new javax.swing.JTextField();
        lbPrecioCosto1 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Caja", "Bote", "Jeringa", "Bolsas" }));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2.0d, 2.0d, 300.0d, 1.0d));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Piezas", "Hojas", "Diques", "ml", "g", " " }));

        jPanel16.setBackground(new java.awt.Color(0, 0, 153));

        lbTitulo6.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTitulo6.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo6.setText("NUEVO PRODUCTO ");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, 0, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        lbCodigo_Barras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbCodigo_Barras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCodigo_Barras.setText("Código de Barras");

        lbDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion.setText("Descripción");

        lbPrecioCosto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioCosto.setText("Precio Costo");

        lbDescripcion1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion1.setText("Insumo");

        lbGanancia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbGanancia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGanancia.setText("Ganancia");

        lbPrecioVenta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioVenta.setText("Precio Venta Externo");

        lbDescripcion2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion2.setText("Presentación");

        lbPorcentaje.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPorcentaje.setText("%");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        lbPrecioVenta1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioVenta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioVenta1.setText("Precio Venta Interno");

        lbPrecioCosto1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioCosto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioCosto1.setText("Existencias");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

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

        btnModificar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnModificar.setText("Modificar Producto");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lbDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lbPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addComponent(lbPrecioVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPrecioVentaInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(186, 186, 186)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(lbPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(lbDescripcion2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(lbPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioVentaExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDescripcion1)
                            .addComponent(lbCodigo_Barras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigo_Barras)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbDescripcion1))
                            .addComponent(txtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbDescripcion))
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbDescripcion2))
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbPrecioCosto1))
                            .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbPrecioCosto))
                            .addComponent(txtPrecioCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGanancia)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbPorcentaje)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVentaExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrecioVenta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVentaInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrecioVenta1))
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        calcularPrecio();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (vacio()){
            JOptionPane.showMessageDialog(null, "Error: Hay un campo vacío");
        } else {  
            String idProducto = txtCodigoBarras.getText().trim();
            if (existeProducto(idProducto)) {
                JOptionPane.showMessageDialog(this, 
                    "El código '" + idProducto + "' ya existe en la base de datos.\n" +
                    "Por favor, use un código diferente o verifique el producto.", 
                    "Producto Duplicado", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            String nombre = txtInsumo.getText();
            try {
                int existencias = Integer.parseInt(txtExistencias.getText());
                double costo = Double.parseDouble(txtPrecioCosto1.getText());
                double precioExt = Double.parseDouble(txtPrecioVentaExterno.getText());
                double precioInt = Double.parseDouble(txtPrecioVentaInterno.getText());

                String descripcion = txtDescripcion.getText();
                int cant1 = ((Number) jSpinner2.getValue()).intValue();
                String pres1 = jComboBox1.getSelectedItem().toString();
                int cant2 = ((Number) jSpinner3.getValue()).intValue();
                String pres2 = jComboBox2.getSelectedItem().toString();

                String descripcionFinal = descripcion + " | "+ cant1 + " " + pres1 + " "+ cant2 + " " + pres2;
                boolean guardado = Controlador.Funciones.guardarProducto(
                        idProducto, nombre, descripcionFinal, existencias, costo, precioExt, precioInt);

                if (guardado) {
                    JOptionPane.showMessageDialog(this, "Producto guardado correctamente");
                    limpia();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar el producto");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error: Verifique que los precios y existencias sean números válidos.");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Interfaz.Pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (vacio()) {
            JOptionPane.showMessageDialog(this, "Error: Hay campos vacíos");
            return;
        }
        try {
            String idProducto = txtCodigoBarras.getText();
            String nombre = txtInsumo.getText();
            int existencias = Integer.parseInt(txtExistencias.getText());
            double costo = Double.parseDouble(txtPrecioCosto1.getText());
            double precioExt = Double.parseDouble(txtPrecioVentaExterno.getText());
            double precioInt = Double.parseDouble(txtPrecioVentaInterno.getText());
            String descripcion = txtDescripcion.getText();

            int cant1 = ((Number) jSpinner2.getValue()).intValue();
            String pres1 = jComboBox1.getSelectedItem().toString();
            int cant2 = ((Number) jSpinner3.getValue()).intValue();
            String pres2 = jComboBox2.getSelectedItem().toString();
            String descripcionFinal = descripcion + " | " + cant1 + " " + pres1 + " + " + cant2 + " " + pres2;

            boolean actualizado = Controlador.Funciones.modificarProducto(
                    idProducto, nombre, descripcionFinal, existencias, costo, precioExt, precioInt);
            if (actualizado) {
                JOptionPane.showMessageDialog(this, "Producto actualizado correctamente");
                limpia();
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el producto");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que los precios y existencias sean números válidos.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public void traerProducto(String idProducto) {
        String sql = "SELECT p.id_producto, p.nombre, p.descripcion, p.costo, p.existencias, " +
                     "pp_ext.precio AS precio_externo, pp_int.precio AS precio_interno FROM producto p " +
                     "LEFT JOIN precioproducto pp_ext ON p.id_producto = pp_ext.id_producto AND pp_ext.tipo_cliente = 'Externo' " +
                     "LEFT JOIN precioproducto pp_int ON p.id_producto = pp_int.id_producto AND pp_int.tipo_cliente = 'Interno' " +
                     "WHERE CAST(p.id_producto AS TEXT) = '" + idProducto + "'";
        java.sql.ResultSet rs = new Controlador.Conectar().consultas(sql);

        try {
            if (rs == null) {
                System.out.println("Error: El ResultSet regresó nulo. Verifica la conexión o la sintaxis.");
                return; 
            }
            if (rs.next()) {
                txtCodigoBarras.setText(rs.getString("id_producto"));
                txtInsumo.setText(rs.getString("nombre"));
                txtDescripcion.setText(rs.getString("descripcion"));
                txtPrecioCosto1.setText(rs.getString("costo"));
                txtExistencias.setText(rs.getString("existencias"));
                txtPrecioVentaExterno.setText(rs.getString("precio_externo"));
                txtPrecioVentaInterno.setText(rs.getString("precio_interno"));

                System.out.println("Producto cargado: " + rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el producto con ID: " + idProducto);
            }
        } catch (Exception ex) {
            System.err.println("Error al procesar el ResultSet: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    private void calcularPrecio() {
        try {
            double precio = txtPrecioCosto1.getText().trim().isEmpty() ? 0 : Double.parseDouble(txtPrecioCosto1.getText());
            double porcentaje = Double.parseDouble(jSpinner1.getValue().toString());       
            double precioFinal = precio * (1 + (porcentaje / 100.0));
            txtPrecioVentaExterno.setText(String.format("%.2f", precioFinal));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato: El Código debe ser un número entero válido.");
            txtPrecioCosto1.setText("");
        }
    }
    
    public void limpia(){
        txtInsumo.setText("");
        txtCodigoBarras.setText("");
        txtDescripcion.setText("");
        txtPrecioCosto1.setText("");
        txtExistencias.setText("");
        txtPrecioVentaExterno.setText("");
        txtPrecioVentaInterno.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);    
    }
    
    private boolean vacio() {
        if (txtCodigoBarras.getText().trim().isEmpty() || 
            txtInsumo.getText().trim().isEmpty() || 
            txtDescripcion.getText().trim().isEmpty() || 
            txtPrecioCosto1.getText().trim().isEmpty() || 
            txtExistencias.getText().trim().isEmpty() || 
            txtPrecioVentaExterno.getText().trim().isEmpty() || 
            txtPrecioVentaInterno.getText().trim().isEmpty() || 
            "Selecciona".equals(jComboBox1.getSelectedItem()) || 
            "Selecciona".equals(jComboBox2.getSelectedItem())) {   
        return true; 
    }
        return false;
    }

    public static boolean existeProducto(String idProducto) {
        return Controlador.Funciones.existeRegistro("producto", "id_producto", idProducto);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel lbCodigo_Barras;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDescripcion1;
    private javax.swing.JLabel lbDescripcion2;
    private javax.swing.JLabel lbGanancia;
    private javax.swing.JLabel lbPorcentaje;
    private javax.swing.JLabel lbPrecioCosto;
    private javax.swing.JLabel lbPrecioCosto1;
    private javax.swing.JLabel lbPrecioVenta;
    private javax.swing.JLabel lbPrecioVenta1;
    public javax.swing.JLabel lbTitulo6;
    public javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencias;
    public javax.swing.JTextField txtInsumo;
    private javax.swing.JTextField txtPrecioCosto1;
    private javax.swing.JTextField txtPrecioVentaExterno;
    private javax.swing.JTextField txtPrecioVentaInterno;
    // End of variables declaration//GEN-END:variables
}
