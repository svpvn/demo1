package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/hello","/hi"})
public class HelloController extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("INIT SERVLET");
	}
	
	@Override
	public void destroy() {
		System.out.println("DESTROY");
	}
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
	}
}
