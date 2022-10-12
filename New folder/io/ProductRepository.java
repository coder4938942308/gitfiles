package com.qa.java.IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class ProductRepository {




	public Product[] readProduct(String filePath) {
		Product[] prodlist = new Product[3];

		try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
			String prodData = br.readLine();
			prodData = br.readLine();
			int indexer = 0;


			while (prodData != null) {
				String[] prodInfo = prodData.split(",");
				String name = prodInfo[0];
				float price = Float.parseFloat(prodInfo[1]);
				int stock = Integer.parseInt(prodInfo[2]);
				boolean availability = Boolean.parseBoolean(prodInfo[3]);

				Product product = new Product();
				product.setName(name)
				.setPrice(price)
				.setStock(stock)
				.setAvailable(availability);

				prodlist[indexer] = product;
				indexer++;
				prodData = br.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return prodlist;
	}
}



