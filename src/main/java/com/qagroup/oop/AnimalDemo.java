package com.qagroup.oop;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {
	
	public static void main(String[] args) {
		Animal animal = new Animal("Cat");
		animal.packagePrivate();
		animal.protectedMethod();
		animal.getName();
		//animal.privateMethod();
	}

	public static void main5(String[] args) {
		// Approach 1
		// Animal dog = new Animal("Dog");
		//
		// System.out.println(dog);
		//
		// dog.move();
		//
		// Animal shark = new Animal("Shark");
		// shark.move();
		//
		// Animal duck = new Animal("Duck");
		// duck.move();

		// Approach 2
		// Dog dog2 = new Dog();
		// System.out.println(dog2);
		// dog2.move();
		// dog2.bark();
		//
		// Shark shark2 = new Shark();
		// shark2.move();
		//
		// Duck duck2 = new Duck();
		// duck2.move();

		// Approach 3
		// Animal someAnimal = new Dog();
		// someAnimal.move();
		//
		// someAnimal = new Duck();
		// someAnimal.move();
		//
		// someAnimal = new Shark();
		// someAnimal.move();

		// Example 4
		// Animal sharik = getSomeAnimal();
		// System.out.println(sharik.getName());
		// System.out.println(sharik.name);
		// sharik.name = "Snake";
		// sharik.move();
		//
		// Dog dog = new Dog();
		//
		// Animal animal = new Dog();
		//
		// Object object = new Dog();

//		 Dog dog = new Dog(3);
//		 System.out.println(dog.getAge());
//		
//		 Dog dogVariable1 = dog;
//		 System.out.println(dogVariable1.getAge());
//		
//		 dog.becomeOlder();
//		 System.out.println(dog.getAge());
//		
//		 // !!! ???
//		 System.out.println(dogVariable1.getAge());

//		int x = 3;
//		int y = x;
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
//
//		x++;
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);
		
//		String string1 = new String("Hello");
//		String string2 = string1.toUpperCase();
//		System.out.println(string1);
		
//		System.out.println(string1);
//		System.out.println(string2);
		
//		Dog dog5 = new Dog();
//		dog5.eat("Meat");
//		
//		CanEat someoneWhoCanEat = new Dog();
//		someoneWhoCanEat.eat("Duck");
		
		List<String> listOfString = new ArrayList<>();
		listOfString.add("Hello");
		listOfString.add(" ");
		listOfString.add("World");
		//listOfString.add(new Dog()); // no way!
		System.out.println(listOfString);
		
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(new Dog());
		listOfAnimals.add(new Shark());
		listOfAnimals.add(new Duck());
//		listOfAnimals.add("Hello"); // no way!
		System.out.println(listOfAnimals);
	}

	public static Animal getSomeAnimal() {
		return new Dog();
	}
}
