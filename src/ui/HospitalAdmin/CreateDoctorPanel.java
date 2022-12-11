/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdmin;

import ui.Admin.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Credentials.Credentials;
import model.Doctor.Doctor;
import model.Hospital.Hospital;
import model.System.DatabaseConnection;

/**
 *
 * @author shubham
 */
public class CreateDoctorPanel extends javax.swing.JPanel {

    DatabaseConnection db = new DatabaseConnection();
    Long docID;

    /**
     * Creates new form ManageDoctorsPanel
     */
    public CreateDoctorPanel() {
        initComponents();
        docID =  (long) (Math.random() * (9999 - 1) + 1);
        docId.setText(String.valueOf(docID));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        docId = new javax.swing.JTextField();
        docName = new javax.swing.JTextField();
        createDocBtn = new javax.swing.JButton();
        docUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        docPwd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hospName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor ID");

        docId.setEditable(false);

        createDocBtn.setText("Create Doctor");
        createDocBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Doctor Panel");

        jLabel4.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor Name");

        jLabel7.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");

        jLabel5.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Name");

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doctor Credentials");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 268, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(createDocBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(docUserName)
                                    .addComponent(docPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(hospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(docUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(docPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(createDocBtn)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void createDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocBtnActionPerformed
        // TODO add your handling code here:
        if(docName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter valid input!");
            return;
        }
        
        if (Pattern.matches("^[0-9]*$", docName.getText())) {
            JOptionPane.showMessageDialog(this, "Name cannot contain numbers!");
            return;
        }
        
        if(hospName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter valid input!");
            return;
        }
        
        if (Pattern.matches("^[0-9]*$", hospName.getText())) {
            JOptionPane.showMessageDialog(this, "Name cannot contain numbers!");
            return;
        }
        
        if(docUserName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter hospital admin username!");
            return;
        }
        
        if(String.valueOf(docPwd.getPassword()).trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter hospital admin passwords!");
            return;
        }
        
        int pwdLen = docPwd.getPassword().length;
        if(pwdLen < 6) {
            JOptionPane.showMessageDialog(this, "Password should be minimum 6 characters!");
            return;
        }
        
        Connection dbConn = null;
        PreparedStatement docStatement = null;
        PreparedStatement userStatement = null;

        Long userId = (long) (Math.random() * (9999 - 1) + 1);
        String docQuery = "INSERT INTO project.doctors VALUES  (?, ?, ?);";
        String userQuery = "INSERT INTO project.credentials VALUES (?, ?, ?, ?);";
        
        Doctor doc = new Doctor();
        doc.setDoctorId(userId);
        doc.setDoctorName(docName.getText());
        doc.setHospitalName(hospName.getText());
        
        Credentials creds = new Credentials();
        creds.setUserId(userId);
        creds.setUsername(docUserName.getText());
        creds.setPassword(String.valueOf(docPwd.getPassword()));
        creds.setRole("Doctor");

        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                dbConn.setAutoCommit(false);
                docStatement = dbConn.prepareStatement(docQuery);
                userStatement = dbConn.prepareStatement(userQuery);
                docStatement.setLong(1, doc.getDoctorId());
                docStatement.setString(2, doc.getDoctorName());
                docStatement.setString(3, doc.getHospitalName());

                userStatement.setLong(1, creds.getUserId());
                userStatement.setString(2, creds.getUsername());
                userStatement.setString(3, creds.getPassword());
                userStatement.setString(4, creds.getRole());
                if ((docStatement.executeUpdate() > 0) && userStatement.executeUpdate() > 0) {
                    System.out.println("Created Doctor Successfully!");
                    dbConn.commit();
                } else {
                    System.out.println("Failed to create doctor");
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
            if (docStatement != null) {
                try {
                    if (!docStatement.isClosed()) {
                        docStatement.close();
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
    }//GEN-LAST:event_createDocBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createDocBtn;
    private javax.swing.JTextField docId;
    private javax.swing.JTextField docName;
    private javax.swing.JPasswordField docPwd;
    private javax.swing.JTextField docUserName;
    private javax.swing.JTextField hospName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
