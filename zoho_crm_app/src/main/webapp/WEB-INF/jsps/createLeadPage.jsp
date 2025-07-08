<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create new lead page</title>
</head>
<body>

	<h1>Create new lead page here...</h1>

	<form action="saveLeads" method="post">

		<table>

			<tr>
				<td>First Name :</td>
				<td><input type="text" name="firstName"></td>
			</tr>

			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName"></td>
			</tr>

			<tr>
				<td>email :</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile"></td>
			</tr>

			<tr>
				<td>Source :</td>
				<td><select name="source">
						<option value="radio">Radio</option>
						<option value="newspaper">News paper</option>
						<option value="tradeshow">Trade show</option>
						<option value="website">Web site</option>
				</select></td>
			</tr>

			<tr>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>
	</form>
	
	${msg}
</body>
</html>