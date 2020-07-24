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
public class Pregunta5_percepcion extends javax.swing.JPanel {
public String rute = "/sonidos/";
public AudioClip a;
    /**
     * Creates new form Pregunta2
     */
    public Pregunta5_percepcion() {
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

        Gruposino = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        panelopciones = new javax.swing.JPanel();
        cbCultural = new javax.swing.JCheckBox();
        cbDeportivo = new javax.swing.JCheckBox();
        cbEduambiental = new javax.swing.JCheckBox();
        cbEducativo = new javax.swing.JCheckBox();
        cbGastronomia = new javax.swing.JCheckBox();
        cbPlaticasformativas = new javax.swing.JCheckBox();
        cbRecreativas = new javax.swing.JCheckBox();
        cbManualidades = new javax.swing.JCheckBox();
        cbSaludyprevencion = new javax.swing.JCheckBox();
        cbServiciosprofesionales = new javax.swing.JCheckBox();
        cbOficios = new javax.swing.JCheckBox();
        cbSaludimagen = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdbSI = new javax.swing.JRadioButton();
        rdbNO = new javax.swing.JRadioButton();
        btnSound1 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("5. ¿Has participado en un taller, curso o alguna otra actividad de los centros comunitarios?");

        panelopciones.setBackground(new java.awt.Color(0, 0, 153));
        panelopciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        panelopciones.setEnabled(false);

        cbCultural.setBackground(new java.awt.Color(0, 0, 153));
        cbCultural.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbCultural.setForeground(new java.awt.Color(255, 255, 255));
        cbCultural.setText("Cultural");
        cbCultural.setEnabled(false);

        cbDeportivo.setBackground(new java.awt.Color(0, 0, 153));
        cbDeportivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbDeportivo.setForeground(new java.awt.Color(255, 255, 255));
        cbDeportivo.setText("Deportivo");
        cbDeportivo.setEnabled(false);

        cbEduambiental.setBackground(new java.awt.Color(0, 0, 153));
        cbEduambiental.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbEduambiental.setForeground(new java.awt.Color(255, 255, 255));
        cbEduambiental.setText("Educacion ambiental");
        cbEduambiental.setEnabled(false);

        cbEducativo.setBackground(new java.awt.Color(0, 0, 153));
        cbEducativo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbEducativo.setForeground(new java.awt.Color(255, 255, 255));
        cbEducativo.setText("Educativo");
        cbEducativo.setEnabled(false);

        cbGastronomia.setBackground(new java.awt.Color(0, 0, 153));
        cbGastronomia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbGastronomia.setForeground(new java.awt.Color(255, 255, 255));
        cbGastronomia.setText("Gastronomia");
        cbGastronomia.setEnabled(false);

        cbPlaticasformativas.setBackground(new java.awt.Color(0, 0, 153));
        cbPlaticasformativas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbPlaticasformativas.setForeground(new java.awt.Color(255, 255, 255));
        cbPlaticasformativas.setText("Platicas formativas");
        cbPlaticasformativas.setEnabled(false);

        cbRecreativas.setBackground(new java.awt.Color(0, 0, 153));
        cbRecreativas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbRecreativas.setForeground(new java.awt.Color(255, 255, 255));
        cbRecreativas.setText("Recreativas");
        cbRecreativas.setEnabled(false);

        cbManualidades.setBackground(new java.awt.Color(0, 0, 153));
        cbManualidades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbManualidades.setForeground(new java.awt.Color(255, 255, 255));
        cbManualidades.setText("Manualidades");
        cbManualidades.setEnabled(false);

        cbSaludyprevencion.setBackground(new java.awt.Color(0, 0, 153));
        cbSaludyprevencion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbSaludyprevencion.setForeground(new java.awt.Color(255, 255, 255));
        cbSaludyprevencion.setText("Salud y prevencion");
        cbSaludyprevencion.setEnabled(false);

        cbServiciosprofesionales.setBackground(new java.awt.Color(0, 0, 153));
        cbServiciosprofesionales.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbServiciosprofesionales.setForeground(new java.awt.Color(255, 255, 255));
        cbServiciosprofesionales.setText("Servicios profesionales voluntarios");
        cbServiciosprofesionales.setEnabled(false);

        cbOficios.setBackground(new java.awt.Color(0, 0, 153));
        cbOficios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbOficios.setForeground(new java.awt.Color(255, 255, 255));
        cbOficios.setText("Oficios");
        cbOficios.setEnabled(false);

        cbSaludimagen.setBackground(new java.awt.Color(0, 0, 153));
        cbSaludimagen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbSaludimagen.setForeground(new java.awt.Color(255, 255, 255));
        cbSaludimagen.setText("Salud, imagen y bienestar personal");
        cbSaludimagen.setEnabled(false);

        javax.swing.GroupLayout panelopcionesLayout = new javax.swing.GroupLayout(panelopciones);
        panelopciones.setLayout(panelopcionesLayout);
        panelopcionesLayout.setHorizontalGroup(
            panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelopcionesLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbGastronomia)
                    .addComponent(cbCultural)
                    .addComponent(cbPlaticasformativas))
                .addGap(21, 21, 21)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDeportivo)
                    .addComponent(cbEducativo)
                    .addComponent(cbSaludyprevencion))
                .addGap(18, 18, 18)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRecreativas)
                    .addComponent(cbSaludimagen)
                    .addComponent(cbEduambiental))
                .addGap(18, 18, 18)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOficios)
                    .addComponent(cbServiciosprofesionales)
                    .addComponent(cbManualidades)))
        );
        panelopcionesLayout.setVerticalGroup(
            panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelopcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCultural)
                    .addComponent(cbEducativo)
                    .addComponent(cbEduambiental)
                    .addComponent(cbManualidades))
                .addGap(28, 28, 28)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRecreativas)
                    .addComponent(cbOficios)
                    .addComponent(cbDeportivo)
                    .addComponent(cbGastronomia))
                .addGap(28, 28, 28)
                .addGroup(panelopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPlaticasformativas)
                    .addComponent(cbSaludyprevencion)
                    .addComponent(cbSaludimagen)
                    .addComponent(cbServiciosprofesionales))
                .addContainerGap(31, Short.MAX_VALUE))
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

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("si tu respuesta fue si, selecciona las actividades:");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        rdbSI.setBackground(new java.awt.Color(0, 0, 153));
        Gruposino.add(rdbSI);
        rdbSI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbSI.setForeground(new java.awt.Color(255, 255, 255));
        rdbSI.setText("SI");
        rdbSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSIActionPerformed(evt);
            }
        });

        rdbNO.setBackground(new java.awt.Color(0, 0, 153));
        Gruposino.add(rdbNO);
        rdbNO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rdbNO.setForeground(new java.awt.Color(255, 255, 255));
        rdbNO.setText("NO");
        rdbNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(rdbSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(rdbNO)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSI)
                    .addComponent(rdbNO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(btnSound1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(panelopciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSound1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!rdbSI.isSelected()&&!rdbNO.isSelected()){
            JOptionPane.showMessageDialog(null, "Debes responder la pregunta");
        }else{
        Pregunta5_percepcion();
        Pregunta6_percepcion1 p = new Pregunta6_percepcion1();
        p.setSize(830, 350);
        p.setLocation(5,5);
        
        PrincipalP.removeAll();
        PrincipalP.add(p, BorderLayout.CENTER);
        PrincipalP.revalidate();
        PrincipalP.repaint();  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdbSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSIActionPerformed
     Habilitar();
    }//GEN-LAST:event_rdbSIActionPerformed

    private void rdbNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNOActionPerformed
     Deshabilitar();   
    }//GEN-LAST:event_rdbNOActionPerformed

    private void btnSound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSound1ActionPerformed
        if (btnSound1.isSelected()){

            audios("pp5.wav");

        }else{
            a.stop();

        }
    }//GEN-LAST:event_btnSound1ActionPerformed
