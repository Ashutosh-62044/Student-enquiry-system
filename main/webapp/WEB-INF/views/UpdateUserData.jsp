<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>udateUserdata</title>
<link rel="stylesheet" type="text/css"
	href="cssFile/registrationcssfile.css">
</head>
<body> 
      
     <h3>Update User Information...</h3>

	<div class="container">
		<form action="UpdateUser" method="post">
			<label for="fname">First Name</label> 
			<input type="text" id="fname"name="name" value="<%= request.getAttribute("name")%>">
				
				 <label for="city">City</label>
				   <input type="text" id="lname" name="city" value="<%= request.getAttribute("city")%>">
			  
			
			
			<label for="email">Email</label>
				   <input type="text" id="lname" name="email" value="<%=request.getAttribute("email")%>" readonly> 
			
			<label for="mobile">Mobile</label>
				   <input type="text" id="lname" name="mobile" value="<%=request.getAttribute("mobile")%>"> 
			

			<input type="submit" value="Update">
		</form>
	</div>
      
</body>
</html>