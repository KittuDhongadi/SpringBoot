package testing;


abstract class A
{
	abstract void callme();
	
	void callmeTo()
	{
		System.out.println("This is concrete method");
	}
}

class B extends A
{
	void callme()
	{
		System.out.println("B's implementation");
	}
}

public class Abstract{
	public static void main(String args[])
	{
		B b = new B();
		b.callme();
		b.callmeTo();
	}


}
