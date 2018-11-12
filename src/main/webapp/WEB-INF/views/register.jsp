<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div class = "container">

<h1>Please Fill Out the Form to Register!</h1>

<form id ="userForm" action="formresults" onsubmit= "return validateInfo();">

		 <input id="firstname" type="text" name="firstname" placeholder = "First Name">
		<br>
		 <input id ="lastname" type="text" name="lastname" placeholder = "Last Name"> 
		<br>
		<input type = "email" name = "userEmail" placeholder = "Email">
		<br>
		 <input id = "userNum" type ="text" name = "userNum" placeholder = "Phone Number">
		<br>
		 <input id = "password" type = "password" name = "userPass" placeholder = "Password">
		<br>
		 <input id= "confirm" type = "password" name = "confirmPass" placeholder = "Confirm Password">
		<br>
		<input id = "register" type="submit" value="Register">

	</form>

</div>



<script src = script.js></script>
</body>
</html>