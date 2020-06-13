import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class ListTest {

	GenericStack<Integer> a;
	GenericStack<Double> b;
	GenericStack<Character> c;
	
	
	@BeforeEach
	void defaultStart()
	{
		a = new GenericStack<Integer>();
		b = new GenericStack<Double>();
		c = new GenericStack<Character>();
	}
	
	//Check Stack is initialized as empty (1)
	@Test
	void startEmpty()
	{
		assertNull(a.getHead());
		assertNull(b.getHead());
		assertNull(c.getHead());		
	}
	
	//Check Empty Length (2)
	@Test
	void emptyLength()
	{
		assertEquals(0, a.getLength());
		assertEquals(0, b.getLength());
		assertEquals(0, c.getLength());
		
	}
	
	//Check if Top value is correct for Integer Stack and correct Length (3)
	@Test
	void insertInt()
	{
		a.push(1);
		a.push(2);
		a.push(3);
		
		assertEquals(3, a.getHead().data, "Top value not correct");
		assertEquals(3, a.getLength());
		assertNotNull(a.getHead());
	}
	
	//Check if Top value is correct for Double Stack and correct Length (4)
	@Test
	void insertDoub()
	{
		b.push(1.1);
		b.push(2.2);
		b.push(3.3);
		
		assertEquals(3.3, b.getHead().data, "Top value not correct");
		assertEquals(3, b.getLength());
		assertNotNull(b.getHead());
	}
	
	//Check if Top value is correct for Char Stack and correct Length (5)
	@Test
	void insertChar()
	{
		c.push('x');
		c.push('y');
		c.push('z');
		
		assertEquals('z', c.getHead().data, "Top value not correct");
		assertEquals(3, c.getLength());
		assertNotNull(c.getHead());
	}
	
	
	//Check Pop of integer Stack, and Length  (6)
	@Test
	void deleteInt()
	{
		a.push(1);
		a.push(2);
		int aa = a.pop();
		
		assertEquals(2, aa, "Pop is incorrect");
		assertNotNull(a.getHead());
		assertEquals(1, a.getLength());
		
	}
	
	    //Check Pop of double Stack, and Length  (7)
		@Test
		void deleteDoub()
		{
			b.push(1.1);
			b.push(2.2);
			double bb = b.pop();
			
			assertEquals(2.2, bb, "Pop is incorrect");
			assertNotNull(b.getHead());
			assertEquals(1, b.getLength());
			
		}
	
	
	
		//Check Pop of character Stack, and Length  (8)
		@Test
		void deleteChar()
		{
			c.push('x');
			c.push('y');
			
			char cc = c.pop();
			
			assertEquals('y', cc, "Pop is incorrect");
			assertNotNull(c.getHead());
			assertEquals(1, c.getLength());
			
		}
		
		//Check Pop when Stack is empty (9)
		@Test
		void popEmpty()
		{
			assertNull(a.pop());
			assertNull(b.pop());
			assertNull(c.pop());
		}
	
		//Check if integer Stack contains every value that is pushed (9)
		@ParameterizedTest
		@ValueSource(ints = {3,2,1})
		void orderInt(int input)
		{
			a.push(1);
			a.push(2);
			a.push(3);
			
			ArrayList<Integer> aa = a.dumpList();
			
			assertTrue(aa.contains(input), "Not all values are found");
		
			
		}
	
		//Check if double Stack contains every value that is pushed (10)
			@ParameterizedTest
			@ValueSource(doubles = {3.3,2.2,1.1})
			void orderDoub(double input)
			{
				b.push(1.1);
				b.push(2.2);
				b.push(3.3);
					
				ArrayList<Double> bb = b.dumpList();
					
				assertTrue(bb.contains(input), "Not all values are found");
				
					
			}
	
			//Check if character Stack contains every value that is pushed (11)
			@ParameterizedTest
			@ValueSource(chars = {'z','y','x'})
			void orderChar(char input)
			{
				c.push('x');
				c.push('y');
				c.push('z');
				
				ArrayList<Character> cc = c.dumpList();
				
				assertTrue(cc.contains(input), "Not all values are found");
			
			}
			
			
			//Check if proper object has been initialized (12)
			@Test
			void initStack()
			{
				assertEquals("GenericStack", a.getClass().getName(), "Wrong Object is initialized");
			}
				

}
