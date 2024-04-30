package n1exercici1.utils;

public class Validations {
	
	public static boolean isValidOption(String option) {
		return option.matches("^[0-3]{1}$");
	}
	
	public static boolean isValidCommandName(String productName) {
		return productName.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ\\s]+$");
	}
}
