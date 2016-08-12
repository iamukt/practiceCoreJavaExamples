package factory;

import facade.Circle;
import facade.Rectangle;
import facade.Shape;

public class ShapeFactory 
{
	public Shape getShape(String name)
	{
		if(name.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(name.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else if(name.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else
			return null;
	}

}
