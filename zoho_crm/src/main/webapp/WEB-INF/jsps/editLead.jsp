<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update lead</title>
</head>
<body>

<h1>Update lead information here...</h1>

	<form action="updateOneLead" method="post">

		<table>
		
		<tr>
				<td>Id :</td>
				<td><input type="text" name="id" value="${leads.id}" readonly="readonly" /></td>
			</tr>

			<tr>
				<td>First Name :</td>
				<td><input type="text" name="firstName" value="${leads.firstName}"/></td>
			</tr>

			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName" value="${leads.lastName}"/></td>
			</tr>

			<tr>
				<td>email :</td>
				<td><input type="text" name="email" value="${leads.email}"></td>
			</tr>

			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile" value="${leads.mobile}"/></td>
			</tr>


			<tr>
				<td><input type="submit" value="update"></td>
			</tr>

		</table>

	</form>
	
	${msg}

</body>
</html>