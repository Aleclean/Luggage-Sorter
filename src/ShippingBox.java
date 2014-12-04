
public class ShippingBox extends Box
	{
	public ShippingBox(double w, String s) 
		{
		super(w, s);		
		}
	
	public void weighs()
		{
		System.out.println("The shipping box weighs " + weight + " kgs.");
		}

	public void size()
		{
		System.out.println("The shipping box is " + size + ".");
		}
	}	
