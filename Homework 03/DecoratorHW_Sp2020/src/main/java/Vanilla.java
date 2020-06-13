
//Add Vanilla to the coffee
public class Vanilla extends CoffeeDecorator{
	
	//Cost of Vanilla
	private double cost = .70;
	
	public Vanilla(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	//Add the cost of vanilla to the total cost of the order
	public double makeCoffee(){
		return specialCoffee.makeCoffee() + addVanilla();
	}
	
	private double addVanilla(){
		System.out.println(" + vanilla: $.70");
		return cost;
	}
	
	

}
