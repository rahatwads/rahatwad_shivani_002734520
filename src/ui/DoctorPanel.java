/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.DoctorDirectory;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author shivanirahatwad
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    CardLayout cardLayoutmain;
    SystemAdmin sysAdmin;
    Doctor d;
    public DoctorPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        cardLayoutmain = (CardLayout)(this.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDoctorLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        btnDoctorLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSplitPaneDoctorPanel = new javax.swing.JSplitPane();
        controlPanelDoctor = new javax.swing.JPanel();
        btnCreateEncounter = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        btnCreateVitalSign = new javax.swing.JButton();
        btnViewVitalSign = new javax.swing.JButton();
        viewPanelDoctor = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jPanelDoctorLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelDoctorLoginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 55, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Doctor Login");
        jPanelDoctorLoginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 61, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Username");
        jPanelDoctorLoginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 158, -1, -1));
        jPanelDoctorLoginPanel.add(txtDoctorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 152, 150, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Password");
        jPanelDoctorLoginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 215, -1, -1));
        jPanelDoctorLoginPanel.add(txtDoctorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 209, 150, -1));

        btnDoctorLogin.setBackground(new java.awt.Color(0, 153, 0));
        btnDoctorLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDoctorLogin.setText("Login");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });
        jPanelDoctorLoginPanel.add(btnDoctorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 286, 130, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/wp2610913.jpg"))); // NOI18N
        jPanelDoctorLoginPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanelDoctorLoginPanel, "jPanelDoctorLoginPanel");

        jSplitPaneDoctorPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        btnCreateVitalSign.setText("Create Vital Signs");
        btnCreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalSignActionPerformed(evt);
            }
        });

        btnViewVitalSign.setText("View Vital Signs");
        btnViewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelDoctorLayout = new javax.swing.GroupLayout(controlPanelDoctor);
        controlPanelDoctor.setLayout(controlPanelDoctorLayout);
        controlPanelDoctorLayout.setHorizontalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnCreateEncounter)
                .addGap(26, 26, 26)
                .addComponent(btnViewEncounter)
                .addGap(30, 30, 30)
                .addComponent(btnCreateVitalSign)
                .addGap(18, 18, 18)
                .addComponent(btnViewVitalSign)
                .addContainerGap(705, Short.MAX_VALUE))
        );
        controlPanelDoctorLayout.setVerticalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateEncounter)
                    .addComponent(btnViewEncounter)
                    .addComponent(btnCreateVitalSign)
                    .addComponent(btnViewVitalSign))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jSplitPaneDoctorPanel.setLeftComponent(controlPanelDoctor);

        javax.swing.GroupLayout viewPanelDoctorLayout = new javax.swing.GroupLayout(viewPanelDoctor);
        viewPanelDoctor.setLayout(viewPanelDoctorLayout);
        viewPanelDoctorLayout.setHorizontalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1386, Short.MAX_VALUE)
        );
        viewPanelDoctorLayout.setVerticalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );

        jSplitPaneDoctorPanel.setRightComponent(viewPanelDoctor);

        add(jSplitPaneDoctorPanel, "jSplitPaneDoctorPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:
        
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();
        boolean validate = validateLogin(username,password);
        if(validate){
            cardLayoutmain.show(this, "jSplitPaneDoctorPanel");
            this.d = getDoctor(username);
            
            
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        AddEncounterPanelDoctor encounterDoctor = new AddEncounterPanelDoctor(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);
        
    }//GEN-LAST:event_btnCreateEncounterActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncounterPanelDoctor encounterDoctor = new ViewEncounterPanelDoctor(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnCreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalSignActionPerformed
        // TODO add your handling code here:
        CreateVitalSignsPanel createvitals = new CreateVitalSignsPanel(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(createvitals);
    }//GEN-LAST:event_btnCreateVitalSignActionPerformed

    private void btnViewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignActionPerformed
        // TODO add your handling code here:
        ViewVitalSignsPanel viewVitals = new ViewVitalSignsPanel(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(viewVitals);
    }//GEN-LAST:event_btnViewVitalSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnCreateVitalSign;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JButton btnViewVitalSign;
    private javax.swing.JPanel controlPanelDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelDoctorLoginPanel;
    private javax.swing.JSplitPane jSplitPaneDoctorPanel;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorUsername;
    private javax.swing.JPanel viewPanelDoctor;
    // End of variables declaration//GEN-END:variables

    private boolean validateLogin(String username, String password) {
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getUsername().equals(username) && d.getPassword().equals(password)){
                return true;
            }
        }
        return false;
        
    }

    private Doctor getDoctor(String username) {
        Doctor doc = new Doctor();
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getUsername().equals(username)){
                doc = d;
                break;
            }
        }
        return doc;
    }
    
}
