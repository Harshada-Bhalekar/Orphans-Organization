package com.login;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connectdb.MyConnectiondb;
import com.insertdata.AdoptionReqDTO;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserLogin() {
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
		System.out.println("Hello");
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		System.out.println(username+" "+password);
		Connection dbcon= MyConnectiondb.getConnection();
		ResultSet rs;
		ResultSet rs1;
		 HttpSession session=request.getSession(true);
        Statement stmt,stmt1;
        PrintWriter out = response.getWriter();
        String log_username= null;
        List<AdoptionReqDTO> l = new ArrayList<AdoptionReqDTO>();
        String query= "Select * from userlogin where "+"username= '"+username+"' and password= '"+password+"'";
        try {
        	stmt=dbcon.createStatement();
            rs=stmt.executeQuery(query);
            
            if(rs.next()){
            	log_username=rs.getString(1);
                   
            }
            else{
                System.out.println("Login Failed 4");
                response.setHeader("login", "failed");
                session.setAttribute("error","Invalid Username or Password");
				
                getServletContext().getRequestDispatcher("/LoginForm.jsp").forward(request,response);

            }
            
            String query1= "Select * from adoption_req";
            try 
            {
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
    				ardto_obj.setAgeGroup(rs1.getString("status"));
    				l.add(ardto_obj);
    				System.out.println(l.get(0));
    				System.out.println(l.get(1));
    				System.out.println(l.get(2));
    				System.out.println(l.get(3));
    				System.out.println(l.get(4));
    				System.out.println(l.get(5));
    				System.out.println(l.get(6));
    				System.out.println(l);
    			}
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
            dbcon.close();
            
        } catch (Exception ex) {
//            out.println("error "+ex);
            ex.printStackTrace();
            
        }
        
        session.setAttribute("Username", log_username);
        
        session.setAttribute("data", l);
		getServletContext().getRequestDispatcher("/Dashboard.jsp").forward(request, response);
	}

}
