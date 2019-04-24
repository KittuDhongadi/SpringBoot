package testing;
abstract class a1
{
	public void run1()
	{
		System.out.println("Inside Abstract Method");
	}
	abstract void eat1();
	{
		System.out.println("Inside Abstract");
	}
}

class b11 extends a1
{
	void eat1() {
		System.out.println("Inside b11");
	}
}

public class Abstract_Class {
	public static void main(String args[])
	{
		a1 a = new b11();
		a.eat1();
		
	}

}
