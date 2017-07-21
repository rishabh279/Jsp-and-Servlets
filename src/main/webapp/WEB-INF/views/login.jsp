<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Yahoo!!</title>
<!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
width: auto;
max-width: 680px;
padding: 0 15px;
}
</style>
</head>
<body>
<nav role="navigation" class="navbar navbar-default">

		<div class="">
			<a href="/" class="navbar-brand">Brand</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/todo.do">Todos</a></li>
				<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do">Logout</a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<form action="/login.do" method="post">
		Enter your name:<input type="text" name="name"/> 
		Password:<input type="password" name="password"/>
		<input type="submit" value="Submit">
	</form>
	</div>
	
	<footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
