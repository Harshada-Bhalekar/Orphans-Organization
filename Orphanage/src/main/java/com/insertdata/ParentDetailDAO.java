package com.insertdata;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.connectdb.MyConnectiondb;
public class ParentDetailDAO 
{
	public boolean insertRecord(ParentDetailsGetSet pdgs) throws SQLException
	{
		int form_no;
    	String insertQuery="insert into parent_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection dbcon= MyConnectiondb.getConnection();
		if(dbcon!=null)
		{
			try
			{
				Statement stmt = dbcon.createStatement();
				//Query to get the number of rows in a table
				String query = "select count(*) from parent_details";
				//Executing the query
				ResultSet rs = stmt.executeQuery(query);
				//Retrieving the result
				rs.next();
				form_no = rs.getInt(1);
				form_no += 1;
				System.out.println("Execute0");
				PreparedStatement ppStmt = dbcon.prepareStatement(insertQuery);
				ppStmt.setInt(1, form_no);
				ppStmt.setString(2, pdgs.getMotherName());
				ppStmt.setString(3, pdgs.getFatherName());
				ppStmt.setLong(4, pdgs.getMotherMobileNumber());
				ppStmt.setLong(5, pdgs.getFatherMobileNumber());
				ppStmt.setString(6, pdgs.getParentAddress());
				ppStmt.setString(7, pdgs.getParentMotherEmailId());
				ppStmt.setString(8, pdgs.getParentFatherEmailId());
				String pmbd = pdgs.getParentMotherBirthDate();
				DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
				java.util.Date bbDate = df.parse(pmbd);
				java.sql.Date bDate = new java.sql.Date(bbDate.getTime());
			    
				ppStmt.setDate(9,bDate );
				
				String pfbd = pdgs.getParentFatherBirthDate();
				DateFormat df1 = new SimpleDateFormat("yyyy-mm-dd");
				java.util.Date bbDate1 = df1.parse(pfbd);
				java.sql.Date bDate1 = new java.sql.Date(bbDate1.getTime());
			    
				ppStmt.setDate(10,bDate1 );
				
				ppStmt.setInt(11, pdgs.getParentMotherAge());
				ppStmt.setInt(12, pdgs.getParentFatherAge());
				ppStmt.setBlob(13, pdgs.getParentMotherPassportSizePhoto());
				ppStmt.setBlob(14, pdgs.getParentFatherPassportSizePhoto());
				ppStmt.setBlob(15, pdgs.getParentMotherAadharphoto());
				ppStmt.setBlob(16, pdgs.getParentFatherAadharphoto());
				ppStmt.setBlob(17, pdgs.getParentMotherIncomeCertificate());
				ppStmt.setBlob(18, pdgs.getParentFatherIncomeCertificate());
				ppStmt.executeUpdate();
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

