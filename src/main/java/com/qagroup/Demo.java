package com.qagroup;

public class Demo {

	public static void main(String[] args) {
		String priceText = "0.77$".replaceAll("\\$", "");
		double price = Double.parseDouble(priceText);
		
		System.out.println(price);
	}
}
