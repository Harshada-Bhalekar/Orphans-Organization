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
 * Servlet implementation class AdoptionReq
 */
@WebServlet("/AdoptionReq")
@MultipartConfig(maxFileSize = 16177215)
public class AdoptionReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdoptionReq() {
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
		// TODO Auto-generated method stub
		AdoptionReqGetSet args=new AdoptionReqGetSet();
		args.setMotherName(request.getParameter("MotherName"));
		args.setFatherName(request.getParameter("FatherName"));
		args.setMotherMobileNumber(Long.parseLong(request.getParameter("MotherMobileNumber")));
		args.setFatherMobileNumber(Long.parseLong(request.getParameter("FatherMobileNumber")));
		args.setParentAddress(request.getParameter("ParentAddress"));
		args.setParentMotherEmailId(request.getParameter("ParentMotherEmailId"));
		args.setParentFatherEmailId(request.getParameter("ParentFatherEmailId"));
		args.setParentMotherBirthDate(request.getParameter("ParentMotherBirthDate"));
		args.setParentFatherBirthDate(request.getParameter("ParentFatherBirthDate"));
		args.setParentMotherAge(Integer.parseInt(request.getParameter("ParentMotherAge")));
		args.setParentFatherAge(Integer.parseInt(request.getParameter("ParentFatherAge")));
		args.setBabygender(request.getParameter("babygender"));
		args.setAgeGroup(request.getParameter("AgeGroup"));
		args.setOrphanageName(request.getParameter("OrphanageName"));
		args.setOrphanageAddress(request.getParameter("OrphanageAddress"));
		args.setVlounteerName(request.getParameter("VlounteerName"));
		Part filePartParentMotherPassportSizePhoto= request.getPart("ParentMotherPassportSizePhoto");
		Part filePartParentFatherPassportSizePhoto= request.getPart("ParentFatherPassportSizePhoto");
		Part filePartParentMotherAadharphoto= request.getPart("ParentMotherAadharphoto");
		Part filePartParentFatherAadharphoto= request.getPart("ParentFatherAadharphoto");
		Part filePartParentMotherMedicalCertificate= request.getPart("ParentMotherMedicalCertificate");
		Part filePartParentFatherMedicalCertificate= request.getPart("ParentFatherMedicalCertificate");
		
		InputStream inputStreamParentMotherPassportSizePhoto = FileConvert.fileObj(filePartParentMotherPassportSizePhoto);
		args.setParentMotherPassportSizePhoto(inputStreamParentMotherPassportSizePhoto);
		
		InputStream inputStreamParentFatherPassportSizePhoto = FileConvert.fileObj(filePartParentFatherPassportSizePhoto);
		args.setParentFatherPassportSizePhoto(inputStreamParentFatherPassportSizePhoto);
		
		InputStream inputStreamParentMotherAadharphoto = FileConvert.fileObj(filePartParentMotherAadharphoto);
		args.setParentMotherAadharphoto(inputStreamParentMotherAadharphoto);
		
		InputStream inputStreamParentFatherAadharphoto = FileConvert.fileObj(filePartParentFatherAadharphoto);
		args.setParentFatherAadharphoto(inputStreamParentFatherAadharphoto);
		
		InputStream inputStreamParentMotherMedicalCertificate = FileConvert.fileObj(filePartParentMotherMedicalCertificate);
		args.setParentMotherMedicalCertificate(inputStreamParentMotherMedicalCertificate);
		
		InputStream inputStreamParentFatherMedicalCertificate = FileConvert.fileObj(filePartParentFatherMedicalCertificate);
		args.setParentFatherMedicalCertificate(inputStreamParentFatherMedicalCertificate);
		
		AdoptionDAO add=new AdoptionDAO();
		 try {
				if(add.insertRecord(args))
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
