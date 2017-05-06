package com.qagroup.oop;

public class Duck extends Animal implements CanMove {

	public Duck() {
		super("Duck");
	}

	@Override
	public void move() {
		System.out.println(toString() + " is flying!");
	}
}
