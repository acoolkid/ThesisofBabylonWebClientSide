<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="script/SessionCheck2.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Portal</title>
<link href='//fonts.googleapis.com/css?family=Raleway:400,300,600' rel='stylesheet' type='text/css'>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/skeleton.css" />
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
</head>
<body>
<div class="container">
	<div class="row">
		<h1>Good Day! <%=session.getAttribute("username")%><br></h1>
	</div>
	<div class="row">
		<div class=containter>
			<button href="E://Patient Medical Data/<%=session.getAttribute("username")%>/<%=session.getAttribute("filepath")%>"> VISIT FILE</button>
		</div>
	</div>
	
	
</body>
</html>