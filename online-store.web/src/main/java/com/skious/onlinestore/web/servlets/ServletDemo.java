package com.skious.onlinestore.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet(urlPatterns = "/demo", initParams = { @WebInitParam(name = "first", value = "Sohaib"),
		@WebInitParam(name = "last", value = "SKIOUS") })
public class ServletDemo extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = getInitParameter("first");
		String lastName = getInitParameter("last");

		PrintWriter writer = response.getWriter();

		writer.println("fullName = [");
		writer.println("\t firstName = " + firstName + "; ");
		writer.println("\t lastName = " + lastName);
		writer.println("]");
//		writer.println("</br>");
		writer.println();

		writer.println("Servlet info = [");
		writer.println("  Servlet name: " + getServletConfig().getServletName());
		writer.println();
		writer.println("  Servlet name: " + getServletName());
		writer.println();
		writer.println("  Context path: " + getServletContext().getContextPath());
		writer.println("]");
		writer.println();

		String param = request.getParameter("param");
		writer.println("Request param value: " + param);
		writer.println(" Servlet Name :  " + getServletName());
		if(param != null && param.equalsIgnoreCase("fillAttr")) {
			writer.println(" Forwarding ...");
//			request.getRequestDispatcher("/demoAttr").forward(request, response);			
			request.getRequestDispatcher("/demoAttr").include(request, response);			
		}
	}

}
