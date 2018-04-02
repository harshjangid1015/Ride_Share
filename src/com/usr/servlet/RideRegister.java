package com.usr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Ride_register
 */
public class RideRegister extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	 // doGet() runs once per HTTP GET request
	   // It takes two arguments, representing the request and response messages
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	   
	      // Set the MIME type for the response message
	      response.setContentType("text/html");
	      // Create a Writer to write the response message to the client over the network
	      PrintWriter out = response.getWriter();
	  
	      // The programming logic to produce a HTML page
	      out.println("<html>");
	      out.println("<p>  Hello </p>" );
	      out.println("</html>");
	   }
	   
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty() || address.isEmpty() || contact.isEmpty()){
			RequestDispatcher req = request.getRequestDispatcher("Register_1.jsp");
			req.include(request, response);
		}else{
			RequestDispatcher req = request.getRequestDispatcher("Register_2.jsp");
			req.forward(request, response);
		}
	}
	
}
