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
		String category = request.getParameter("category");
		todoService.addTodos(newTodo,category);
		//request.getRequestDispatcher("/list-todos.do").forward(request,response);
		response.sendRedirect("/list-todos.do");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-todos.jsp").forward(request,response);
	}

}
