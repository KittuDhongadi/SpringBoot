package testing;

interface base
{
	public void run();
}

class Bike implements base
{
	public void run()
	{
		System.out.println("Superclass");
	}
}

class Bajaj extends Bike implements base
{
	public void run()
	{
		System.out.println("Subclass");
	}
}
public class Run_Time_Poly {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.run();
		Bike b1 = new Bajaj();
		b1.run();
	}
/*
 * example of up casting
 * but down casting not possible
 */
}
