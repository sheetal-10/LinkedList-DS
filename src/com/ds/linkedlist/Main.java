package com.ds.linkedlist;

/**
 * Main function for calling of Linked List Class
 * To pass data to Linked list to do different operations
 * @author sheetal
 * @since 2021-08-20
 */
public class Main {
	public static void main(String[] args) {
		
		
		  System.out.println("Program for the Simple Linked List");
		  
		  LinkedList linkedList=new LinkedList();
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			System.out.println("LinkList:");
			linkedList.print();	
			}
	}


