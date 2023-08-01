package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connectdb.MyConnectiondb;
import com.insertdata.AdoptionReqDTO;

/**
 * Servlet implementation class Dashurl
 */
@WebServlet("/Dashurl")
public class Dashurl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashurl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqName =request.getParameter("button");
		if (reqName.equals("Dashboard"))
        {HttpSession session=request.getSession(true);
        List<AdoptionReqDTO> l = new ArrayList<AdoptionReqDTO>();
			try 
            {	
				Connection dbcon= MyConnectiondb.getConnection();
				ResultSet rs;
				ResultSet rs1;
				 
		        Statement stmt1;
		        String query1= "Select * from adoption_req";
		        
    			stmt1=dbcon.createStatement();
    			rs1=stmt1.executeQuery(query1);
    			while(rs1.next())
    			{
    				AdoptionReqDTO ardto_obj= new AdoptionReqDTO();
    				ardto_obj.setFormno(rs1.getInt("adoption_req_no"));
    				ardto_obj.setMotherName(rs1.getString("MotherName"));
    				ardto_obj.setFatherName(rs1.getString("FatherName"));
    				ardto_obj.setMotherMobileNumber(rs1.getLong("MotherMobileNumber"));
    				ardto_obj.setFatherMobileNumber(rs1.getLong("FatherMobileNumber"));
    				ardto_obj.setBabygender(rs1.getString("gender"));
    				ardto_obj.setAgeGroup(rs1.getString("AgeGroup"));
    				l.add(ardto_obj);
    				
    			}
    			
    			
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} 
			
			session.setAttribute("data", l);
			getServletContext().getRequestDispatcher("/Dashboard.jsp").forward(request, response);
        }

        else if(reqName.equals("parentform"))
        {
        	response.sendRedirect("ParentDetails.html");
        }
        else if(reqName.equals("adoptionform"))
        {
        	response.sendRedirect("AdoptionReqForm.html");
        }else if(reqName.equals("Helpingform"))
        {
        	response.sendRedirect("DashHelpingForm.jsp");
        }
        else if(reqName.equals("About"))
        {
        	response.sendRedirect("About.html");
        }
        else if(reqName.equals("Contact"))
        {
        	response.sendRedirect("ContactForm.html");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
