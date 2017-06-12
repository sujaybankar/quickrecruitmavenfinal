<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Login To Portal</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=1.0, minimum-scale=1.0, maximum-scale=1.0">
	<!--CSS Link-->
	<link rel="stylesheet" type="text/css" href="asset/css/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="asset/css/style.css" >
	<!-- JS Link -->
	<script  type="text/javascript" src="<c:url value="asset/js/jquery.js"/>"></script>
	<script type="text/javascript" src="<c:url value="asset/js/bootstrap.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="asset/js/login.js"/>"></script>
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">


</head>
<body background="C:\Users\A664122\workspace\Quick_Recruit\WebContent\recruitment.jpg">

	<!--Main Container Stared  -->
	<div class="container-fluid">
		<!--Jumbotron Stared -->
		<div class="jumbotron">
			<!--Main_Banner started -->
			<div class="col-lg-12 Main_Banner">
			<img src="<c:url value="/asset/images/pcmc.jpg" />" class="img-responsive">
				
			</div>
			<!--Main_Banner Ended -->
			<!--Admin_login started -->
			<div class="col-lg-12">
				
				
					<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3 right">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="register" >Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							               <h4>${requestScope.status }</h4>
								<form id="login-form" action="login" method="post" role="form" style="display: block;" >
									<div class="form-group">
										<input type="text"  name="email" id="username" tabindex="1" class="form-control" placeholder="Username" value="${requestScope.user.email }" />
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" />
									</div>
									
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
									
								</form>
								<%-- <form id="register-form" action="http://phpoll.com/register/process" method="post" role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="" path="name">
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="" path="email">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" path="password" >
									</div>
									<div class="form-group">
										<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
									</div>
									<div class="form-group">
										<input type="text" name="Street" id="street" tabindex="2" class="form-control" placeholder="Street" path="street">
									</div>
									<div class="form-group">
										<input type="text" name="City" id="city" tabindex="2" class="form-control" placeholder="City" path="city">
									</div>
									<div class="form-group">
										<input type="text" name="State" id="state" tabindex="2" class="form-control" placeholder="State" path="state">
									</div>
									<div class="form-group">
										<input type="integer" name="Pincode" id="pincode" tabindex="2" class="form-control" placeholder="Pincode" path="pincode">
									</div>
									
									<div class="form-group">
										<input type="text" name="Gender" id="gender" tabindex="2" class="form-control" placeholder="Gender" path="gender">
									</div>
									<div class="form-group">
										<input type="integer" name="Aadhar Card No." id="aadhar no." tabindex="2" class="form-control" placeholder="Aadhar Card No." path="adharCard_no">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
								</form> --%>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
			</div>
			<!--Admin_login Ended -->
		</div>
		<!--Jumbotron Stared -->
	</div>
	<!--Main Container Stared -->

</body>
</html>