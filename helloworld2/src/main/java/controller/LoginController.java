package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username= req.getParameter("username");
		String password= req.getParameter("password");
		
		if(username.equals("nam")&& password.equals("123")) {
			//secsion : luu tam data
			HttpSession session= req.getSession();
			System.out.println(session.getId());
			session.setAttribute("loginUser",username);
			//redirect
			resp.sendRedirect("/helloworld2/admin/welcome");
		}else {
			resp.sendRedirect("/helloworld2/login");
		}
	}
}
