/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hopen.SistemaHopen.UI;

import com.hopen.SistemaHopen.entities.Factura;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Martiniano
 */
public class CargarFactura extends javax.swing.JFrame {

    /**
     * Creates new form CargarFactura
     */
    public CargarFactura() {
        initComponents();
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
        UITxt = new javax.swing.JLabel();
        ObreroIcon = new javax.swing.JLabel();
        titularLbl = new javax.swing.JLabel();
        numeroFac = new javax.swing.JTextField();
        sepTitular = new javax.swing.JSeparator();
        MTLbl = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        sepMT = new javax.swing.JSeparator();
        fechaLbl = new javax.swing.JLabel();
        sepFecha = new javax.swing.JSeparator();
        SalirBtn = new javax.swing.JButton();
        SigBtn = new javax.swing.JButton();
        fechaFac = new com.toedter.calendar.JDateChooser();
        titularLbl1 = new javax.swing.JLabel();
        sepTitular1 = new javax.swing.JSeparator();
        tfImagen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        UITxt.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        UITxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UITxt.setText("Ingrese los datos de factura");

        ObreroIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ObreroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura.png"))); // NOI18N

        titularLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        titularLbl.setText("Numero Factura");

        numeroFac.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numeroFac.setToolTipText("Hola q onda\n");
        numeroFac.setBorder(null);
        numeroFac.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        numeroFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numeroFacMouseClicked(evt);
            }
        });
        numeroFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroFacActionPerformed(evt);
            }
        });

        MTLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        MTLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MTLbl.setText("Monto ");

        monto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        monto.setBorder(null);
        monto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoKeyTyped(evt);
            }
        });

        fechaLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        fechaLbl.setText("Fecha");

        SalirBtn.setBackground(new java.awt.Color(255, 153, 51));
        SalirBtn.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        SalirBtn.setForeground(new java.awt.Color(255, 255, 255));
        SalirBtn.setText("Volver");
        SalirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        SigBtn.setBackground(new java.awt.Color(0, 204, 255));
        SigBtn.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        SigBtn.setForeground(new java.awt.Color(255, 255, 255));
        SigBtn.setText("Guardar");
        SigBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigBtnActionPerformed(evt);
            }
        });

        fechaFac.setBackground(new java.awt.Color(255, 255, 255));

        titularLbl1.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        titularLbl1.setText("Imagen Factura");

        tfImagen.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tfImagen.setToolTipText("Hola q onda\n");
        tfImagen.setBorder(null);
        tfImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfImagenMouseClicked(evt);
            }
        });
        tfImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfImagenActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SigBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sepTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sepMT, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(fechaLbl)
                                    .addGap(111, 111, 111)
                                    .addComponent(fechaFac, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(MTLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sepFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(titularLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroFac, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sepTitular1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(titularLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titularLbl)
                    .addComponent(numeroFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MTLbl)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepMT, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLbl))
                .addGap(9, 9, 9)
                .addComponent(sepFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titularLbl1)
                    .addComponent(tfImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SigBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigBtnActionPerformed
        // TODO add your handling code here:
        String numeroFactura = numeroFac.getText();
        double totalFactura = Double.parseDouble(monto.getText());
        //Para convertir fecha de java en fecha de sql
        java.util.Date fecha = fechaFac.getDate();
        long timeInMilliSecs = fecha.getTime();
        java.sql.Date fechaDB = new java.sql.Date(timeInMilliSecs);

        Factura factura = new Factura();
        factura.setNumeroFactura(numeroFactura);
        factura.setFechaFactura(fechaDB);
        factura.setTotalFactura(totalFactura);
        factura.setImagenFactura();

        PreparedStatement ps;

        try{
            Connection con = ConexionDB.getConnection();
            String sql ="INSERT INTO factura (numero_factura, total_factura, fecha_factura, imagen_factura) VALUES (?,?,?,?)";
            ps = ConexionDB.getConnection().prepareStatement(sql);

            ps.setString(1, numeroFactura);
            ps.setDouble(2, totalFactura);
            ps.setDate(3, fechaDB);
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos guardados");
            ConexionDB.endConnection(con);

        }catch(Exception e){
            e.printStackTrace();
        }
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_SigBtnActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Si vuelve atras no se guardarán los datos.", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
            == JOptionPane.YES_OPTION){
            dispose();
            try {
                new Menu().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(CargarObra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();

        if ((car<'0' || car>'9') && monto.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_montoKeyTyped

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void numeroFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroFacActionPerformed

    private void numeroFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroFacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroFacMouseClicked

    private void tfImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfImagenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfImagenMouseClicked

    private void tfImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfImagenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser jf = new JFileChooser();
        jf.setMultiSelectionEnabled(false);
        if(jf.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            rsdragdropfiles.Rs
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CargarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MTLbl;
    private javax.swing.JLabel ObreroIcon;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JButton SigBtn;
    private javax.swing.JLabel UITxt;
    private com.toedter.calendar.JDateChooser fechaFac;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField numeroFac;
    private javax.swing.JSeparator sepFecha;
    private javax.swing.JSeparator sepMT;
    private javax.swing.JSeparator sepTitular;
    private javax.swing.JSeparator sepTitular1;
    private javax.swing.JTextField tfImagen;
    private javax.swing.JLabel titularLbl;
    private javax.swing.JLabel titularLbl1;
    // End of variables declaration//GEN-END:variables
}
