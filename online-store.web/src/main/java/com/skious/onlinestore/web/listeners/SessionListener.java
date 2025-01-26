package com.skious.onlinestore.web.listeners;


import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HttpListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

	/**
	 * Default constructor.
	 */
	public SessionListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println(" Attribute `" + event.getName() + "  - " + event.getValue() + "` added to the session");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println(" Attribute " + event.getName() + " removed from the session");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(" Attribute " + event.getName() + " replaced in the session");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(
				" Session created at : " + new Timestamp(se.getSession().getCreationTime()).toGMTString());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(" Session with id = '" + se.getSession().getId() + "' destroyed ");
	}

}
