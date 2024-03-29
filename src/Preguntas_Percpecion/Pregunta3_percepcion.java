/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas_Percpecion;

import Preguntas.*;
import static cis_encuestas.EncuestaPercepcion.PrincipalP;
import static cis_encuestas.EncuestaSatisfaccion.Principal;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis
 */
public class Pregunta3_percepcion extends javax.swing.JPanel {
public String rute = "/sonidos/";
public AudioClip a;
    /**
     * Creates new form Pregunta2
     */
    public Pregunta3_percepcion() {
        initComponents();
    }
    public void audios(String audio){
        
        a = java.applet.Applet.newAudioClip(getClass().getResource(rute+audio));
        a.play();
        
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
        jPanel1 = new javax.swing.JPanel();
        cbTriptico = new javax.swing.JCheckBox();
        cbCartulinas = new javax.swing.JCheckBox();
        cbVolante = new javax.swing.JCheckBox();
        cbPromotor = new javax.swing.JCheckBox();
        cbInternet = new javax.swing.JCheckBox();
        cbTelevision = new javax.swing.JCheckBox();
        cbRadio = new javax.swing.JCheckBox();
        cbRecomendacion = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        btnSound1 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("De las siguientes opciones, elige el medio por el cual conociste el centro o los centros:");

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        cbTriptico.setBackground(new java.awt.Color(0, 0, 153));
        cbTriptico.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbTriptico.setForeground(new java.awt.Color(255, 255, 255));
        cbTriptico.setText("Triptico");

        cbCartulinas.setBackground(new java.awt.Color(0, 0, 153));
        cbCartulinas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbCartulinas.setForeground(new java.awt.Color(255, 255, 255));
        cbCartulinas.setText("Cartulinas");

        cbVolante.setBackground(new java.awt.Color(0, 0, 153));
        cbVolante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbVolante.setForeground(new java.awt.Color(255, 255, 255));
        cbVolante.setText("Volante");

        cbPromotor.setBackground(new java.awt.Color(0, 0, 153));
        cbPromotor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbPromotor.setForeground(new java.awt.Color(255, 255, 255));
        cbPromotor.setText("Promotor social");

        cbInternet.setBackground(new java.awt.Color(0, 0, 153));
        cbInternet.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbInternet.setForeground(new java.awt.Color(255, 255, 255));
        cbInternet.setText("Internet");

        cbTelevision.setBackground(new java.awt.Color(0, 0, 153));
        cbTelevision.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbTelevision.setForeground(new java.awt.Color(255, 255, 255));
        cbTelevision.setText("Television");

        cbRadio.setBackground(new java.awt.Color(0, 0, 153));
        cbRadio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbRadio.setForeground(new java.awt.Color(255, 255, 255));
        cbRadio.setText("Radio");

        cbRecomendacion.setBackground(new java.awt.Color(0, 0, 153));
        cbRecomendacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbRecomendacion.setForeground(new java.awt.Color(255, 255, 255));
        cbRecomendacion.setText("Recomendacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTriptico)
                    .addComponent(cbInternet))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCartulinas)
                    .addComponent(cbTelevision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRadio)
                    .addComponent(cbVolante))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPromotor)
                    .addComponent(cbRecomendacion))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTriptico)
                    .addComponent(cbCartulinas)
                    .addComponent(cbVolante)
                    .addComponent(cbPromotor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInternet)
                    .addComponent(cbRadio)
                    .addComponent(cbRecomendacion)
                    .addComponent(cbTelevision))
                .addGap(33, 33, 33))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGUIENTE");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSound1.setBackground(new java.awt.Color(0, 0, 153));
        btnSound1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N
        btnSound1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnSound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSound1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnSound1))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSound1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(!cbTriptico.isSelected()&&!cbCartulinas.isSelected()&&!cbInternet.isSelected()&&!cbPromotor.isSelected()&&!cbRadio.isSelected()&&!cbRecomendacion.isSelected()&&!cbTelevision.isSelected()&&!cbVolante.isSelected()){
         JOptionPane.showMessageDialog(null, "Debes elegir una opcion");
     }else{
        
        
    Pregunta3_percepcion();
     Pregunta5_percepcion p = new Pregunta5_percepcion();
        p.setSize(830, 350);
        p.setLocation(5,5);
        
        PrincipalP.removeAll();
        PrincipalP.add(p, BorderLayout.CENTER);
        PrincipalP.revalidate();
        PrincipalP.repaint();
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSound1ActionPerformed
        if (btnSound1.isSelected()){

            audios("pp3.wav");

        }else{
            a.stop();

        }
    }//GEN-LAST:event_btnSound1ActionPerformed
    
    public void Pregunta3_percepcion(){
        if(cbTriptico.isSelected()){
           String Triptico = "Triptico";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 1";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbCartulinas.isSelected()){
           String Triptico = "Cartulinas";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 2";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbVolante.isSelected()){
           String Triptico = "Volante";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 3";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbPromotor.isSelected()){
           String Triptico = "Promotor";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 4";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbInternet.isSelected()){
           String Triptico = "Internet";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 5";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbTelevision.isSelected()){
           String Triptico = "Television";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 6";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbRadio.isSelected()){
           String Triptico = "Radio";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 7";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbRecomendacion.isSelected()){
           String Triptico = "Recomendacion";
           String sql = "Update pregunta3_percepcion set cantidad = cantidad + 1 where id_medio = 8";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSound1;
    private javax.swing.JCheckBox cbCartulinas;
    private javax.swing.JCheckBox cbInternet;
    private javax.swing.JCheckBox cbPromotor;
    private javax.swing.JCheckBox cbRadio;
    private javax.swing.JCheckBox cbRecomendacion;
    private javax.swing.JCheckBox cbTelevision;
    private javax.swing.JCheckBox cbTriptico;
    private javax.swing.JCheckBox cbVolante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
