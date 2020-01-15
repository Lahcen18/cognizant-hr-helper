<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

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
	<c:forEach items="${users}" var="user">
	<tr>
        	<th>${user.id}</th>
        	<th>${user.firstName}</th>
        	<th>${user.lastName}</th>
	</tr>
	</c:forEach>
</table>

<p> my data : ${myData}</p>

</body>

</html>