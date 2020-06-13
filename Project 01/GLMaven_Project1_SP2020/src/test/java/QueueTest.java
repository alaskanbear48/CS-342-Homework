import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class QueueTest {

	GenericQueue<Integer> a;
	GenericQueue<Double> b;
	GenericQueue<Character> c;
	
	
	@BeforeEach
	void defaultStart()
	{
		a = new GenericQueue<Integer>();
		b = new GenericQueue<Double>();
		c = new GenericQueue<Character>();
	}
	
	//Check Queue is initialized as empty (1)
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
	
	//Check if Top value is correct for Integer Queue and correct Length (3)
	@Test
	void insertInt()
	{
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		
		assertEquals(1, a.getHead().data, "Top value not correct");
		assertEquals(3, a.getLength());
		assertNotNull(a.getHead());
	}
	
	//Check if Top value is correct for Double Queue and correct Length (4)
	@Test
	void insertDoub()
	{
		b.enqueue(1.1);
		b.enqueue(2.2);
		b.enqueue(3.3);
		
		assertEquals(1.1, b.getHead().data, "Top value not correct");
		assertEquals(3, b.getLength());
		assertNotNull(b.getHead());
	}
	
	//Check if Top value is correct for Char Queue and correct Length (5)
	@Test
	void insertChar()
	{
		c.enqueue('x');
		c.enqueue('y');
		c.enqueue('z');
		
		assertEquals('x', c.getHead().data, "Top value not correct");
		assertEquals(3, c.getLength());
		assertNotNull(c.getHead());
	}
	
	
	//Check Pop of integer Queue, and Length  (6)
	@Test
	void deleteInt()
	{
		a.enqueue(1);
		a.enqueue(2);
		int aa = a.dequeue();
		
		assertEquals(1, aa, "Pop is incorrect");
		assertNotNull(a.getHead());
		assertEquals(1, a.getLength());
		
	}
	
	    //Check Pop of double Queue, and Length  (7)
		@Test
		void deleteDoub()
		{
			b.enqueue(1.1);
			b.enqueue(2.2);
			double bb = b.dequeue();
			
			assertEquals(1.1, bb, "Pop is incorrect");
			assertNotNull(b.getHead());
			assertEquals(1, b.getLength());
			
		}
	
	
	
		//Check Pop of character Queue, and Length  (8)
		@Test
		void deleteChar()
		{
			c.enqueue('x');
			c.enqueue('y');
			
			char cc = c.dequeue();
			
			assertEquals('x', cc, "Pop is incorrect");
			assertNotNull(c.getHead());
			assertEquals(1, c.getLength());
			
		}
		
		//Check Pop when Queue is empty (9)
		@Test
		void popEmpty()
		{
			assertNull(a.dequeue());
			assertNull(b.dequeue());
			assertNull(c.dequeue());
		}
	
		//Check if integer Queue contains every value that is pushed (9)
		@ParameterizedTest
		@ValueSource(ints = {3,2,1})
		void orderInt(int input)
		{
			a.enqueue(1);
			a.enqueue(2);
			a.enqueue(3);
			
			ArrayList<Integer> aa = a.dumpList();
			
			assertTrue(aa.contains(input), "Not all values are found");
		
			
		}
	
		//Check if double Queue contains every value that is pushed (10)
		@ParameterizedTest
		@ValueSource(doubles = {3.3,2.2,1.1})
		void orderDoub(double input)
		{
			b.enqueue(1.1);
			b.enqueue(2.2);
			b.enqueue(3.3);
					
			ArrayList<Double> bb = b.dumpList();
					
			assertTrue(bb.contains(input), "Not all values are found");
				
					
		}
	
			//Check if character Queue contains every value that is pushed (11)
			@ParameterizedTest
			@ValueSource(chars = {'z','y','x'})
			void orderChar(char input)
			{
				c.enqueue('x');
				c.enqueue('y');
				c.enqueue('z');
				
				ArrayList<Character> cc = c.dumpList();
				
				assertTrue(cc.contains(input), "Not all values are found");
			
			}
			
			
			//Check if proper object has been initialized (12)
			@Test
			void initStack()
			{
				assertEquals("GenericQueue", a.getClass().getName(), "Wrong Object is initialized");
			}
}
