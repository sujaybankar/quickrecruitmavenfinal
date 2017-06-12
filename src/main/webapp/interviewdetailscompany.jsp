<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interview Evaluation</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
div {
	background-color: #D3DCF3;
}
</style>
</head>
<body background="C:\Users\A664122\workspace\Quick_Recruit\WebContent\recruitment.jpg">
	<br>
	<br>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<!-- <ul class="nav navbar-nav">
				<li class="active"><a href="Home.jsp">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> Candidate <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="CandidateLogin">Login</a></li>
						<li><a href="CandidateSignup">Sign Up</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> Company <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="CompanyLogin">Login</a></li>
						<li><a href="CompanySignup">Sign Up</a></li>
					</ul></li>
				 <li><a href="#">Page 2</a></li>
        <li><a href="#">Page 3</a></li>
			</ul> -->
			<ul class="nav navbar-nav navbar-right">
				<li><span class="glyphicon glyphicon-user"></span> Welcome ${sessionScope.company.companyName}</li>
				<li><a href="<c:url value="logout" />"><span
						class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<center><h3> Candiadate's Interview Status is: </h3></center>
<c:if test=""></c:if>
<center>
<c:forEach var="it" items="${sessionScope.interviewdetailscompany}">
<br>
<div> New Round 
 <table width="50%" cellpadding="10" border="1" bgcolor="cyan">
 		
        <tr align="center"><td>Technical Skill (Out of 5) </td><td>${it.technicalSkills}</td></tr>
        <tr align="center"><td>Managerial SKill (Out of 5)</td><td>${it.managerialSkill}</td></tr>
        <tr align="center"><td>Body Language (Out of 5)</td><td>${it.bodyLanguage}</td></tr>
        <tr align="center"><td>Experience (In years)</td><td>${it.experience}</td></tr>
         <tr align="center"><td>Final Status :</td><td>${it.result}</td></tr>   
         <tr align="center"><td>Other Comments :</td><td>${it.comments}</td></tr>
        <tr></tr>
        <tr></tr>
    </table>
    </div>
   </c:forEach>

</center>
	
		<form method="post" action="interviewdetailscompany">
			<center>
				<table width="30%" cellpadding="5">
					<thead>
						<tr>
							<th colspan="2"><h3>Interview Evaluation</h3></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Technical Skills :</td>
							<td><input type="text" name="technicalSkills" value=""
								path="technicalSkills" /><td>Out of 5</td></td>
						</tr>
						<tr>
							<td>Managerial Skills :</td>
							<td><input type="text" name="managerialSkill" value=""
								path="managerialSkill" /><td>Out of 5</td></td>
						</tr>
						<tr>
							<td>Body Language :</td>
							<td><input type="text" name="bodyLanguage" value=""
								path="bodyLanguage" /><td>Out of 5</td></td>
						</tr>
						<tr>
							<td>Experience :</td>
							<td><input type="text" name="experience" value=""
								path="experience" /><td>(In years)</td></td>
						</tr>
						<tr>
							<td>Status :</td>
							<td><select name="result">
									<option value="Rejected">Rejected</option>
									<option value="Selected">Selected</option>
									<option value="On Hold">On Hold</option>
									<option value="Processing">Processing</option>
							</select></td>
						</tr>
						<tr>
							<td>Comments :</td>
							<td><input type="text" name="comments" value=""
								path="comments" /></td>
						</tr>
						<!-- <tr>
                        <td>Confirm Password :</td>
                        <td>input type="password" name="confirmPassword" value="" path="confirmPassword"/></td>
                    </tr> -->
						<tr>
							<td><input type="submit" value="Submit" /></td>
							<td><input type="reset" value="Reset" /></td>
						</tr>

					</tbody>
				</table>
			</center>
		</form>
	
</body>
</html>