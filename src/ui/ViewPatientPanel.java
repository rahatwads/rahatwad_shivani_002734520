/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author shivanirahatwad
 */
public class ViewPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientPanel
     */
    SystemAdmin sysAdmin;
    public ViewPatientPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateHouses();
        populateTable();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientDirectory = new javax.swing.JTable();
        btnviewPatientDetails = new javax.swing.JButton();
        btnupdatePatientDetails = new javax.swing.JButton();
        lblPatientPhoneNumber = new javax.swing.JLabel();
        lblPatientEmailAddress = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        txtPatientGender = new javax.swing.JTextField();
        txtPatientPhoneNumber = new javax.swing.JTextField();
        txtPatientEmailAddress = new javax.swing.JTextField();
        lblPatientFundamentals = new javax.swing.JLabel();
        lblPatientHeight = new javax.swing.JLabel();
        lblPatientWeight = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientAllergies = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        txtPatientHeight = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtPatientWeight = new javax.swing.JTextField();
        txtPatientAllergies = new javax.swing.JTextField();
        lblContactDetails = new javax.swing.JLabel();
        lblPatientUsername = new javax.swing.JLabel();
        txtPatientUsername = new javax.swing.JTextField();
        lblPatientPassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPatientHouse = new javax.swing.JComboBox<>();
        btnSavePatient = new javax.swing.JButton();
        txtPatientPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("View Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 17, -1, -1));

        tblPatientDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "House", "HeightinCms", "WeightinCms", "Allergies"
            }
        ));
        jScrollPane1.setViewportView(tblPatientDirectory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 630, 195));

        btnviewPatientDetails.setText("view Details");
        btnviewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewPatientDetailsActionPerformed(evt);
            }
        });
        add(btnviewPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        btnupdatePatientDetails.setText("update Details");
        btnupdatePatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatePatientDetailsActionPerformed(evt);
            }
        });
        add(btnupdatePatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        lblPatientPhoneNumber.setText("Phone Number");
        add(lblPatientPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, -1));

        lblPatientEmailAddress.setText("Email Address");
        add(lblPatientEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 682, -1, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 349, 220, -1));
        add(txtPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 317, 220, -1));
        add(txtPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 389, 220, -1));

        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPatientPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 215, -1));
        add(txtPatientEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 670, 222, -1));

        lblPatientFundamentals.setText("Fundamentals");
        add(lblPatientFundamentals, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        lblPatientHeight.setText("Height");
        add(lblPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        lblPatientWeight.setText("Weight");
        add(lblPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        lblPatientName.setText("Name");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 352, -1, -1));

        lblPatientAllergies.setText("Allergies");
        add(lblPatientAllergies, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 320, -1, -1));

        txtPatientHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHeightActionPerformed(evt);
            }
        });
        add(txtPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 150, -1));

        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 392, -1, -1));
        add(txtPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 150, -1));
        add(txtPatientAllergies, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, -1));

        lblContactDetails.setText("Contact Details");
        add(lblContactDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 94, -1));

        lblPatientUsername.setText("Username");
        add(lblPatientUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 483, -1, -1));
        add(txtPatientUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 480, 217, -1));

        lblPatientPassword.setText("Password");
        add(lblPatientPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 524, -1, -1));

        jLabel2.setText("House");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 442, -1, -1));

        add(jComboBoxPatientHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 439, 217, -1));

        btnSavePatient.setText("Save Patient");
        btnSavePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });
        add(btnSavePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));
        add(txtPatientPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 521, 214, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/wp2610913.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientPhoneNumberActionPerformed

    private void txtPatientHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientHeightActionPerformed

    private void btnviewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewPatientDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblPatientDirectory.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        Patient p = (Patient) model.getValueAt(selectedrowIndex, 1);
        
        
        
        txtPatientName.setText(p.getName());
        txtPatientName.setEditable(false);
        txtPatientAge.setText(String.valueOf(p.getAge()));
        txtPatientAge.setEditable(false);
        txtPatientGender.setText(String.valueOf(p.getGender()));
        txtPatientGender.setEditable(false);
        jComboBoxPatientHouse.setSelectedItem(p.getAddress());
        jComboBoxPatientHouse.setEditable(false);
        
        txtPatientPhoneNumber.setText(p.getPhoneNumber());
        txtPatientPhoneNumber.setEditable(false);
        txtPatientEmailAddress.setText(p.getEmailAddress());
        txtPatientEmailAddress.setEditable(false);
        txtPatientUsername.setText(p.getUsername());
        txtPatientUsername.setEditable(false);
        txtPatientPassword.setText(p.getPassword());
        txtPatientPassword.setEditable(false);
        
        txtPatientHeight.setText(String.valueOf(p.getHeightIncms()));
        txtPatientHeight.setEditable(false);
        txtPatientWeight.setText(String.valueOf(p.getWeightInKgs()));
        txtPatientWeight.setEditable(false);
        txtPatientAllergies.setText(p.getAllergies());
        txtPatientAllergies.setEditable(false);
        
        
        
    }//GEN-LAST:event_btnviewPatientDetailsActionPerformed

    private void btnupdatePatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatePatientDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblPatientDirectory.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        Patient p = (Patient) model.getValueAt(selectedrowIndex, 1);
        
        
        
        txtPatientName.setText(p.getName());
        txtPatientName.setEditable(true);
        txtPatientAge.setText(String.valueOf(p.getAge()));
        txtPatientAge.setEditable(true);
        txtPatientGender.setText(String.valueOf(p.getGender()));
        txtPatientGender.setEditable(true);
        jComboBoxPatientHouse.setSelectedItem(p.getAddress());
        jComboBoxPatientHouse.setEditable(true);
        
        txtPatientPhoneNumber.setText(p.getPhoneNumber());
        txtPatientPhoneNumber.setEditable(true);
        txtPatientEmailAddress.setText(p.getEmailAddress());
        txtPatientEmailAddress.setEditable(true);
        txtPatientUsername.setText(p.getUsername());
        txtPatientUsername.setEditable(true);
        txtPatientPassword.setText(p.getPassword());
        txtPatientPassword.setEditable(true);
        
        txtPatientHeight.setText(String.valueOf(p.getHeightIncms()));
        txtPatientHeight.setEditable(true);
        txtPatientWeight.setText(String.valueOf(p.getWeightInKgs()));
        txtPatientWeight.setEditable(true);
        txtPatientAllergies.setText(p.getAllergies());
        txtPatientAllergies.setEditable(true);
    }//GEN-LAST:event_btnupdatePatientDetailsActionPerformed

    private void btnSavePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientActionPerformed
        // TODO add your handling code here:
        
        if(jComboBoxPatientHouse.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        House house = (House)jComboBoxPatientHouse.getSelectedItem();
        
        Patient p = sysAdmin.getPatientDirectory().getPatient(txtPatientUsername.getText());
        
        String patientName = txtPatientName.getText();
        int patientAge;
        String patientGender = txtPatientGender.getText();
        

        
        String patientEmail = txtPatientEmailAddress.getText();
        String patientPhone = txtPatientPhoneNumber.getText();
        String username = txtPatientUsername.getText();
        String password = txtPatientPassword.getText();
        String weight = txtPatientWeight.getText();
        String height = txtPatientHeight.getText();
        String allergies = txtPatientAllergies.getText();

        if(patientName.length()==0 || patientGender.length()==0 || patientEmail.length()==0 ||
            patientPhone.length()==0 || username.length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            return;
        }
        try{
            patientAge = Integer.parseInt(txtPatientAge.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
            return;
        }

        

        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailmatcher = emailPattern.matcher(patientEmail);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(patientPhone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }

        
        p.setName(patientName);
        p.setAge(patientAge);
        
        p.setGender(patientGender);
        
        
        p.setEmailAddress(patientEmail);
        p.setPhoneNumber(patientPhone);
        p.setUsername(username);
        p.setPassword(password);
        p.setAddress(house);
        p.setHeightIncms(Double.parseDouble(height));
        p.setWeightInKgs(Double.parseDouble(weight));
        p.setAllergies(allergies);

        JOptionPane.showMessageDialog(this, "Patient Info Updated");

        txtPatientAge.setText("");
        txtPatientEmailAddress.setText("");
        
        txtPatientGender.setText("");
        txtPatientName.setText("");
        
        txtPatientPassword.setText("");
        txtPatientPhoneNumber.setText("");
        txtPatientWeight.setText("");
        txtPatientHeight.setText("");
        txtPatientAllergies.setText("");
        txtPatientUsername.setText("");
        jComboBoxPatientHouse.setSelectedItem(null);
        populateTable();
        
    }//GEN-LAST:event_btnSavePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePatient;
    private javax.swing.JButton btnupdatePatientDetails;
    private javax.swing.JButton btnviewPatientDetails;
    private javax.swing.JComboBox<Object> jComboBoxPatientHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientAllergies;
    private javax.swing.JLabel lblPatientEmailAddress;
    private javax.swing.JLabel lblPatientFundamentals;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHeight;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientPassword;
    private javax.swing.JLabel lblPatientPhoneNumber;
    private javax.swing.JLabel lblPatientUsername;
    private javax.swing.JLabel lblPatientWeight;
    private javax.swing.JTable tblPatientDirectory;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientAllergies;
    private javax.swing.JTextField txtPatientEmailAddress;
    private javax.swing.JTextField txtPatientGender;
    private javax.swing.JTextField txtPatientHeight;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JPasswordField txtPatientPassword;
    private javax.swing.JTextField txtPatientPhoneNumber;
    private javax.swing.JTextField txtPatientUsername;
    private javax.swing.JTextField txtPatientWeight;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        
        DefaultTableModel model = (DefaultTableModel)tblPatientDirectory.getModel();
        model.setRowCount(0);
        PatientDirectory pd = sysAdmin.getPatientDirectory();
        List<Patient> patients = pd.getPatientDirectory();
        for(Patient p : patients){
            Object[] row = new Object[7];
            row[0] = p.getPatientId();
            row[1] = p;
            row[2] = p.getAge();
            row[3] = p.getAddress();
            row[4] = p.getHeightIncms();
            row[5] = p.getWeightInKgs();
            row[6] = p.getAllergies();
            model.addRow(row);
        }
        
        
        
    }

    private void populateHouses() {
        List<City> cities = sysAdmin.getCities();
        jComboBoxPatientHouse.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                for(House h : community.getHouseList()){
                    jComboBoxPatientHouse.addItem(h);
                }
            }
        }
    }
}
