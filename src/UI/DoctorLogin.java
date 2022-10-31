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
public class DoctorLogin extends javax.swing.JFrame {

    /** Creates new form DoctorLoginJPanel */
    public DoctorLogin() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Doctxt = new javax.swing.JTextField();
        btnDocLogin = new javax.swing.JButton();
        btnhome2 = new javax.swing.JButton();
        DocPswdTxt = new javax.swing.JPasswordField();
        errortext = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("DOCTOR LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("USERNAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 109, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 199, -1, -1));

        Doctxt.setBackground(new java.awt.Color(255, 255, 204));
        Doctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctxtActionPerformed(evt);
            }
        });
        getContentPane().add(Doctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 164, -1));

        btnDocLogin.setBackground(new java.awt.Color(0, 153, 0));
        btnDocLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDocLogin.setText("LOGIN");
        btnDocLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnDocLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        btnhome2.setBackground(new java.awt.Color(51, 153, 255));
        btnhome2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnhome2.setText("HOME");
        btnhome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 87, -1));

        DocPswdTxt.setBackground(new java.awt.Color(255, 255, 204));
        DocPswdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocPswdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(DocPswdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 164, -1));

        errortext.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        errortext.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errortext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 490, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/istockphoto-1318410710-170667a.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome2ActionPerformed
        // TODO add your handling code here:
        MainJFrame MainFram = new MainJFrame();
         MainFram.show();
         dispose();
    }//GEN-LAST:event_btnhome2ActionPerformed

    private void DocPswdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocPswdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocPswdTxtActionPerformed

    private void btnDocLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocLoginActionPerformed
        // TODO add your handling code here:
        String Doctor = Doctxt.getText();
        String pswd = DocPswdTxt.getText();
        if (Doctor.equals("doctors") && pswd.equals("doctors")) {
            
             
            DoctorHome DoctorHom = new DoctorHome();
         DoctorHom.show();
         dispose(); 
            
        }else {
        errortext.setText("Incorrect Credentials,Please enter correct details");
        }
        if (Doctor.equals("doctorr") && pswd.equals("doctorr")) {
            
            DoctorHome DoctorHom = new DoctorHome();
         DoctorHom.show();
         dispose(); 
            
        }else {
        errortext.setText("Incorrect Credentials,Please enter correct details");
        }
          if (Doctor.equals("doctorj") && pswd.equals("doctorj")) {
            
             
            DoctorHome DoctorHom = new DoctorHome();
         DoctorHom.show();
         dispose(); 
        }else {
        errortext.setText("Incorrect Credentials,Please enter correct details");
        }
        
     
    }//GEN-LAST:event_btnDocLoginActionPerformed

    private void DoctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctxtActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField DocPswdTxt;
    private javax.swing.JTextField Doctxt;
    private javax.swing.JButton btnDocLogin;
    private javax.swing.JButton btnhome2;
    private javax.swing.JLabel errortext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
