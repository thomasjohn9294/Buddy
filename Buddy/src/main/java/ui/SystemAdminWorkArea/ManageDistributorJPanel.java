/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import models.Distributor.Distributor;
import models.AppSystem;
import models.Role.DistributorRole;
import models.Person.Person;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thomas
 */
public class ManageDistributorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDistributorJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem system;
    Person user;
    String imgPath;
    public ManageDistributorJPanel(JPanel userProcessContainer, AppSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateDistributorTable();
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
        tblDistributors = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 244, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDistributors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDistributors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 404, 91));

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        btnView.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnView.setText("View");
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        btnDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, -1));

        txtName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("UserName");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        txtUserName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 140, -1));

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 140, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Password");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Manage Distributor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String name = txtName.getText();
        String userName = txtUserName.getText();
        
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        try {
            if (name == null || name.isEmpty()) {
                throw new NullPointerException(" Name field is Empty");

            } else if (name.length() < 5 || Pattern.matches("^[A-Za-z]+$", name) == false) {
                throw new Exception("Please enter valid  Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if (userName == null || userName.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (userName.length() < 5) {
                throw new Exception("Please enter valid User Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if (password == null || password.isEmpty()) {
                throw new NullPointerException("Password field is Empty");
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
                throw new Exception("Invalid Password");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName) == false) {
            JOptionPane.showMessageDialog(null, "  User Name already exists ");
        } else {

            Person ua1 = system.getUserAccountDirectory().createUserAccount(name, userName, password, null, new DistributorRole());
            Distributor distributor = system.getDistributorDirectory().createDistributor(userName);
            

            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");

            populateDistributorTable();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectRow = tblDistributors.getSelectedRow();
        txtUserName.setEditable(false);

        if (selectRow >= 0) {
            String username = (String) tblDistributors.getValueAt(selectRow, 1);
            String pwd = (String) tblDistributors.getValueAt(selectRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);
            
            for (Distributor distributor : system.getDistributorDirectory().getDistributorDirectory()) {
                if (username.equals(distributor.getUserName())) {
                    JOptionPane.showMessageDialog(null, distributor.getName());
                    txtName.setText(distributor.getName());
                    txtUserName.setText(distributor.getUserName());
                    txtPassword.setText(distributor.getPassword());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblDistributors.getSelectedRow();

        if (selectRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        String name = txtName.getText();
        String uname = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());

        try {
            if (name == null || name.isEmpty()) {
                throw new NullPointerException(" Name field is Empty");

            } else if (name.length() < 5 || Pattern.matches("^[A-Za-z]+$", name) == false) {
                throw new Exception("Please enter valid  Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if (uname == null || uname.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (uname.length() < 5) {
                throw new Exception("Please enter valid User Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if (password == null || password.isEmpty()) {
                throw new NullPointerException("Pwd field is Empty");
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
                throw new Exception("Invalid Password");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        system.getUserAccountDirectory().updateUserAccount(user, name, uname, password);
        populateDistributorTable();
        txtName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDistributors.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblDistributors.getValueAt(selectedRow, 1);
                String pwd = (String) tblDistributors.getValueAt(selectedRow, 2);
                Person user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getContributorDirectory().deleteContributor(user.getUsername());

                populateDistributorTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDistributors;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateDistributorTable() {
    DefaultTableModel model = (DefaultTableModel) tblDistributors.getModel();

        model.setRowCount(0);

        // Updating the contributorTable
        for (Person user : system.getUserAccountDirectory().getUserAccountList()) {

            if ("models.Role.DistributorRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];

                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();

                model.addRow(row);
            }

        } 
    }
}
