<%-- 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.patientcare.model.AdminLogin" %>
<% AdminLogin user=(AdminLogin)session.getAttribute("user");
	if(user==null)
	{
		response.sendRedirect("login");
	}
%>




<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css\header.css">
<link rel="stylesheet" href="css\page.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<style>
#userDetails
{
float:right;
}
#helpDesk
{
width:100px;
height:100px;

}
#help
{
text-align:center;
}

#logoutImage
{
width:100px;
height:100px;
}

#updateProfileImage
{
width:100px;
height:100px;
}

#apppointmentImage
{
width:100px;
height:100px;
}
</style>
</head>

<body style="color:#CD5C5C;font-family: 'Raleway', sans-serif;">

<div  id="header">

<table>
<tr>

<td>
<h4 style="margin-left:10px;">
<span id="logoname" ><span id="patientLogo">MEDICAL</span><span id="careLogo">CARD</span>
<br/>
<span style="font-size:75%;">The Future of Healthcare</span>
</h4>
<br/>
<br/><td></tr>
</table>
<a href="addPatient">
<div id="add"><img id="addImage" src="img\add.jpg"/><br/>add patient</div>
</a>
<br/>
<a href="viewPatient">
<div id="view"><img id="viewImage" src="img\view.ico"/><br/>view patient</div>
</a>
<br/>
<a href="helpUser">
<div id="help"><img id="helpDesk" src="img\help.ico"/><br/>need help</div>
</a>
</div>

<div id="userDetails">
<img src="userImage?id=<%=user.getId()%>" id="userImage"/>
<div id="username"><%=user.getName()%></div>

<br/>
<a href="updateProfile">
<img src="img\updateProfile.png" id="updateProfileImage"/>
<div id="update">update profile</div>
</a>
<br/>
<a href="appointment">
<img src="img\appointments.jpg" id="apppointmentImage"/>
<div id="appoint">appointments</div>
</a>
<br/>
<a href="log">
<img src="img\logout.jpg" id="logoutImage"/>
<div id="logout">logout</div>
</a>
</div>
</body>


</html>


 --%>