package com.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employee.service.EmployeeService;

@WebServlet ("/updateSalaryById")
public class UpdateSalaryByIdController extends HttpServlet {
	
	EmployeeService employeeService = new EmployeeService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String new_salary = req.getParameter("new_salary");
		
		int idNo = Integer.parseInt(id);
		double sal = Double.parseDouble(new_salary);
		
		boolean e3 = employeeService.updateEmployeeSalaryById(idNo, sal);
		
		if(e3 == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateSalaryById.jsp");
			requestDispatcher.include(req, resp);
		}

	}
	
	

}
