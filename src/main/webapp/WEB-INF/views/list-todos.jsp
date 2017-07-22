<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<H1>Welcome ${name}</H1>

		<p>Todos Are as follows:</p>
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Actions</th>
			</thead>
			<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.name} &nbsp;</td>
							<td>${todo.category}</td>
							<td><a class="btn btn-danger" href="/delete.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
						</tr>	
					</c:forEach>		
			</tbody>
		</table>
		<ol>
			
		</ol>
		<a class="btn btn-success" href="/addtodo.do">Add New Todo</a>
	</div>
<%@ include file="../common/footer.jspf"%>