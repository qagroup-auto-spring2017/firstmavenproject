package com.qagroup.oop.modifiers;

import com.qagroup.oop.Animal;

public class AnimalDemo2 {

	public static void main(String[] args) {
		Animal animal = new Animal("Cat");
		//animal.packagePrivate();
		//animal.protectedMethod();
		animal.getName();
		//animal.privateMethod();
	}
}
