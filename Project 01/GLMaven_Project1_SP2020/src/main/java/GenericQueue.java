public class GenericQueue<I> extends GenericList<I>{
	
	//Add a node to the queue 
	public void add(I value)
	{
		//Create a new node
		Node<I> newNode = new Node<I>();
		
		//Check if Queue is empty 
		if(getLength() == 0)
		{
			//Set the Node to point to Null and store value 
			newNode.next = null;
			newNode.data = value;
			
			//Set the new head of the list 
			setHead(newNode);
		}
		else
		{
			//Get Head position to traverse 
			Node<I> temp = getHead();
			
			newNode.next = null;
			newNode.data = value;
			
			//Traverse the Queue to find the last Node 
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			//Connect Nodes 
			temp.next = newNode;
		}
		
		//Increase the Length of the List by one  
		setLength(getLength() + 1);
	}
	
	//Add value on queue
	public void enqueue(I value){
		add(value);
	}
	
	//pop first value off queue 
	public I dequeue(){
		return delete();
	}

}