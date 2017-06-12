<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company SignUp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <style type="text/css">
	  
div
{
background-color:#b3ccff;
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
			<ul class="nav navbar-nav">
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
				<!--  <li><a href="#">Page 2</a></li>
        <li><a href="#">Page 3</a></li> -->
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li> -->
				<!--  <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li> -->
			</ul>
		</div>
	</div>
	</nav>
	<br><br><br>
<form:form method="post" modelAttribute="company" >
            <center>
            <table width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2"><h1><center>Company SignUp</h1></center></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Company Name :</td>
                        <td><form:input type="text" name="companyName"  path="companyName"  maxlength="20" required="true"/></td>
                        </div>
                    </tr>
                    <tr>
                        <td>Email :</td>
                        <td><input type="email" name="email"  path="email"  maxlength="25" required="true"/></td>
                    </tr>
                    <tr>
                        <td>Helpline Number :</td>
                        <td><input type="number" name="helpLineNumber"  path="helpLineNumber"  maxlength="15" required="true"/></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password"  path="password"  maxlength="15" required="true"/></td>
                    </tr>
                    <tr>
                        <td>Confirm Password :</td>
                        <td><input type="password" name="confirmPassword"   path="confirmPassword"  maxlength="15" required="true"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="CompanyLogin">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form:form>
</div></div>
						</div>
</body>
</html>