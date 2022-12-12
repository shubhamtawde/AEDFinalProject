/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.System.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author siddharthvaghela
 */
public class MonitorResearcher extends javax.swing.JPanel {

    /**
     * Creates new form MonitorResearcher
     */
   
       Connection dbConn = null;
    PreparedStatement sqlStatement,sqlStatement1 = null;
     Logger logger = LogManager.getLogger(MonitorResearcher.class);
    public MonitorResearcher() {
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

        jLabel1 = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MonitorEnterpriseTable = new javax.swing.JTable();
        usernameEnterprise = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameEnterprise = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 118, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monitor Researcher");

        viewButton.setBackground(new java.awt.Color(25, 118, 211));
        viewButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(25, 118, 211));
        updateButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(25, 118, 211));
        deleteButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        MonitorEnterpriseTable.setBackground(new java.awt.Color(25, 118, 211));
        MonitorEnterpriseTable.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        MonitorEnterpriseTable.setForeground(new java.awt.Color(255, 255, 255));
        MonitorEnterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Organization ID", "Name", "Username", "Password", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MonitorEnterpriseTable);

        usernameEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameEnterpriseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 118, 211));
        jLabel2.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 118, 211));
        jLabel3.setText("Username : ");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 118, 211));
        jLabel5.setText("Password :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usernameEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(266, 266, 266))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, updateButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameEnterprise, password, usernameEnterprise});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteButton, updateButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nameEnterprise, password, usernameEnterprise});

    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = MonitorEnterpriseTable.getSelectedRow();

        if (MonitorEnterpriseTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please select only 1 row !");
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select 1 row ");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) MonitorEnterpriseTable.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            ResultSet dbResult = null;
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("select * from ResearcherList where id=?;");
                    sqlStatement.setLong(1, id_long);

                    dbResult = sqlStatement.executeQuery();

                    //System.out.println(dbResult.next());
                    //populateTable(dbResult);
                    while (dbResult.next()) {

                        nameEnterprise.setText(dbResult.getString(3));
                        usernameEnterprise.setText(dbResult.getString(4));
                        password.setText(dbResult.getString(5));
                        

                    }

                } else {
                    System.out.println("connection not done");
                }
            } catch (Exception e) {
                System.out.println(e);
                logger.error(e);
            } finally {
                if (sqlStatement != null) {
                    try {
                        if (!sqlStatement.isClosed()) {
                            sqlStatement.close();
                        }

                    } catch (SQLException err) {
                        err.printStackTrace();
                        logger.error(err);

                    }
                }
                if (dbConn != null) {
                    try {
                        if (!dbConn.isClosed()) {
                            db.closeConnection(dbConn);
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();
                        logger.error(err);

                    }
                }
            }
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = MonitorEnterpriseTable.getSelectedRow();

        if (MonitorEnterpriseTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please select only 1 row !");
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select 1 row ");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) MonitorEnterpriseTable.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));  
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            ResultSet dbResult = null;
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("update ResearcherList set name=?,username=?,password=? where id=?;");

                    sqlStatement.setString(1, nameEnterprise.getText());
                    sqlStatement.setString(2, usernameEnterprise.getText());
                    sqlStatement.setString(3, password.getText());
                    sqlStatement.setLong(4, id_long);

                    int result = sqlStatement.executeUpdate();

                    //System.out.println(dbResult.next());
                    //populateTable(dbResult);

                    findTableData();
                    nameEnterprise.setText("");
                    usernameEnterprise.setText("");
                    password.setText("");
                
                } else {
                    System.out.println("connection not done");
                }
            } catch (Exception e) {
                System.out.println(e);
                logger.error(e);
            } finally {
                if (sqlStatement != null) {
                    try {
                        if (!sqlStatement.isClosed()) {
                            sqlStatement.close();
                        }

                    } catch (SQLException err) {
                        err.printStackTrace();
                        logger.error(err);

                    }
                }
                if (dbConn != null) {
                    try {
                        if (!dbConn.isClosed()) {
                            db.closeConnection(dbConn);
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();
                        logger.error(err);

                    }
                }
            }
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = MonitorEnterpriseTable.getSelectedRow();

        if (MonitorEnterpriseTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please select only 1 row !");
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select 1 row ");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) MonitorEnterpriseTable.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            ResultSet dbResult = null;
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("delete from ResearcherList where id=?;");
                    sqlStatement1 = dbConn.prepareStatement("delete from Credentials where id=?;");
                    
                    sqlStatement.setLong(1, id_long);
                    sqlStatement1.setLong(1, id_long);
                    
                    int result = sqlStatement.executeUpdate();
                    sqlStatement1.executeUpdate();
                    
                    System.out.println(result);
                    findTableData();
                    //populateTable(dbResult);
                } else {
                    System.out.println("connection not done");
                }
            } catch (Exception e) {
                System.out.println(e);
                logger.error(e);
            } finally {
                if (sqlStatement != null && sqlStatement1 != null) {
                    try {
                        if (!sqlStatement.isClosed()) {
                            sqlStatement.close();
                        }
                        if (!sqlStatement1.isClosed()) {
                            sqlStatement1.close();
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();
                        logger.error(err);

                    }
                }
                if (dbConn != null) {
                    try {
                        if (!dbConn.isClosed()) {
                            db.closeConnection(dbConn);
                        }
                    } catch (SQLException err) {
                        err.printStackTrace();
                        logger.error(err);

                    }
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void usernameEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameEnterpriseActionPerformed
        private void findTableData() {
        DatabaseConnection db = new DatabaseConnection();
        ResultSet dbResult = null;
        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                sqlStatement = dbConn.prepareStatement("select * from ResearcherList;");

                dbResult = sqlStatement.executeQuery();

                //System.out.println(dbResult.next());
                populateTable(dbResult);

            } else {
                System.out.println("connection not done");
            }
        } catch (Exception e) {
            System.out.println(e);
            logger.error(e);
        } finally {
            if (sqlStatement != null) {
                try {
                    if (!sqlStatement.isClosed()) {
                        sqlStatement.close();
                    }

                } catch (SQLException err) {
                    err.printStackTrace();
                    logger.error(err);

                }
            }
            if (dbConn != null) {
                try {
                    if (!dbConn.isClosed()) {
                        db.closeConnection(dbConn);
                    }
                } catch (SQLException err) {
                    err.printStackTrace();
                    logger.error(err);

                }
            }
        }
    }

        
     private void populateTable(ResultSet dbResult) {
        DefaultTableModel model = (DefaultTableModel) MonitorEnterpriseTable.getModel();
        model.setRowCount(0);
        try {
            while (dbResult.next()) {
                Object[] row = new Object[6];
                row[0] = dbResult.getInt(1);
                row[1] = dbResult.getString(2);
                row[2] = dbResult.getString(3);
                row[3] = dbResult.getString(4);
                row[4] = dbResult.getString(5);
                row[5] = dbResult.getString(6);
                
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MonitorEnterpriseTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameEnterprise;
    private javax.swing.JTextField password;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameEnterprise;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
