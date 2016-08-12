package facade;

public class FacadeShape 
{
	private Shape circle;
	private Shape rectangle;
	public FacadeShape() 
	{
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void Circle()
	{
		circle.printNameOfTheShape();
	}
	
	public void Rectangle()
	{
		rectangle.printNameOfTheShape();
	}

}
