package com.login.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.DatabaseServiceImpl;
import com.login.model.DatabaseSevice;
@WebServlet("/UpdateUser")
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateUserController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		 
		 request.setAttribute("name", name);
		 request.setAttribute("city", city);
		 request.setAttribute("email", email);
		 request.setAttribute("mobile", mobile);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/UpdateUserData.jsp");
		 rd.forward(request, response);
		
		DatabaseSevice service = new DatabaseServiceImpl();
		   service.userUpdate(name,city,email,mobile);
		
		   
			 
			 
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
