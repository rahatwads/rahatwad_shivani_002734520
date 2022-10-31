/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Person;

import business.Person;
import business.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanirahatwad
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonJPanel
     */
    
    private PersonDirectory personDirectory;
    private JPanel userContainer;
    
    public ManagePersonJPanel(JPanel userContainer,PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.userContainer = userContainer;
        populatePersonTable(personDirectory.getPersonDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePerson = new javax.swing.JTable();
        lblMngPersonTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchPersonName = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnViewPerson = new javax.swing.JButton();
        btnUpdatePerson = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        btnAddPerson1 = new javax.swing.JButton();
        updatePersonData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Gender", "House Address", "Community", "City", "Zip Code", "Person Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, 775, 178));

        lblMngPersonTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMngPersonTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMngPersonTitle.setText("Manage Person Details");
        add(lblMngPersonTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 28, 391, 37));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Search:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 86, 29));

        txtSearchPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonNameActionPerformed(evt);
            }
        });
        add(txtSearchPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 81, 240, 29));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 81, 104, 29));

        btnViewPerson.setText("View");
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });
        add(btnViewPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 328, 94, 31));

        btnUpdatePerson.setText("Update");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });
        add(btnUpdatePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 328, 94, 31));

        btnDeletePerson.setText("Delete");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });
        add(btnDeletePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 328, 94, 31));

        btnAddPerson1.setText("Add");
        btnAddPerson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPerson1ActionPerformed(evt);
            }
        });
        add(btnAddPerson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 328, 94, 31));

        updatePersonData.setText("Upload");
        updatePersonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonDataActionPerformed(evt);
            }
        });
        add(updatePersonData, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 81, 101, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Person/wp2610913.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonNameActionPerformed
        // TODO add your handling code here:
        
        String key= txtSearchPersonName.getText();
        if(key.length()==0)
        {
        JOptionPane.showMessageDialog(this, "Please enter key.",
        "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        ArrayList<Person> searchPersons;
        searchPersons=personDirectory.searchPerson(key);
        populatePersonTable(searchPersons);
    }//GEN-LAST:event_txtSearchPersonNameActionPerformed

    private void btnAddPerson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPerson1ActionPerformed
        // TODO add your handling code here:
        
        CreatePersonJPanel createPersonJPanel= 
                new CreatePersonJPanel(userContainer, personDirectory);
        userContainer.add("createPersonJPanel", createPersonJPanel);
        CardLayout layout=(CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_btnAddPerson1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        populatePersonTable(personDirectory.getPersonDirectory());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
        int selectedRow= jTablePerson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) jTablePerson.getValueAt(selectedRow, 0);
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            personDirectory.removePerson(person);
            populatePersonTable(personDirectory.getPersonDirectory());
        }
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow= jTablePerson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) jTablePerson.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        ViewUpdatePersonDetailsJPanel vupersondJPanel= 
                new ViewUpdatePersonDetailsJPanel(userContainer, person,Boolean.FALSE);
        userContainer.add("vupersondJPanel", vupersondJPanel);
        CardLayout layout=(CardLayout) userContainer.getLayout();
        layout.next(userContainer);
        
        JOptionPane.showMessageDialog(this, "Selected Car Details will be viewed");
        
    }//GEN-LAST:event_btnViewPersonActionPerformed

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow= jTablePerson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) jTablePerson.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        ViewUpdatePersonDetailsJPanel vupersondJPanel= 
                new ViewUpdatePersonDetailsJPanel(userContainer, person,Boolean.TRUE);
        userContainer.add("vupersondJPanel", vupersondJPanel);
        CardLayout layout=(CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void updatePersonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonDataActionPerformed
        // TODO add your handling code here:
        
        personDirectory.uploadData();
        populatePersonTable(personDirectory.getPersonDirectory());
    }//GEN-LAST:event_updatePersonDataActionPerformed
    
    
    private void populatePersonTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) jTablePerson.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Person's found. Please add"
                    + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[8];
            row[0] = person;
            row[1]= person.getAge();
            row[2]= person.getGender();
            row[3]= person.getHouseAddress();
            row[4]= person.getCommunity();
            row[5]= person.getCity();
            row[6]= person.getZipcode();
            row[7]= person.getPersonId();
           
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson1;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePerson;
    private javax.swing.JLabel lblMngPersonTitle;
    private javax.swing.JTextField txtSearchPersonName;
    private javax.swing.JButton updatePersonData;
    // End of variables declaration//GEN-END:variables
}
