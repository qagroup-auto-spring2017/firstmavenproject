package com.qagroup.oop;

public class Dog extends Animal implements CanEat, CanMove {

	private int age;
	
	public Dog() {
		super("Dog");
		this.age = 0;
	}
	
	public Dog(int age) {
		super("Dog");
		this.age = age;
	}
	
	public void bark() {
		System.out.println(toString() + " barks");
	}
	
	@Override
	public void move() {
		System.out.println(toString() + " is running!");
	}
	
	public void move(String whereOrHow) {
		System.out.println(toString() + " is running " + whereOrHow);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void becomeOlder() {
		this.age++;
	}
	
	@Override
	public void eat(String food) {
		System.out.println(toString()+ " is eating " + food);
	}
}
