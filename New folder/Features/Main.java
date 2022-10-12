package com.qa.java.oop.features;

public class Main {


	public static void main(String args[]) {

		Audi newAudi = new Audi(130, "Audi", 120000.12f, "Electric", "gas", 2022,"23x-ddd0",true);
		BMW newBMW = new BMW(130, "BMW", 120000.12f, "Electric", "Diesel", 2022,200,24);
		
		
		CarService.displayCar(newAudi);
		CarService.displayCar(newBMW);
		
	}

	
}
