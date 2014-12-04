
public abstract class Bag extends Luggage
	{	
	public Bag(double w, String s) 
		{
		super(w, s);		
		}
	
	public void weighs()
		{
		System.out.println("The bag weighs " + weight + " kgs.");
		}

	public void size()
		{
		System.out.println("The bag is " + size + ".");
		}
	}
