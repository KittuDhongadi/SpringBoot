package test1;

interface No_Parameter_interface
{
	public String print();
}

public class No_Parameter {
	public static void main(String args[])
	{
		No_Parameter_interface i1= ()->{return "Hello";};
		System.out.println(i1.print());
	}

}
