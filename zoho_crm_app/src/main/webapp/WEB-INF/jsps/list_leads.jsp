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

<a href="viewLeadPage">New Leads</a>

	<h1>List of all Leads</h1>

	<table border="1">

		<tr>

			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>

		</tr>


		<c:forEach  var="allData" items="${leads}">

			<tr>
				
				<td><a href="showLeadPage?id=${allData.id}">${allData.firstName}</a></td>
				<td>${allData.lastName}</td>
				<td>${allData.email}</td>
				<td>${allData.mobile}</td>
				<td>${allData.source}</td>



			</tr>

		</c:forEach>


	</table>

</body>
</html>