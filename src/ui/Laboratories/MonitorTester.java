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
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(25, 118, 211));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
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
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(25, 118, 211));
        jScrollPane1.setViewportView(jTable1);

        viewButton.setBackground(new java.awt.Color(25, 118, 211));
        viewButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View");
        viewButton.setMaximumSize(new java.awt.Dimension(76, 26));
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(25, 118, 211));
        updateButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setMaximumSize(new java.awt.Dimension(76, 26));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(25, 118, 211));
        deleteButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setMaximumSize(new java.awt.Dimension(76, 26));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 118, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name : ");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 118, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 118, 211));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password :");

        name.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        name.setForeground(new java.awt.Color(25, 118, 211));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        username.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(25, 118, 211));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(25, 118, 211));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 118, 211));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Monitor Tester");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, updateButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {name, password, username});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField username;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
