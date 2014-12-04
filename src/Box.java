
public abstract class Box extends Luggage
	{
	public Box(double w, String s) 
		{
		super(w, s);		
		}
	
	public void weighs()
		{
		System.out.println("The box weighs " + weight + " kgs.");
		}

	public void size()
		{
		System.out.println("The box is " + size + ".");
		}
	}
