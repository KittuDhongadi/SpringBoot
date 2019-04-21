package Cloning_Object;

class rotate
{
	int b[] = new int[8];
	public void Rotate(int ar[],int i)
	{
		for(int j=0;j<2;j++)
		{
			int first = ar[j];
			for(int k=0;k<7;k++)
			{
				b[k]=ar[k+1];
			}
		}
	}

	public void print() {
		for(int i=0;i<7;i++)
		{
			System.out.println(b[i]);
		}
	}
}
public class Rotate_Array {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7};
		
		
	rotate r = new rotate();
	r.Rotate(a,2);
	
	r.print();
	}
}
