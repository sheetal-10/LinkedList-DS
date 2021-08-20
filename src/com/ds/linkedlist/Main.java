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
			linkedList.push(56);
			linkedList.push(30);
			linkedList.push(70);
			System.out.println("LinkList:");
			linkedList.print();	
			}
	}


