package testing;

class kishan
{
	int sup=1;
	
	kishan()
	{
		System.out.println("Super Class COnstructor");
	}
	
	{
		System.out.println("Instance Block in Super class");
	}
	
	static
	{
		System.out.println("Static block of Super class");
	}
	
	void sup_method()
	{
		System.out.println("Super class");
	}
	
	void private1()
	{
		System.out.println("Invoked usinng Super keyword");
	}
}

class kittu extends kishan
{
	{
		System.out.println("Instance Block in Sub class");
	}
	static
	{
		System.out.println("Static block of Sub class");
	}
	void sup_method()
	{
		System.out.println("Sub Class"+sup);
	}
	kittu()
	{
	super();
	}
}
public class Super_Usage {
public static void main(String args[])
{
	kishan a = new kittu();
	a.sup_method();
}
}
