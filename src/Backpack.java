
public class Backpack extends Bag implements Fragile
	{	
	public Backpack(double w, String s) 
		{
		super(w, s);		
		}
	
	public void weighs()
		{
		System.out.println("The backpack weighs " + weight + " kgs.");
		}

	public void size()
		{
		System.out.println("The backpack is " + size + ".");
		}

	public void carefulHandling() 
		{
		System.out.println("The backpack needs careful handling.");	
		}	
	}
