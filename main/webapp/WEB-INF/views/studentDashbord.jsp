<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Dashboard</title>
    <link rel="stylesheet" type="text/css" href="cssFile/studentdashbord.css">
</head>
<body>
    <header>
        <h1>Welcome, Ashutosh Yadav</h1>
        <a href="Logout">Logout</a>
    </header>
    
    <nav>
        <ul>
            <li><a href="inquiry_form.jsp">Inquiry Form</a></li>
            <li><a href="#">Courses</a></li>
            <li><a href="#">Grades</a></li>
            <li><a href="#">Profile</a></li>
        </ul>
    </nav>
    
    <main>
        <section id="profile">
            <h2>Your Profile</h2>
            <!-- Display student profile information here -->
        </section>
        
        <section id="courses">
            <h2>Your Courses</h2>
            <!-- Display enrolled courses here -->
        </section>
        
        <section id="grades">
            <h2>Your Grades</h2>
            <!-- Display grades for each course here -->
        </section>
    </main>
    
    <footer>
        <p>&copy; 2023 Your Institute</p>
    </footer>
</body>
</html>
