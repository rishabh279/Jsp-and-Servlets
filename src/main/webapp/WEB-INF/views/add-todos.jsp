<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<form action="/addtodo.do" method=post>
			<fieldset class="form-group">
				<label>Description</label>
				<input type="text" class="form-control" name="newTodo">
			</fieldset>
			<fieldset class="form-group">
				<label>Category</label>
				<input type="text" class="form-control" name="category">
			</fieldset>
			<input type="submit" value="Submit" class="btn btn-primary"/>
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