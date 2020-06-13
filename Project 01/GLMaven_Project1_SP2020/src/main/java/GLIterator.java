import java.util.Iterator;

public class GLIterator<I> implements Iterator<I> {

	//Node reference 
	GenericList<I>.Node<I> m1;
	
	public GLIterator(GenericList<I>.Node<I> listHead)
	{
		//Node reference assigned to list head 
		m1 = listHead;
	}
	
	@Override
	public boolean hasNext() {
		
		//Check if there is an element in list to return 
		if(m1 != null)
		{
			return true; 
		}
			return false;
	}

	@Override
	public I next() {
		
		//Move down one in list
		I val = m1.data;
		m1 = m1.next;
				
		//Return current element 
		return val;
	}
}
