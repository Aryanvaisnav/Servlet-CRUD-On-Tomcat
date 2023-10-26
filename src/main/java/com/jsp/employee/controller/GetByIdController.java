package com.jsp.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

@WebServlet ("/getById")
public class GetByIdController extends HttpServlet {
	
	EmployeeService employeeService = new EmployeeService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		int idNo = Integer.parseInt(id);
		
		Employee e = employeeService.getEmployeeById(idNo);
		
		if(e != null) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.write("<html><body>"
					+ "<p>" + e.getId() + "</p>"
					+ "<p>" + e.getName() + "</p>"
					+ "<p>" + e.getEmail() + "</p>"
					+ "<p>" + e.getSalary() + "</p>"
					+ "<p>" + e.getDesignation() + "</p>"
					+ "</body></html>");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getById.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
