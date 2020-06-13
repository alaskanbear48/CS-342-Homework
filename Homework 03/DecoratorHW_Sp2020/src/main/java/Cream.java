//Add Cream to the coffee 
public class Cream extends CoffeeDecorator{

	//Cost of cream 
	private double cost = .50;
	
	Cream(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	//Add the cost of cream to the total cost of order
	public double makeCoffee(){
		return specialCoffee.makeCoffee() + addCream();
	}
	
	private double addCream(){
		System.out.println(" + cream: $.50");
		return cost;
	}
}
