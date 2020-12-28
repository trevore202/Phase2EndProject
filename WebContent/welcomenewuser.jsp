<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.User"%>
    <%@ page import="utility.HibernateUtility"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<% 
response.getWriter().println("New User Registered Successfully!<br/>");
response.getWriter().println("Username: " + session.getAttribute("username") + "<br/>");
org.hibernate.Session ses = HibernateUtility.getSession();
User user = (User)ses.get(User.class, (String)session.getAttribute("username"));
response.getWriter().println("Email: " + user.getEmail()); 
%>

</body>
</html>