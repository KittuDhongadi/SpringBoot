package test1;

interface parameter
{
	public String print(String say);
}
public class one_parameter {

	public static void main(String[] args) {
		
		/*parameter p1 = (say)->{return "Hello "+say;};
		System.out.println(p1.print("Kishan"));*/
		
		parameter p1 = new parameter() {
			
			@Override
			public String print(String say) {
				return "Hello " +say;
			}
		};
		System.out.println(p1.print("kishan"));
	}
}
