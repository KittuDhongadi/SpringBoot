package test1;

interface Drawable
{
	public void draw();
}

public class Drawable_with {
	public static void main(String args[])
	{
		int width = 10;
		
		Drawable d1 = ()->{System.out.println("Drawing :"+width);};
		d1.draw();
		
	}

}
