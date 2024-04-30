package n1exercici1.handlers;

import n1exercici1.utils.Constants;

public class MenuHandler {
	
	public static String getMenu() {
		return Constants.Messages.MAIN_MENU;
	}
	
	public static String getExitMessage() {	
		return Constants.Messages.EXIT;
	}
	
	public static String getInvalidMenuOptionMessage() {	
		return Constants.Messages.INVALID_MENU_OPTION;
	}
	
	public static String getEnterValidCommand() {
		return Constants.Messages.ENTRY_COMMAND;
	}

}
