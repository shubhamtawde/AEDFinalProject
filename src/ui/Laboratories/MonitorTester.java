/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Laboratories;

import Model.System.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidhisejpal
 */
public class MonitorTester extends javax.swing.JPanel {

    /**
     * Creates new form MonitorTestor
     */
    Connection dbConn = null;
    PreparedStatement sqlStatement = null;

    public MonitorTester() {
        initComponents();
        findTableData();
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
        jTable1 = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Organization ID", "Name", "Email", "Username", "Password", "License"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        title.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        title.setText("Monitor Tester");

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name : ");

        jLabel2.setText("Username :");

        jLabel3.setText("Password :");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(updateButton)
                                .addGap(40, 40, 40)
                                .addComponent(deleteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, updateButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {name, password, username});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteButton, updateButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {name, password, username});

    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = jTable1.getSelectedRow();

        if (jTable1.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Please select only 1 row !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select 1 row !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            ResultSet dbResult = null;
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("select * from Tester where TesterId=?;");
                    sqlStatement.setLong(1, id_long);

                    dbResult = sqlStatement.executeQuery();

                    //System.out.println(dbResult.next());
                    //populateTable(dbResult);
                    while (dbResult.next()) {

                        name.setText(dbResult.getString(3));
                        username.setText(dbResult.getString(5));
                        password.setText(dbResult.getString(6));

                    }

                } else {
                    System.out.println("connection not done");
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (sqlStatement != null) {
                    try {
                        if (!sqlStatement.isClosed()) {
                            sqlStatement.close();
                        }

                    } catch (SQLException err) {
                        err.printStackTrace();

                    }
                }
                if (dbConn != null) {
                    try {
                        if (!dbConn.isClosed()) {
                            db.closeConnection(dbConn);
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();

                    }
                }
            }
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = jTable1.getSelectedRow();

        if (jTable1.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Please select only 1 row !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select 1 row !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            ResultSet dbResult = null;
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("delete from Tester where TesterId=?;");
                    sqlStatement.setLong(1, id_long);

                    int result = sqlStatement.executeUpdate();

                    System.out.println(result);
                    findTableData();
                    //populateTable(dbResult);
                } else {
                    System.out.println("connection not done");
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (sqlStatement != null) {
                    try {
                        if (!sqlStatement.isClosed()) {
                            sqlStatement.close();
                        }

                    } catch (SQLException err) {
                        err.printStackTrace();

                    }
                }
                if (dbConn != null) {
                    try {
                        if (!dbConn.isClosed()) {
                            db.closeConnection(dbConn);
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();

                    }
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();

        if (jTable1.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please select only 1 row !");
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select 1 row ");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            ResultSet dbResult = null;
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("update Tester set TesterName=?,TesterUsername=?,TesterPassword=? where TesterId=?;");

                    sqlStatement.setString(1, name.getText());
                    sqlStatement.setString(2, username.getText());
                    sqlStatement.setString(3, password.getText());
                    sqlStatement.setLong(4, id_long);

                    int result = sqlStatement.executeUpdate();

                    //System.out.println(dbResult.next());
                    //populateTable(dbResult);
                    findTableData();
                    name.setText("");
                    username.setText("");
                    password.setText("");

                } else {
                    System.out.println("connection not done");
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (sqlStatement != null) {
                    try {
                        if (!sqlStatement.isClosed()) {
                            sqlStatement.close();
                        }

                    } catch (SQLException err) {
                        err.printStackTrace();

                    }
                }
                if (dbConn != null) {
                    try {
                        if (!dbConn.isClosed()) {
                            db.closeConnection(dbConn);
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();

                    }
                }
            }
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void findTableData() {
        DatabaseConnection db = new DatabaseConnection();
        ResultSet dbResult = null;
        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                sqlStatement = dbConn.prepareStatement("select * from Tester;");

                dbResult = sqlStatement.executeQuery();

                //System.out.println(dbResult.next());
                // System.out.println(dbResult.getLong(1));
                populateTable(dbResult);

            } else {
                System.out.println("connection not done");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (sqlStatement != null) {
                try {
                    if (!sqlStatement.isClosed()) {
                        sqlStatement.close();
                    }

                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
            if (dbConn != null) {
                try {
                    if (!dbConn.isClosed()) {
                        db.closeConnection(dbConn);
                    }
                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
        }
    }

    private void populateTable(ResultSet dbResult) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            while (dbResult.next()) {
                Object[] row = new Object[7];
                row[0] = dbResult.getLong(1);
                row[1] = dbResult.getLong(2);
                row[2] = dbResult.getString(3);
                row[3] = dbResult.getString(4);
                row[4] = dbResult.getString(5);
                row[5] = dbResult.getString(6);
                row[6] = dbResult.getString(7);
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField username;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
