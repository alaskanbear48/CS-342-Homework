
//Add sugar to the coffee
public class Sugar extends CoffeeDecorator{

	//Cost of sugar 
	private double cost = .50;
	
	Sugar(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	//Add the cost of sugar to the total cost of the order 
	public double makeCoffee(){
		return specialCoffee.makeCoffee()+ addSugar();
	}
	
	private double addSugar(){
		System.out.println(" + sugar: $.50");
		return cost;
	}
}
