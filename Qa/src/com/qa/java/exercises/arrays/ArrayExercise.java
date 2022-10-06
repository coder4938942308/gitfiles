package com.qa.java.exercises.arrays;


public class ArrayExercise {

	public static void main(String[] args) {
		
		
		int[] numbers = {1, 6, 2, 8, 3, 9, 15, 0};
		
		
		Product[] products = {
				new Product(001, "SAMSUNG TV 55 INCH", 499.99F, "Entertainment", 4.32F, 12.5F, true),
				new Product(002, "PLAYSTATION 5", 349.99F, "Gaming", 4.89F, 5.0F, true),
				new Product(003, "SOFA", 149.99F, "Furniture", 3.97F, 22.5F, false),
				new Product(004, "IPHONE", 329.99F, "Entertainment", 4.17F, 15.0F, true),
				new Product(005, "WALLET", 14.99F, "Accessory", 3.61F, 10.0F, false)
		};
		
		
		ArraysUtil util = new ArraysUtil();
		
		System.out.println(util.sumOfElements(numbers));
		System.out.println(util.smallestNum(numbers));
		System.out.println(util.biggestNum(numbers));
		
		System.out.println("--------");
		
		//CREATE A VARIABLE 'cheapestProduct' OF TYPE PRODUCT TO PRINT ITS NEWPRICE
		Product cheapestProduct;
		cheapestProduct = util.getProductWithLowestPrice(products);
		System.out.println("$" + cheapestProduct.newPrice());
		cheapestProduct.displayProductInfo();
		
		System.out.println("--------");
		
		/*
		 * OR I CAN AVOID CREATING A NEW VARIALBE, AND JUST PRINT IT THIS WAY BECAUSE METHOD PROVIDES THE PRODUCT
		 * System.out.println(util.getProductWithLowestPrice(products).newPrice());
		 * System.out.println(util.method(array).attribute/method());
		 */
		
		Product mostExpensiveProduct;
		mostExpensiveProduct = util.getProductWithHighestPrice(products);
		System.out.println("$" + mostExpensiveProduct.newPrice());
		mostExpensiveProduct.displayProductInfo();
		
		System.out.println("--------");
		
		Product highestRatedProduct = util.getProductWithHighestRating(products);
		System.out.println(highestRatedProduct.rating + "/5.00");
		highestRatedProduct.displayProductInfo();


	}
}
