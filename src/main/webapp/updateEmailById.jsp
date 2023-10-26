<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Update Your Email</h1>

<form action="updateEmailById" method = "post">
Id: <input type = "number" name = "id" value = "<%= request.getParameter("id") %>"><br><br>

<p><b>Enter the old email:</b></p><br>

Old_Email: <input type = "email" name = "old_email">

<p><b>Enter the new email:</b></p><br>

New_Email: <input type = "email" name = "new_email"><br><br>

<input type = "submit">
 
</form>

</body>
</html>