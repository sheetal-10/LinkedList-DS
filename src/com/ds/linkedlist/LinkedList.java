package com.ds.linkedlist;

/**
 * To create Simple Linked List
 * To perform different operation on insertion elements
 * @author sheetal
 * @since 2021-08-20
 */
public class LinkedList {
	//Initializing Head Node
	Node head; 
			
	// Creating inner class for Node
	class Node {
		int data; //Value variable
		Node next;//Node for next
				
		
		/**
		 * Constructor for data
		 * @param data
		 */
		public Node(int data) {
					this.data = data;
					this.next = null;
				}
		}
			
	/**
	  * Method to insert data into linked list
	  * To check if head is null then add data to it
	  * If not then checks for other nodes for null to add data
   	  * @param data
	  */
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head==null) {
			head = newNode; //storing data in head
		} else {
			Node temp = head; //Initializing temp
			while (temp.next!=null) {
				temp=temp.next; //Traversing temp to next
			}
			temp.next = newNode;
		}
	}
	
	//method to push
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
			 }
	// method to display inserted data
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
}

