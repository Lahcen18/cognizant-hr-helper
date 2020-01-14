<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title> My Page</title>
</head>

<body>
	<h2>My First Page</h2>
	<hr>
	
	<p>
	Welcome to company home page!
	</p>
	
	<hr>
	
	
	<p>
		data from my controller : ${myData}
	</p>
	
	
	<a href="${pageContext.request.contextPath}/">go back to home page</a>
	<br>
	<br>
	<br>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>

</html>









