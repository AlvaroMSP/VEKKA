
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author drlias
 */
public class JPPedidos extends javax.swing.JPanel {

    Conexion cnx;
    ImageIcon foto;
    String codigoe = "E01";
    String folio = "0";

    public JPPedidos(Conexion cnx) {
        initComponents();

        TListaProductos.setRowHeight(80);

        this.cnx = cnx;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFCodigop = new javax.swing.JTextField();
        LFoto = new javax.swing.JLabel();
        LSubir = new javax.swing.JLabel();
        BLeer = new javax.swing.JButton();
        SCantidad = new javax.swing.JSpinner();
        SPrecio = new javax.swing.JSpinner();
        TFNombrep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnRegistrar = new javax.swing.JButton();
        BtnReporte = new javax.swing.JButton();
        BtnDel = new javax.swing.JButton();
        BtnUp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TListaProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        LTotal = new javax.swing.JLabel();
        PProducto = new javax.swing.JPanel();
        BBuscar = new javax.swing.JButton();
        TFCliente = new javax.swing.JTextField();
        BCrearP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("LISTA DE PRODUCTOS");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Nombre Producto:");

        TFBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFBuscarKeyPressed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Código del producto:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Precio:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("Cantidad:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("Foto:");

        TFCodigop.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TFCodigop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCodigopKeyPressed(evt);
            }
        });

        LFoto.setBackground(new java.awt.Color(204, 51, 255));
        LFoto.setFocusable(false);
        LFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LFoto.setName(""); // NOI18N
        LFoto.setOpaque(true);

        LSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/up.png"))); // NOI18N
        LSubir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LSubir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSubirMousePressed(evt);
            }
        });

        BLeer.setText("LEER");
        BLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLeerActionPerformed(evt);
            }
        });

        SCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        TFNombrep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setText("Nombre del producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGap(67, 67, 67))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(TFNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(TFCodigop, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LSubir)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLeer)
                    .addComponent(TFCodigop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LSubir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        BtnRegistrar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        BtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/r.png"))); // NOI18N
        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnReporte.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        BtnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/re.png"))); // NOI18N
        BtnReporte.setText("REPORTE");
        BtnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteActionPerformed(evt);
            }
        });

        BtnDel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del.png"))); // NOI18N
        BtnDel.setText("BORRAR");
        BtnDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelActionPerformed(evt);
            }
        });

        BtnUp.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        BtnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ac.png"))); // NOI18N
        BtnUp.setText("ACTUALIZAR");
        BtnUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnReporte)
                        .addGap(31, 31, 31))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDel)
                    .addComponent(BtnUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad", "Importe", "Diseño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TListaProductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TListaProductos);

        jLabel7.setText("Total: $");

        LTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LTotal.setText("0.00 ");
        LTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BBuscar.setText("BUSCAR");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        TFCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BCrearP.setText("Nuevo Pedido");
        BCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCrearPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRAR PEDIDO");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Cliente:");

        javax.swing.GroupLayout PProductoLayout = new javax.swing.GroupLayout(PProducto);
        PProducto.setLayout(PProductoLayout);
        PProductoLayout.setHorizontalGroup(
            PProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BCrearP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PProductoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscar)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(68, 68, 68))
        );
        PProductoLayout.setVerticalGroup(
            PProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCrearP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTotal)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        String id = null;
        String cant = SCantidad.getValue().toString();
        String precio = SPrecio.getValue().toString();
        String status = "Pendiente";
        String idProd = TFCodigop.getText();

        Detalles ded = new Detalles(id, cant, foto, precio, status, folio, idProd);

        if (ded.insertar(cnx) == 1) {
            JOptionPane.showMessageDialog(this, "Producto agregado");
            String sql = "SELECT iddetalles, idproductos, nombrep, preciod, cantidadp, preciod*cantidadp AS Importe, fotod "
                    + "FROM detalles "
                    + "JOIN productos ON idproductos = productos_idproductos WHERE pedidos_folio = '" + folio + "'";
            cnx.entablar(sql, TListaProductos);
            calcularTotal(TListaProductos, 5, LTotal);
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error, intente de nuevo");
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void LSubirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSubirMousePressed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            foto = new ImageIcon(archivo.getPath());
            LFoto.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), 200, 200)));
        }
    }//GEN-LAST:event_LSubirMousePressed

    private void TFBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFBuscarKeyPressed
        String name = TFBuscar.getText();
        String sql = "SELECT *   FROM productos WHERE nombrep LIKE '%" + name + "%'";
        cnx.entablar(sql, TListaProductos);
    }//GEN-LAST:event_TFBuscarKeyPressed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String name = TFBuscar.getText();
        String sql = "SELECT *   FROM productos WHERE nombrep LIKE '%" + name + "%'";
        cnx.entablar(sql, TListaProductos);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpActionPerformed
        int rensel = TListaProductos.getSelectedRow();
        if (rensel > -1) {
            DefaultTableModel datos = (DefaultTableModel) TListaProductos.getModel();
            String iddetalles = datos.getValueAt(rensel, 0).toString();

            String cant = SCantidad.getValue().toString();
            String pre = SPrecio.getValue().toString();
            String st = "Pendiente";
            String pro = TFCodigop.getText();

            Detalles det = new Detalles(iddetalles, cant, foto, pre, st, folio, pro);

            if (det.actualizar(cnx) == 1) {
                String sql = "SELECT iddetalles, idproductos, nombrep, preciod, cantidadp, preciod*cantidadp AS Importe, fotod "
                        + "FROM detalles "
                        + "JOIN productos ON idproductos = productos_idproductos WHERE pedidos_folio = '" + folio + "'";
                JOptionPane.showMessageDialog(this, "Producto actualizado");
                cnx.entablar(sql, TListaProductos);
                calcularTotal(TListaProductos, 5, LTotal);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo, consultalo en el administrador del sistema");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar");
        }
    }//GEN-LAST:event_BtnUpActionPerformed

    private void BtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelActionPerformed
        int rensel = TListaProductos.getSelectedRow();
        if (rensel > -1) {
            DefaultTableModel datos = (DefaultTableModel) TListaProductos.getModel();
            String iddetalles = datos.getValueAt(rensel, 0).toString();
            Detalles det = new Detalles(iddetalles);
            if (det.remover(cnx) == 1) {
                String sql = "SELECT iddetalles, idproductos, nombrep, preciod, cantidadp, preciod*cantidadp AS Importe, fotod "
                        + "FROM detalles "
                        + "JOIN productos ON idproductos = productos_idproductos WHERE pedidos_folio = '" + folio + "'";
                JOptionPane.showMessageDialog(this, "Producto cancelado");
                cnx.entablar(sql, TListaProductos);
                calcularTotal(TListaProductos, 5, LTotal);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo, consultalo en el administrador del sistema");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Primero selecciona el pedido de la Tabla");

        }
    }//GEN-LAST:event_BtnDelActionPerformed

    private void BtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteActionPerformed
        String cla = TFCliente.getText();
        String reporte = System.getProperty("user.dir") + "/productos.jasper";

        Map parametros = new HashMap();
        parametros.put("clavePel", cla);

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BtnReporteActionPerformed

    private void BLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLeerActionPerformed
        JDLector jdl = new JDLector(this, true);
        jdl.setVisible(true);
    }//GEN-LAST:event_BLeerActionPerformed

    private void BCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCrearPActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TListaProductos.getModel();
        String cli = TFCliente.getText();

        Pedidos ped = new Pedidos(cli, codigoe);
        if (ped.insertar(cnx) == 1) {
            modelo.setRowCount(0);
            //poner codigo para mostrar el control de los paneles
            folio = cnx.obtenerDato("SELECT MAX(folio) FROM pedidos");
            JOptionPane.showMessageDialog(this, "Listo para agregar productos");

        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_BCrearPActionPerformed

    private void TListaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TListaProductosMousePressed
        int ren = TListaProductos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TListaProductos.getModel();

        if (ren >= 0) {
            TFCodigop.setText(modelo.getValueAt(ren, 0).toString());
            TFNombrep.setText(modelo.getValueAt(ren, 1).toString());
            SCantidad.setValue(Integer.valueOf(modelo.getValueAt(ren, 2).toString()));
            SPrecio.setValue(Integer.valueOf(modelo.getValueAt(ren, 3).toString()));
            foto = new ImageIcon(cnx.escalarImagen(((ImageIcon) modelo.getValueAt(ren, 5)).getImage(), LFoto.getWidth(), LFoto.getHeight()));
            LFoto.setIcon(foto);
        }
    }//GEN-LAST:event_TListaProductosMousePressed

    private void TFCodigopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCodigopKeyPressed
        if (evt.getKeyChar() == '\n') {
            
            String id = TFCodigop.getText();
            
            String nom = cnx.obtenerDato("SELECT nombrep FROM productos WHERE idproductos = '" + id + "'");
            String pre = cnx.obtenerDato("SELECT preciosugerido FROM productos WHERE idproductos = '" + id + "'");

            if (id.equals("") == false && pre.equals("")==false) {
                TFNombrep.setText(nom);
                SPrecio.setValue(Integer.valueOf(pre));
            } else {
                JOptionPane.showMessageDialog(this, "El producto no existe");
            }
        }
    }//GEN-LAST:event_TFCodigopKeyPressed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        
    }//GEN-LAST:event_BBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BCrearP;
    private javax.swing.JButton BLeer;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnDel;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnReporte;
    private javax.swing.JButton BtnUp;
    private javax.swing.JLabel LFoto;
    private javax.swing.JLabel LSubir;
    private javax.swing.JLabel LTotal;
    private javax.swing.JPanel PProducto;
    private javax.swing.JSpinner SCantidad;
    private javax.swing.JSpinner SPrecio;
    private javax.swing.JTextField TFBuscar;
    private javax.swing.JTextField TFCliente;
    private javax.swing.JTextField TFCodigop;
    private javax.swing.JTextField TFNombrep;
    private javax.swing.JTable TListaProductos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void setLectura(String texto) {
        TFNombrep.setText(texto);
        String nombre = texto;

        String id = cnx.obtenerDato("SELECT idproductos FROM productos WHERE nombrep = '" + nombre + "'");
        String pre = cnx.obtenerDato("SELECT preciosugerido FROM productos WHERE nombrep = '" + nombre + "'");
        //foto = cnx.obtenerImagen("SELECT fotop FROM productos WHERE nombrep = '" + nombre + "'");

        if (id.equals("") == false) {
            TFCodigop.setText(id);
            SPrecio.setValue(Integer.valueOf(pre));
            //LFoto.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), LFoto.getWidth(), LFoto.getHeight())));
        } else {
            JOptionPane.showMessageDialog(this, "El producto no existe");
        }

    }

    private void calcularTotal(JTable tabla, int col, JLabel et) {
        DefaultTableModel datos = (DefaultTableModel) tabla.getModel();
        double total = 0;
        for (int r = 0; r < datos.getRowCount(); r++) {
            total += Double.valueOf(datos.getValueAt(r, col).toString());
        }
        et.setText(String.format("%.2f", total));
    }
}
