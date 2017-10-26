<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.ArrayList,org.patientcare.model.Patient"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Patients</title>
<style type="text/css">

th 
{
	 text-align: center;
	 border: 1px solid white;
	 border-collapse: collapse;
	 color:inherit;
	
}
td
{
text-align:center;
border:1px solid ;
color:inherit;
}



tr 
{
	border-collapse: collapse;
	border: 1px solid ;
	padding-top:5px;
	padding-bottom:5px;
	
}
table
{

}


</style>
</head>
<body>
	<div id="page">
		<table>
			<thead>
				<tr>
					<th>image</th>
					<th>name</th>
					<th>disease</th>
					<th>care team</th>
					<th>doctor</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${patients}" var="patient">
					<tr>
						<td><img src='imageDisplay?pid=${patient.pid}'
							style="display: inline-block; width: 50px; height: 50px; border-radius: 50%; background-repeat: no-repeat; background-position: center center; background-size: cover;" />
						</td>
						<td><c:out value="${patient.name}" /></td>
						<td><c:forEach items="${patient.disease}" var="disease">
								<a href="#"> <c:out value="${disease}" /></a>
							</c:forEach></td>
						<td><c:forEach items="${patient.careTeam}" var="careTeam">
								<a href="#"> <c:out value="${careTeam}" /></a>
							</c:forEach></td>
						<td><c:forEach items="${patient.doctor}" var="doctor">
								<a href="#"> <c:out value="${doctor}" /></a>
							</c:forEach></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>