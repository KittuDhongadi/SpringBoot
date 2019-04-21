package testing;


abstract class figure
{
	int dim1;
	int dim2;
	
	figure(int a,int b)
	{
		dim1=a;
		dim2=b;
	}
	abstract int area();
}

class Rectangle extends figure
{
	Rectangle(int a,int b)
	{
		super(a,b);
	}
	
	int area()
	{
		System.out.println("Inside Rectangle");
		return dim1+dim2;
	}
}

class Triangle extends figure
{
	Triangle(int a,int b)
	{
		super(a,b);
	}
	
	int area()
	{
		System.out.println("Inside Triangle");
		return dim1+dim2;
	}
}
public class Abstract1 {
public static void main(String args[])
{
	Rectangle r = new Rectangle(1,2);
	System.out.println(r.area());
	
	Triangle t = new Triangle(2,3);
	System.out.println(t.area()
			);
}
}
