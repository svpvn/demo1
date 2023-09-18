package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/2"},loadOnStartup = 1)
public class HiController extends HttpServlet{
	
	//GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HTTP GET METHOD");
		System.out.println(req.getRemoteAddr());
		//response
		resp.setContentType("text/html");
		
		PrintWriter pw= resp.getWriter();
		pw.println("Hello");
		pw.println("<h1>Hello HTML</h1>");
		pw.println("<a>aaaa </a>");
	}
}
