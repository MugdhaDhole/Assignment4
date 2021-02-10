package com.shape;

public class Rectangle implements Polygon {
	float length = 20;
	float breadth = 10;

	@Override
	public void calcArea() {
		float area = length * breadth;
		System.out.println("Area of Square with length : "+length+" and breadth : "+breadth+" = "+area);
	}

	@Override
	public void calcPeri() {
		float perimeter=2*(length+breadth);
		System.out.println("Perimeter of Square with length : "+length+" and breadth : "+breadth+" = "+perimeter);
	}

}
