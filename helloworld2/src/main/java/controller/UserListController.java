package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import service.UserService;
@WebServlet("/user/lists")
public class UserListController extends HttpServlet{
	UserService userService= new UserService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> list= userService.getAll();
		req.setAttribute("listUser", list);
//		req.getRequestDispatcher("/views/list-user.jsp").forward(req, resp);
		req.getRequestDispatcher("/views/listUser.jsp").forward(req, resp);
	}
}
