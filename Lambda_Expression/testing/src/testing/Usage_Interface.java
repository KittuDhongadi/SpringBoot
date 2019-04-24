package testing;

/*
 * Multiple inheritance can be achived only by interface
 * 
 * keyword used is "implements"
 * 
 * used to achieve abstraction
 */

interface intf
{
	public void run();
	public int a=1;
}

class intf1 implements intf
{
	public void run() {
		System.out.println("Inside super class after implementing intf"+a);
	}
}

class intf2 extends intf1
{
	public void run()
	{
		System.out.println("Inside sub class after implementing intf"+a);
	}
}

public class Usage_Interface {
	public static void main(String args[]) {
		intf i = new intf1();
		i.run();
	}

}
