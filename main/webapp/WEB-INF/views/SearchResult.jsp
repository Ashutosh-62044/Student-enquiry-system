
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Registration data.</title>
<link rel="stylesheet" type="text/css" href="cssFile/SearchResult.css">
</head>
<body>

	<h3>&nbsp;&nbsp;&nbsp;Show Registration data....</h3>
	<table id="customers">
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

		<%
		ResultSet result = (ResultSet) request.getAttribute("result");
		while (result.next()) {
		%>
		<tr>
			<td><%=result.getString(1)%></td>
			<td><%=result.getString(2)%></td>
			<td><%=result.getString(3)%></td>
			<td><%=result.getString(4)%></td>
			<td><a href="deleteuser?email=<%=result.getString(3)%>">delete</a></td>
			<td><a
				href="UpdateUser?name=<%=result.getString(1)%>&city=<%=result.getString(2)%>&email=<%=result.getString(3)%>& mobile=<%=result.getString(4)%>">Update</a></td>


		</tr>

		<%
		}
		%>

	</table>
</body>
</html>