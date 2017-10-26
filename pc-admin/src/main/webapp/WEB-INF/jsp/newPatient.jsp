<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="org.patientcare.repository.DoctorRepository,org.patientcare.repository.CareTeamRepository,java.util.ArrayList"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/angular.js"></script>
<title>${user.name}</title>
<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>

<script type="text/javascript">
	
	var i=0;
	function showForm()
	{
		document.getElementById("patientForm").style.display = "block";
		document.getElementById("addPatient").style.display = "none";
		document.getElementById("viewPatient").style.display = "none";
		document.getElementById("name").style.display = "none";
	}
	
	 function addMore(divName)
		{
		 	 i++;
			 var newdiv = document.createElement('div');
	         newdiv.innerHTML = "<input type='text' name='disease["+i+"]' />";
	         document.getElementById(divName).appendChild(newdiv);
		} 
	 
	 function readURL(input) {
	        if (input.files && input.files[0]) {
	            var reader = new FileReader();

	            reader.onload = function (e) {
	                $('#patientImage')
	                    .attr('src', e.target.result)
	                    .width(150)
	                    .height(200);
	            };

	            reader.readAsDataURL(input.files[0]);
	        }
	    }
</script>

<script type="text/javascript">

var myApp=angular.module("myModule",[]);
myApp.controller("careteam",function($scope) 
		{
	var careteam=[
	              <%ArrayList<String> ct = (ArrayList<String>) CareTeamRepository.getCareTeam();;%>
	          	<%for (int i = 0; i < ct.size() - 1; i++) {%>{name: "<%=ct.get(i)%>"},
	          	  <%}%>{name:"<%=ct.get(ct.size() - 1)%>"}];
	              
	              
	$scope.careteam=careteam;
	$scope.startsWith = function (actual, expected)
			{
		    var lowerStr = (actual + "").toLowerCase();
		    return lowerStr.indexOf(expected.toLowerCase()) === 0;
		  }
		});
		
myApp.controller("doctors",function($scope)
		{
	
	var doctors=[
<%ArrayList<String> a = (ArrayList<String>) DoctorRepository.getDoctors();%>
<%for (int i = 0; i < a.size() - 1; i++) {%>{name: "<%=a.get(i)%>"},
  <%}%>{name:"<%=a.get(a.size() - 1)%>"}];
	$scope.doctors=doctors;
	$scope.startsWith = function (actual, expected)
	{
    var lowerStr = (actual + "").toLowerCase();
    return lowerStr.indexOf(expected.toLowerCase()) === 0;
  	}
	});
</script>

</head>
<body>
	<div id="page">
		<form:form action="addPatient" method="post" modelAttribute="patient"
			id="patientForm" enctype="multipart/form-data">
			<h3>Patient Information</h3>
			<br />
			<table ng-app="myModule">
				<tr>
					<td><b>Patient Image</b></td>
					<td><label for="upload-photo"><img id="patientImage"
							alt="patient Image" src="img/notavailable.png"
							style="border: 1px solid; border-radius: 5%; max-height: 100px; max-width: 100px; min-height: 100px; min-width: 100px;" /></label>
						<form:input type="file" path="patientImageFile" id="upload-photo"
							onchange="readURL(this);" style="display:none;" /></td>
				</tr>
				<tr>
					<td><b>Name</b></td>
					<td><form:input type="text" path="name"
							placeholder="Enter Patient Name" autocomplete="off" /></td>
				</tr>
				<tr>
					<td><b>Disease</b></td>
					<td>
						<div id="addMore">
							<form:input type="text" path="disease" />
						</div> <a href="#" onclick="addMore('addMore')">add more</a>
					</td>
				</tr>
				<tr ng-controller="careteam">
					<td><b>Care Team</b></td>
					<td><form:input path="careTeam" list="care" ng-model="care"></form:input>

						<datalist id="care">
							<option ng-repeat="c in careteam |  filter:care:startsWith"
								value="{{c.name}}">
						</datalist></td>

				</tr>
				<tr ng-controller="doctors">
					<td><b>Doctor</b></td>
					<td><form:input path="doctor" list="doctorName"
							ng-model="doctorName"></form:input> <datalist id="doctorName">
							<option ng-repeat="d in doctors |  filter:doctorName:startsWith"
								value="{{d.name}}">
						</datalist></td>
				</tr>
				<tr>
					<td><input type="submit" value="add patient" /><br /> <br /></td>
				</tr>

			</table>

		</form:form>


	</div>
</body>
</html>