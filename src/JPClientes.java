
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class JPClientes extends javax.swing.JPanel {

    Conexion cnx;

    public JPClientes(Conexion cnx) {
        initComponents();

        TClientes.setRowHeight(50);

        String sql = "SELECT * FROM clientes";
        cnx.entablar(sql, TClientes);

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TClientes = new javax.swing.JTable();
        TFNom = new javax.swing.JTextField();
        TFRfc = new javax.swing.JTextField();
        TFTel = new javax.swing.JTextField();
        TFDir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFId = new javax.swing.JTextField();
        BReporte = new javax.swing.JButton();
        BActu = new javax.swing.JButton();
        TFCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BBorrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(97, 199, 195));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Datos del Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("RFC:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("TELÉFONO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DIRECCIÓN:");

        BRegistrar.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        BRegistrar.setText("REGISTRAR");
        BRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });

        TClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TClientes.setAlignmentX(1.0F);
        TClientes.setAlignmentY(1.0F);
        TClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TClientes.setRowMargin(0);
        TClientes.setSelectionBackground(new java.awt.Color(204, 255, 204));
        TClientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TClientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TClientes);

        TFNom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TFRfc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TFTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TFDir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID:");

        TFId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BReporte.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        BReporte.setText("REPORTE");
        BReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteActionPerformed(evt);
            }
        });

        BActu.setText("ACTUALIZAR");
        BActu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActuActionPerformed(evt);
            }
        });

        TFCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFClienteKeyPressed(evt);
            }
        });

        jLabel7.setText("BUSCAR");

        BBorrar.setText("Borrar Cliente");
        BBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TFTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(TFRfc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFNom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFDir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BRegistrar)
                        .addGap(34, 34, 34)
                        .addComponent(BActu)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(BReporte)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BBorrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BReporte)
                        .addGap(7, 7, 7)))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BRegistrar)
                            .addComponent(BActu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBorrar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        String id = TFId.getText();
        String nom = TFNom.getText();
        String rfc = TFRfc.getText();
        String tel = TFTel.getText();
        String dir = TFDir.getText();
        
        Clientes cl = new Clientes(id, nom, rfc, tel, dir);

        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "Hubo un error, intente de nuevo");
        } else if (cl.insertar(cnx) == 1){
            JOptionPane.showMessageDialog(this, "Cliente agregado");
            cnx.entablar("SELECT * FROM clientes", TClientes);
            TFId.setText("");
            TFNom.setText("");
            TFTel.setText("");
            TFRfc.setText("");
            TFDir.setText("");
        } 
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void BActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActuActionPerformed
        String id = TFId.getText();
        String nom = TFNom.getText();
        String rfc = TFRfc.getText();
        String tel = TFTel.getText();
        String dir = TFDir.getText();

        Clientes cl = new Clientes(id, nom, rfc, tel, dir);
        if (cl.actualizar(cnx) == 1) {
            String sql = "SELECT * FROM clientes";
            JOptionPane.showMessageDialog(this, "Datos Actualizados");
            cnx.entablar(sql, TClientes);

        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar");
        }
    }//GEN-LAST:event_BActuActionPerformed

    private void TFClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFClienteKeyPressed
        String name = TFCliente.getText();
        String sql = "SELECT * FROM clientes WHERE nombrec LIKE '%" + name + "%'";
        cnx.entablar(sql, TClientes);
    }//GEN-LAST:event_TFClienteKeyPressed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        int rensel = TClientes.getSelectedRow();
        if (rensel > -1) {
            DefaultTableModel datos = (DefaultTableModel) TClientes.getModel();
            String codigo = datos.getValueAt(rensel, 0).toString();

            String id = TFId.getText();
            String nom = TFNom.getText();
            String rfc = TFRfc.getText();
            String tel = TFTel.getText();
            String dir = TFDir.getText();

            Clientes cl = new Clientes(id, nom, rfc, tel, dir);
            if (cl.remover(cnx) == 1) {
                String sql = "SELECT * FROM clientes";
                JOptionPane.showMessageDialog(this, "Cliente Borrado");
                cnx.entablar(sql, TClientes);

            } else {
                JOptionPane.showMessageDialog(this, "Error al borrar");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Primero selecciona al cliente de la Tabla");

        }
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteActionPerformed
        String cla = TFId.getText();
        String reporte = System.getProperty("user.dir") + "/clientesv.jasper";

        Map parametros = new HashMap();
        parametros.put("clavePel", cla);

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteActionPerformed

    private void TClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TClientesMousePressed
        int ren = TClientes.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TClientes.getModel();

        if (ren >= 0) {
            TFId.setText(modelo.getValueAt(ren, 0).toString());
            TFNom.setText(modelo.getValueAt(ren, 1).toString());
            TFRfc.setText(modelo.getValueAt(ren, 2).toString());
            TFTel.setText(modelo.getValueAt(ren, 3).toString());
            TFDir.setText(modelo.getValueAt(ren, 4).toString());

        }
    }//GEN-LAST:event_TClientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActu;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JButton BReporte;
    private javax.swing.JTable TClientes;
    private javax.swing.JTextField TFCliente;
    private javax.swing.JTextField TFDir;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFNom;
    private javax.swing.JTextField TFRfc;
    private javax.swing.JTextField TFTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
