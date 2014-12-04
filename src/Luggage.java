
public abstract class Luggage 
	{
	static double weight;
	static String size;
	
	public Luggage(double w, String s)
		{
		weight = w;
		size = s;
		}
	
	public void weighs()
		{
		System.out.println("The luggage weighs " + weight + " kgs.");
		}
	
	public void size()
		{
		System.out.println("The luggage is " + size + ".");
		}
	}
