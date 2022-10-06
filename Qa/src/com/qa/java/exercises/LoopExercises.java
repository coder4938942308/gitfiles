package com.qa.java.exercises;

public class LoopExercises {

	public static void main(String[] args) {
		
		System.out.println(LoopExercises.summedDigits(5471));
		System.out.println(LoopExercises.reversed(6969));
	}
	
	//SUMS THE DIGITS OF A GIVEN NUMBER
	static int summedDigits(int num) {
			
		// GIVEN A NUMBER, CALUCLATE THE SUM OF ITS DIGITS
		// EG. 1234 -> 10, 5681 -> 20
						
		int number;
		number = num;
		int total;
		total = 0;
		int placeholder;
		
		System.out.println("Number: " + num);
							
		while (number > 0) {
		placeholder = number % 10;
		total += placeholder;
		number /= 10;
			
		}
		System.out.print("The sum of the digits given are: ");	
		
		return total;
	}
	
	//REVERSES A GIVEN NUMBER
	static int reversed(int num) {
		
		//GIVEN A NUMBER, PRINT THE REVERSE NUMBER
		//1234 -> 4321			
		//1234 -> 4 -> 43 -> 432 -> 4321
		//879 -> 987 -> 978
						
		int newNumber;
		newNumber = num;	
		int reversed;
		reversed = 0;
						
		System.out.println("Number: " + num);
		
		while (newNumber > 0){
		int digit = newNumber % 10;
		
		reversed = reversed * 10 + digit;
		newNumber /= 10;
		}
		
		System.out.print("Your number reversed is: ");
				
		return reversed;
	}

}


