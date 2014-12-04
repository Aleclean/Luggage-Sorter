
public class PetContainer extends Box implements Fragile
	{
	public PetContainer(double w, String s) 
		{
		super(w, s);		
		}
	
	public void weighs()
		{
		System.out.println("The luggage weighs " + weight + " kgs.");
		}

	public void size()
		{
		System.out.println("The luggage is " + size + ".");
		}
	
	public void carefulHandling() 
		{
		System.out.println("The pet container needs careful handling.");	
		}
	}
