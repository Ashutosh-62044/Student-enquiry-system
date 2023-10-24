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

	<h3>&nbsp;&nbsp;&nbsp;Show All Inquiry Submit by The Information....</h3>
	<table id="customers">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>message</th>
			<th>created_at</th>
			
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
			
		</tr>

		<%
		}
		%>

	</table>
</body>
</html>