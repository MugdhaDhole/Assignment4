package com.test;

import com.shape.*; //Importing package

public class Calculate {

	public static void main(String[] args) {
		Square square = new Square();
		square.calcArea(); // Method calls
		square.calcPeri();

		Rectangle rectangle = new Rectangle();
		rectangle.calcArea(); // Method calls
		rectangle.calcPeri();

	}

}
