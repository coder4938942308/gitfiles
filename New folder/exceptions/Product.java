package com.qa.java.Exceptions;

public class Product {
        
        int id;
        String name;
        float price;
        String category;
        byte rating;
        float discountPercentage;
        boolean isAvailable;
        
        final static String SellerName = "Mario";
        final static String Phone = "031312312313";
        final static String Email = "Mario@plumber.com";

        
        //No Constructor
        
        Product(){
            id= 25;
            name= "pr1";
            price= 40.0f;
            category= "Toys";
            rating= 5;
            discountPercentage= 12.5f;
            isAvailable= true;
        }
            
        //constructor
            
            public Product(int id, String name, float price, String category,
            byte rating, float discountPercentage, boolean isAvailable) {
                
            System.out.println("product(...) arg constructor is invoked...");
            this.id = id;
            this.name = name;
            this.price = price;
            this.category = category;
            this.rating = rating;
            this.discountPercentage = discountPercentage;
            this.isAvailable = isAvailable;
            
            
            }
            

            
            
            public static void main(String args[]) {
            	   
                Product fish = new Product(1,"tuna",12.0f,"fish",(byte) 3.1f, 0.1f, true );
                
                fish.non_arg_setPrice();
                System.out.println(fish.price);
                fish.arg_setPrice(21.1f);
                System.out.println(fish.price);
                fish.getInformation();
                System.out.println("discounted price is : £" + String.format("%.2f",fish.getDiscountedPrice())+  "\n" );
                fish.sellerContactDetails();

            
            }
            
    
            
            public void non_arg_setPrice() {
            	
            	this.price = 20;
            	
            }
            
            public void arg_setPrice(float value) {
            	
            	this.price = value;
            	
            }
            
            public void getInformation() {
            	System.out.println( "\n"+ "information about product" + "\n");
            	System.out.println("id: " + this.id);
            	System.out.println("name: " + this.name);
            	System.out.println("price: £" + this.price);
            	System.out.println("catergory: "+this.category);
            	System.out.println("rating: "+this.rating);
            	System.out.println("discout is: " + this.discountPercentage);
            	System.out.println("Availability: "+ this.isAvailable +"\n");
    	
            	
            }
            
            public float getDiscountedPrice() {
            	
            	return (this.price - (this.price*this.discountPercentage));
            	
            }
           
            public float getDiscount() {
            	
            	return  (this.price*this.discountPercentage);
            	
            }
            
            public void sellerContactDetails() {
            	System.out.println("the seller: "+ this.SellerName +"\n"+ "the contanct number: "+ this.Phone+ "\n"+ "the seller email: "+this.Email);
            	
            }
            
            
}