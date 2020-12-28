<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>

Hello
<br/><br/>
Log In<br/>

<form method="post" action="LoginServlet">

Name:<input type="text" name="username"><br/>
Password:<input type="password" name = "password"><br/>

<button type="submit">Login</button>

</form>


<br/><br/>
<a href="register.jsp">Register a New User</a>

</body>
</html>