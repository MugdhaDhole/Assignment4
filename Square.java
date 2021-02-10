package com.shape;

public class Square implements Polygon {
	float side = 4;

	@Override
	public void calcArea() {
		float area = side * side;
		System.out.println("Area of Square with side "+side+" = "+area);
	}

	@Override
	public void calcPeri() {
		float perimeter = 4 * side;
		System.out.println("Perimeter of Square with side "+side+" = "+perimeter);
	}

}
