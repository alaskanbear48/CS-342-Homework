
//Adds condiments to the coffee  
public class CoffeeMaker {
	
	public Coffee order;
	
	//Each order starts with a basic Coffee
	CoffeeMaker(){
		order = new BasicCoffee();
	}
	
	//Add an Extra Shot to the coffee
	public void putExtraShot(){
		order = new ExtraShot(order);
	}
	
	//Add cream to the coffee
	public void putCream(){
		order = new Cream(order);
	}
	
	//Add Sugar to the coffee
	public void putSugar(){
		order = new Sugar(order);
	}
	
	//Add Vanilla to the coffee
	public void putVanilla(){
		order = new Vanilla(order);
	}

	//Add caramel to the coffee
	public void putCaramel(){
		order = new Caramel(order);
	}
	
	//Get total cost of order 
	public double getCost(){
		//Round the cost to the nearest hundredth 
		double roundOff = (double) Math.round(order.makeCoffee() * 100) / 100;
		return roundOff;
	}
}
