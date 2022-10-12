package com.qa.java.Exceptions;


public class Main {
	

	public static void main(String args[]) {
		Util Util = new Util();
	
		
		Product empty = null ;
		
		try {
			Util.div(1,0);
		} catch (ArithmeticException e){
			System.out.println("cannot be divided by 0");
		}
		
		
		
		Util.getProductDetails(empty);
		
		
		
		try {
			Util.getProductById(12);
		} catch (ProductNotFoundExeption e) {	
			System.out.println(e.getMessage());
		}

	
		
	}
	
	
}
