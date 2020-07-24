/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis_encuestas;

import Preguntas.Pregunta2;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
//Iconos Iconos diseñados por <a href="https://www.flaticon.es/autores/smashicons" title="Smashicons">Smashicons</a> from <a href="https://www.flaticon.es/" title="Flaticon"> www.flaticon.es</a>
/**
 *
 * @author Jose Luis Aranda Cervantes-ConcernedSun658
 */
public class EncuestaSatisfaccion extends javax.swing.JFrame {
//public Clip clip;
public String rute = "/sonidos/";
public AudioClip a;
    
    
    
    public EncuestaSatisfaccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
       
        
       
    }
    public void audios(String audio){
        
        a = java.applet.Applet.newAudioClip(getClass().getResource(rute+audio));
        a.play();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pregunta1Grupo = new javax.swing.ButtonGroup();
        Principal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdbP1EXCELENTE = new javax.swing.JRadioButton();
        rdbP1REGULAR = new javax.swing.JRadioButton();
        rdbP1MALA = new javax.swing.JRadioButton();
        rdbP1BUENA = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnSound = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principal.setBackground(new java.awt.Color(0, 0, 102));
        Principal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1.\tLa atención y cordialidad que recibió por parte de la servidora(o) publico que le atendió fue:");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        rdbP1EXCELENTE.setBackground(new java.awt.Color(0, 0, 153));
        Pregunta1Grupo.add(rdbP1EXCELENTE);
        rdbP1EXCELENTE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP1EXCELENTE.setForeground(new java.awt.Color(255, 255, 255));
        rdbP1EXCELENTE.setText("Excelente");

        rdbP1REGULAR.setBackground(new java.awt.Color(0, 0, 153));
        Pregunta1Grupo.add(rdbP1REGULAR);
        rdbP1REGULAR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP1REGULAR.setForeground(new java.awt.Color(255, 255, 255));
        rdbP1REGULAR.setText("Regular");

        rdbP1MALA.setBackground(new java.awt.Color(0, 0, 153));
        Pregunta1Grupo.add(rdbP1MALA);
        rdbP1MALA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP1MALA.setForeground(new java.awt.Color(255, 255, 255));
        rdbP1MALA.setText("Mala");
        rdbP1MALA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbP1MALAActionPerformed(evt);
            }
        });

        rdbP1BUENA.setBackground(new java.awt.Color(0, 0, 153));
        Pregunta1Grupo.add(rdbP1BUENA);
        rdbP1BUENA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP1BUENA.setForeground(new java.awt.Color(255, 255, 255));
        rdbP1BUENA.setText("Buena");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(rdbP1EXCELENTE)
                .addGap(76, 76, 76)
                .addComponent(rdbP1BUENA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(rdbP1REGULAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbP1MALA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbP1EXCELENTE)
                    .addComponent(rdbP1BUENA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbP1REGULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbP1MALA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(0, 0, 153));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("SIGUIENTE");
        btnGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSound.setBackground(new java.awt.Color(0, 0, 153));
        btnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N
        btnSound.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(btnSound)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSound)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 840, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosEiconos/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbP1MALAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbP1MALAActionPerformed

    }//GEN-LAST:event_rdbP1MALAActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(!rdbP1EXCELENTE.isSelected()&& !rdbP1BUENA.isSelected() && !rdbP1REGULAR.isSelected() && !rdbP1MALA.isSelected()){
            JOptionPane.showMessageDialog(null, "Debes contestar la pregunta");
        } else {
        
        Pregunta1();
        Pregunta2 p = new Pregunta2();
        p.setSize(830, 350);
        p.setLocation(5,5);
        
        Principal.removeAll();
        Principal.add(p, BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
        
        
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoundActionPerformed
        if (btnSound.isSelected()){
            
        audios("sauno.wav");
            
            
        }else{
         a.stop();
            
        }
        
    
        
    
        
    
        
    }//GEN-LAST:event_btnSoundActionPerformed

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
            java.util.logging.Logger.getLogger(EncuestaSatisfaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncuestaSatisfaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncuestaSatisfaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncuestaSatisfaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncuestaSatisfaccion().setVisible(true);
            }
        });
    }
    
    public void Pregunta1(){
       if(rdbP1EXCELENTE.isSelected()){
           String sql = "Update preguntas set excelente = excelente + 1 where clavepeguntas = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
       if(rdbP1BUENA.isSelected()){
           String sql = "Update preguntas set buena = buena + 1 where clavepeguntas = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
       if(rdbP1REGULAR.isSelected()){
           String sql = "Update preguntas set regular = regular + 1 where clavepeguntas = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
       if(rdbP1MALA.isSelected()){
           String sql = "Update preguntas set mala = mala + 1 where clavepeguntas = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Pregunta1Grupo;
    public static javax.swing.JPanel Principal;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnSound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdbP1BUENA;
    private javax.swing.JRadioButton rdbP1EXCELENTE;
    private javax.swing.JRadioButton rdbP1MALA;
    private javax.swing.JRadioButton rdbP1REGULAR;
    // End of variables declaration//GEN-END:variables

    
}

