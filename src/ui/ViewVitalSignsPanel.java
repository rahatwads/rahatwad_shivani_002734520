/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author shivanirahatwad
 */
public class ViewVitalSignsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSignsPanel
     */
    SystemAdmin sysAdmin;
    Doctor d;
    public ViewVitalSignsPanel(SystemAdmin sysAdmin,Doctor d) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.d = d;
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
        tblVitalSigns = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTemperature = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        btnSaveVitalSign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("View Vital Signs");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 61, -1, -1));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Blood Pressure", "Temperature", "Pulse Rate", "Respiration Rate"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 104, 795, 146));

        jButton1.setText("View Vitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jButton2.setText("Update Vitals");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 446, 150, -1));

        jLabel5.setText("Pulse rate");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 505, 97, -1));
        add(txtPulseRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 499, 150, -1));

        jLabel6.setText("Respiration Rate");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 560, -1, -1));
        add(txtRespirationRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 554, 150, -1));

        btnSaveVitalSign.setText("Save");
        btnSaveVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVitalSignActionPerformed(evt);
            }
        });
        add(btnSaveVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 647, -1, -1));

        jLabel2.setText("Patient");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 334, -1, -1));

        add(jComboBoxPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 331, 150, -1));

        jLabel3.setText("Blood Pressure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 398, -1, -1));
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 392, 150, -1));

        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 452, 89, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/wp2610913.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -2, 1390, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVitalSignActionPerformed
        // TODO add your handling code here:
        
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();
        try{
            Double bp = Double.parseDouble(txtBloodPressure.getText());
            Double temp = Double.parseDouble(txtTemperature.getText());
            Double pr = Double.parseDouble(txtPulseRate.getText());
            Double rr = Double.parseDouble(txtRespirationRate.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Fields: All should be in double");
            return;
        }

        if(p==null){
            JOptionPane.showMessageDialog(this, "Select All Fields");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().getEncounterPatient(p);
        VitalSigns vs = new VitalSigns();
        vs.setBloodPressure(Double.parseDouble(txtBloodPressure.getText()));
        vs.setTemperatureInF(Double.parseDouble(txtTemperature.getText()));
        vs.setPulseRate(Double.parseDouble(txtPulseRate.getText()));
        vs.setRespirationRate(Double.parseDouble(txtRespirationRate.getText()));

        e.setVitalSign(vs);

        JOptionPane.showMessageDialog(this, "Vital Sign Updated");

        jComboBoxPatient.setSelectedItem(null);
        txtBloodPressure.setText("");
        txtPulseRate.setText("");
        txtRespirationRate.setText("");
        txtTemperature.setText("");
        populateTable();

    }//GEN-LAST:event_btnSaveVitalSignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedrowIndex = tblVitalSigns.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
        }
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        Encounter en = (Encounter) model.getValueAt(selectedrowIndex, 1);
        jComboBoxPatient.setSelectedItem(en.getPatient());
        jComboBoxPatient.setEditable(false);
        VitalSigns vs = en.getVitalSign();
        txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
        txtBloodPressure.setEditable(false);
        txtTemperature.setText(String.valueOf(vs.getTemperatureInF()));
        txtTemperature.setEditable(false);
        txtPulseRate.setText(String.valueOf(vs.getPulseRate()));
        txtPulseRate.setEditable(false);
        txtRespirationRate.setText(String.valueOf(vs.getRespirationRate()));
        txtRespirationRate.setEditable(false);
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblVitalSigns.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
        }
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        Encounter en = (Encounter) model.getValueAt(selectedrowIndex, 1);
        jComboBoxPatient.setSelectedItem(en.getPatient());
        jComboBoxPatient.setEditable(false);
        VitalSigns vs = en.getVitalSign();
        txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
        txtBloodPressure.setEditable(true);
        txtTemperature.setText(String.valueOf(vs.getTemperatureInF()));
        txtTemperature.setEditable(true);
        txtPulseRate.setText(String.valueOf(vs.getPulseRate()));
        txtPulseRate.setEditable(true);
        txtRespirationRate.setText(String.valueOf(vs.getRespirationRate()));
        txtRespirationRate.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveVitalSign;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jComboBoxPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       
        
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        model.setRowCount(0);
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        List<Encounter> el = eh.getEncounterHistory();
        for(Encounter e : el){
            if(e.getDoctor().getDoctorId().equals(d.getDoctorId())){
                VitalSigns vs = e.getVitalSign();
                Object[] row = new Object[5];
                row[0] = e.getPatient();
                row[1] = vs;
                row[2] = vs.getTemperatureInF();
                row[3] = vs.getPulseRate();
                row[4] = vs.getRespirationRate();
                model.addRow(row);
            }
            
        }
        
    }
}
