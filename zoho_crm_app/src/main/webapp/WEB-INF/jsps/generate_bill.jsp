<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Bill</title>
</head>
<body>

	<h1>Create Bill...</h1>

	<form action="saveBill" method="post">

		<table>

			<tr>
				<td>First Name :</td>
				<td><input type="text" name="firstName" value="${contact.firstName}"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName" value="${contact.lastName}"></td>
			</tr>

			<tr>
				<td>email :</td>
				<td><input type="text" name="email" value="${contact.email}"></td>
			</tr>

			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile" value="${contact.mobile}"></td>
			</tr>
			
			<tr>
				<td>Product :</td>
				<td><input type="text" name="product"></td>
			</tr>
			
			<tr>
				<td>Amount :</td>
				<td><input type="text" name="amount"></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="generate bill"></td>
			</tr>

		</table>
	</form>
	
	${msg}
</body>
</html>