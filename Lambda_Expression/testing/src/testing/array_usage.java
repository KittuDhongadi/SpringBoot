package testing;

public class array_usage {
	public static void main(String args[])
	{
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = {1,2,3,4,5};
		System.out.println(b.length);
	}

}
