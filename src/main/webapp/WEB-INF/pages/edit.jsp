<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Employee</title>
</head>
<body>
	<center>
			<h3>For Trend Soft Project</h3>
            <h1>Edit form</h1>
            <p>(Use for edit employee)</p>

						<a href="start_form">Add new employee</a> ||
                		<a href="search_form">Search employee</a> ||
                		<a href="list">See Employees List</a>


		<form:form id="registerForm" modelAttribute="employee" method="post"
			action="update">
			<table width="400px" height="150px">

				<tr>
                	<td hidden><form:label path="id" >Id</form:label></td>
                	<td hidden><form:input path="id" value="${employee1.id}" /></td>
                </tr>
                <tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName" value="${employee1.firstName}" /></td>
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name</form:label></td>
					<td><form:input path="lastName" value="${employee1.lastName}"/></td>
				</tr>
				<tr>
					<td><form:label path="secondName">Second Name</form:label></td>
					<td><form:input path="secondName" value="${employee1.secondName}"/></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age" value="${employee1.age}"/></td>
				</tr>
				<tr>
                <td><form:label path="experience">Experience</form:label></td>
                <td><form:input path="experience" value="${employee1.experience}"/></td>
                </tr>
                <tr>
                <td><form:label path="description">Description</form:label></td>
                <td><form:input path="description" value="${employee1.description}"/></td>
                </tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" />
					</td>
				</tr>
			</table>
		</form:form>



	</center>
</body>
</html>
