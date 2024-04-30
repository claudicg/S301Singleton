package n1exercici1.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import n1exercici1.singletons.HistorySingleton;
import n1exercici1.utils.Constants;
import n1exercici1.utils.Validations;


public class Undo {

	private static Logger logger = LoggerFactory.getLogger(Undo.class);
	
	private static String askCommand() {
		
		String command = "";
		
		do {
			
			System.out.println(MenuHandler.getEnterValidCommand());
			command = AppHandler.readConsoleInput().trim();
			
		} while(!Validations.isValidCommandName(command));
		
		
		return command;
	}
	
	public static String addCommand() {
		
		String command = askCommand();
		logger.info("Undo :: addCommand :: New command added.");
		
		HistorySingleton.getHistorySingleton().getHistory().add(command);
		return "The command has added successly.";		
	}
	
	public static String undo() {
		
		logger.info("Undo :: addCommand :: Method delete last command.");
		
		if(HistorySingleton.getHistorySingleton().getHistory().isEmpty()) {
			return Constants.Messages.EMPTY_COMMAND_LIST;
		} else {
			HistorySingleton.getHistorySingleton().getHistory().removeLast();
			return Constants.Messages.UNDO;
		}
	}
	
	public static void listHistory() {
		
		HistorySingleton.getHistorySingleton().getHistory()
						.forEach(command -> System.out.println( command));
		logger.info("Undo :: listHistoty :: History was printed.");
	}
	
	
}
