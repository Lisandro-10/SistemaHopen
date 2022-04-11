/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hopen.SistemaHopen.UI;

import com.hopen.SistemaHopen.services.ObraService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Martiniano
 */
public class Menu extends javax.swing.JFrame {

    @Autowired
    private ObraService obraS;
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setTitle("Menu");
        TextPrompt dataholderBuscar = new TextPrompt("Ingrese el nombre del titular de la obra a buscar",tfBuscar);
        dataholderBuscar.setShowPromptOnce(true);
        mostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cargarPresupuesto = new javax.swing.JButton();
        cargarFactura = new javax.swing.JButton();
        btnEditarObra = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaObras = new javax.swing.JTable();
        tfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        MTbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1007, 491));
        setPreferredSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 500));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cargarPresupuesto.setBackground(new java.awt.Color(0, 204, 255));
        cargarPresupuesto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        cargarPresupuesto.setForeground(new java.awt.Color(255, 255, 255));
        cargarPresupuesto.setText("Cargar presupuesto");
        cargarPresupuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cargarPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPresupuestoActionPerformed(evt);
            }
        });

        cargarFactura.setBackground(new java.awt.Color(0, 204, 255));
        cargarFactura.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        cargarFactura.setForeground(new java.awt.Color(255, 255, 255));
        cargarFactura.setText("Cargar factura");
        cargarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cargarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarFacturaActionPerformed(evt);
            }
        });

        btnEditarObra.setBackground(new java.awt.Color(0, 204, 255));
        btnEditarObra.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEditarObra.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarObra.setText("Editar datos de obra");
        btnEditarObra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarObraActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 153, 204));
        btnIngresar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar una obra nueva");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaObras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titular", "Total Presupuesto", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaObras);
        if (tablaObras.getColumnModel().getColumnCount() > 0) {
            tablaObras.getColumnModel().getColumn(0).setResizable(false);
            tablaObras.getColumnModel().getColumn(1).setResizable(false);
            tablaObras.getColumnModel().getColumn(2).setResizable(false);
        }

        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 135, 9));
        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        MTbtn.setBackground(new java.awt.Color(255, 135, 9));
        MTbtn.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        MTbtn.setForeground(new java.awt.Color(255, 255, 255));
        MTbtn.setText("Mostrar todas");
        MTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cargarFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarObra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargarPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MTbtn)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnEditarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargarPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(MTbtn)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTbtnActionPerformed
        // TODO add your handling code here:
        mostrarTabla();
    }//GEN-LAST:event_MTbtnActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(tfBuscar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No puede estar vacío el campo");
        }else{
            buscarDatosObra(tfBuscar.getText());
            tfBuscar.setText("");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
        //      try {
            // TODO add your handling code here:
            //         mostrarTabla(tfBuscar.getText());
            //      } catch (Exception ex) {
            //         ex.getMessage();
            //     }
    }//GEN-LAST:event_tfBuscarKeyReleased

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        new CargarObra().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEditarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarObraActionPerformed
        // TODO add your handling code here:
        new EditarObra().setVisible(true);
        dispose();
        // tablaObras.
    }//GEN-LAST:event_btnEditarObraActionPerformed

    private void cargarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarFacturaActionPerformed
        // TODO add your handling code here:
        new CargarFactura().setVisible(true);
        dispose();
    }//GEN-LAST:event_cargarFacturaActionPerformed

    private void cargarPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPresupuestoActionPerformed
        // TODO add your handling code here:
        new CargarPresupuesto().setVisible(true);
        dispose();
    }//GEN-LAST:event_cargarPresupuestoActionPerformed
        
    public String getTitular(){
        String titular = tfBuscar.getText();
        /*int fila = tablaObras.getSelectedRow();
        System.out.println("Numero de fila: "+fila);
        String titular = tablaObras.getValueAt(3,0).toString();*/
        return titular;
    }
          
    private void buscarDatosObra(String input){
        DefaultTableModel model = new DefaultTableModel(); 
        
        model.addColumn("Titular");
        model.addColumn("Total presupuesto");
        model.addColumn("Fecha presupuesto");
        
        tablaObras.setModel(model);
        
        String[] dato = new String[3];
        
        PreparedStatement ps;
        
        try{
        Connection con = ConexionDB.getConnection();
        String sql = "SELECT o.titular,o.total_presupuesto,o.fecha_presupuesto FROM obra o WHERE titular LIKE ?";
        ps = ConexionDB.getConnection().prepareStatement(sql);
        ps.setString(1, input+"%");
        
        ResultSet resultSet = ps.executeQuery();
        
        while(resultSet.next()){
            dato[0] = resultSet.getString(1);
            dato[1] = resultSet.getString(2);
            dato[2] = resultSet.getString(3);
            model.addRow(dato);
        }
        
        ConexionDB.endConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    private void mostrarTabla() {   
           
        DefaultTableModel model = new DefaultTableModel(); 
        
        model.addColumn("Titular");
        model.addColumn("Total presupuesto");
        model.addColumn("Fecha presupuesto");
        
        tablaObras.setModel(model);
        
        String[] dato = new String[3];
        
        PreparedStatement ps;
        
        try{
        Connection con = ConexionDB.getConnection();
        String sql = "SELECT o.titular,o.total_presupuesto,o.fecha_presupuesto FROM obra o";
        ps = ConexionDB.getConnection().prepareStatement(sql);
        
        ResultSet resultSet = ps.executeQuery();
        
        while(resultSet.next()){
            dato[0] = resultSet.getString(1);
            dato[1] = resultSet.getString(2);
            dato[2] = resultSet.getString(3);
            model.addRow(dato);
        }
        
        ConexionDB.endConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Menu().setVisible(true);          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MTbtn;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarObra;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton cargarFactura;
    private javax.swing.JButton cargarPresupuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaObras;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
