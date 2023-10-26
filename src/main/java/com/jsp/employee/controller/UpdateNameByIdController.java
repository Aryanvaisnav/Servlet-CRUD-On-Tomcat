package com.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employee.service.EmployeeService;

@WebServlet("/updateNameById")
public class UpdateNameByIdController extends HttpServlet {
	
	EmployeeService employeeService = new EmployeeService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String new_name = req.getParameter("new_name");
		
		int idNo = Integer.parseInt(id);
		
		boolean e3 = employeeService.updateEmployeeNameById(idNo, new_name);
		
		if(e3 == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateNameById.jsp");
			requestDispatcher.include(req, resp);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
