<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

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
