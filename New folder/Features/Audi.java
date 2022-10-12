package com.qa.java.oop.features;

public class Audi extends Car {

	String model;
	Boolean isAvailable;


	public Audi(int id, String name, float price, String engineCC, String fuelType, int manifacturingYear, String model,
			Boolean isAvailable) {
		super(id, name, price, engineCC, fuelType, manifacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}

	public void displayCar() {
		System.out.println("car id: "+id);
		System.out.println("car name: "+name);
		System.out.println("car price: " + price);
		System.out.println("engine????? : " +engineCC);
		System.out.println("fuel type: " + fuelType);
		System.out.println("year of manifacture: "+ manifacturingYear);
		System.out.println("exact model: "+this.model);
		System.out.println("Available: "+ this.isAvailable);

	}








}
