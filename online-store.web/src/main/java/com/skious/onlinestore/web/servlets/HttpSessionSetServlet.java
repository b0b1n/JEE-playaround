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
 * Servlet implementation class HttpSessionServlet
 */
@WebServlet("/session")
public class HttpSessionSetServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setAttribute("sessionVarStr", "123");
		session.setAttribute("sessionVarInt", 123);

		PrintWriter writer = response.getWriter();
		writer.append("Check ur session habibi ");
	}

}
