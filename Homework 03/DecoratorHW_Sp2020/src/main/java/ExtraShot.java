
//Add an Extra Shot to the coffee
public class ExtraShot extends CoffeeDecorator {

	//Cost of Extra Shot 
	private double cost = 1.20;
	
	ExtraShot(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	//Add the cost of an extra shot to the total cost of the order 
	public double makeCoffee() {
		return specialCoffee.makeCoffee() + addShot();
	}
	
	private double addShot(){
		System.out.println(" + extra shot: $1.20");
		return cost;
	}
}
