package cybage;

import singleton.SingletonClass;

public class TestHybris 
{
	public static void append(String just)
	{
		just = new String("Hi") ;
		System.out.println(just);
	}
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		append(s1);
		System.out.println(s1);
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
	}
}
