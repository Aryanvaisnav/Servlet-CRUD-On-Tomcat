package com.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/update")
public class UpdateController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String updateName = req.getParameter("updateName");
		String updateEmail = req.getParameter("updateEmail");
		String updateSalary = req.getParameter("updateSalary");
		String updateDesignation = req.getParameter("updateDesignation");
		
		if(updateName != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateNameById.jsp");
			requestDispatcher.forward(req, resp);
		}
		else
			if(updateEmail != null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateEmailById.jsp");
				requestDispatcher.forward(req, resp);
			}
			else
				if(updateSalary != null) {
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateSalaryById.jsp");
					requestDispatcher.forward(req, resp);
				}
				else
					if(updateDesignation != null) {
						RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateDesignationById.jsp");
						requestDispatcher.forward(req, resp);

					}
		
	}

}
