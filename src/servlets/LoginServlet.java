package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import service.UserService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService us = new UserService();
		Login log = new Login(request.getParameter("username"), request.getParameter("password"));
		String flag = us.login(log);
		if(flag != "") {
			HttpSession session = request.getSession();
			session.setAttribute("username", flag);
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("unsuccessfulLogin.jsp");
		}
		
	}

}
