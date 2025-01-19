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
@WebServlet("/demoAttr")
public class ServletDemo2 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("Attr", "i am an Attribute");
		System.out.println(" i passed by the /demoAttr servlet");

		PrintWriter writer = response.getWriter();
		writer.println(" Servlet Name :  " + getServletName());
		writer.println("Request attribute: " + request.getAttribute("Attr"));
//		response.sendRedirect("http://google.com");
	}

}
