<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8"/>
	<title>My Page</title>
</head>

<body>
<h1>User List</h1>

<table>
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
	</tr>
	<tr th:each="user : ${users}">
		<td th:text="${user.id}">123</td>
		<td th:text="${user.firstName}">Momo</td>
		<td th:text="${user.lastName}">Hassan</td>
	</tr>
</table>
<br>
<p> my data : ${myData}</p>

</body>

</html>