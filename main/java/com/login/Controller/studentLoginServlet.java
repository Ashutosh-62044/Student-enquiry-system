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
@WebServlet("/studentverify")
public class studentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studentLoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		DatabaseSevice service = new DatabaseServiceImpl();
		
		  service.connectDB();
		  boolean status =  service.verifystudentlogin(email, password);

		if(status) {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/studentDashbord.jsp");
		rd.forward(request, response);
		}else {
			request.setAttribute("error" , "Invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("student_login.jsp");
			rd.forward(request, response);
	    }
	}
}
