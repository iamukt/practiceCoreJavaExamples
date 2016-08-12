package singleton;

public class SingletonClass {
	private static SingletonClass singleton=null;
	private int a;
	private int b;

	private SingletonClass() {
		
	}

	public static SingletonClass getInstance() {
		if(singleton == null)
		{	
			singleton = new SingletonClass();
			singleton.setA(5);
			singleton.setB(6);
			return singleton;
		}
		else
			return singleton;
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
