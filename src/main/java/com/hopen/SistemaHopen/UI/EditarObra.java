/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hopen.SistemaHopen.UI;

import com.hopen.SistemaHopen.entities.Obra;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import Service.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author lisan
 */
public class EditarObra extends javax.swing.JFrame {
    
    @Autowired
    ObraService obraService;
    
    /**
     * Creates new form CargarObra
     */
    public EditarObra() {
        initComponents();
        setTitle("Editar Obra");
        mostrarDatos();
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
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        UITxt.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        UITxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UITxt.setText("Editar datos de la obra");

        ObreroIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ObreroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/obrero.png"))); // NOI18N

        titularLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        titularLbl.setText("Titular");

        titularTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        titularTxt.setToolTipText("Ingrese el nombre del titular");
        titularTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        MTLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
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

        CFLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
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

        ComisionLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
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

        GPLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
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

        fechaLbl.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
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
        SigBtn.setText("Siguiente");
        SigBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigBtnActionPerformed(evt);
            }
        });

        fechaCH.setBackground(new java.awt.Color(255, 255, 255));

        buscar.setBackground(new java.awt.Color(255, 135, 9));
        buscar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addComponent(fechaCH, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(titularLbl)
                                        .addGap(77, 77, 77)
                                        .addComponent(titularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ObreroIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UITxt, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(7, Short.MAX_VALUE))
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
                    .addComponent(titularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatos(){
        /*
        String titular = new Menu().getTitular();

        PreparedStatement ps;
        
        try{
        Connection con = ConexionDB.getConnection();
        String sql = "SELECT * FROM obra o WHERE o.titular=?";
        ps = ConexionDB.getConnection().prepareStatement(sql);
        ps.setString(1, titular);
        
        ResultSet resultSet = ps.executeQuery();
        
        if(resultSet.next()){
            double comision = resultSet.getDouble("comision");
            double costos_fijos = resultSet.getDouble("costos_fijos");
            String fecha = resultSet.getString("fecha_presupuesto");
            double ganancia = resultSet.getDouble("ganancia_pretendida");
            String titular2 = resultSet.getString("titular");
            double presupuesto = resultSet.getDouble("total_presupuesto");
            
            CFTxt.setText(Double.toString(costos_fijos));
            ComisionTxt.setText(Double.toString(comision));
            GPTxt.setText(Double.toString(ganancia));
            MTTxt.setText(Double.toString(presupuesto));
            titularTxt.setText(titular2);
        }
        
        ConexionDB.endConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        */
    }
    
    
    private void buscarDatosObraEnBD(String titularObra){
 
        PreparedStatement ps;
    /*    if(){
    //        EntityManager em = 
       /*  Connection con = ConexionDB.getConnection();
         String sql ="SELECT * FROM obra o WHERE o.titular=?";
         ps = ConexionDB.getConnection().prepareStatement(sql);
         
         ps.setString(1, titularObra);
         
         ResultSet resultSet = ps.executeQuery();
         titularTxt.setText(titularObra);
         
         if(resultSet.next()){
              this.titularTxt.setText(resultSet.getString("titular"));
        //      MTTxt.setText(resultSet.getString("total_presupuesto"));
        /*    double ganancia = resultSet.getDouble("ganancia_pretendida");
              double costosF = resultSet.getDouble("costos_fijos");
              double comision = resultSet.getDouble("comision");
              Date fecha = resultSet.getDate("fecha_presupuesto");
              MTTxt.setText(Double.toString(montoT));
              CFTxt.setText(Double.toString(costosF));
              ComisionTxt.setText(Double.toString(comision));
              GPTxt.setText(Double.toString(ganancia));
              fechaCH.setDate(fecha);*/
      /*    }catch(SQLException msgerror){
              msgerror.printStackTrace();
              System.exit(1);*/
    /*     }else{
             this.titularTxt.setText(titularObra);
         }
          ConexionDB.endConnection(con);
    }
        }catch(Exception e){
             e.printStackTrace();
         }*/
     }
    
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

    private void SigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigBtnActionPerformed
        // TODO add your handling code here:
        if(titularTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresar una obra para editar");
        }else{
            double total_presupuesto = Double.parseDouble(MTTxt.getText());
            double comision = Double.parseDouble(ComisionTxt.getText());
            double ganancia_pretendida = Double.parseDouble(GPTxt.getText());
            double costos_fijos = Double.parseDouble(CFTxt.getText());
            //Para convertir fecha de java en fecha de sql
            java.util.Date fecha = fechaCH.getDate();
            long timeInMilliSecs = fecha.getTime();
            java.sql.Date fechaDB = new java.sql.Date(timeInMilliSecs);
         
            Obra obra = new Obra();
            obra.setTotalPresupuesto(total_presupuesto);
            obra.setComision(comision);
            obra.setGanancia_pretendida(ganancia_pretendida);
            obra.setCostosFijos(costos_fijos);
            obra.setFechaPresupuesto(fecha);
         
            PreparedStatement ps;

            try{
            Connection con = ConexionDB.getConnection();
            String sql ="UPDATE obra SET total_presupuesto = '"+total_presupuesto+"',comision ='"+comision+"', ganancia_pretendida ='"+ganancia_pretendida+"', costos_fijos ='"+costos_fijos+"', fecha_presupuesto ='"+fechaDB+"' WHERE titular = '"+titularTxt.getText()+"'";
            ps = ConexionDB.getConnection().prepareStatement(sql);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos guardados");
            ConexionDB.endConnection(con);

            }catch(Exception e){
                e.printStackTrace();
            }    
        new Menu().setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_SigBtnActionPerformed

    private void titularTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titularTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titularTxtMouseClicked

    private void MTTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MTTxtKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_MTTxtKeyTyped

    private void ComisionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComisionTxtKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ComisionTxtKeyTyped

    private void GPTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GPTxtKeyTyped
        // TODO add your handling code here:
     
    }//GEN-LAST:event_GPTxtKeyTyped

    private void CFTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CFTxtKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_CFTxtKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        
        if (titularTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo esta vacío");
        }else {
            PreparedStatement ps;
            String titular = titularTxt.getText();
        try{
        Connection con = ConexionDB.getConnection();
        String sql = "SELECT o.total_presupuesto, o.fecha_presupuesto, o.ganancia_pretendida, o.comision, o.costos_fijos FROM obra o WHERE titular LIKE ?";
        ps = ConexionDB.getConnection().prepareStatement(sql);
        ps.setString(1, titular);
        
        ResultSet resultSet = ps.executeQuery();
        
        if(resultSet.next()){
            MTTxt.setText(resultSet.getString(1));
            ComisionTxt.setText(resultSet.getString(4));
            GPTxt.setText(resultSet.getString(3));
            CFTxt.setText(resultSet.getString(5));
            fechaCH.setDate(resultSet.getDate(2));
            
        }
        
        ConexionDB.endConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_buscarActionPerformed
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
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new EditarObra().setVisible(true);
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
    private javax.swing.JButton buscar;
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
