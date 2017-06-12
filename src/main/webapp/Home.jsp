<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quick Recruit</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <style type="text/css">
 div
{
background-color:#b3ccff;
} 
</style>
</head>
<body background="C:\Users\A664122\workspace\Quick_Recruit\WebContent\recruitment.jpg">

<br>
<h1 style="color: blue">Welcome to Quick Recruit</h1>
<br><div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="Home.jsp">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Candidate <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="CandidateLogin">Login</a></li>
            <li><a href="CandidateSignup">Sign Up</a></li>
          </ul>
        </li>
         <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Company <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="CompanyLogin">Login</a></li>
            <li><a href="CompanySignup">Sign Up</a></li>
          </ul>
        </li>
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
</div><br><br><br>

</body>
</html>