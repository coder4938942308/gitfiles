package com.qa.java.exercises.oop.features;

public class Audi extends Car {

	String model;
	boolean isAvailable;
	
	
	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, 
				String model, boolean isAvailable) {
		
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}

	
	void getAudiDetails() {
		getCarInfo();
		System.out.println("Model: " + model);
		System.out.println("Available: " + isAvailable);
		
	}
	
	
	
}
