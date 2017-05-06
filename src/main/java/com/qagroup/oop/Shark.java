package com.qagroup.oop;

public class Shark extends Animal  implements CanMove {

	public Shark() {
		super("Shark");
	}

	@Override
	public void move() {
		System.out.println(toString() + " is swimming!");
	}
}
