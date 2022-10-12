package com.qa.java.Collection;
import java.io.File;
import java.util.*;

public class ProductService {




	public static void main(String args[]) {

		Product fish = new Product();
		
		ProductRepository rep = new ProductRepository();
		
		String path = "C://fish.csv";
		ArrayList<Product> productList = rep.readProduct(path);
		
		for(Product product : productList) {
			System.out.println(product);
		}

	}

	