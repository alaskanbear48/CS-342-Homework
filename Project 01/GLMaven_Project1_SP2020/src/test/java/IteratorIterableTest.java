import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IteratorIterableTest {

	GenericQueue<Integer> a;
	GenericStack<Integer> b;
	
	GLIterator<Integer> aa;
	GLIterator<Integer> bb;
	
	
	@BeforeEach
	void defaultStart()
	{
		a = new GenericQueue<Integer>();
		b = new GenericStack<Integer>();
		
	}
	
	//Checks if hasNext() returns false if it is empty (1) 
	@Test
	void emptyHasNext()
	{
		aa = a.createIterator();
		bb = b.createIterator();
		
		assertFalse(aa.hasNext());
		assertFalse(bb.hasNext());
	}
	
	//Checks if hasNext() returns true if it is not empty (2) 
	@Test
	void notEmptyHasNext()
	{
		a.enqueue(1);
		b.push(100);
		
		
		aa = a.createIterator();
		bb = b.createIterator();

		assertTrue(aa.hasNext(), "Has Next failed");
		assertTrue(bb.hasNext(), "Has Next failed");
	}
	
	//Checks basic next() returns value (3)
	@Test
	void basicNext()
	{
		a.enqueue(1);
		b.push(100);
		
		aa = a.createIterator();
		bb = b.createIterator();
		
		assertEquals(1, aa.next(), "Basic Next failed");
		assertEquals(100, bb.next(), "Basic Next failed");
		
	}
	
	@Test
	//Checks basic next for Stack order (4)
	void nextStack()
	{
		b.push(100);
		b.push(200);
		b.push(300);
		
		bb = b.createIterator();
		
		assertTrue(bb.hasNext());
		assertEquals(300, bb.next(), "Value is not in right (S) order");
	}
	
	@Test
	//Checks basic next for Queue order (5)
	void nextQueue()
	{
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		
		aa = a.createIterator();
		
		assertTrue(aa.hasNext());
		assertEquals(1, aa.next(), "Value is not in right (Q) order");		
	}
	
	@Test
	//Checks if Head points at next value after next() is used (6)
	void nextVal()
	{
		a.enqueue(1);
		a.enqueue(2);
		
		b.push(100);
		b.push(200);
		
		aa = a.createIterator();
		bb = b.createIterator();
		
		int c = aa.next();
		int d = bb.next();
		
		assertEquals(1, c);
		assertEquals(200, d);
		
		assertEquals(2, aa.next(), "Does not point to right next value(Q)");
		assertEquals(100, bb.next(), "Does not point to right next value(S)");
		
	}
	
	//Check for going out of bounds for empty Queue for next() (7)
	@Test
	void boundsQueue()
	{
		a.enqueue(1);
		a.enqueue(2);
		
		
		aa = a.createIterator();
		
		int c = aa.next();
		int d = aa.next();
		
		assertEquals(1, c);
		assertEquals(2, d);
		
		assertFalse(aa.hasNext(), "Out of bounds");
		
	}
	
	//Check for going out of bounds for empty Stack for next() (8)
		@Test
		void boundsStack()
		{
			b.push(100);
			b.push(200);
			
			
			bb = b.createIterator();
			
			int c = bb.next();
			int d = bb.next();
			
			assertEquals(200, c);
			assertEquals(100, d);
			
			assertFalse(bb.hasNext(), "Out of bounds");
			
		}
	
	//Check if proper object has been initialized for Stack iterator (9)
	@Test
	void initStackIterator()
	{
		bb = b.createIterator();
		assertEquals("GLIterator", bb.getClass().getName(), "Wrong Iterator Object Initialized");
	}
	
	//Check if proper object has been initialized for Queue iterator (10)
	@Test
	void initQueueIterator()
	{
		aa = a.createIterator();
		assertEquals("GLIterator", aa.getClass().getName(), "Wrong Iterator Object Initialized");
	}
	
	//Check for empty list forEach() (11)
	@Test
	void emptyForEach()
	{
		a.forEach(i-> System.out.println(i));
		b.forEach(i-> System.out.println(i));
	}
	
	//Check for not-empty list forEach() (12)
	@Test
	void notEmptyForEach()
	{
		a.enqueue(1);
		a.enqueue(2);
		
		b.push(100);
		b.push(200);
		
		a.forEach(i-> System.out.println(i));
		b.forEach(i-> System.out.println(i));
	}
	
}
