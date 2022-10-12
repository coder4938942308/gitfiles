package com.qa.java.oop.features;

public abstract class Car {
	int id;
	String name;
	float price;
	String engineCC;
	String fuelType;
	int manifacturingYear;


	public Car(int id, String name, float price, String engineCC, String fuelType, int manifacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manifacturingYear = manifacturingYear;
	}

	public abstract void displayCar();
		

}
