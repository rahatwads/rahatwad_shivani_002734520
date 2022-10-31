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
public class ViewPatientPanelSystemAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientPanelSystemAdmin
     */
    SystemAdmin sysAdmin;
    public ViewPatientPanelSystemAdmin(SystemAdmin sysAdmin) {
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

        lblPatientHeight = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientDirectory = new javax.swing.JTable();
        lblPatientWeight = new javax.swing.JLabel();
        btnviewPatientDetails = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        btnupdatePatientDetails = new javax.swing.JButton();
        lblPatientAllergies = new javax.swing.JLabel();
        lblPatientPassword = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        txtPatientHeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblPatientGender = new javax.swing.JLabel();
        jComboBoxPatientHouse = new javax.swing.JComboBox<>();
        lblPatientPhoneNumber = new javax.swing.JLabel();
        txtPatientWeight = new javax.swing.JTextField();
        btnSavePatient = new javax.swing.JButton();
        txtPatientPassword = new javax.swing.JPasswordField();
        lblPatientEmailAddress = new javax.swing.JLabel();
        txtPatientAllergies = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        txtPatientGender = new javax.swing.JTextField();
        lblContactDetails = new javax.swing.JLabel();
        txtPatientPhoneNumber = new javax.swing.JTextField();
        txtPatientEmailAddress = new javax.swing.JTextField();
        lblPatientFundamentals = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPatientUsername = new javax.swing.JLabel();
        txtPatientUsername = new javax.swing.JTextField();
        btnDeletePatient = new javax.swing.JButton();

        lblPatientHeight.setText("Height");

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

        lblPatientWeight.setText("Weight");

        btnviewPatientDetails.setText("view Details");
        btnviewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewPatientDetailsActionPerformed(evt);
            }
        });

        lblPatientName.setText("Name");

        btnupdatePatientDetails.setText("update Details");
        btnupdatePatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatePatientDetailsActionPerformed(evt);
            }
        });

        lblPatientAllergies.setText("Allergies");

        lblPatientPassword.setText("Password");

        lblPatientAge.setText("Age");

        txtPatientHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHeightActionPerformed(evt);
            }
        });

        jLabel2.setText("House");

        lblPatientGender.setText("Gender");

        lblPatientPhoneNumber.setText("Phone Number");

        btnSavePatient.setText("Save Patient");
        btnSavePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });

        lblPatientEmailAddress.setText("Email Address");

        lblContactDetails.setText("Contact Details");

        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });

        lblPatientFundamentals.setText("Fundamentals");

        jLabel1.setText("View Patients");

        lblPatientUsername.setText("Username");

        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPatientFundamentals))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(btnviewPatientDetails)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnupdatePatientDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletePatient)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(lblContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPatientUsername)
                                            .addComponent(lblPatientName)
                                            .addComponent(lblPatientAge)
                                            .addComponent(lblPatientGender)
                                            .addComponent(lblPatientPassword)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPatientAge, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(txtPatientGender)
                                                .addComponent(txtPatientName))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jComboBoxPatientHouse, javax.swing.GroupLayout.Alignment.LEADING, 0, 217, Short.MAX_VALUE)
                                                .addComponent(txtPatientUsername, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientPhoneNumber)
                                .addGap(240, 240, 240)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPatientAllergies, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPatientHeight)
                                        .addComponent(lblPatientWeight)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btnSavePatient)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientEmailAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPatientEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewPatientDetails)
                    .addComponent(btnupdatePatientDetails)
                    .addComponent(btnDeletePatient))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPatientAge))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPatientFundamentals)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPatientName)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPatientGender)
                                    .addComponent(txtPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPatientHeight)
                                    .addComponent(txtPatientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPatientWeight)
                                    .addComponent(txtPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPatientAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPatientAllergies))))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxPatientHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPatientPassword)
                        .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientUsername))
                        .addGap(18, 18, 18)
                        .addComponent(btnSavePatient)))
                .addGap(50, 50, 50)
                .addComponent(lblContactDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientPhoneNumber)
                    .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblPatientEmailAddress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtPatientHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientHeightActionPerformed

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

    private void txtPatientPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientPhoneNumberActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
        /*
        int selectedrowIndex = tblHospitals.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to delete the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        Hospital h = (Hospital) model.getValueAt(selectedrowIndex, 1);
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        hd.deleteHospital(h);
        JOptionPane.showMessageDialog(this, "Hospital deleted");
        populateTable();
        */
        int selectedrowIndex = tblPatientDirectory.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to delete the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        Patient h = (Patient) model.getValueAt(selectedrowIndex, 1);
        PatientDirectory pd = sysAdmin.getPatientDirectory();
        pd.deleteHospital(h);
        JOptionPane.showMessageDialog(this, "Patient deleted");
        populateTable();
    }//GEN-LAST:event_btnDeletePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnSavePatient;
    private javax.swing.JButton btnupdatePatientDetails;
    private javax.swing.JButton btnviewPatientDetails;
    private javax.swing.JComboBox<Object> jComboBoxPatientHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
}
