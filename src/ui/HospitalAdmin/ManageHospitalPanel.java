/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.System.DatabaseConnection;

/**
 *
 * @author shubham
 */
public class ManageHospitalPanel extends javax.swing.JPanel {

    DatabaseConnection db = new DatabaseConnection();

    /**
     * Creates new form ManageHospitalPanel
     */
    public ManageHospitalPanel() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hospId = new javax.swing.JTextField();
        hospName = new javax.swing.JTextField();
        hospCity = new javax.swing.JTextField();
        createHospitalBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        hospAdminUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hospAdminPassword = new javax.swing.JPasswordField();

        jLabel1.setText("Manage Hospital Panel");

        jLabel2.setText("Hospital ID");

        jLabel3.setText("Hospital Name");

        jLabel4.setText("Hospital City");

        createHospitalBtn.setText("Create Hospital");
        createHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHospitalBtnActionPerformed(evt);
            }
        });

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name", "Hospital City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitalTable);

        jLabel5.setText("Password");

        jLabel6.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hospCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hospId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hospName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hospAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(hospAdminPassword))
                                    .addGap(104, 104, 104)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(createHospitalBtn)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(hospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3))
                            .addComponent(hospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(hospAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hospAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hospCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(createHospitalBtn)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHospitalBtnActionPerformed
        // TODO add your handling code here:
        Connection dbConn = null;
        PreparedStatement sqlStatement = null;
        PreparedStatement userStatement = null;
        Long hospitalId = (long) (Math.random() * (9999 - 1) + 1);
        Long userId = (long) (Math.random() * (9999 - 1) + 1);
        String sqlQuery = "INSERT INTO project.hospital VALUES  (?, ?, ?);";
        String userQuery = "INSERT INTO project.credentials VALUES (?, ?, ?, ?);";
        
        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                dbConn.setAutoCommit(false);
                sqlStatement = dbConn.prepareStatement(sqlQuery);
                userStatement = dbConn.prepareStatement(userQuery);
                sqlStatement.setLong(1, hospitalId);
                sqlStatement.setString(2, hospName.getText());
                sqlStatement.setString(3, hospCity.getText());
                
                userStatement.setLong(1, userId);
                userStatement.setString(2, hospAdminUsername.getText());
                userStatement.setString(3, String.valueOf(hospAdminPassword.getPassword()));
                userStatement.setString(4, "Hospital Admin");
                if ((sqlStatement.executeUpdate() > 0) && userStatement.executeUpdate() > 0) {
                    System.out.println("Created Hospital Successfully!");
                    System.out.println("Created Hospital Admin successfully!");
                    dbConn.commit();
                } else {
                    System.out.println("Failed to create hospital");
                    dbConn.rollback();
                }
            } else {
                System.out.println("DB connection not connected");
            }
        } catch (SQLException sqlExp) {
            //rollback the connection
            sqlExp.printStackTrace();
        } catch (Exception exp) {
            exp.printStackTrace();

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

    }//GEN-LAST:event_createHospitalBtnActionPerformed

    private void populateTable() {
        Connection dbConn = null;
        ResultSet dbResult = null;
        PreparedStatement sqlStatement = null;
        Long hospitalId = (long) (Math.random() * (9999 - 1) + 1);
        String sqlQuery = "SELECT * FROM project.hospital;";
        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                sqlStatement = dbConn.prepareStatement(sqlQuery);
                dbResult = sqlStatement.executeQuery();
                System.out.println(dbResult);
                if (dbResult == null) {
                    System.out.println("Result set is null!");
                } else {
                    fillTable(dbResult);
                }
            } else {
                System.out.println("DB connection not connected");
            }
        } catch (SQLException sqlExp) {
            //rollback the connection
            sqlExp.printStackTrace();
        } catch (Exception exp) {
            exp.printStackTrace();

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
    
    private void fillTable(ResultSet dbResult) throws SQLException {
        DefaultTableModel tableModel = (DefaultTableModel) hospitalTable.getModel();

        tableModel.setRowCount(0);

        while(dbResult.next()) {
            Object[] tblRow = new Object[3];
            tblRow[0] = dbResult.getLong(1);
            tblRow[1] = dbResult.getString(2);
            tblRow[2] = dbResult.getString(3);
            tableModel.addRow(tblRow);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createHospitalBtn;
    private javax.swing.JPasswordField hospAdminPassword;
    private javax.swing.JTextField hospAdminUsername;
    private javax.swing.JTextField hospCity;
    private javax.swing.JTextField hospId;
    private javax.swing.JTextField hospName;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
