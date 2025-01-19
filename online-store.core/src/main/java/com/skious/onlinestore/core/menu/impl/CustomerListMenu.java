package com.skious.onlinestore.core.menu.impl;

import java.util.List;
import java.util.ResourceBundle;

import com.skious.onlinestore.core.configs.ApplicationContext;
import com.skious.onlinestore.core.menu.Menu;
import com.skious.onlinestore.core.services.UserManagementService;
import com.skious.onlinestore.core.services.impl.MySqlUserManagementService;
import com.skious.onlinestore.persistence.enteties.User;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	private ResourceBundle rb;
	
	{
		userManagementService = new MySqlUserManagementService();
		context = ApplicationContext.getInstance();
		rb = ResourceBundle.getBundle(RESOURCE_BUNDLE_BASE_NAME);
	}
	
	@Override
	public void start() {
		printMenuHeader();
		List<User> users = userManagementService.getUsers();
		
		if (users == null || users.size() == 0) {
			System.out.println(rb.getString("no.users.msg"));
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println(rb.getString("customer.list.header"));		
	}

}
