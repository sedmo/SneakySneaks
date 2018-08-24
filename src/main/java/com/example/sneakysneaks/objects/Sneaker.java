package com.example.sneakysneaks.objects;

//import lombok.Data;


public class Sneaker {
	private int product_number;
	private String brand;
	private String name;
	private int size; 
	private double price;
    
    public Sneaker(int product_number, String brand, String name, int size, double price) {
    	this.setProduct_number(product_number);
    	this.setBrand(brand);
    	this.setName(name);
    	this.setSize(size);
    	this.setPrice(price);
    }

	public int getProduct_number() {
		return product_number;
	}

	public void setProduct_number(int product_number) {
		this.product_number = product_number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    

}
