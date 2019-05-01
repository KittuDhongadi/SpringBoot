package testing;

class clone1 implements Cloneable
{
	String name;
	int no;
	
	clone1(String name , int no)
	{
		this.name=name;
		this.no=no;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class Clone_Usage {
	public static void main(String args[])
	{try {
		clone1 c1 = new clone1("Kishan",1);
		
			clone1 c2 =(clone1)c1.clone();
		
		
		System.out.println(c2.name);
		
	} 
		catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
