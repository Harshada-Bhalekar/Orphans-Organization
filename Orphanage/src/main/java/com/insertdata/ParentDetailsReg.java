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
 * Servlet implementation class ParentDetailsReg
 */
@WebServlet("/ParentDetailsReg")
@MultipartConfig(maxFileSize = 16177215)
public class ParentDetailsReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParentDetailsReg() {
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
		ParentDetailsGetSet pdgs=new ParentDetailsGetSet();
		pdgs.setMotherName(request.getParameter("MotherName"));
		pdgs.setFatherName(request.getParameter("FatherName"));
		pdgs.setMotherMobileNumber(Long.parseLong(request.getParameter("MotherMobileNumber")));
		pdgs.setFatherMobileNumber(Long.parseLong(request.getParameter("FatherMobileNumber")));
		pdgs.setParentAddress(request.getParameter("ParentAddress"));
		pdgs.setParentMotherEmailId(request.getParameter("ParentMotherEmailId"));
		pdgs.setParentFatherEmailId(request.getParameter("ParentFatherEmailId"));
		pdgs.setParentMotherBirthDate(request.getParameter("ParentMotherBirthDate"));
		pdgs.setParentFatherBirthDate(request.getParameter("ParentFatherBirthDate"));
		pdgs.setParentMotherAge(Integer.parseInt(request.getParameter("ParentMotherAge")));
		pdgs.setParentFatherAge(Integer.parseInt(request.getParameter("ParentFatherAge")));
		Part filePartParentMotherPassportSizePhoto= request.getPart("ParentMotherPassportSizePhoto");
		Part filePartParentFatherPassportSizePhoto= request.getPart("ParentFatherPassportSizePhoto");
		Part filePartParentMotherAadharphoto= request.getPart("ParentMotherAadharphoto");
		Part filePartParentFatherAadharphoto= request.getPart("ParentFatherAadharphoto");
		Part filePartParentMotherIncomeCertificate= request.getPart("ParentMotherIncomeCertificate");
		Part filePartParentFatherIncomeCertificate= request.getPart("ParentFatherIncomeCertificate");
		
		InputStream inputStreamParentMotherPassportSizePhoto = FileConvert.fileObj(filePartParentMotherPassportSizePhoto);
		pdgs.setParentMotherPassportSizePhoto(inputStreamParentMotherPassportSizePhoto);
        InputStream inputStreamParentFatherPassportSizePhoto = FileConvert.fileObj(filePartParentFatherPassportSizePhoto);
        pdgs.setParentFatherPassportSizePhoto(inputStreamParentFatherPassportSizePhoto);
        
        InputStream inputStreamParentMotherAadharphoto = FileConvert.fileObj(filePartParentMotherAadharphoto);
        pdgs.setParentMotherAadharphoto(inputStreamParentMotherAadharphoto);
        
        InputStream inputStreamParentFatherAadharphoto = FileConvert.fileObj(filePartParentFatherAadharphoto);
        pdgs.setParentFatherAadharphoto(inputStreamParentFatherAadharphoto);
        
        InputStream inputStreamParentMotherIncomeCertificate = FileConvert.fileObj(filePartParentMotherIncomeCertificate);
        pdgs.setParentMotherIncomeCertificate(inputStreamParentMotherIncomeCertificate);
        
        InputStream inputStreamParentFatherIncomeCertificate = FileConvert.fileObj(filePartParentFatherIncomeCertificate);
        pdgs.setParentFatherIncomeCertificate( inputStreamParentFatherIncomeCertificate);
        
        ParentDetailDAO pdd= new ParentDetailDAO();
        try {
			if(pdd.insertRecord(pdgs))
			{
				System.out.println("Data Inserted Successfully");
				response.sendRedirect("Home.html");
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
