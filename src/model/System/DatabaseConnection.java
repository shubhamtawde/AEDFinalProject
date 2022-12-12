/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author shubham
 */
public class DatabaseConnection {

    /* The DB URL, Username, Password variables
     */
    static final String dbURL = "jdbc:mysql://localhost:3306/project?useSSL=false";
    static final String dbUser = "root";
    static final String dbPass = "shubham";
    static Connection dbConnection;

    public Connection getConnection() throws SQLException, ClassNotFoundException {

        //instantiate the connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            dbConnection = DriverManager.getConnection(dbURL, dbUser, dbPass);
        } catch (SQLException | ClassNotFoundException sqlExp) {
            System.out.println("Error Description: " + sqlExp.getMessage());
        }
        //return the database connection to the calling class
        return dbConnection;
    }

    public void closeConnection(Connection dbConnection) throws SQLException {
        try {
            if (dbConnection != null) {
                dbConnection.close();
            }
        } catch (SQLException sqlExp) {
            System.out.println("Error Description: " + sqlExp.getMessage());
        }
    }

}
