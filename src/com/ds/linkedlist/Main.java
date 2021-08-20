package com.ds.linkedlist;

/**
 * Main function for calling of Linked List Class
 * To pass data to Linked list to do different operations
 * @author sheetal
 * @since 2021-08-20
 */
public class Main {
	public static void main(String[] args) {
		
		  LinkedList linkedList=new LinkedList();
		  linkedList.insert(56);
		  linkedList.insert(30);
	      linkedList.insert(70);
		  linkedList.print();
		  
		  int pop = linkedList.pop();
		  System.out.println(pop);
			
		  linkedList.print();	
	}
}



