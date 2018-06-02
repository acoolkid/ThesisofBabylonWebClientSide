<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Portal</title>
<link href='//fonts.googleapis.com/css?family=Raleway:400,300,600' rel='stylesheet' type='text/css'>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/skeleton.css" />
<link rel="stylesheet" type="text/css" href="css/basedesign.css" />
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
</head>
<body>
<div class="container">
	<div class="row">
		<h1>Welcome to Client Portal!!!</h1>
	</div>
	<div class="row">
		<div class="four columns">
				<form action="print.jsp" method="post">
						<input name="id" id="id" type="hidden" value="<%= session.getAttribute("patientid") %>">
						<input class="button u-pull-left" value="Print" type="submit">
				</form>	
		</div>
	</div>
	<div class="row">
		<div class="six columns">
			<textarea class="u-full-width dontresize textboxheight" name="patientDetails" placeholder="Basic Patient Information will show up here. "></textarea>
		</div>
		<div class="six columns">
			<textarea class="u-full-width dontresize textboxheight" name="medicalRecords" placeholder="The Medical Data of the Patient will show up here. "></textarea>
		</div>
	</div>
</div>
</body>
</html>