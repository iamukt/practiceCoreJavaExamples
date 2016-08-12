package factory;

import facade.Shape;

public class Triangle implements Shape
{
	@Override
	public void printNameOfTheShape() 
	{
		System.out.println("Triangle");
	}
}
