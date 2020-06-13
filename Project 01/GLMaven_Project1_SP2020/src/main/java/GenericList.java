//Project 1 Manuel M Martinez 
//This project allows the creation of a stack and queue with the additional implementation 
//of an iterator using an interface.  

import java.util.ArrayList;
import java.util.Iterator;

public abstract class GenericList<I> implements CreateIterator<I>, Iterable<I>{
	
	//Head of the list 
	private Node<I> head = null;
	
	//Length of the list 
	private int length = 0;
	
	//Prints Items of the list 
	public void print()
	{
		if(getLength() == 0)
		{
			System.out.println("Empty List");
		}
		else{
			
		//Get List of data values 
		ArrayList<I> pList = dumpList();
		
		//System.out.println("This is your list: ");
		
		for(int i = 0; i < pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		pList.clear();
		}
		
	}
	
	//Adds the values to the list (Depends on D.S) <--
	public abstract void add(I data);
	
	//Returns the first value of the list and deletes the Node <--
	public I delete()
	{
		//Check if list is empty 
		if(getLength() == 0)
		{
			return null;
		}
		else {
		
		//Store the deleted value of the node in a variable 
		I value = head.data;
		
		Node<I> temp = head;
		
		head = head.next;
		
		temp.next = null;
		temp = null;
		
		//Decreases length by one 
		setLength(getLength() - 1);
		
		return value;
		}
	}
	
	//Stores all values into an array and returns
	//Method must empty list at the end 
	public ArrayList<I> dumpList()
	{
		//Create a new List 
		ArrayList<I> list = new ArrayList<I>();
		
		Node<I> temp = head;
		
		//Store all the values of DS into list 
		while(temp != null)
		{
			list.add(temp.data);
			
			temp = temp.next;
		}
		
		return list;
	}
	
	//Get and set functions for length & Head <-- 
	public int getLength() {
		return length;
	}
	
	//Set Length <--
	public void setLength(int newLength){
		length = newLength;
	}
	
	//Return a reference to the head of the list <--
	public Node<I> getHead(){
		return head;
	}

	//Sets new head of list <--
	public void setHead(Node<I> newNode){
		head = newNode;
	}
	
	//Node Class
	public class Node<T>{
		T data;
		Node<T> next;
	}
	
	public GLIterator<I> createIterator(){
		//Pass Head of list 
		return new GLIterator<I>(this.getHead());
	}
	
	public Iterator<I> iterator()
	{
		return new GLIterator<I>(this.getHead());
	}
	
}