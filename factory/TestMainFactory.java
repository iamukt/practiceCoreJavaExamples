package factory;

import facade.Shape;

public class TestMainFactory 
{
	
	public static void main(String[] args) 
	{
		ShapeFactory sf = new ShapeFactory();
		//Circle object 
		Shape circle = sf.getShape("circle");
		Shape triangle = sf.getShape("triangle");
		Shape rectangle = sf.getShape("rectangle");
		circle.printNameOfTheShape();
		triangle.printNameOfTheShape();
		rectangle.printNameOfTheShape();
	}
}
