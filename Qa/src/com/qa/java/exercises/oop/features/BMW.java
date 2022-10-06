package com.qa.java.exercises.oop.features;

public class BMW extends Car {

	int noOfCylinders;
	int maxTorque;
	
	
	public BMW(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear,
			   int noOfCylinders, int maxTorque) {
		
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}


	void getBMWInfo() {
		getCarInfo();
		System.out.println("Number of cylinders: " + noOfCylinders);
		System.out.println("Max torque produced: " + maxTorque);
	}
}
