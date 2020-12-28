<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="model.User" %>
    <%@ page import="utility.HibernateUtility" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!</title>
</head>
<body>

<br/><br/>
<%
org.hibernate.Session ses = HibernateUtility.getSession();
User user = (User)ses.get(User.class, (String)session.getAttribute("username"));
response.getWriter().println("Welcome back " + session.getAttribute("username") + "!<br/>" +  "Your Email: " + user.getEmail());
 %>
 

 
</body>
</html>