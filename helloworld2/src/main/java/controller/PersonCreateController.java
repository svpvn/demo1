package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Person;
@WebServlet("/person/create")
public class PersonCreateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher= req.getRequestDispatcher("/views/person-create.jsp");
		
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doc du lieu gui len tu client
		String id =req.getParameter("id");
		String name= req.getParameter("name");
		System.out.println(id+ " "+name);
		Person person= new Person();
		person.setId((Integer.parseInt(id)));
		person.setName(name);
		//save to db
		//....
		//views
		req.setAttribute("person", person);
		req.getRequestDispatcher("/views/preson-detail.jsp").forward(req, resp);
	}
}
