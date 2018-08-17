package com.example.sneakysneaks.objects;

import lombok.Data;

@Data
public class Sneaker {
	int product_number;
    String brand;
    String name;
    int size; 
    double price;
    
    public Sneaker(int product_number, String brand, String name, int size, double price) {
    	this.product_number=product_number;
    	this.brand=brand;
    	this.name=name;
    	this.size=size;
    	this.price=price;
    }

}
