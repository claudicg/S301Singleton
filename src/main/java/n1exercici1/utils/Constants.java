package n1exercici1.utils;

public class Constants {
	
	public class Files {
		public static final String PATH = "src/main/resources/";
		public static final String COMMANDS = "commands";
		public static final String HISTORY = "history";
	}
	
	public class Messages {
		public static final String MAIN_MENU = "\n\n1. - Enter a new command."
												+ "\n2. - Delete last command."
												+ "\n3. - List History."
												+ "\n0. - Exit.\n\n";
		public static final String EXIT = "Command input is now shut down.";
		public static final String INVALID_MENU_OPTION = "Invalid option. Try again.";
		public static final String ENTRY_COMMAND = "Entry a valid command";
		public static final String INVALID_COMMAND = "Invalid command.";
		public static final String ELEMENT_OOB = "The element is out of bounds.";
		public static final String EMPTY_COMMAND_LIST = "The are no previous saved commands.";
		public static final String UNDO = "The last command was removed.";
		public static final String UNDO_TXT = "The last command was removed history command txt.";
	}
}
