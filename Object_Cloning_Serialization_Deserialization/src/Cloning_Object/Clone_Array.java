package Cloning_Object;

public class Clone_Array {
	public static void main(String args[])
	{
		int a[]= {1,2,3};
		
		int b[]=a.clone();
		
		System.out.println(a==b);
		System.out.println(a[0]==b[0]);
		
	}

}
