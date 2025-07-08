<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>

	<h1>Create New Leads</h1>

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

	<!-- 	
		
		    <tr>
				<td>Source :</td>
				<td><select>
						<option value="">Radio</option>
						<option value="">News paper</option>
						<option value="">Trade show</option>
						<option value="">Web site</option>
				</select></td>
			</tr> 
			
	-->

			<tr>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>

	</form>
	
	${msg}


</body>
</html>