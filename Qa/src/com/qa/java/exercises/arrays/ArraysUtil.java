package com.qa.java.exercises.arrays;

public class ArraysUtil {

	// RETURN THE SUM OF ALL ELEMENTS IN THE GIVEN ARRAY
	int sumOfElements(int[] numbers) {
		int total = 0;

		// FOR EACH METHOD
		for (int number : numbers) {
			total += number;
		}

		return total;
	}

	// RETURNS THE SMALLEST VALUE IN THE GIVEN ARRAY
	int smallestNum(int[] numbers) {
		int smallest = numbers[0];

		// FOR EACH METHOD
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}

		return smallest;
	}

	// RETURNS THE BIGGEST VALUE IN THE GIVEN ARRAY
	int biggestNum(int[] numbers) {
		int biggest = numbers[0];

		// FOR EACH METHOD
		for (int number : numbers) {
			if (number > biggest) {
				biggest = number;
			}
		}

		return biggest;
	}

	Product getProductWithLowestPrice(Product[] products) {
		Product finalProduct = products[0];
		float lowestPrice = products[0].newPrice();

		for (Product p : products) {
			if (p.newPrice() <= lowestPrice) {
				finalProduct = p;
				lowestPrice = p.newPrice();
			}
		}

		return finalProduct;
	}

	Product getProductWithHighestPrice(Product[] products) {
		Product finalProduct = products[0];
		float highestPrice = products[0].newPrice();

		for (Product p : products) {
			if (p.newPrice() >= highestPrice) {
				finalProduct = p;
				highestPrice = p.newPrice();
			}
		}

		return finalProduct;
	}

	Product getProductWithHighestRating(Product[] products) {
		Product finalProduct = products[0];
		float highestRating = products[0].rating;

		for (Product p : products) {
			if (p.rating >= highestRating) {
				finalProduct = p;
				highestRating = p.rating;
			}
		}

		return finalProduct;
	}

}
