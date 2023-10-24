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
@WebServlet("/studentRegistration")
public class studentRegistrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public studentRegistrationservlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		System.out.print("hello");
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		
		  DatabaseSevice service = new DatabaseServiceImpl();
		   service.connectDB();
		   service.studentRegistration(name,city,email,mobile,password);
		   
		   request.setAttribute("msg", "Connect to database Successfully");
		   
		   RequestDispatcher rd = request.getRequestDispatcher("student_login.jsp");
	        rd.forward(request, response);
	}

}