public void Habilitar(){
    if(rdbSI.isSelected()){
         panelopciones.setEnabled(true);
         cbCultural.setEnabled(true);
         cbDeportivo.setEnabled(true);
         cbEduambiental.setEnabled(true);
         cbEducativo.setEnabled(true);
         cbGastronomia.setEnabled(true);
         cbPlaticasformativas.setEnabled(true);
         cbRecreativas.setEnabled(true);
         cbManualidades.setEnabled(true);
         cbSaludyprevencion.setEnabled(true);
         cbServiciosprofesionales.setEnabled(true);
         cbOficios.setEnabled(true);
         cbSaludimagen.setEnabled(true);
     }   
}
public void Deshabilitar(){
    if(rdbNO.isSelected()){
         panelopciones.setEnabled(false);
         cbCultural.setEnabled(false);
         cbDeportivo.setEnabled(false);
         cbEduambiental.setEnabled(false);
         cbEducativo.setEnabled(false);
         cbGastronomia.setEnabled(false);
         cbPlaticasformativas.setEnabled(false);
         cbRecreativas.setEnabled(false);
         cbManualidades.setEnabled(false);
         cbSaludyprevencion.setEnabled(false);
         cbServiciosprofesionales.setEnabled(false);
         cbOficios.setEnabled(false);
         cbSaludimagen.setEnabled(false);
     }   
}
public void Pregunta5_percepcion(){
    if(cbCultural.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 1";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbEducativo.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 4";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbEduambiental.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 3";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbManualidades.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 6";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbGastronomia.isSelected()){
          
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 5";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbDeportivo.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 2";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbRecreativas.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 8";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbOficios.isSelected()){
          
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 12";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbPlaticasformativas.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 7";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbSaludyprevencion.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 9";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbSaludimagen.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 10";
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            
           
            pst.executeUpdate();
            
          //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(cbServiciosprofesionales.isSelected()){
           
           String sql = "Update pregunta5_percepcion set cantidad = cantidad + 1 where id = 11";
        
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
    private javax.swing.ButtonGroup Gruposino;
    private javax.swing.JToggleButton btnSound1;
    private javax.swing.JCheckBox cbCultural;
    private javax.swing.JCheckBox cbDeportivo;
    private javax.swing.JCheckBox cbEduambiental;
    private javax.swing.JCheckBox cbEducativo;
    private javax.swing.JCheckBox cbGastronomia;
    private javax.swing.JCheckBox cbManualidades;
    private javax.swing.JCheckBox cbOficios;
    private javax.swing.JCheckBox cbPlaticasformativas;
    private javax.swing.JCheckBox cbRecreativas;
    private javax.swing.JCheckBox cbSaludimagen;
    private javax.swing.JCheckBox cbSaludyprevencion;
    private javax.swing.JCheckBox cbServiciosprofesionales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelopciones;
    private javax.swing.JRadioButton rdbNO;
    private javax.swing.JRadioButton rdbSI;
    // End of variables declaration//GEN-END:variables
}
