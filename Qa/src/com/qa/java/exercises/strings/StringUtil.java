package com.qa.java.exercises.strings;

public class StringUtil {
	
	
	static int wordCounter(String word) {
		
		return word.split(" ").length; //.split returns an array, so using .length will give us a count of each word in the array
		
	}
	
	
	static int numOfInvalidEmails(String[] emails) {
		int count = 0;
		
		for (String email : emails) {
			if (email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				
			}
			else {
				count++;
			}
			
		}
		
		return count;
	}
	
	static int numOfValidEmails(String[] emails) {
		int count = 0;
		
		for (String email : emails) {
			if (email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				count++;
			}
			else {
			}
			
		}
		
		return count;
	}
	
	static void validEmails(String[] emails) {
		String validEmail = "";
		
		for (String email : emails) {
			
			if (email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				validEmail = email;
				System.out.println(validEmail);
			}
			
			else {
			}
		}
	}
	
	static void invalidEmails(String[] emails) {
		String invalidEmail = "";
		
		for (String email : emails) {
			
			if (email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {	
			}
			
			else {
				invalidEmail = email;
				System.out.println(invalidEmail);
			}
		}
	}
	
	

}
