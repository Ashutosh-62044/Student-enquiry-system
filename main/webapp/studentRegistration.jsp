<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
 	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration</title>
<link rel="stylesheet" type="text/css"
	href="cssFile/registrationcssfile.css">
</head>
<body>
	<h2>Student fill your Registration form..</h2>

	<h3>Contact Form</h3>

	<div class="container">
		<form action="studentRegistration" method="post">
			<label for="fname">First Name</label> 
			<input type="text" id="fname"name="name" placeholder="Your name..">
				
				 <label for="city">City</label>
				   <input type="text" id="lname" name="city"placeholder="Your city name.."> 
			  
			
			
			<label for="email">Email</label>
				   <input type="text" id="lname" name="email"placeholder="Your email.."> 
			
			<label for="mobile">mobile</label>
				   <input type="text" id="lname" name="mobile"placeholder="Your mobile number.."> 
			
			<label for="mobile">Password</label>
				   <input type="text" id="lname" name="password"placeholder="Enter Password..."> 
			

			<input type="submit" value="Submit">
		</form>
	</div>


	<p style="font-size: 30px; color: blue;">
		<%
		if (request.getAttribute("msg") != null) {
			out.print(request.getAttribute("msg"));
		}
		%>
	</p>
</body>
</html>