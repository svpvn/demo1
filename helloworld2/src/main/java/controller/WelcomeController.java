package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/admin/welcome")
public class WelcomeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//response
				resp.setContentType("text/html");
				
				PrintWriter pw= resp.getWriter();
				pw.println("Hello");
				pw.println("<h1>Hello HTML</h1>");
				pw.println("<a>aaaa </a>");
	}
}
