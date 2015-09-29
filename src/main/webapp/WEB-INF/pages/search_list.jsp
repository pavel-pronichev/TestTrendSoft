<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees list</title>
</head>
<body>
	<center>

		<h3>For Trend Soft Project</h3>
        	<h1>Employees List (Search)</h1>


		<a href="start_form">Add new employee</a> ||
		<a href="search_form">Search employee</a> ||
		<a href="list">See Employees List (All)</a>




			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: #04B45F; color: white; text-align: center;"
					height="40px">

					<td hidden>Id</td>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Second Name</td>
					<td>Age</td>
					<td>Experience</td>
					<td>Description</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
				<c:forEach items="${employeeSearchList}" var="user">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">

						<td hidden><c:out value="${user.id}" />
                        </td>
						<td><c:out value="${user.firstName}" />
						</td>
						<td><c:out value="${user.lastName}" />
						</td>
						<td><c:out value="${user.secondName}" />
						</td>
						<td><c:out value="${user.age}" />
						</td>
						<td><c:out value="${user.experience}" />
                        </td>
                        <td><c:out value="${user.description}" />
                        </td>
						<td><a href="edit?id=${user.id}">Edit</a></td>
						<td><a href="delete?id=${user.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>




	</center>
</body>
</html>
