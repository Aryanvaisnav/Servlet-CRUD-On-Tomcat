<%@page import="com.jsp.employee.dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.employee.service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employees List Working in the company</h1>

<% EmployeeService employeeService = new EmployeeService();
   List<Employee> employees = employeeService.getAllEmployees();

%>

<table border = "2px" cellspacing = "0" cellpadding = "1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Salary</th>
<th>Designation</th>
</tr>

<% for(Employee e : employees) { %>
	<tr>
		<td><%= e.getId()  %></td>
		<td><%= e.getName() %></td>
		<td><%= e.getEmail() %></td>
		<td><%= e.getSalary() %></td>
		<td><%= e.getDesignation() %></td>
		<td><a href = "delete.jsp?id=<%= e.getId() %>">Delete</a></td>
		<td><a href = "updateEmailById.jsp?id=<%= e.getId() %>">UpdateEmail</a></td>
		
	</tr>
<% } %>


</table>
</body>
</html>