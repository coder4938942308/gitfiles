package com.qa.java.exercises.oop;

public class Product {
	
	int id;
	String name;
	float price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;
	
	static final String SELLERNAME = "Geron";
	static final long CONTACTNO = 7501529591L;
	static final String EMAILADDRESS = "geron12@hotmail.co.uk";
	
	//NO ARGUMENT CONSTRUCTOR
	//DEFAULT VALUES
	Product(){
		id = 100;
		name = "Water Bottle";
		price = 9.99F;
		category = "Outdoor";
		rating = 3.50F;
		discountPercentage = 20.0F;
		isAvailable = true;
		
	}
	
	//ARGUMENT CONTSTRUCTOR
	public Product(int id, String name, float price, String category, float rating, float discountPercentage, boolean isAvailable){
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	//METHOD DISPLAYING THE PRODUCT'S INFO
	void displayProductInfo() {
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating + "/5.00");
		System.out.println("Discount Percentage: " + discountPercentage + "%");
		System.out.println("Available? " + isAvailable);
		
	}
	
	//METHOD RETURNING THE VALUE OF THE DISCOUNTED PRICE
	float discountedValue() {
		return (price * discountPercentage / 100);
	}
	
	//METHOD RETURNING THE NEW TOTAL PRICE
	float newPrice() {
		return (price - discountedValue());
	}
	
	static void sellerInfo() {
		System.out.println("SELLER NAME: " + SELLERNAME);
		System.out.println("CONTACT NUMBER: 0" + CONTACTNO);
		System.out.println("EMAIL ADDRESS: " + EMAILADDRESS);
	}
}
