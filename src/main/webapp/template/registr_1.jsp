<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register Form</title>
    <meta charset="utf-8">
</head>
<body>
<h1>Register Form</h1>
<form action="http://localhost:8080/login/registr" method="post">
			<table style="with: 50%">
				<tr>
                	<td>Login</td>
                	<td><input type="text" name="login" /></td>
                </tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Birthday</td>
					<td><input type="text" name="birthday" /></td>
				</tr>
				<tr>
					<td>Date of registration</td>
					<td><input type="text" name="datereg" /></td>
				</tr>
				<tr>
                	<td>Role</td>
                	<td><input type="text" name="role" /></td>
                </tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>
