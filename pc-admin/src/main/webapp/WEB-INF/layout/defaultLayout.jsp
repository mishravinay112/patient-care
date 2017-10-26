<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<style>
td
{
text-align:center;
width:100px;
height:100px;
}

#patientLogo
{
color:#CD5C5C;
background:white;
border-radius: 10px 0px 0px 10px;
}

#careLogo
{
color:white;
background:#CD5C5C;
border-radius: 0px 10px 10px 0px;
}

#logoname:hover > #patientLogo
{
background:#CD5C5C;
color:white;
}
#logoname:hover > #careLogo
{
background:white;
color:#CD5C5C;
}

#addImage     
{
width:100px;
height:100px;
}

#viewImage
{
width:100px;
height:100px;
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

#helpDesk
{
width:100px;
height:100px;
}

</style>
</head>
<body style="color: #CD5C5C; font-family: 'Raleway', sans-serif;">


	<table border="1" style="width:100%;height:100%;">
		
		<tr>
			<td colspan="3">
				<h4>
					<span id="logoname"><span id="patientLogo">MEDICAL</span><span id="careLogo">CARD</span> <br /> 
					<span style="font-size: 75%;">The Future of Healthcare</span>
				</h4>
			</td>
		</tr>

		<tr>
			<td>
			<a href="addPatient"> <img id="addImage" src="img\add.jpg" /><br />
			add patient
			</a>
			</td>

			<td rowspan="3"><tiles:insertAttribute name="body" /></td>

			<td>
			<a href="updateProfile"> 
			<img src="img\updateProfile.png" id="updateProfileImage" /><br/>
			update profile
			</a>
			</td>
		</tr>

		<tr>
			<td>
			<a href="viewPatient">
			<img id="viewImage" src="img\view.ico" /><br />
			view patient
			</a>
			</td>

			<td>
			<a href="appointment">
			 <img src="img\appointments.jpg" id="apppointmentImage" /><br/>
			appointments
			</a>
			</td>
		</tr>

		<tr>
			<td>
			<a href="helpUser">
			<img id="helpDesk" src="img\help.ico" /><br />
			need help
			</a>
			</td>

			<td>
			<a href="log"> 
			<img src="img\logout.jpg" id="logoutImage" /><br/>
			logout
			</a>
			</td>
		</tr>
		
		<tr>
			<td colspan="3"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>

</body>
</html>