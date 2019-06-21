package testing;

/*class call_by_value{  
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
	 call_by_value op=new call_by_value();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
  
 }  
}*/

class call_by_value
{
	int data=50;
	
	void change(call_by_value op)
	{
		op.data=op.data+100;
	}
	public static void main(String args[])
	{
		call_by_value c1 = new call_by_value();
		
		System.out.println("Before change : "+c1.data);
		c1.change(c1);
		System.out.println("Before change : "+c1.data);
}
}