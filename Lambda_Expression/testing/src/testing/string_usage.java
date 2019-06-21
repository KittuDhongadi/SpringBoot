package testing;

public class string_usage {
	public static void main(String args[])
	{
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = "AB";
		
		String s11 = new String("ABC");
		String s12 = new String("ABC");
		String s13 = new String("AB");
		
		//string literals
		/*System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));*/
		
		//string Objects
		/*System.out.println(s11==s12);
		System.out.println(s11.equals(s12));
		
		System.out.println(s11==s11);
		System.out.println(s11.equals(s11));*/
		
		//String literals vs Objects
		System.out.println(s1==s11);
		System.out.println(s1.equals(s11));
		System.out.println();
		
		System.out.println();
	
	}

}
