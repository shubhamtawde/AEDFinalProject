/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author siddharthvaghela
 */
public class DatabaseConnection {
    	static final String dbURL = "jdbc:mysql://localhost:3306/testproject";
	static final String dbUser = "root";
	static final String dbPass = "Glitchpop@115";
        Connection dbConnection;
        public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			dbConnection = DriverManager.getConnection(dbURL, dbUser, dbPass);
		}
		catch (SQLException sqlExp) 
		{
			System.out.println("Error Description: " + sqlExp.getMessage());
			sqlExp.printStackTrace();
			
		}
		catch (ClassNotFoundException exp) 
		{
			System.out.println("Error Description: " + exp.getMessage());
			exp.printStackTrace();
			
		}
		//return the database connection to the calling class
		return dbConnection;
                
                
	}
        
        public void closeConnection(Connection dbConnection) throws SQLException 
	{
		try 
		{
			if(dbConnection != null)
			{
				dbConnection.close();
			}
		} 
		catch (SQLException sqlExp)
		{
			System.out.println("Error Description: " + sqlExp.getMessage());
			sqlExp.printStackTrace();
		}
	}
}
