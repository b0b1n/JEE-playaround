package com.skious.onlinestore.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionGetServlet
 */
@WebServlet("/HttpSessionGetServlet")
public class HttpSessionGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("sessionVarStr", "123");
		session.setAttribute("sessionVarInt", 123);

		PrintWriter writer = response.getWriter();
		writer.append(" Session attributes : \n ");
		session.getAttributeNames().asIterator().forEachRemaining(e -> writer.append("\t\t\t  -- " + e + " \n"));
		writer.append(" sessionVarStr  :  " + session.getAttribute("sessionVarStr"));
		writer.append(" \nsessionVarInt  :  " + session.getAttribute("sessionVarInt"));
	}

}
