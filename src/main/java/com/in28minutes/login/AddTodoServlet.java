package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet("/addtodo.do")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newTodo = request.getParameter("newTodo");
		todoService.addTodos(newTodo);
		//request.getRequestDispatcher("/todo.do").forward(request,response);
		response.sendRedirect("/todo.do");
	}

}
