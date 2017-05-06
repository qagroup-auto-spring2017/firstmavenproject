package com.qagroup.oop;

public class Animal implements CanMove {

	// Field
	private String name;

	// Constructor
	public Animal(String name) {
		this.name = name;
	}

	// Method
	@Override
	public void move() {
		System.out.println(this.name + " is moving!");
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
