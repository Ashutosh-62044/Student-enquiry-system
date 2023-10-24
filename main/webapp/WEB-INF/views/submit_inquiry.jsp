<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inquiry Submission</title>
    <link rel="stylesheet" type="text/css" href="#">
</head>
<body>
    <header>
        <h1 style="text-align:center;">Inquiry Submission</h1>
    </header>
    
    <main >
        <section style="text-align:center;">
            <h2>Thank you for your inquiry, <%= request.getParameter("name") %></h2>
            <p>We have received your message and will get back to you as soon as possible at <%= request.getParameter("email") %>.</p>
        </section>
    </main>
              <p style="text-align:center;"><a href="student_login.jsp"><b>Back to Login</b></a></p>
    
    <footer>
        <p style="text-align:center;">&copy; 2023 Your Institute</p>
    </footer>
</body>
</html>
