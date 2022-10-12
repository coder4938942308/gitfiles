package com.qa.java.oop.features;

public class BMW extends Car{

	int noOfCylinders;
	int maxTorque;


	public BMW(int id, String name, float price, String engineCC, String fuelType, int manifacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manifacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}

	public void displayCar() {
		System.out.println("car id: "+id);
		System.out.println("car name: "+name);
		System.out.println("car price: " + price);
		System.out.println("engine????? : " +engineCC);
		System.out.println("fuel type: " + fuelType);
		System.out.println("year of manifacture: "+ manifacturingYear);
		System.out.println("Cylinders: "+this.noOfCylinders);
		System.out.println("Torque: "+ this.maxTorque);
	}


}
