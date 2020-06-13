//import java.util.Iterator;

public class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello generic lists");
		
		GenericStack<Integer> m1 = new GenericStack<Integer>();
		//GenericQueue<Integer> m2 = new GenericQueue<Integer>();
		
		//--------- Stack 
		m1.push(1);
		m1.push(2);
		m1.push(3);
		/*
		m1.print();
		
		int a = m1.pop();
		System.out.println(a);
		
		m1.print();
		System.out.println(m1.getLength());
		
		//---------- Queue
		
		m2.enqueue(10);
		m2.enqueue(11);
		m2.enqueue(12);
		
		m2.print();
		
		int b = m2.dequeue();
		System.out.println(b);
		
		m2.print();
		System.out.println(m2.getLength());
		
		
		*/
		//----------
		
		//GLIterator<Integer> aa = m1.createIterator();
		//Iterator<Integer> aaa = m1.iterator();
		
		/*while(aa.hasNext())
		{
			System.out.println(aa.next());
		}*/
		
		m1.forEach(i-> System.out.println(i));
		
	}

}
