package com.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectiondb {
	public static Connection getConnection()
    {
	 	//Declare Connection value Objects
	 
	 	String dbDriver="com.mysql.jdbc.Driver";
     	String dbUrl="jdbc:mysql://localhost:3306/orphanagedb";
     	
     	String userName="root";
     	String pwd="root@123";
        // As java.sql package classes
        // contains Checked Exceptions,
        // we have to surround it with
        // Try/Catch Block.
        try {

        	Class.forName(dbDriver);//Load the Driver
        	
        	Connection con= DriverManager.getConnection(dbUrl,userName,pwd);//Get Connection
            return con;// return Connection Object
        }
        catch (SQLException e) {
 
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
        	System.out.println(e.getMessage());
		}
        return null;
    }
}
