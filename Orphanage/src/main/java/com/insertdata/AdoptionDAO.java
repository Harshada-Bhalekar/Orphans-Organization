package com.insertdata;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.connectdb.MyConnectiondb;

public class AdoptionDAO {
	public boolean insertRecord(AdoptionReqGetSet args) throws SQLException
	{
		int form_no;
    	String insertQuery="insert into adoption_req values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection dbcon= MyConnectiondb.getConnection();
		if(dbcon!=null)
		{
			try
			{
				Statement stmt = dbcon.createStatement();
				//Query to get the number of rows in a table
				String query = "select count(*) from adoption_req";
				//Executing the query
				ResultSet rs = stmt.executeQuery(query);
				//Retrieving the result
				rs.next();
				form_no = rs.getInt(1);
				form_no += 1;
				System.out.println("Execute0");
				PreparedStatement ppStmt = dbcon.prepareStatement(insertQuery);
				ppStmt.setInt(1, form_no);
				ppStmt.setString(2, args.getMotherName());
				ppStmt.setString(3, args.getFatherName());
				ppStmt.setLong(4, args.getMotherMobileNumber());
				ppStmt.setLong(5, args.getFatherMobileNumber());
				ppStmt.setString(6, args.getParentAddress());
				ppStmt.setString(7, args.getParentMotherEmailId());
				ppStmt.setString(8, args.getParentFatherEmailId());
				
				
				String pmbd = args.getParentMotherBirthDate();
				DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
				java.util.Date bbDate = df.parse(pmbd);
				java.sql.Date bDate = new java.sql.Date(bbDate.getTime());
			    
				ppStmt.setDate(9,bDate );
				
				String pfbd = args.getParentFatherBirthDate();
				DateFormat df1 = new SimpleDateFormat("yyyy-mm-dd");
				java.util.Date bbDate1 = df1.parse(pfbd);
				java.sql.Date bDate1 = new java.sql.Date(bbDate1.getTime());
			    
				ppStmt.setDate(10,bDate1 );
				
				ppStmt.setInt(11, args.getParentMotherAge());
				ppStmt.setInt(12, args.getParentFatherAge());
				
				ppStmt.setString(13, args.getBabygender());
				ppStmt.setString(14, args.getAgeGroup());
				ppStmt.setString(15, args.getOrphanageName());
				ppStmt.setString(16, args.getOrphanageAddress());
				ppStmt.setString(17, args.getVlounteerName());
				ppStmt.setBlob(18, args.getParentMotherPassportSizePhoto());
				ppStmt.setBlob(19, args.getParentFatherPassportSizePhoto());
				ppStmt.setBlob(20, args.getParentMotherAadharphoto());
				ppStmt.setBlob(21, args.getParentFatherAadharphoto());
				ppStmt.setBlob(22, args.getParentMotherMedicalCertificate());
				ppStmt.setBlob(23, args.getParentFatherMedicalCertificate());
				ppStmt.setString(24,"Under Process");
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