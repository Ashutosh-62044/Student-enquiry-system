<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Login</title>
    <link rel="stylesheet" type="text/css" href="cssFile/studentlogin.css">
</head>
<body>
    <header>
        <h1>Student Login</h1>
    </header>
    
    <main>
        <section id="login-form">
            <h2>Login</h2>
            
            <form action="studentverify" method="post">
               
                <label for="username">Username (Email or Username):</label>
                <input type="text" id="username" name="email" required>

                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>

                <button type="submit">Login</button>
                <a href="studentRegistration.jsp">Create Account</a>
            </form>
        </section>
    </main>
             <p style="color: red;">
		 <%
		   if (request.getAttribute("error") != null) {
			out.print(request.getAttribute("error"));
		    }
		%>
          
    <footer>
        <p>&copy; 2023 Your Institute</p>
    </footer>
</body>
</html>
