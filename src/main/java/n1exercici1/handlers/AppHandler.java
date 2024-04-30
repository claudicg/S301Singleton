package n1exercici1.handlers;

import java.util.Scanner;

import n1exercici1.utils.Validations;

public class AppHandler {

	private static Scanner scanner;
	
	public AppHandler() {
		super();
		AppHandler.scanner = new Scanner(System.in);
	}
	
	public void runApp() {
		
		String menuOption = "";
		
		do {
			
			System.out.println(MenuHandler.getMenu());
			
			menuOption = readConsoleInput().trim();
			
			boolean validInput = Validations.isValidOption(menuOption);
			if(validInput) {
				processOption(menuOption);
			} else {
				System.out.println(MenuHandler.getInvalidMenuOptionMessage());
			}
			
		} while(!menuOption.equalsIgnoreCase("0"));

		closeConsoleInput();
		
	}
	
	public static String readConsoleInput() {
		return scanner.nextLine();
	}
	
	private void closeConsoleInput() {
		scanner.close();
	}
	
	private void processOption(String menuOption) {
		
		switch(menuOption) {
		case "1": 
			Undo.addCommand();
			break;
		case "2":
			System.out.println(Undo.undo());
			break;
		case "3":
			Undo.listHistory();
			break;
		case "0":
			System.out.println(MenuHandler.getExitMessage());
			break;
		default:
			break;
		}
	}
	
}
