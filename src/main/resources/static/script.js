/**
 * 
 */

function validateInfo() {
	// 1.)Get the text box value
	var first = document.getElementById("firstname").value;
	var last = document.getElementById("lastname").value;
	var x = document.forms["userForm"]["userNum"].value;
	var password = document.getElementById("password").value;
	var confirm = document.getElementById("confirm").value;
	

	if (first.length <= 2) {
		alert("Enter a longer first name!");
		document.getElementById("firstname").focus();
		return false;
	}

	if (last.length < 2) {
		alert("Enter a longer last name!");
		document.getElementById("lastname").focus();
		return false;

	}
	
	  if (isNaN(x)) {
	    alert("Must input numbers");
	    return false;
	  }
	  
	  if(password != confirm){
		  
		  alert("Passwords must match!");
		  return false;
	  }


}

	
