package com.skious.onlinestore.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();

		response.addCookie(new Cookie("BAAA", "BOOO"));
		response.addCookie(new Cookie("PAAA", "POOO"));
		response.addCookie(new Cookie("DAAA", "DOOO"));

		PrintWriter out = response.getWriter();
		out.println("Reading Cookies Example \n");

		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
// 				to delete cookie setMaxAge to zero and add this cookie back to response
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			out.println(" | Name : " + cookie.getName());
			out.println(" | ------->   Value: " + cookie.getValue());
			out.println();
		}
	}

}
