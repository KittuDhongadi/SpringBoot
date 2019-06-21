package testing;

public class toString_Usage {
	int rollno;
	String name;
	
	toString_Usage(int rollno,String Name)
	{
		this.rollno=rollno;
		this.name=Name;
	}
	
	/*public String toString()
	{
		return rollno+" "+name;
	}*/
	public static void main(String args[])
	{
		toString_Usage t1 = new toString_Usage(1,"Kishan");
		System.out.println(t1);
		
	}

}
