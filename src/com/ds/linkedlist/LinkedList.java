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
	 * Method to delete element of given position in the sequence
	 * If position is more than Sequence it will Out of  Bound
	 * @param position
	 */
	public Node insert(int data) {
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
		return newNode;
	}
	
	
	
	// method to insert after a node
	public void insertAfter(Node prevNode, int value) {

		if (prevNode == null) {
		System.out.println("Prev Node should not be null");
		return;
		}				
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	//method to delete a element
	public int pop() {
		int popData = 0;
		if (head == null) {
		System.out.println("Stack Over flow");
		}
		popData = head.data;
		head = head.next;
		return popData;
		}
	
	//method to delete the last element
	public void deleteLast() {
		if (head==null) {
			System.out.println("Sequence have no elements");
		} else if (head.next==null) {
			head=null;
			System.out.println("After deleting last Element, Sequence have no elements");
		} else {
			Node lastSecond = head;
			while(lastSecond.next.next!=null) {
				lastSecond=lastSecond.next;//Traversing the last Second element
			}
			lastSecond.next=null;
			System.out.println("After deleting last Element");
		}
	}
	
	/**
	 * Method to check whether given element is present in Sequence or not
	 * If it's there then printing its position
	 * @param searchData
	 */
	public void searchNode(int searchData) {
		int flag=0;
		int count=1;
		if (head==null) { //checks whether list is empty
			System.out.println("Sequence have no elements");
		} else {
			Node temp = head; //Initializing temp
			while (temp.next!=null) {
				if(temp.data==searchData) { //Searching for the key
					flag=1;
					break;
				} else {
					count++;
					temp=temp.next; //Traversing temp to next
				}
			}
			if (flag==1) System.out.println("Element '"+searchData+"' is at postion-"+count);
			else System.out.println("Element '"+searchData+"' is not in the sequence");
		}
	}
	
	
	//  Printing the Node value by traversing 
	public void print() {
		System.out.print("The sequence is : ");
		Node temp = head; //Initializing temp
		while (temp!=null) {
			System.out.print(temp.data+" -> "); //Printing data
			temp=temp.next;//Traversing temp to next
		}
		System.out.println("\n");
	}
}

