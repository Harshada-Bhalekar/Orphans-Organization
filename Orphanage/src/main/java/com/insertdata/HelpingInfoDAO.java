package com.insertdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connectdb.MyConnectiondb;

public class HelpingInfoDAO {
	public boolean insertRecord(HelpingInfoGetSet higs_obj) throws SQLException
	{
		int form_no;
		String insertQuery="insert into helpinghand values(?,?,?,?,?,?,?,?)";
		Connection dbcon= MyConnectiondb.getConnection();
		if(dbcon!=null)
		{
			try
			{
				Statement stmt = dbcon.createStatement();
				//Query to get the number of rows in a table
				String query = "select count(*) from helpinghand";
				//Executing the query
				ResultSet rs = stmt.executeQuery(query);
				//Retrieving the result
				rs.next();
				form_no = rs.getInt(1);
				form_no += 1;
				System.out.println("Execute0");
				PreparedStatement ppStmt = dbcon.prepareStatement(insertQuery);
				ppStmt.setInt(1, form_no);
				ppStmt.setString(2, higs_obj.getPersonName());
				ppStmt.setLong(3, higs_obj.getPersonPhoneNumber());
				ppStmt.setString(4, higs_obj.getGender());
				ppStmt.setBlob(5, higs_obj.getPersonAadharphoto());
				ppStmt.setString(6, higs_obj.getPersonAddress());
				ppStmt.setString(7, higs_obj.getChildLocation());
				ppStmt.setBlob(8, higs_obj.getPolicecomplaint());
				System.out.println("Execute1");
				ppStmt.executeUpdate();
				System.out.println("Execute2");
				ppStmt.close();
				System.out.println("Execute3");
				dbcon.close();
				return true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				dbcon.close();
				return false;
			}
			
		}
		else 
		{
			return false;
		}
	}

}
