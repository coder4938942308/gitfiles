package com.qa.java.exercises.oop;

public class ProductExercise {

	public static void main(String[] args) {
		
		//CREATING OBJECTS OF TYPE PRODUCT
		Product p1;
		p1 = new Product(001, "SAMSUNG TV 55 INCH", 499.99F, "Entertainment", 4.32F, 12.5F, true); 
		
		Product p2;
		p2 = new Product(002, "PLAYSTATION 5", 349.99F, "Gaming", 4.89F, 5.0F, true);
		
		Product p3;
		p3 = new Product(003, "SOFA", 149.99F, "Furniture", 3.97F, 22.5F, false);
		
		Product p4;
		p4 = new Product();
		
		//DISPLAYS THE NAME, CONTACT NO. AND EMAIL ADDRESS OF THE SELLER
		Product.sellerInfo();
		
		System.out.println("----------");
		
		//DISPLAYS PRODUCT ONE'S INFO, DISCOUNTED VALUE AND NEW VALUE
		p1.displayProductInfo();
		System.out.println("Discount amount: $" + p1.discountedValue());
		System.out.println("New value: $" + p1.newPrice());

		System.out.println("----------");
		

		//DISPLAYS PRODUCT TWO'S INFO, DISCOUNTED VALUE AND NEW VALUE
		p2.displayProductInfo();
		System.out.println("Discount amount: $" + p2.discountedValue());
		System.out.println("New value: $" + p2.newPrice());

		System.out.println("----------");
		

		//DISPLAYS PRODUCT THREE'S INFO, DISCOUNTED VALUE AND NEW VALUE
		p3.displayProductInfo();
		System.out.println("Discount amount: $" + p3.discountedValue());
		System.out.println("New value: $" + p3.newPrice());
		
		
		System.out.println("----------");
		
		//DISPLAYS PRODUCT FOUR'S INFO, DISCOUNTED VALUE AND NEW VALUE
		p4.displayProductInfo();
		System.out.println("Discount amount: $" + p4.discountedValue());
		System.out.println("New value: $" + p4.newPrice());
		
	}

}
