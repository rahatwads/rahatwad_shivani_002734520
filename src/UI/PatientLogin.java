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
public class PatientLogin extends javax.swing.JFrame {

    /**
     * Creates new form PatientLoginJPanel
     */
    public PatientLogin() {
        initComponents();
        
        
//        getContentPane().setBackground(Color.white);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PatientTxt = new javax.swing.JTextField();
        Patientloginbtn = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        PatientPswdTxt = new javax.swing.JPasswordField();
        errortxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("USERNAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 109, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 199, -1, -1));

        PatientTxt.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(PatientTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 164, -1));

        Patientloginbtn.setBackground(new java.awt.Color(0, 153, 51));
        Patientloginbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Patientloginbtn.setText("LOGIN");
        Patientloginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientloginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Patientloginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        BtnHome.setBackground(new java.awt.Color(51, 153, 255));
        BtnHome.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BtnHome.setText("HOME");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 87, -1));

        PatientPswdTxt.setBackground(new java.awt.Color(255, 255, 204));
        PatientPswdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientPswdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(PatientPswdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 164, -1));

        errortxt.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        errortxt.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 492, 39));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/istockphoto-1318410710-170667a.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
         MainJFrame MainFram = new MainJFrame();
         MainFram.show();
         dispose();
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void PatientPswdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientPswdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientPswdTxtActionPerformed

    private void PatientloginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientloginbtnActionPerformed
        // TODO add your handling code here:
        String patient = PatientTxt.getText();
        String password = PatientPswdTxt.getText();
        
        if (patient.equals("shivani") && password.equals("shivani123")) {
            
            PatientHome PatientHom = new PatientHome();
         PatientHom.show();
         dispose(); 
            
        }else {
        errortxt.setText("Incorrect Credentials,Please enter correct details");
        }
        if (patient.equals("mike") && password.equals("mike123")) {
            
             
            PatientHome PatientHom = new PatientHome();
         PatientHom.show();
         dispose();  
            
        }else {
        errortxt.setText("Incorrect Credentials,Please enter correct details");
        }
          if (patient.equals("joe") && password.equals("joe123")) {
            
            PatientHome PatientHom = new PatientHome();
         PatientHom.show();
         dispose();  
            
        }else {
        errortxt.setText("Incorrect Credentials,Please enter correct details");
        }
    }//GEN-LAST:event_PatientloginbtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JPasswordField PatientPswdTxt;
    private javax.swing.JTextField PatientTxt;
    private javax.swing.JButton Patientloginbtn;
    private javax.swing.JLabel errortxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
