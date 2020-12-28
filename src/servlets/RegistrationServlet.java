package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import model.User;
import service.UserService;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserService us = new UserService();
		User user = new User(request.getParameter("username"), request.getParameter("password"), request.getParameter("email"));
		boolean success = us.register(user);
		if(success) {
			HttpSession session = request.getSession();
			session.setAttribute("username", request.getParameter("username"));
			response.sendRedirect("welcomenewuser.jsp");
		} else {
			response.sendRedirect("unsuccessfulRegister.jsp");
		}
		
	}

}
