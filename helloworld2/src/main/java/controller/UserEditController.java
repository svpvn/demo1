package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
//http://localhost:8081/helloworld2/user/edit?id=10
@WebServlet("/user/edit")
public class UserEditController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		User user= new User();
		user.setId(Integer.parseInt(id));
		req.setAttribute("u", user);
		req.getRequestDispatcher("/views/edit-user.jsp").forward(req, resp);
	}
}
