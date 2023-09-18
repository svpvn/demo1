package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import service.UserService;
@WebServlet("/user/new")
public class UserNewController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/new-user.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("id");
		String name= req.getParameter("name");
		String age= req.getParameter("age");
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		UserService userService = new UserService();
		userService.Create(user);
		resp.sendRedirect("/helloworld2/user/lists");
	}
}
