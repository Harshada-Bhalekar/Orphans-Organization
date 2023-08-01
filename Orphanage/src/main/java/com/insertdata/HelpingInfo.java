package com.insertdata;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connectdb.FileConvert;

/**
 * Servlet implementation class HelpingInfo
 */
@WebServlet("/HelpingInfo")
@MultipartConfig(maxFileSize = 16177215)
public class HelpingInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelpingInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelpingInfoGetSet higs_obj= new HelpingInfoGetSet();
		higs_obj.setPersonName(request.getParameter("PersonName"));
		higs_obj.setPersonPhoneNumber(Long.parseLong(request.getParameter("PersonPhoneNumber")));
		higs_obj.setGender(request.getParameter("gender"));
		System.out.println("Hello1");
		
		higs_obj.setPersonAddress(request.getParameter("PersonAddress"));
		System.out.println("Hello3");
		
		higs_obj.setChildLocation(request.getParameter("ChildLocation"));
		System.out.println("Hello5");
		Part filePartAadhar= request.getPart("PersonAadharphoto");
		Part filePartFIR= request.getPart("Policecomplaint");
		
		System.out.println("hello");
        InputStream inputStreamAadhar = FileConvert.fileObj(filePartAadhar);
        InputStream inputStreamFIR = FileConvert.fileObj(filePartFIR);
        
        higs_obj.setPersonAadharphoto(inputStreamAadhar);
        higs_obj.setPolicecomplaint(inputStreamFIR);
		System.out.println("Hello");
		HelpingInfoDAO hDAOObj= new HelpingInfoDAO();
        try {
			if(hDAOObj.insertRecord(higs_obj))
			{
				
				System.out.println("Data Inserted Successfully");
				response.sendRedirect("Dashboard.jsp");
			}
			else
			{
				System.out.println("Data not Inserted Successfully");
				response.sendRedirect("HelpingHand.html");
			}
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
