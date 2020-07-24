/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preguntas_Percpecion;

import Preguntas.*;
import cis_encuestas.EncuestaPercepcion;
import static cis_encuestas.EncuestaPercepcion.PrincipalP;
import cis_encuestas.EncuestaSatisfaccion;
import static cis_encuestas.EncuestaSatisfaccion.Principal;
import cis_encuestas.INICIO;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jose Luis
 */
public class Pregunta7_percepcion1 extends javax.swing.JPanel {
public String rute = "/sonidos/";
public AudioClip a;
    /**
     * Creates new form Pregunta2
     */
    public Pregunta7_percepcion1() {
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbMenos30 = new javax.swing.JCheckBox();
        cbEntre30y50 = new javax.swing.JCheckBox();
        cbEntre50y90 = new javax.swing.JCheckBox();
        cbMayor90 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        cbLunes = new javax.swing.JCheckBox();
        cbMartes = new javax.swing.JCheckBox();
        cbMiercoles = new javax.swing.JCheckBox();
        cbJueves = new javax.swing.JCheckBox();
        cbViernes = new javax.swing.JCheckBox();
        cbSabado = new javax.swing.JCheckBox();
        cbDomingo = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cb6a12 = new javax.swing.JCheckBox();
        cb12a5 = new javax.swing.JCheckBox();
        cb5a9 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSound1 = new javax.swing.JToggleButton();
        btnSound2 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cual seria la cuota de recuperacion, que podrias dar por clase");

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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Taller de formacion, capacitacion y servicios profesionales)");

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        cbMenos30.setBackground(new java.awt.Color(0, 0, 153));
        cbMenos30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbMenos30.setForeground(new java.awt.Color(255, 255, 255));
        cbMenos30.setText("Menos de $30.00");

        cbEntre30y50.setBackground(new java.awt.Color(0, 0, 153));
        cbEntre30y50.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbEntre30y50.setForeground(new java.awt.Color(255, 255, 255));
        cbEntre30y50.setText("Entre $30.00 y $50.00");

        cbEntre50y90.setBackground(new java.awt.Color(0, 0, 153));
        cbEntre50y90.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbEntre50y90.setForeground(new java.awt.Color(255, 255, 255));
        cbEntre50y90.setText("Entre $50.00 y $90.00");

