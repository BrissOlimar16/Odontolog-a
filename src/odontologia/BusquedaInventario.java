package odontologia;

import Controlador.Funciones;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static odontologia.Interfaz.Pantalla;
import static odontologia.Interfaz.*;

/**
 *
 * @author Alexandra
 */
public class BusquedaInventario extends javax.swing.JPanel {
    public java.sql.Connection cp = null;
    
    public BusquedaInventario() {       
        initComponents();     
        cp = new Controlador.Conectar().conectaBD();
        t = (DefaultTableModel)tablaInventario.getModel();
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
        jPanel1 = new javax.swing.JPanel();
        lbDescripcion1 = new javax.swing.JLabel();
        lbDisponibles1 = new javax.swing.JLabel();
        lbTexto1 = new javax.swing.JLabel();
        lbPrecioCosto1 = new javax.swing.JLabel();
        lbMinimo1 = new javax.swing.JLabel();
        lbGanancia1 = new javax.swing.JLabel();
        lbMaximo1 = new javax.swing.JLabel();
        lbPorcentaje1 = new javax.swing.JLabel();
        txtDescripcion1 = new javax.swing.JTextField();
        txtPrecioCosto2 = new javax.swing.JTextField();
        txtPrecioVenta2 = new javax.swing.JTextField();
        txtDisponible1 = new javax.swing.JTextField();
        txtMinimo1 = new javax.swing.JTextField();
        txtMaximo1 = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        lbPrecioVenta1 = new javax.swing.JLabel();
        txtCodigoBarras1 = new javax.swing.JTextField();
        lbCodigo_Barras1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
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
                .addContainerGap(225, Short.MAX_VALUE))
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
        setPreferredSize(new java.awt.Dimension(506, 580));

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDescripcion1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDescripcion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescripcion1.setText("Descripción");
        jPanel1.add(lbDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 133, -1));

        lbDisponibles1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbDisponibles1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDisponibles1.setText("Hay");
        jPanel1.add(lbDisponibles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 70, -1));

        lbTexto1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbTexto1.setText("en este momento.");
        jPanel1.add(lbTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 117, -1));

        lbPrecioCosto1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioCosto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioCosto1.setText("Precio Costo");
        jPanel1.add(lbPrecioCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 97, -1));

        lbMinimo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbMinimo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMinimo1.setText("Mínimo");
        jPanel1.add(lbMinimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, -1));

        lbGanancia1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbGanancia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGanancia1.setText("Ganancia");
        jPanel1.add(lbGanancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 97, -1));

        lbMaximo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbMaximo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMaximo1.setText("Máximo");
        jPanel1.add(lbMaximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 68, -1));

        lbPorcentaje1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPorcentaje1.setText("%");
        jPanel1.add(lbPorcentaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 21, -1));
        jPanel1.add(txtDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 229, -1));
        jPanel1.add(txtPrecioCosto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 118, -1));

        txtPrecioVenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVenta2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 118, -1));
        jPanel1.add(txtDisponible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 71, -1));
        jPanel1.add(txtMinimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 71, -1));
        jPanel1.add(txtMaximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 71, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 118, -1));

        lbPrecioVenta1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lbPrecioVenta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrecioVenta1.setText("Precio Venta");
        jPanel1.add(lbPrecioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 97, -1));

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
        btnGuardar1.setText("Guardar Producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioVenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVenta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVenta2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Inventario.setVisible(true);
        //BusquedaInventario.setVisible(false);
        Inventario.setVisible(true);
        Inventario.setSize(Pantalla.getSize());
        Inventario.setLocationRelativeTo(null);       
        Funciones.limpiaTabla(t);
        Funciones.consultarU(query,t);
        //Pantalla.setVisible(false);        
//        this.add(in);
//        in.setBounds(0, 0, 466, 376);
//        in.setVisible(true);
//        Pantalla.removeAll();
//        Pantalla.add(in);
//        Pantalla.revalidate();
//        Pantalla.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    String buscar = txtCodigoBarras1.getText().trim();    
            try {
                int n = Integer.parseInt(buscar);
                Funciones.buscando(n+"");
//                txtBusquedaP.setText(n+"");
//                txtCodigo.setText("");
//                BusquedaProducto.setLocation(900, 150);
//                BusquedaProducto.setVisible(true);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de formato: El Código debe ser un número entero válido.");
                txtCodigoBarras1.setText("");
            } 
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Interfaz.Pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed



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
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lbCodigo_Barras1;
    private javax.swing.JLabel lbDescripcion1;
    private javax.swing.JLabel lbDisponibles1;
    private javax.swing.JLabel lbGanancia1;
    private javax.swing.JLabel lbMaximo1;
    private javax.swing.JLabel lbMinimo1;
    private javax.swing.JLabel lbPorcentaje1;
    private javax.swing.JLabel lbPrecioCosto1;
    private javax.swing.JLabel lbPrecioVenta1;
    private javax.swing.JLabel lbTexto1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtCodigoBarras1;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtDisponible1;
    private javax.swing.JTextField txtMaximo1;
    private javax.swing.JTextField txtMinimo1;
    private javax.swing.JTextField txtPrecioCosto2;
    private javax.swing.JTextField txtPrecioVenta2;
    // End of variables declaration//GEN-END:variables
}
