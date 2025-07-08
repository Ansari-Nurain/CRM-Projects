<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of all details</title>
</head>
<body>

	<h1>List of all details</h1>

	<table border="1">

		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>

		</tr>


		<c:forEach items="${findAllData}" var="allData">

			<tr>
				<td>${allData.id}</td>
				<td>${allData.firstName}</td>
				<td>${allData.lastName}</td>
				<td>${allData.email}</td>
				<td>${allData.mobile}</td>
				<td><a href="delete?id=${allData.id}">delete</a></td>
				<td><a href="update?id=${allData.id}">update</a></td>


			</tr>

		</c:forEach>


	</table>

</body>
</html>