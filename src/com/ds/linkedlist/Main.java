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
		  LinkedList.Node prevNode = linkedList.insert(56);
		  linkedList.insertAfter(prevNode, 30); 
		  linkedList.print();	
	}
}



