 package com.login.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.DatabaseServiceImpl;
import com.login.model.DatabaseSevice;


@WebServlet("/deleteuser")
public class DeleteUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteUserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
	    
		String email =	request.getParameter("email");
	    System.out.println(email);
	    out.print(email);
	    
	    try {
	    	DatabaseSevice service = new DatabaseServiceImpl();
	    	 service.deleteUserRegistration(email);
	    	 
	    	 
	    	 ResultSet result = service.readRegistration();
			 request.setAttribute("result", result);
			
	    	 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/menu.jsp");
	    	 rd.forward(request, response);
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
