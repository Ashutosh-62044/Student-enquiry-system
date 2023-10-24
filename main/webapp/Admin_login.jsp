<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="cssFile/login.css">
</head>
<body>

	<h2>Login Form</h2>

	<form action="verifyLoginSecond" method="post">
		<div class="imgcontainer">
			<img src="img_avatar2.png" alt="Avatar" class="avatar">
		</div>

		<div class="container">
			<label for="uname"><b>Username</b></label> 
			<input type="text" placeholder="Enter Username" name="email" required> 
				
				<label for="psw"><b>Password</b>
				  </label> <input type="password" placeholder="Enter Password" name="password" required>

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked" name="remember"> Remember me</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>
	
	<p style="color: red;">
		 <%
		   if (request.getAttribute("error") != null) {
			out.print(request.getAttribute("error"));
		    }
		%>
	</p>
</body>
</html>