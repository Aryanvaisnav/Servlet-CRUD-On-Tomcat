package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//============================================================================================================

	// Save the employee details

	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

//============================================================================================================

	// Get the details of employee by id

	public Employee getEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

//=============================================================================================================

	// Delete the employee details

	public boolean deleteEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return true;
	}

//=============================================================================================================

	// Update the employee name by id

	public boolean updateEmployeeNameById(int id, String new_name) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setName(new_name);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}

//============================================================================================================

	// Update the employee email by id

	public boolean updateEmployeeEmailById(int id, String new_email) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setEmail(new_email);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}

//============================================================================================================

	// Update the employee salary by id

	public boolean updateEmployeeSalaryById(int id, double new_salary) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setSalary(new_salary);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}

//============================================================================================================

	// Update the employee designation by id

	public boolean updateEmployeeDesignationById(int id, String new_designation) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setDesignation(new_designation);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}

//===========================================================================================================

	// To get the details of all the employees

	public List<Employee> getAllEmployees() {
		String sql = "Select e from Employee e";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

//==========================================================================================================

}
