package com.qa.java.exercises.strings;

public class StringExercises {

	public static void main(String[] args) {
		
		String str1 = new String("Hello how are you today");
		
		System.out.println(StringUtil.wordCounter(str1));
		
		String[] emails = {
				
				"abc_gmail.com",
				"abcd*()@gmail.com",
				"abcd@gmail.com",
				"test_123@gmail.com",
				"1234@#$@gmail.com",
				
		};
		
		
		System.out.println(StringUtil.numOfInvalidEmails(emails));
		System.out.println(StringUtil.numOfValidEmails(emails));
		
		System.out.println("Valid Emails: ");
		StringUtil.validEmails(emails);
		System.out.println("--------");
		System.out.println("Invalid Emails: ");
		StringUtil.invalidEmails(emails);
		
	}


}
