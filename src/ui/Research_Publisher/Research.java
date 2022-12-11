/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Research_Publisher;

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
public class Research extends javax.swing.JFrame {

    /**
     * Creates new form Research
     */
    Connection dbConn = null;
    ResultSet dbResult = null;
    PreparedStatement sqlStatement = null;

    public Research() {
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

        title = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        experimentName = new javax.swing.JTextField();
        keywords = new javax.swing.JTextField();
        searchLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GlobalSearchTable = new javax.swing.JTable();
        upvoteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        title.setText("Global Search");

        searchLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        searchLabel.setText("Search by Experiment Name  : ");

        keywords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordsActionPerformed(evt);
            }
        });

        searchLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        searchLabel1.setText("Search by KeyWords  : ");

        searchButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        GlobalSearchTable.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        GlobalSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Experiment Name", "Keywords", "Research Description", "Lead Scientist", "Collabrators", "Upvote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(GlobalSearchTable);

        upvoteButton.setText("Upvote");
        upvoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upvoteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchLabel)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(keywords, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(experimentName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upvoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experimentName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keywords, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(upvoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {experimentName, keywords});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordsActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        DatabaseConnection db = new DatabaseConnection();
        
        if (!experimentName.getText().isEmpty() && !keywords.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "You cannot search by both inputs !", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        else if (!experimentName.getText().isEmpty()) {
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    dbConn.setAutoCommit(false);
                    sqlStatement = dbConn.prepareStatement("select * from GlobalSearch where ExperimentName= ?;");

                    sqlStatement.setString(1, experimentName.getText());

                    dbResult = sqlStatement.executeQuery();

                    //System.out.println(dbResult.next());
                    populateTable(dbResult);
                    experimentName.setText("");

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
        else{
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    dbConn.setAutoCommit(false);
                    sqlStatement = dbConn.prepareStatement("select * from GlobalSearch where Keywords= ?;");

                    sqlStatement.setString(1, keywords.getText());

                    dbResult = sqlStatement.executeQuery();

                    //System.out.println(dbResult.next());
                    populateTable(dbResult);
                    keywords.setText("");

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

    }//GEN-LAST:event_searchButtonActionPerformed

    private void upvoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upvoteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = GlobalSearchTable.getSelectedRow();

        if (GlobalSearchTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Please select only 1 row !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select 1 row !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) GlobalSearchTable.getModel();
            //Long id= Long.valueOf(TOOL_TIP_TEXT_KEY) model.getValueAt(selectedRowIndex,0);
            String id = String.valueOf(model.getValueAt(selectedRowIndex, 0));
            Long id_long = Long.valueOf(id);
            System.out.println(id);
            DatabaseConnection db = new DatabaseConnection();
            
            try {
                dbConn = db.getConnection();
                if (dbConn != null) {
                    sqlStatement = dbConn.prepareStatement("update GlobalSearch set Verify = verify+1 where GlobalSearchID = ?;");

                    
                    sqlStatement.setLong(1, id_long);

                    int result = sqlStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Your Upvote is Successfully Updated");
                    model.setRowCount(0);
                    return;

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
    }//GEN-LAST:event_upvoteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Research.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Research.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Research.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Research.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Research().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GlobalSearchTable;
    private javax.swing.JTextField experimentName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keywords;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JLabel title;
    private javax.swing.JButton upvoteButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable(ResultSet dbResult) {
        DefaultTableModel model = (DefaultTableModel) GlobalSearchTable.getModel();
        model.setRowCount(0);
        try {
            while (dbResult.next()) {
                Object[] row = new Object[7];
                row[0] = dbResult.getInt(1);
                row[1] = dbResult.getString(2);
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
}
