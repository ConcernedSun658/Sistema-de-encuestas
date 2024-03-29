/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis_encuestas;

/**
 *
 * @author Jose Luis Aranda Cervantes
 */
public class INICIO extends javax.swing.JFrame {

    /**
     * Creates new form INICIO
     */
    public INICIO() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //this.setResizable(false);
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
        btnEncuestaSa = new javax.swing.JButton();
        btnEncuestaPer = new javax.swing.JButton();
        btnAdministrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(19, 43, 106));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        btnEncuestaSa.setBackground(new java.awt.Color(0, 0, 153));
        btnEncuestaSa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEncuestaSa.setForeground(new java.awt.Color(255, 255, 255));
        btnEncuestaSa.setText("Encuesta de Satisfaccion");
        btnEncuestaSa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnEncuestaSa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaSaActionPerformed(evt);
            }
        });

        btnEncuestaPer.setBackground(new java.awt.Color(0, 0, 153));
        btnEncuestaPer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEncuestaPer.setForeground(new java.awt.Color(255, 255, 255));
        btnEncuestaPer.setText("Encuesta de Percepcion");
        btnEncuestaPer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnEncuestaPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaPerActionPerformed(evt);
            }
        });

        btnAdministrar.setBackground(new java.awt.Color(0, 0, 153));
        btnAdministrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdministrar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrar.setText("Administrar Encuestas");
        btnAdministrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        btnAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncuestaSa, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(btnEncuestaPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdministrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnEncuestaSa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnEncuestaPer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnAdministrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 25, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosEiconos/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncuestaSaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaSaActionPerformed
        Registro r = new Registro();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEncuestaSaActionPerformed

    private void btnAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarActionPerformed
        VentanaAdmin admin = new VentanaAdmin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdministrarActionPerformed

    private void btnEncuestaPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaPerActionPerformed
        EncuestaPercepcion ep = new EncuestaPercepcion();
        ep.show();
        dispose();
    }//GEN-LAST:event_btnEncuestaPerActionPerformed

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
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrar;
    private javax.swing.JButton btnEncuestaPer;
    private javax.swing.JButton btnEncuestaSa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
