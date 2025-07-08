<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ include file="menu.jsp" %>
    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of all contact details</title>
</head>
<body>

	<h1>List of all contact Leads</h1>

	<table border="1">

		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Billing</th>

		</tr>


		<c:forEach  var="contact" items="${contacts}">

			<tr>
				<td>${contact.id}</td>
				<td>${contact.firstName}</td>
				<td>${contact.lastName}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td>${contact.source}</td>
				<td> <a href="generateBill?id=${contact.id}">billing</a> </td>



			</tr>

		</c:forEach>


	</table>

</body>

</html>