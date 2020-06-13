import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeDecoratorTest {

	CoffeeMaker customer;
	Coffee coffee;
	
	@BeforeEach
	void defaulStart(){
		customer = new CoffeeMaker();
	}
	
	//Test Black Coffee
	@Test
	void testBlackCoffee1(){
		assertEquals(3.99, customer.getCost(), "Did Not start with Black Coffee");
	}
	
	@Test
	void testBlackCoffee2(){
		coffee = new BasicCoffee();
		assertEquals(3.99, coffee.makeCoffee(), "Did not add Black Coffee");
	}
	
	//Test Sugar
	@Test 
	void testSugar1(){
		customer.putSugar();
		assertEquals(4.49, customer.getCost(), "Did Not add Sugar");
	}
	
	@Test
	void testSugar2(){
		coffee = new Sugar(new BasicCoffee());
		assertEquals(4.49, coffee.makeCoffee(), "Did not put Sugar");
	}
	
	//Test Cream
	@Test 
	void testCream1(){
		customer.putCream();
		assertEquals(4.49, customer.getCost(), "Did Not add Cream");
	}
	
	@Test 
	void testCream2(){
		coffee = new Cream(new BasicCoffee());
		assertEquals(4.49, coffee.makeCoffee(), "Did not put Cream");
	}

	//Test Extra Shot
	@Test 
	void testExtraShot1(){
		customer.putExtraShot();
		assertEquals(5.19, customer.getCost(), "Did Not add an Extra Shot");
	}
	
	@Test
	void testExtraShot2(){
		coffee = new ExtraShot(new BasicCoffee());
		assertEquals(5.19, coffee.makeCoffee(), "Did not put Extra Shot");
	}
	
	//Test Vanilla 
	@Test
	void testVanilla(){
		customer.putVanilla();
		assertEquals(4.69, customer.getCost(), "Did Not add Vanilla");
	}
	
	@Test 
	void testVanilla2(){
		coffee = new Vanilla(new BasicCoffee());
		assertEquals(4.69, coffee.makeCoffee(), "Did not put Vanilla");
	}
	
	//Test Caramel 
	@Test
	void testCaramel(){
		customer.putCaramel();
		assertEquals(4.74, customer.getCost(), "Did Not add Caramel");
	}
	
	@Test 
	void testCaramel2(){
		coffee = new Caramel(new BasicCoffee());
		assertEquals(4.74, coffee.makeCoffee(), "Did not put Caramel");
	}
	
	//Test Get Cost Of Coffee
	@Test
	void testTotal(){
		customer.putExtraShot();
		customer.putSugar();
		customer.putCream();
		customer.putVanilla();
		customer.putCaramel();
		
		assertEquals(7.64, customer.getCost(), "Did not get the right Total Cost");
	}
	
	@Test 
	void testMakeCoffee(){
		coffee = new Caramel(new Vanilla(new Cream(new Sugar(new ExtraShot(new BasicCoffee())))));
		double roundOff = (double) Math.round(coffee.makeCoffee() * 100) / 100;
		
		assertEquals(7.64, roundOff, "Did not get the right Coffee Made");
	}
	
	
}
