
public class GenericStack<I> extends GenericList<I>{

	public void add(I value)
	{
		//Create new node 
		Node<I> newNode = new Node<I>();
		
		//Check if stack is empty
		if(getLength() == 0){
			
			newNode.next = null;
			newNode.data = value;
			
			setHead(newNode);
		}
		//Stack is not empty 
		else{
			
			Node<I> temp = getHead();
			
			newNode.next = temp;
			newNode.data = value;
			
			setHead(newNode);
		}
		
		//Increase the Length of the List by one  
		setLength(getLength() + 1);
	}
	
	 //Push value into stack 
	 public void push(I value){
		 add(value);
	 }
	
	 //Pop value off stack 
	 public I pop(){
		 return delete();
	 }
}
