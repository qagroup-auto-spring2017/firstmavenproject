package com.qagroup.oop.modifiers;

import com.qagroup.oop.Animal;

public class Cat extends Animal {

	public Cat() {
		super("Cat");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		//cat.packagePrivate();
		cat.protectedMethod();
	}
}
