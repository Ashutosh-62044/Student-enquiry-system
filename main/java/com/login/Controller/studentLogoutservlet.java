package com.login.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/studentLogoutservlet")
public class studentLogoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public studentLogoutservlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
		HttpSession session = request.getSession(false);
	     session.invalidate();
		  RequestDispatcher rd = request.getRequestDispatcher("student_login.jsp");
	      rd.forward(request, response);
	}

}
