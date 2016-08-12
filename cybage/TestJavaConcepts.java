package cybage;



public class TestJavaConcepts {

	public static void main(String[] args) {
		int a=5;
		System.out.println(test());
		a=++a;
		System.out.println("Value of a: "+a);
	}

	public static int test()
	{
		try
		{
		 System.out.println("Hi");
		 return 5;
		}
		finally
		{
			System.out.println("Bye");
		}
	}
}
