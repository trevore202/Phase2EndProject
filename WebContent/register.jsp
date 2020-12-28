<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<br/> Register a new user<br/>
<form method="post" action="RegistrationServlet">

Username:<input type="text" name="username"><br/>
Password:<input type="password" name = "password"><br/>
Email:<input type="email" name = "email"><br/>

<button type="submit">Register</button>

</form>

<br/><a href="index.jsp">Log in as existing user</a>

</body>
</html>