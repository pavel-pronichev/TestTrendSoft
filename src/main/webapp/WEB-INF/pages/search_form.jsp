<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Form</title>
</head>
<body>
	<center>

	<h3>For Trend Soft Project</h3>
	<h1>Search form</h1>
	<p>(Use for search employee)</p>

	<a href="start_form">Add new employee</a> ||
	<a href="list">See Employees List</a>


	<form:form id="searchForm" modelAttribute="employee" method="post"
    			action="search">
    			<table width="290px" height="150px">
    				<tr>
    					<td><form:label path="firstName">First Name</form:label></td>
    					<td><form:input path="firstName" /></td>
    				</tr>
    				<tr>
    					<td><form:label path="lastName">Last Name</form:label></td>
    					<td><form:input path="lastName" /></td>
    				</tr>
    				<tr>
    					<td><form:label path="secondName">Second Name</form:label></td>
    					<td><form:input path="secondName" /></td>
    				</tr>
    				<tr>
    					<td><form:label path="age">Age</form:label></td>
    					<td><form:input path="age" /></td>
    				</tr>
    				<tr>
                        <td><form:label path="experience">Experience</form:label></td>
                        <td><form:input path="experience" /></td>
                    </tr>
                    <tr>
                        <td><form:label path="description">Description</form:label></td>
                        <td><form:input path="description" /></td>
                    </tr>
    				<tr>
    					<td></td>
    					<td align="center"><input type="submit" value="Search" />
    					</td>
    				</tr>
    			</table>
    		</form:form>

	</center>
	</body>
	</head>