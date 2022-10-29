/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;

/**
 *
 * @author shivanirahatwad
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        
//        getContentPane().setBackground(Color.pink);
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
        btnpatientlogin = new javax.swing.JButton();
        btndoclogin = new javax.swing.JButton();
        btnHospitalAdminlogin = new javax.swing.JButton();
        btncomadmin = new javax.swing.JButton();
        btnSystemAdmlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN AS A :");
        jLabel1.setMaximumSize(new java.awt.Dimension(63, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 200, 37));

        btnpatientlogin.setText("PATIENT");
        btnpatientlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnpatientlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 151, -1));

        btndoclogin.setText("DOCTOR");
        btndoclogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocloginActionPerformed(evt);
            }
        });
        getContentPane().add(btndoclogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 151, -1));

        btnHospitalAdminlogin.setText("HOSPITAL ADMIN");
        btnHospitalAdminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalAdminloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnHospitalAdminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 151, -1));

        btncomadmin.setText("COMMUNITY ADMIN");
        btncomadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomadminActionPerformed(evt);
            }
        });
        getContentPane().add(btncomadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        btnSystemAdmlogin.setText("SYSTEM ADMIN");
        btnSystemAdmlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdmloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnSystemAdmlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 151, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel3.setText("WELCOME");
        jLabel3.setMaximumSize(new java.awt.Dimension(63, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 200, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/medical-waste-disposal-for-hospitals.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpatientloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientloginActionPerformed
        // TODO add your handling code here:
        
          PatientLogin patientlog = new PatientLogin();
         patientlog.show();
         dispose();
    }//GEN-LAST:event_btnpatientloginActionPerformed

    private void btndocloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocloginActionPerformed
        // TODO add your handling code here:
          DoctorLogin Doctorlog = new DoctorLogin();
         Doctorlog.show();
         dispose();
    }//GEN-LAST:event_btndocloginActionPerformed

    private void btncomadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomadminActionPerformed
        // TODO add your handling code here:
        CommunityAdminLogin CommunityAdminLog = new  CommunityAdminLogin();
        CommunityAdminLog.show();
         dispose();
    }//GEN-LAST:event_btncomadminActionPerformed

    private void btnHospitalAdminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalAdminloginActionPerformed
        // TODO add your handling code here:
          HospitalAdminLogin HospitalAdminLog = new HospitalAdminLogin();
         HospitalAdminLog.show();
         dispose();
    }//GEN-LAST:event_btnHospitalAdminloginActionPerformed

    private void btnSystemAdmloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdmloginActionPerformed
        // TODO add your handling code here:
         SystemAdminLogin SystemAdminLog = new SystemAdminLogin();
         SystemAdminLog.show();
         dispose();
        
    }//GEN-LAST:event_btnSystemAdmloginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospitalAdminlogin;
    private javax.swing.JButton btnSystemAdmlogin;
    private javax.swing.JButton btncomadmin;
    private javax.swing.JButton btndoclogin;
    private javax.swing.JButton btnpatientlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
