/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Hospital;
import model.HospitalDirectory;
import model.SystemAdmin;

/**
 *
 * @author shivanirahatwad
 */
public class CreateDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorPanel
     */
    SystemAdmin sysAdmin;
    public CreateDoctorPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateHospitals();
        
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
        lblDoctorPassword = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        lblDoctorPhoneNumber = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        lblDoctorEmailAddress = new javax.swing.JLabel();
        btnSaveDoctor = new javax.swing.JButton();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorAge = new javax.swing.JTextField();
        txtDoctorGender = new javax.swing.JTextField();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        txtDoctorEmailAddress = new javax.swing.JTextField();
        lblpersonalDetails = new javax.swing.JLabel();
        lbDoctorName = new javax.swing.JLabel();
        lblDoctorAge = new javax.swing.JLabel();
        lblDoctorGender = new javax.swing.JLabel();
        lblPatientLoginDetails = new javax.swing.JLabel();
        lblDoctorUsername = new javax.swing.JLabel();
        lblContactDetails = new javax.swing.JLabel();
        lblDoctorHouse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorOccupation = new javax.swing.JTextField();
        jComboBoxDoctorHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDoctorExperience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorSpecialisation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Add Doctor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 57, -1, -1));

        lblDoctorPassword.setText("Password");
        add(lblDoctorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 203, -1, -1));
        add(txtDoctorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 159, 220, -1));

        lblDoctorPhoneNumber.setText("Phone Number");
        add(lblDoctorPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 629, -1, -1));
        add(txtDoctorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 200, 221, -1));

        lblDoctorEmailAddress.setText("Email Address");
        add(lblDoctorEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 698, -1, -1));

        btnSaveDoctor.setBackground(new java.awt.Color(0, 153, 0));
        btnSaveDoctor.setText("Save Doctor");
        btnSaveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDoctorActionPerformed(evt);
            }
        });
        add(btnSaveDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 301, 297, -1));
        add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 159, 150, -1));
        add(txtDoctorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 203, 150, -1));
        add(txtDoctorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 239, 150, -1));

        txtDoctorPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNumberActionPerformed(evt);
            }
        });
        add(txtDoctorPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 626, 151, -1));
        add(txtDoctorEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 695, 155, -1));

        lblpersonalDetails.setText("Personal Details");
        add(lblpersonalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 107, -1, -1));

        lbDoctorName.setText("Name");
        add(lbDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 162, -1, -1));

        lblDoctorAge.setText("Age");
        add(lblDoctorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 206, -1, -1));

        lblDoctorGender.setText("Gender");
        add(lblDoctorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 242, -1, -1));

        lblPatientLoginDetails.setText("Login Details");
        add(lblPatientLoginDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 107, -1, -1));

        lblDoctorUsername.setText("Username");
        add(lblDoctorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 162, -1, -1));

        lblContactDetails.setText("Contact Details");
        add(lblContactDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 573, 94, -1));

        lblDoctorHouse.setText("Hospital");
        add(lblDoctorHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 290, -1, -1));

        jLabel3.setText("Occupation");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 338, -1, -1));
        add(txtDoctorOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 335, 150, -1));

        add(jComboBoxDoctorHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 287, 150, -1));

        jLabel2.setText("Experience");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 387, -1, -1));
        add(txtDoctorExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 384, 150, -1));

        jLabel4.setText("Specialisation");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 441, -1, -1));
        add(txtDoctorSpecialisation, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 435, 150, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/wp2610913.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDoctorActionPerformed
        // TODO add your handling code here:
        
       
        
        if(jComboBoxDoctorHospital.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        Hospital hospital = (Hospital)jComboBoxDoctorHospital.getSelectedItem();
        
        String doctorId = String.valueOf(sysAdmin.getDoctorDirectory().doctorCount() + Integer.parseInt("1000000"));
        String doctorName = txtDoctorName.getText();
        int doctorAge,doctorExperience;
        String doctorGender = txtDoctorGender.getText();
        String doctorOccupation = txtDoctorOccupation.getText();
        
        String specialisation = txtDoctorSpecialisation.getText();
        String doctorEmail = txtDoctorEmailAddress.getText();
        String doctorPhone = txtDoctorPhoneNumber.getText();
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();
        
        if(doctorName.length()==0 || doctorGender.length()==0 || doctorOccupation.length()==0 || specialisation.length()==0 || doctorEmail.length()==0 ||
                doctorPhone.length()==0 || username.length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            return;
        }
        try{
            doctorAge = Integer.parseInt(txtDoctorAge.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
            return;
        }
        
        try{
            doctorExperience = Integer.parseInt(txtDoctorExperience.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Experience");
            return;
        }
        
        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailmatcher = emailPattern.matcher(doctorEmail);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(doctorPhone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }
        Doctor d = sysAdmin.getDoctorDirectory().addDoctor();
        d.setDoctorId(doctorId);
        d.setDoctorName(doctorName);
        d.setAge(doctorAge);
        d.setExperience(doctorExperience);
        d.setGender(doctorGender);
        d.setOccupation(doctorOccupation);
        d.setSpecialization(specialisation);
        d.setEmail(doctorEmail);
        d.setPhoneNumber(doctorPhone);
        d.setUsername(username);
        d.setPassword(password);
        d.setHospital(hospital);
        
        JOptionPane.showMessageDialog(this, "Doctor Info Saved"); 
        
        txtDoctorAge.setText("");
        txtDoctorEmailAddress.setText("");
        txtDoctorExperience.setText("");
        txtDoctorGender.setText("");
        txtDoctorName.setText("");
        txtDoctorOccupation.setText("");
        txtDoctorPassword.setText("");
        txtDoctorPhoneNumber.setText("");
        txtDoctorSpecialisation.setText("");
        txtDoctorUsername.setText("");
        jComboBoxDoctorHospital.setSelectedItem(null);
        
        
        
        
        

    }//GEN-LAST:event_btnSaveDoctorActionPerformed

    private void txtDoctorPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveDoctor;
    private javax.swing.JComboBox<Object> jComboBoxDoctorHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbDoctorName;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblDoctorAge;
    private javax.swing.JLabel lblDoctorEmailAddress;
    private javax.swing.JLabel lblDoctorGender;
    private javax.swing.JLabel lblDoctorHouse;
    private javax.swing.JLabel lblDoctorPassword;
    private javax.swing.JLabel lblDoctorPhoneNumber;
    private javax.swing.JLabel lblDoctorUsername;
    private javax.swing.JLabel lblPatientLoginDetails;
    private javax.swing.JLabel lblpersonalDetails;
    private javax.swing.JTextField txtDoctorAge;
    private javax.swing.JTextField txtDoctorEmailAddress;
    private javax.swing.JTextField txtDoctorExperience;
    private javax.swing.JTextField txtDoctorGender;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorOccupation;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorSpecialisation;
    private javax.swing.JTextField txtDoctorUsername;
    // End of variables declaration//GEN-END:variables

    

    private void populateHospitals() {
        /*
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        
        */
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        List<Hospital> hl = hd.getHospitalDirectory();
        for(Hospital h : hl){
            jComboBoxDoctorHospital.addItem(h);
        }
        
    }
}
