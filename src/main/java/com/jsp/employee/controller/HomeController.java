package com.jsp.employee.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/home")
public class HomeController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String save = req.getParameter("save");
		String delete = req.getParameter("delete");
		String update = req.getParameter("update");
		String get_all = req.getParameter("getall");
		String get_by_id = req.getParameter("getid");
		
		if(save != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("save.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
			if(delete != null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("delete.jsp");
				requestDispatcher.forward(req, resp);
			}
			else
				if(update != null) {
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
					requestDispatcher.forward(req, resp);
				}
				else
					if(get_all != null) {
						RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAll.jsp");
						requestDispatcher.forward(req, resp);
					}
					else
						if(get_by_id != null) {
							RequestDispatcher requestDispatcher = req.getRequestDispatcher("getById.jsp");
							requestDispatcher.forward(req, resp);	
						}
							
		
		
	}
	

}
