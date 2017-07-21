package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo("Learn Web Application Dveleopment"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodos(String name) {
		todos.add(new Todo(name));
	}

	public void deleteTodos(String name) {
		todos.remove(new Todo(name));
	}
	
}
