/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import userInterface.MainJFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanirahatwad
 */
public class HospitalHome extends javax.swing.JFrame {

    DefaultTableModel tblModel;
    private DefaultTableModel tblmodel;
    /**
     * Creates new form HospitalHomeJPanel
     */
    public HospitalHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ziptxt = new javax.swing.JTextField();
        hospitalNmTxt = new javax.swing.JTextField();
        DocNmTxt = new javax.swing.JTextField();
        Avltxt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogout.setBackground(new java.awt.Color(255, 255, 204));
        btnlogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"02130", "JO CLINIC", "Dr John", "AVLBL"},
                {"02134", "MM HOSPITAL", "Dr Jason", "AVBL"},
                {"02150", "BOSTON CHILDREN", "Dr Mike", "AVLBL"},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ZIPCODE", "HOSPITAL NAME", "DOCTOR NAME", "AVAILABILITY"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 49, 621, 248));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Search by NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 317, 136, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 315, 124, -1));

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setText("VIEW/UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 377, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 377, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("HOSPITAL HOMEPAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 502, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("CREATE A NEW HOSPITAL ENTRY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 380, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("ZIPOCODE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 515, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("HOSPITAL NAME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 574, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("DOCTOR NAME:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 626, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("AVAILABILITY:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 678, -1, -1));

        ziptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ziptxtActionPerformed(evt);
            }
        });
        getContentPane().add(ziptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 512, 169, -1));

        hospitalNmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNmTxtActionPerformed(evt);
            }
        });
        getContentPane().add(hospitalNmTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 571, 169, -1));
        getContentPane().add(DocNmTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 623, 169, -1));

        Avltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvltxtActionPerformed(evt);
            }
        });
        getContentPane().add(Avltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 675, 169, -1));

        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAdd.setText("ADD ENTRY");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 738, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/wp2610913.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
          
          
            if(jTable1.getSelectedRowCount() == 1) {
                
                
                 String Zipcode = ziptxt.getText();
                 String HospitalName = hospitalNmTxt.getText();
                 String DoctorName = DocNmTxt.getText();
                 String Availability = Avltxt.getText();
                 
             tblModel.setValueAt(Zipcode,jTable1.getSelectedRow(), 0);
                 
          tblModel.setValueAt(HospitalName,jTable1.getSelectedRow(),1);
          tblModel.setValueAt(DoctorName,jTable1.getSelectedRow(),2);
          tblModel.setValueAt(Availability,jTable1.getSelectedRow(),3);
          
           JOptionPane.showMessageDialog(this, "update successful");
            }  else{
          if(jTable1.getRowCount() == 0){
              
              JOptionPane.showMessageDialog(this, "table is empty");
          }
      }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
          MainJFrame MainFram = new MainJFrame();
         MainFram.show();
         dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void ziptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ziptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ziptxtActionPerformed

    private void hospitalNmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalNmTxtActionPerformed

    private void AvltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvltxtActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(ziptxt.getText().equals("") || hospitalNmTxt.getText().equals("") || DocNmTxt.getText().equals("") || Avltxt.getText().equals("")){
           JOptionPane .showMessageDialog(this, "Please Enter all data")  ; 
        } else{
            String data[] = {ziptxt.getText(),hospitalNmTxt.getText(),DocNmTxt.getText(),Avltxt.getText()};
        
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane .showMessageDialog(this, "Data Added successfully")  ; 
            ziptxt.setText("");
            hospitalNmTxt.setText("");
            DocNmTxt.setText("");
            Avltxt.setText("");
            
            
            
            
        
        
        }
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed
    
    
    
    
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
          
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        
        if(jTable1.getSelectedRowCount () == 1){
            
            tblModel.removeRow(jTable1.getSelectedRow());
            
        } else{
            if(jTable1.getRowCount () == 0){
                
                JOptionPane .showMessageDialog(this, "TABLE IS EMPTY")  ;
            }
            else{
            JOptionPane .showMessageDialog(this, "Please select any single row you want to delete")  ;
            }
        
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    String Zipcode  = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
    String HospitalName = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
    String DoctorName = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
      String Availability = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        
     
               ziptxt.setText(Zipcode);
      hospitalNmTxt.setText(HospitalName);
     DocNmTxt.setText(DoctorName);
     Avltxt.setText(Availability);
     
    
      
      
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalHome().setVisible(true);
            }
        });
    }
    
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Avltxt;
    private javax.swing.JTextField DocNmTxt;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnlogout;
    private javax.swing.JTextField hospitalNmTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField ziptxt;
    // End of variables declaration//GEN-END:variables
}
