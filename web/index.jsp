<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Side here</title>
</head>
<body>

	<h1>Patient Login</h1>
	
	<form action="login" method="post">  
		<div class="row">
			    	<div class="three columns">
			    		<label for="username">Username or Email:</label>
			    	</div>
			    	<div class="nine columns">
			    		<input class="u-full-width" type="text" name="username" id="username" placeholder="Username"></input>
			    	</div>
				</div>
				<div class="row">
					<div class="three columns">
			    		<label for="password">Password:</label>
			    	</div>
			    	<div class="nine columns">
			    		<input class="u-full-width" type="password" name="password" id="password" placeholder="Password"></input>
			    	</div>
				</div>
				<div class="row">
					<br>
			    	<div class="twelve columns">
			    		<input class="button u-pull-right" value="clear" type="reset"></input>
			    		<input class="button-primary u-pull-right" value="login" type="submit"></input>
			    	</div>
				</div>
	</form>
	  


</body>
</html>