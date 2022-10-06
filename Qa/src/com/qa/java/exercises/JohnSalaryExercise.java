package com.qa.java.exercises;

public class JohnSalaryExercise {

	public static void main(String[] args) {
		
		int salary;
		salary = 35000;
		System.out.println("Initial Salary: " + salary);
		
		float increment;
		increment = (float) (salary * 10.5 / 100);
		System.out.println("Salary increased by: " + increment);
		
		salary += increment;
		System.out.println("New salary: " + salary);
		
		// INITIAL PRICES
		float apple;
		apple = 3.25F;

		float chickenFillet;
		chickenFillet = 7.25F;

		float banana;
		banana = 1.25F;
		
		// ADJUSTED PRICES
		float newAppleValue;
		newAppleValue = apple - (apple * 10 / 100);
		//newAppleValue = apple * 0.9;
		System.out.println("Discounted apple price: " + newAppleValue);
		
		float newChickenFillet;
		newChickenFillet = chickenFillet - (chickenFillet * 8 / 100);
		System.out.println("Discounted chicken fillet price: " + newChickenFillet);
		
		float newBanana;
		newBanana = banana - (banana * 3 / 100);
		System.out.println("Discounted banana price: " + newBanana);

	}

}
