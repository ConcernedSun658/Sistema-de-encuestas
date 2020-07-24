/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis_encuestas;




import Preguntas_Percpecion.Pregunta3_percepcion;
import Preguntas_Percpecion.Pregunta5_percepcion;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis
 */
public class EncuestaPercepcion extends javax.swing.JFrame {
public String rute = "/sonidos/";
public AudioClip a;
    
    
    
    public EncuestaPercepcion() {
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
        PrincipalP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdbSI = new javax.swing.JRadioButton();
        rdbNO = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbCentros = new javax.swing.JComboBox<>();
        jcbCentros2 = new javax.swing.JComboBox<>();
        btnSound = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalP.setBackground(new java.awt.Color(0, 0, 102));
        PrincipalP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1. ¿Conoces algun centro comunitario?");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        rdbSI.setBackground(new java.awt.Color(0, 0, 153));
        Pregunta1Grupo.add(rdbSI);
        rdbSI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rdbSI.setForeground(new java.awt.Color(255, 255, 255));
        rdbSI.setText("SI");
        rdbSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSIActionPerformed(evt);
            }
        });

        rdbNO.setBackground(new java.awt.Color(0, 0, 153));
        Pregunta1Grupo.add(rdbNO);
        rdbNO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
                .addGap(67, 67, 67)
                .addComponent(rdbSI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(rdbNO, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSI)
                    .addComponent(rdbNO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Si tu respuesta fue si ¿Que centros conoces?");

        jcbCentros.setBackground(new java.awt.Color(0, 0, 153));
        jcbCentros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbCentros.setForeground(new java.awt.Color(255, 255, 255));
        jcbCentros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "CIS Villas del Bajio", "CIS Romeral", "CIS Xochipilli", "CIS San Juan de la Vega", "CIS Monte blanco" }));
        jcbCentros.setEnabled(false);

        jcbCentros2.setBackground(new java.awt.Color(0, 0, 153));
        jcbCentros2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbCentros2.setForeground(new java.awt.Color(255, 255, 255));
        jcbCentros2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "CIS Villas del Bajio", "CIS Romeral", "CIS Xochipilli", "CIS San Juan de la Vega", "CIS Monte Blanco" }));
        jcbCentros2.setEnabled(false);

        btnSound.setBackground(new java.awt.Color(0, 0, 153));
        btnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N
        btnSound.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalPLayout = new javax.swing.GroupLayout(PrincipalP);
        PrincipalP.setLayout(PrincipalPLayout);
        PrincipalPLayout.setHorizontalGroup(
            PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrincipalPLayout.createSequentialGroup()
                        .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnSound))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbCentros2, 0, 355, Short.MAX_VALUE)
                            .addComponent(jcbCentros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
        );
        PrincipalPLayout.setVerticalGroup(
            PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PrincipalPLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(PrincipalPLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSound)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jcbCentros2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(PrincipalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 840, 360));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(!rdbSI.isSelected()&& !rdbNO.isSelected()){
            JOptionPane.showMessageDialog(null, "Debes elegir una opcion");
        }
        else{
        Pregunta1_percepcion();
        
        
        Pregunta3_percepcion p = new Pregunta3_percepcion();
        p.setSize(830, 350);
        p.setLocation(5,5);
        
        PrincipalP.removeAll();
        PrincipalP.add(p, BorderLayout.CENTER);
        PrincipalP.revalidate();
        PrincipalP.repaint();
        }
        

    }//GEN-LAST:event_btnGuardarActionPerformed
 
    private void rdbSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSIActionPerformed
            jcbCentros.setEnabled(true);
            jcbCentros2.setEnabled(true);
            
        
    }//GEN-LAST:event_rdbSIActionPerformed

    private void rdbNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNOActionPerformed
       if(rdbNO.isSelected()){
            jcbCentros.setEnabled(false);
            jcbCentros2.setEnabled(false);
        } 
    }//GEN-LAST:event_rdbNOActionPerformed

    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoundActionPerformed
        if (btnSound.isSelected()){

            audios("pp1.wav");

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
            java.util.logging.Logger.getLogger(EncuestaPercepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncuestaPercepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncuestaPercepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncuestaPercepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncuestaPercepcion().setVisible(true);
            }
        });
    }
    public void Pregunta1_percepcion(){
       String centro1 = jcbCentros.getSelectedItem().toString();
       String centro2 = jcbCentros2.getSelectedItem().toString();
        System.out.println(centro1);
        if(rdbSI.isSelected()){
           String sql = "Update pregunta1_percepcion set si = si + 1 where id = 1";
           
           String sql2 = "Update pregunta2_percepcion set veces_conocido = veces_conocido + 1 where centro = '"+centro1+"'";
           String sql3 = "Update pregunta2_percepcion set veces_conocido = veces_conocido + 1 where centro = '"+centro2+"'";
           
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            PreparedStatement pst2 = cn.prepareStatement(sql2);
            PreparedStatement pst3 = cn.prepareStatement(sql3);
           
            pst.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            
     
           //JOptionPane.showMessageDialog(null, "RESPUESTA GUARDADA
        }catch(Exception e){
            System.out.println(e);
        }
        }
        if(rdbNO.isSelected()){
            String sql = "Update pregunta1_percepcion set no = no + 1 where id = 1";
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcis2", "root", "");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            }catch(Exception e){
            System.out.println(e);
        }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Pregunta1Grupo;
    public static javax.swing.JPanel PrincipalP;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnSound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbCentros;
    private javax.swing.JComboBox<String> jcbCentros2;
    private javax.swing.JRadioButton rdbNO;
    private javax.swing.JRadioButton rdbSI;
    // End of variables declaration//GEN-END:variables

    
}

