package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

//===================================================================================================================================================

	public Employee saveEmployee(Employee employee) {
		if (employee.getName() != null && employee.getEmail() != null && employee.getSalary() > 0
				&& employee.getDesignation() != null && employee != null) {
			return employeeDao.saveEmployee(employee);
		}
		return null;
	}

//===================================================================================================================================================

	public boolean deleteEmployeeById(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (id > 0 && employee != null) {
			return employeeDao.deleteEmployeeById(id);
		}
		return false;
	}

//==============================================================================================================================================

	public boolean updateEmployeeNameById(int id, String new_name) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (id > 0 && new_name != null && employee != null) {
			return employeeDao.updateEmployeeNameById(id, new_name);
		} else {
			return false;
		}
	}

//==============================================================================================================================================

	public boolean updateEmployeeEmailById(int id, String old_email, String new_email) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (id > 0 && new_email != null && employee != null && employee.getEmail().equals(old_email)) {
			return employeeDao.updateEmployeeEmailById(id, new_email);
		} else {
			return false;
		}
	}

//=============================================================================================================================================

	public boolean updateEmployeeSalaryById(int id, double new_salary) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (id > 0 && new_salary > 0 && employee != null) {
			return employeeDao.updateEmployeeSalaryById(id, new_salary);
		} else {
			return false;
		}
	}

//============================================================================================================================================

	public boolean updateEmployeeDesignationById(int id, String new_designation) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (id > 0 && new_designation != null && employee != null) {
			return employeeDao.updateEmployeeDesignationById(id, new_designation);
		} else {
			return false;
		}
	}

//=========================================================================================================================

	public Employee getEmployeeById(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (id > 0 && employee != null) {
			return employeeDao.getEmployeeById(id);
		} else {
			return null;
		}
	}

//=============================================================================================================================================

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();

	}

//=========================================================================================================================

}
