/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hopen.SistemaHopen.UI;

import com.hopen.SistemaHopen.entities.Obra;
import com.hopen.SistemaHopen.UI.TextPrompt;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.Calendar;
import javax.swing.JOptionPane;
import com.hopen.SistemaHopen.UI.ConexionDB;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.sql.Date;

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
        TextPrompt dataholderMontoTotal = new TextPrompt("Ingrese el monto con formato 100.000",MTTxt);
        dataholderMontoTotal.setShowPromptOnce(true);
        TextPrompt dataholderComision = new TextPrompt("Ingrese la comision con formato 100.000",ComisionTxt);
        dataholderComision.setShowPromptOnce(true);
        TextPrompt dataholderGananciaPre = new TextPrompt("Ingrese la ganancia pretendida con formato 100.000",GPTxt);
        dataholderGananciaPre.setShowPromptOnce(true);
        TextPrompt dataholderCF = new TextPrompt("Ingrese los costos fijos con formato 100.000",CFTxt);
        dataholderCF.setShowPromptOnce(true);
        setTitle("Cargar Obra");
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
        sepFecha = new javax.swing.JSeparator();
        SalirBtn = new javax.swing.JButton();
        SigBtn = new javax.swing.JButton();
        fechaCH = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        UITxt.setFont(new java.awt.Font("Microsoft YaHei", 2, 20)); // NOI18N
        UITxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UITxt.setText("Ingrese los datos de la obra");

        ObreroIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ObreroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/obrero.png"))); // NOI18N

        titularLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        titularLbl.setText("Titular");

        titularTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        titularTxt.setToolTipText("Hola q onda\n");
        titularTxt.setBorder(null);
        titularTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titularTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titularTxtMouseClicked(evt);
            }
        });
        titularTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titularTxtActionPerformed(evt);
            }
        });

        MTLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        MTLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MTLbl.setText("Monto Total");

        MTTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        MTTxt.setBorder(null);
        MTTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MTTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTTxtActionPerformed(evt);
            }
        });
        MTTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MTTxtKeyTyped(evt);
            }
        });

        CFLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        CFLbl.setText("Costos Fijos");

        CFTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CFTxt.setBorder(null);
        CFTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFTxtActionPerformed(evt);
            }
        });
        CFTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CFTxtKeyTyped(evt);
            }
        });

        ComisionLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        ComisionLbl.setText("Comisión");

        ComisionTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ComisionTxt.setBorder(null);
        ComisionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComisionTxtActionPerformed(evt);
            }
        });
        ComisionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ComisionTxtKeyTyped(evt);
            }
        });

        GPLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        GPLbl.setText("Ganancia Pretendida");

        GPTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GPTxt.setBorder(null);
        GPTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPTxtActionPerformed(evt);
            }
        });
        GPTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GPTxtKeyTyped(evt);
            }
        });

        fechaLbl.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        fechaLbl.setText("Fecha");

        SalirBtn.setBackground(new java.awt.Color(255, 51, 51));
        SalirBtn.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        SalirBtn.setForeground(new java.awt.Color(255, 255, 255));
        SalirBtn.setText("Volver");
        SalirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        SigBtn.setBackground(new java.awt.Color(0, 204, 255));
        SigBtn.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        SigBtn.setForeground(new java.awt.Color(255, 255, 255));
        SigBtn.setText("Siguiente");
        SigBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigBtnActionPerformed(evt);
            }
        });

        fechaCH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(MTLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MTTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(SigBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CFLbl)
                                    .addGap(64, 64, 64)
                                    .addComponent(CFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sepMT, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepComision, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepGP, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepCF, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(fechaLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechaCH, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(titularLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(GPLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(ComisionLbl)
                                .addGap(78, 78, 78)
                                .addComponent(ComisionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLbl))
                .addGap(9, 9, 9)
                .addComponent(sepFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CFLbl))
                .addGap(8, 8, 8)
                .addComponent(sepCF, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SigBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Si vuelve atras no se guardarán los datos.", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (JOptionPane.YES_NO_OPTION == 0){
            dispose();
            new Menu().setVisible(true);
        }
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void SigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigBtnActionPerformed
        // TODO add your handling code here:
         String titular = titularTxt.getText();
         double total_presupuesto = Double.parseDouble(MTTxt.getText());
         double comision = Double.parseDouble(ComisionTxt.getText());
         double ganancia_pretendida = Double.parseDouble(GPTxt.getText());
         double costos_fijos = Double.parseDouble(CFTxt.getText());
         //Para convertir fecha de java en fecha de sql
         java.util.Date fecha = fechaCH.getDate();
         long timeInMilliSecs = fecha.getTime();
         java.sql.Date fechaDB = new java.sql.Date(timeInMilliSecs);
         
         Obra obra = new Obra();
         obra.setTitular(titular);
         obra.setTotalPresupuesto(total_presupuesto);
         obra.setComision(comision);
         obra.setGanancia_pretendida(ganancia_pretendida);
         obra.setCostosFijos(costos_fijos);
         obra.setFechaPresupuesto(fechaDB);
         
         PreparedStatement ps;
         
         try{
         Connection con = ConexionDB.getConnection();
         String sql ="INSERT INTO obra (titular, total_presupuesto, comision, ganancia_pretendida, costos_fijos, fecha_presupuesto) VALUES (?,?,?,?,?,?)";
         ps = ConexionDB.getConnection().prepareStatement(sql);
               
         ps.setString(1, titular);
         ps.setDouble(2, total_presupuesto);
         ps.setDouble(3, comision);
         ps.setDouble(4, ganancia_pretendida);
         ps.setDouble(5, costos_fijos);
         ps.setDate(6, fechaDB);
         ps.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "Datos guardados");
         ConexionDB.endConnection(con);
         
         }catch(Exception e){
             e.printStackTrace();
         }
         
        dispose();         
     
    }//GEN-LAST:event_SigBtnActionPerformed

    private void titularTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titularTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titularTxtMouseClicked

    private void MTTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MTTxtKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        
        if ((car<'0' || car>'9') && MTTxt.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){
             evt.consume();
             JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_MTTxtKeyTyped

    private void ComisionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComisionTxtKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        
        if ((car<'0' || car>'9') && ComisionTxt.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){
             evt.consume();
             JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ComisionTxtKeyTyped

    private void GPTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GPTxtKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        
        if ((car<'0' || car>'9') && GPTxt.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){
             evt.consume();
             JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GPTxtKeyTyped

    private void CFTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CFTxtKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        
        if ((car<'0' || car>'9') && CFTxt.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){
             evt.consume();
             JOptionPane.showMessageDialog(null, "Solo se admiten números", "Validar numeros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_CFTxtKeyTyped
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
    private javax.swing.JButton SalirBtn;
    private javax.swing.JButton SigBtn;
    private javax.swing.JLabel UITxt;
    private com.toedter.calendar.JDateChooser fechaCH;
    private javax.swing.JLabel fechaLbl;
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
