package com.skious.onlinestore.core;

import com.skious.onlinestore.core.menu.Menu;
import com.skious.onlinestore.core.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
