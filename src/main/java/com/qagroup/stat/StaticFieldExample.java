package com.qagroup.stat;

import com.qagroup.Car;

public class StaticFieldExample {

	public static void main(String[] args) {
		Car car1 = new Car("Black", "Mercedes", "");
		Car car2 = new Car("White", "BMW", "s");
		Car car3 = new Car("Red", "Subaru", "s");
		
		System.out.println(car1.getCounter());
		System.out.println(car2.getCounter());
		System.out.println(car3.getCounter());
		
		System.out.println(Car.counter);
		System.out.println(Car.getCounter());
		
		Car.counter = 100500;
		
		System.out.println(car2.getCounter());
		System.out.println(car3.getCounter());
		
		car1.changeColor("Light Blue");
		System.out.println(car1.getColor());
		System.out.println(car2.getColor());
		
		car1.counter = -25;
		System.out.println(car1.getCounter());
		System.out.println(car2.getCounter());
	}
}
