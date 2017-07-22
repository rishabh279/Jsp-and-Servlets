package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo("Learn Web Application Dveleopment","Study"));
		todos.add(new Todo("Learn Spring MVC","Study"));
		todos.add(new Todo("Learn Spring Rest Services","Study"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodos(String name,String category) {
		todos.add(new Todo(name,category));
	}

	public void deleteTodos(String name,String category) {
		todos.remove(new Todo(name,category));
	}
	
}
