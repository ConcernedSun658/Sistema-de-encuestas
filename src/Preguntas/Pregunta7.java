/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas;

import static cis_encuestas.EncuestaSatisfaccion.Principal;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis
 */
public class Pregunta7 extends javax.swing.JPanel {
public Clip clip;
public String rute = "/sonidos/";
public AudioClip a;
    /**
     * Creates new form Pregunta7
     */
    public Pregunta7() {
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

        GrupoPregunta7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbP7EXCELENTE = new javax.swing.JRadioButton();
        rdbP7BUENA = new javax.swing.JRadioButton();
        rdbP7REGULAR = new javax.swing.JRadioButton();
        rdbP7MALA = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnSound = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 0, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("En una escala del 1 al 10 ¿Que calificacion le otorga al tramite o servicio que realizo?");

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        rdbP7EXCELENTE.setBackground(new java.awt.Color(0, 0, 153));
        GrupoPregunta7.add(rdbP7EXCELENTE);
        rdbP7EXCELENTE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP7EXCELENTE.setForeground(new java.awt.Color(255, 255, 255));
        rdbP7EXCELENTE.setText("EXCELENTE");

        rdbP7BUENA.setBackground(new java.awt.Color(0, 0, 153));
        GrupoPregunta7.add(rdbP7BUENA);
        rdbP7BUENA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP7BUENA.setForeground(new java.awt.Color(255, 255, 255));
        rdbP7BUENA.setText("BUENA");

        rdbP7REGULAR.setBackground(new java.awt.Color(0, 0, 153));
        GrupoPregunta7.add(rdbP7REGULAR);
        rdbP7REGULAR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP7REGULAR.setForeground(new java.awt.Color(255, 255, 255));
        rdbP7REGULAR.setText("REGULAR");

        rdbP7MALA.setBackground(new java.awt.Color(0, 0, 153));
        GrupoPregunta7.add(rdbP7MALA);
        rdbP7MALA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbP7MALA.setForeground(new java.awt.Color(255, 255, 255));
        rdbP7MALA.setText("MALA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(rdbP7EXCELENTE)
                .addGap(74, 74, 74)
                .addComponent(rdbP7BUENA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(rdbP7REGULAR)
                .addGap(96, 96, 96)
                .addComponent(rdbP7MALA)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbP7EXCELENTE)
                    .addComponent(rdbP7BUENA)
                    .addComponent(rdbP7REGULAR)
                    .addComponent(rdbP7MALA))
                .addGap(30, 30, 30))
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

        btnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N
        btnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSound, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSound)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!rdbP7EXCELENTE.isSelected()&& !rdbP7BUENA.isSelected() && !rdbP7REGULAR.isSelected() && !rdbP7MALA.isSelected()){
            JOptionPane.showMessageDialog(null, "Debes contestar la pregunta");
        } else {
        
        Pregunta7();
        Comentario p = new Comentario();
        p.setSize(830, 350);
        p.setLocation(5,5);
        
        Principal.removeAll();
        Principal.add(p, BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoundActionPerformed
        if (btnSound.isSelected()){
            audios("saPregunta7.wav");
        }else{
            a.stop();
        }
    }//GEN-LAST:event_btnSoundActionPerformed

    public void Pregunta7(){
       if(rdbP7EXCELENTE.isSelected()){
           String sql = "Update preguntas set excelente = excelente + 1 where clavepeguntas = 7";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
       if(rdbP7BUENA.isSelected()){
           String sql = "Update preguntas set buena = buena + 1 where clavepeguntas = 7";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
       if(rdbP7REGULAR.isSelected()){
           String sql = "Update preguntas set regular = regular + 1 where clavepeguntas = 7";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            
            
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA");

        }catch(Exception e){
            System.out.println(e);
        }
        
       }
       
       if(rdbP7MALA.isSelected()){
           String sql = "Update preguntas set mala = mala + 1 where clavepeguntas = 7";
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
    private javax.swing.ButtonGroup GrupoPregunta7;
    private javax.swing.JToggleButton btnSound;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbP7BUENA;
    private javax.swing.JRadioButton rdbP7EXCELENTE;
    private javax.swing.JRadioButton rdbP7MALA;
    private javax.swing.JRadioButton rdbP7REGULAR;
    // End of variables declaration//GEN-END:variables
}
