package testing;

class test
{
	int i,j;
	public void math(int i, int j) {
	i*=2;
	j*=2;
	}
}

public class passByValue {
	public static void main(String args[])
	{
		int a=10;
		int b=10;
		test t = new test();
		System.out.println(a+" "+" "+b);
		t.math(a,b);
		System.out.println(a+" "+" "+b);
	}

}
