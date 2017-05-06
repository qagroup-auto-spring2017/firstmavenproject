package com.qagroup;

public class Car {

	// Fields
	private String color;
	
	private String make;
	
	private String model;
	
	// Constructor
	public Car(String color, String make, String model) {
		this.color = "Black";
		this.make = make;
		this.model = model;
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
	
}
