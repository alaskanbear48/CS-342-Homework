
//Add Caramel to the Coffee
public class Caramel extends CoffeeDecorator {

	//Cost of Caramel 
	private double cost = .75;
	
	public Caramel(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	//Add the cost of Caramel to the the total cost of order
	public double makeCoffee(){
		return specialCoffee.makeCoffee() + addCaramel();
	}
	
	private double addCaramel(){
		System.out.println(" + caramel: $.75");
		return cost;
	}
	

}
