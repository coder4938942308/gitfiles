package com.qa.java.exercises.oop.features;

public class Main {

	public static void main(String[] args) {
		
		//PARAMETERS: int id, String name, float price, float engineCC, String fuelType, int manufacturingYear, String model, boolean isAvailable
		Audi audi1 = new Audi(001, "Audi", 128000.0F, 1390, "Gasoline", 2019, "R8", true);
		
		audi1.getAudiDetails();
		
		System.out.println("-----");
		
		//PARAMETERS: int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, int noOfCylinders, int maxTorque
		BMW bmw1 = new BMW(001, "BMW", 51999.99F, 1390, "Gasoline", 2012, 4, 500);
		
		bmw1.getBMWInfo();

	}

}
