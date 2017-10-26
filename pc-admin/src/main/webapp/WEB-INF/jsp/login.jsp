<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/style.css">
</head>

<body>


	<form:form action="signIn" method="post" modelAttribute="admin">
		<h4>Login Information</h4>
		<form:input class="name" type="text" path="emailId"
			placeholder="Enter Username" autocomplete="off"  />
		<form:input class="pw" type="password" path="password"
			placeholder="Enter Password" autocomplete="off"  />
		<li><a href="#">Forgot your password?</a></li>
		<input class="button" type="submit" value="Log in" /><br/><br/>
	</form:form>


</body>
</html>