        cbMayor90.setBackground(new java.awt.Color(0, 0, 153));
        cbMayor90.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbMayor90.setForeground(new java.awt.Color(255, 255, 255));
        cbMayor90.setText("Mayor a $90.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMenos30)
                    .addComponent(cbEntre50y90))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEntre30y50)
                    .addComponent(cbMayor90))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMenos30)
                    .addComponent(cbEntre30y50))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEntre50y90)
                    .addComponent(cbMayor90))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        cbLunes.setBackground(new java.awt.Color(0, 0, 153));
        cbLunes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbLunes.setForeground(new java.awt.Color(255, 255, 255));
        cbLunes.setText("Lunes");

        cbMartes.setBackground(new java.awt.Color(0, 0, 153));
        cbMartes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbMartes.setForeground(new java.awt.Color(255, 255, 255));
        cbMartes.setText("Martes");

        cbMiercoles.setBackground(new java.awt.Color(0, 0, 153));
        cbMiercoles.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        cbMiercoles.setText("Miercoles");

        cbJueves.setBackground(new java.awt.Color(0, 0, 153));
        cbJueves.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbJueves.setForeground(new java.awt.Color(255, 255, 255));
        cbJueves.setText("Jueves");

        cbViernes.setBackground(new java.awt.Color(0, 0, 153));
        cbViernes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbViernes.setForeground(new java.awt.Color(255, 255, 255));
        cbViernes.setText("Viernes");

        cbSabado.setBackground(new java.awt.Color(0, 0, 153));
        cbSabado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbSabado.setForeground(new java.awt.Color(255, 255, 255));
        cbSabado.setText("Sabado");

        cbDomingo.setBackground(new java.awt.Color(0, 0, 153));
        cbDomingo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbDomingo.setForeground(new java.awt.Color(255, 255, 255));
        cbDomingo.setText("Domingo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbLunes)
                        .addGap(18, 18, 18)
                        .addComponent(cbMartes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMiercoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbJueves))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbViernes)
                        .addGap(18, 18, 18)
                        .addComponent(cbSabado)
                        .addGap(27, 27, 27)
                        .addComponent(cbDomingo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLunes)
                    .addComponent(cbMartes)
                    .addComponent(cbMiercoles)
                    .addComponent(cbJueves))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSabado)
                    .addComponent(cbDomingo)
                    .addComponent(cbViernes))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        cb6a12.setBackground(new java.awt.Color(0, 0, 153));
        cb6a12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb6a12.setForeground(new java.awt.Color(255, 255, 255));
        cb6a12.setText("De 6am a 12pm");

        cb12a5.setBackground(new java.awt.Color(0, 0, 153));
        cb12a5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb12a5.setForeground(new java.awt.Color(255, 255, 255));
        cb12a5.setText("De 12pm a 5pm");

        cb5a9.setBackground(new java.awt.Color(0, 0, 153));
        cb5a9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb5a9.setForeground(new java.awt.Color(255, 255, 255));
        cb5a9.setText("De 5 a 9pm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb6a12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb12a5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb5a9)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb6a12)
                    .addComponent(cb12a5)
                    .addComponent(cb5a9))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Si decidieras tomar una actividad en el centro comunitario");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Cual o cuales serian los dias y horario?");

        btnSound1.setBackground(new java.awt.Color(0, 0, 153));
        btnSound1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N
        btnSound1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnSound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSound1ActionPerformed(evt);
            }
        });

        btnSound2.setBackground(new java.awt.Color(0, 0, 153));
        btnSound2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N
        btnSound2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnSound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSound2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnSound1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnSound2)
                    .addContainerGap(793, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSound1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(btnSound2)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     EncuestaPercepcion o =  (EncuestaPercepcion)SwingUtilities.getWindowAncestor(this);
      o.dispose();
      INICIO i = new INICIO();
      i.show();
     Horarios();
     Cuotaderecuperacion();
     Horariodias();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSound1ActionPerformed
        if (btnSound1.isSelected()){

            audios("pp7.2.wav");

        }else{
            a.stop();

        }
    }//GEN-LAST:event_btnSound1ActionPerformed

    private void btnSound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSound2ActionPerformed
      if (btnSound2.isSelected()){

            audios("pp7.1.wav");

        }else{
            a.stop();

        }  // TODO add your handling code here:
    }//GEN-LAST:event_btnSound2ActionPerformed
    public void Cuotaderecuperacion(){
        if(cbMenos30.isSelected()){
           
           String sql = "Update cuota_recuperacion set menos_de_30 = menos_de_30 + 1 where id_cuota = 1";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbEntre30y50.isSelected()){
           String sql = "Update cuota_recuperacion set entre_30y50 = entre_30y50 + 1 where id_cuota = 1";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbEntre50y90.isSelected()){
           
           String sql = "Update cuota_recuperacion set entre_50y90 = entre_50y90 + 1 where id_cuota = 1";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbMayor90.isSelected()){
          
           String sql = "Update cuota_recuperacion set mayor_90 = mayor_90 + 1 where id_cuota = 1";
        
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
    public void Horariodias(){
      if(cbLunes.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cbMartes.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 2";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cbMiercoles.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 3";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cbJueves.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 4";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cbViernes.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 5";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cbSabado.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 6";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cbDomingo.isSelected()){
           
           String sql = "Update horariodias set cantidad = cantidad + 1 where id_preferido = 7";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
    }
    public void Horarios(){
      if(cb6a12.isSelected()){
           String sql = "Update posibles_horarios set cantidad' = cantidad + 1 where id_horas = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }  
      if(cb12a5.isSelected()){
           String sql = "Update posibles_horarios set cantidad = cantidad + 1 where id_horas = 2";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }    
      if(cb5a9.isSelected()){
           String sql = "Update posibles_horarios set cantidad = cantidad + 1 where id_horas = 1";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();//JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSound1;
    private javax.swing.JToggleButton btnSound2;
    private javax.swing.JCheckBox cb12a5;
    private javax.swing.JCheckBox cb5a9;
    private javax.swing.JCheckBox cb6a12;
    private javax.swing.JCheckBox cbDomingo;
    private javax.swing.JCheckBox cbEntre30y50;
    private javax.swing.JCheckBox cbEntre50y90;
    private javax.swing.JCheckBox cbJueves;
    private javax.swing.JCheckBox cbLunes;
    private javax.swing.JCheckBox cbMartes;
    private javax.swing.JCheckBox cbMayor90;
    private javax.swing.JCheckBox cbMenos30;
    private javax.swing.JCheckBox cbMiercoles;
    private javax.swing.JCheckBox cbSabado;
    private javax.swing.JCheckBox cbViernes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}