/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hopen.SistemaHopen.UI;

/**
 *
 * @author lisan
 */
public class CargarObra extends javax.swing.JFrame {

    /**
     * Creates new form CargarObra
     */
    public CargarObra() {
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
        titularTxt = new javax.swing.JTextField();
        sepTitular = new javax.swing.JSeparator();
        MTLbl = new javax.swing.JLabel();
        MTTxt = new javax.swing.JTextField();
        sepMT = new javax.swing.JSeparator();
        CFLbl = new javax.swing.JLabel();
        CFTxt = new javax.swing.JTextField();
        sepCF = new javax.swing.JSeparator();
        ComisionLbl = new javax.swing.JLabel();
        ComisionTxt = new javax.swing.JTextField();
        sepComision = new javax.swing.JSeparator();
        GPLbl = new javax.swing.JLabel();
        GPTxt = new javax.swing.JTextField();
        sepGP = new javax.swing.JSeparator();
        fechaLbl = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JTextField();
        sepFecha = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        UITxt.setFont(new java.awt.Font("Roboto", 2, 20)); // NOI18N
        UITxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UITxt.setText("Ingrese los datos de la obra");

        ObreroIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ObreroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/obrero.png"))); // NOI18N

        titularLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        titularLbl.setText("Titular");

        titularTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        titularTxt.setForeground(new java.awt.Color(204, 204, 204));
        titularTxt.setText("Ingrese titular de la obra");
        titularTxt.setBorder(null);
        titularTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titularTxtActionPerformed(evt);
            }
        });

        MTLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        MTLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MTLbl.setText("Monto Total");

        MTTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        MTTxt.setForeground(new java.awt.Color(204, 204, 204));
        MTTxt.setText("Ingrese monto total");
        MTTxt.setBorder(null);
        MTTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTTxtActionPerformed(evt);
            }
        });

        CFLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CFLbl.setText("Costos Fijos");

        CFTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CFTxt.setForeground(new java.awt.Color(204, 204, 204));
        CFTxt.setText("Ingrese costos fijos");
        CFTxt.setBorder(null);
        CFTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFTxtActionPerformed(evt);
            }
        });

        ComisionLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ComisionLbl.setText("Comisión");

        ComisionTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ComisionTxt.setForeground(new java.awt.Color(204, 204, 204));
        ComisionTxt.setText("Ingrese comision");
        ComisionTxt.setBorder(null);
        ComisionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComisionTxtActionPerformed(evt);
            }
        });

        GPLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GPLbl.setText("Ganancia Pretendida");

        GPTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GPTxt.setForeground(new java.awt.Color(204, 204, 204));
        GPTxt.setText("Ingrese ganancia");
        GPTxt.setBorder(null);
        GPTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPTxtActionPerformed(evt);
            }
        });

        fechaLbl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fechaLbl.setText("Fecha");

        fechaTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(204, 204, 204));
        fechaTxt.setText("Ingrese fecha");
        fechaTxt.setBorder(null);
        fechaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(MTLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MTTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CFLbl)
                                    .addGap(53, 53, 53)
                                    .addComponent(CFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(sepCF, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sepTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(titularLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sepMT, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sepComision, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ComisionLbl)
                                    .addGap(73, 73, 73)
                                    .addComponent(ComisionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sepGP, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sepFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(fechaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titularLbl)
                    .addComponent(titularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MTLbl)
                    .addComponent(MTTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepMT, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComisionLbl)
                    .addComponent(ComisionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepComision, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GPLbl)
                    .addComponent(GPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepGP, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLbl)
                    .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CFLbl)
                    .addComponent(CFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepCF, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
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

    private void titularTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titularTxtActionPerformed

    private void MTTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MTTxtActionPerformed

    private void CFTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CFTxtActionPerformed

    private void ComisionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComisionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComisionTxtActionPerformed

    private void GPTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GPTxtActionPerformed

    private void fechaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxtActionPerformed

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
            java.util.logging.Logger.getLogger(CargarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CFLbl;
    private javax.swing.JTextField CFTxt;
    private javax.swing.JLabel ComisionLbl;
    private javax.swing.JTextField ComisionTxt;
    private javax.swing.JLabel GPLbl;
    private javax.swing.JTextField GPTxt;
    private javax.swing.JLabel MTLbl;
    private javax.swing.JTextField MTTxt;
    private javax.swing.JLabel ObreroIcon;
    private javax.swing.JLabel UITxt;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator sepCF;
    private javax.swing.JSeparator sepComision;
    private javax.swing.JSeparator sepFecha;
    private javax.swing.JSeparator sepGP;
    private javax.swing.JSeparator sepMT;
    private javax.swing.JSeparator sepTitular;
    private javax.swing.JLabel titularLbl;
    private javax.swing.JTextField titularTxt;
    // End of variables declaration//GEN-END:variables
}
