<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>


<h1>Please Fill Out the Form to Register!</h1>

<form id ="userForm" action="formresults" onsubmit= "return validateInfo();">

		First Name: <input id="firstname" type="text" name="firstname">
		<br>
		Last Name: <input id ="lastname" type="text" name="lastname"> 
		<br>
		Email: <input type = "email" name = "userEmail">
		<br>
		Phone Number: <input id = "userNum" type ="text" name = "userNum">
		<br>
		Password: <input id = "password" type = "password" name = "userPass">
		<br>
		Confirm Password: <input id= "confirm" type = "password" name = "confirmPass">
		<br>
		<input type="submit" value="Register">

	</form>





<script src = script.js></script>
</body>
</html>