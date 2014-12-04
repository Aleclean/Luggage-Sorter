import java.util.Scanner;

public class LuggageRunner extends Luggage
	{	
	public LuggageRunner(double w, String s) 
	{
	super(w, s);	
	}

	public static void main(String[] args) 
		{
		inputLuggage();
		}
	
	public static void inputLuggage()
		{
		System.out.println("Which type of luggage do you wish to add?");
		System.out.println("1). Suitcase");
		System.out.println("2). Backpack");
		System.out.println("3). Shipping Box");
		System.out.println("4). Pet Container");
		Scanner userInput1 = new Scanner(System.in);
		int type = userInput1.nextInt() - 1;
		
		if(type == 0)
			{
			Suitcase s = new Suitcase(weight, size);
			System.out.println("Input the weight of the suitcase in kg.");
			weight = userInput1.nextDouble();
			System.out.println("Input the size of the suitcase(small, medium, large).");
			size = userInput1.next();
			s.weighs();
			s.size();
			}
		
		if(type == 1)
			{
			Backpack b = new Backpack(weight, size);
			System.out.println("Input the weight of the backpack in kg.");
			weight = userInput1.nextDouble();
			System.out.println("Input the size of the backpack(small, medium, large).");
			size = userInput1.next();
			b.weighs();
			b.size();
			b.carefulHandling();
			}
		
		if(type == 2)
			{
			ShippingBox sb = new ShippingBox(weight, size);
			System.out.println("Input the weight of the shipping box in kg.");
			weight = userInput1.nextDouble();
			System.out.println("Input the size of the shipping box(small, medium, large).");
			size = userInput1.next();
			sb.weighs();
			sb.size();
			}
		
		if(type == 3)
			{
			PetContainer pc = new PetContainer(weight, size);
			System.out.println("Input the weight of the pet container in kg.");
			weight = userInput1.nextDouble();
			System.out.println("Input the size of the pet container(small, medium, large).");
			size = userInput1.next();
			pc.weighs();
			pc.size();
			pc.carefulHandling();
			}		
		}
	}
