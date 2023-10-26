package com.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employee.service.EmployeeService;

@WebServlet ("/updateEmailById")
public class UpdateEmailByIdController extends HttpServlet {
	
	EmployeeService employeeService = new EmployeeService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String old_email = req.getParameter("old_email");
		String new_email = req.getParameter("new_email");
		
		int idNo = Integer.parseInt(id);
		
		boolean e3 = employeeService.updateEmployeeEmailById(idNo, old_email, new_email);
		
		if(e3 == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateEmailById.jsp");
			requestDispatcher.include(req, resp);
		}

	}
	
}
