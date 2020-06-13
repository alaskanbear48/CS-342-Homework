
//Class that keeps track of all the orders 
abstract class CoffeeDecorator implements Coffee{
	
	protected Coffee specialCoffee;
	
	public CoffeeDecorator(Coffee specialCoffee){
		this.specialCoffee = specialCoffee;
	}
	
	//Returns the current order of coffee
	public double makeCoffee(){
		return specialCoffee.makeCoffee();
	}
}
