package com.qa.java.exercises.oop.features;

public class Car {
	
	int id;
	String name;
	float price;
	int engineCC;
	String fuelType;
	int manufacturingYear;
	

	public Car(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}
	
	void getCarInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("Engine Cubic Capacity: " + engineCC);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Manufacted in year: " + manufacturingYear);
		
	}
	
	

}
