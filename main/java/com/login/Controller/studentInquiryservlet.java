package com.login.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.model.DatabaseServiceImpl;
import com.login.model.DatabaseSevice;

@WebServlet("/studentInquiry")
public class studentInquiryservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public studentInquiryservlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(7);
			//if (session.getAttribute("email") != null) {

				DatabaseSevice service = new DatabaseServiceImpl();
				service.connectDB();
				service.studentinquiry(name, email, message);

				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/submit_inquiry.jsp");
				rd.forward(request, response);

			//} 
		//else {
			//	RequestDispatcher rd = request.getRequestDispatcher("student_login.jsp");
			//	rd.forward(request, response);
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
