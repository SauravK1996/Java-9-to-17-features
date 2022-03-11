package com.example.switchExpressions;

public class SwitchExpressions {

	public static void main(String[] args) {

//		oldSwitchExpressions("apple");

		newSwitchExpressions("apple");

	}

	private static void oldSwitchExpressions(String fruits) {
		switch (fruits) {
		case "apple":
			System.out.println("APPLE");
//			break;
		case "mango":
			System.out.println("MANGO");
			break;
		case "guava":
			System.out.println("GUAVA");
			break;

		default:
			System.out.println("Fruits not listed");
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	private static void newSwitchExpressions(String fruits) {
		switch (fruits) {
		case "apple" -> System.out.println("APPLE");
		case "mango" -> System.out.println("MANGO");
		case "guava" -> System.out.println("GUAVA");

		default -> System.out.println("Fruits not listed");
		}

	}

}
