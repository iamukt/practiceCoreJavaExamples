package cybage;

public class TestConcepts 
{
	final int tempVariable;
	static int staticTempVariable;
	public TestConcepts() 
	{
		tempVariable = 20;
	}
	public TestConcepts(int a)
	{
		tempVariable = a;
	}
	public static void main(String[] args) 
	{
		System.out.println("Static temp variable: "+staticTempVariable);
		System.out.println("Non static temp varible: "+new TestConcepts().tempVariable);
		new TestConcepts().normalFunction();
	}
	public void normalFunction()
	{
		int tempVariableInsideFunction=6;
		System.out.println("Temporary varible inside function: "+tempVariableInsideFunction);
	}
}
