<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inquiry Form</title>
    <link rel="stylesheet" type="text/css" href="cssFile/submitInquiry.css">
</head>
<body>
    <header>
        <h1>Inquiry Form</h1>
    </header>
    
    <main>
        <section id="inquiry-form">
            <h2>Contact Us</h2>
            <form action="studentInquiry" method="post">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>

                <label for="message">Text Message:</label>
                <textarea id="message" name="message" rows="4" required></textarea>

                <button type="submit">Submit</button>
            </form>
        </section>
    </main>
    
    <footer>
        <p>&copy; 2023 Your Institute</p>
    </footer>
</body>
</html>
