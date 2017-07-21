package com.in28minutes.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	private UserValidationService userValidationService = new UserValidationService(); 
	private TodoService todoService = new TodoService();
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	 {
		 /*
		  getParameter() is used to get the parameter passed in the url
		  setAttribute() is used to set the attribute with name specified in double qoutes so that we can use in jsp page  
		  */
		 //https://www.javatpoint.com/requestdispatcher-in-servlet
		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		 
		 /*PrintWriter out = response.getWriter();
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>Yahoo</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("My First Servlet");
		 out.println("</body>");
		 out.println("</html>");*/
	 }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(userValidationService.isUserValid(name,password)){
			
			//request.setAttribute("todos",todoService.retrieveTodos());
			request.getSession().setAttribute("name",name);
			response.sendRedirect("/todo.do");
		}else{
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		}
		 
	 }
	 
	 
}
