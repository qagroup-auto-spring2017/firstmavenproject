package com.qagroup;

public class Car {
	
	public static int counter = 0;

	// Fields
	private String color;
	
	private String make;
	
	private String model;
	
	// Constructor
	public Car(String color, String make, String model) {
		this.color = color;
		this.make = make;
		this.model = model;
		counter++;
	}
	
	// Methods
	public String getColor() {
		return this.color;
	}
	
	public void changeColor(String newColor) {
		this.color = newColor;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public static int getCounter() {
		return counter;
	}
	
}
