package com.login.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.DatabaseServiceImpl;
import com.login.model.DatabaseSevice;
@WebServlet("/createRegistrationController")
public class createReagistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public createReagistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/createRegistration.jsp");
         rd.forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		
		  DatabaseSevice service = new DatabaseServiceImpl();
		   service.connectDB();
		   service.createregistration(name,city,email,mobile,password);
		   
		 //  request.setAttribute("msg", "Connect to database Successfully");
		   
		   RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/student/studentDashbord.jsp");
	       rd.forward(request, response);
	}

}
