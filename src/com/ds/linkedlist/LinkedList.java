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
				
				
				/**
				 * Constructor for data
				 * @param data
				 */
				public Node(int data) {
					this.data = data;
				}
			}
			
			/**
			 * Method to insert data into linked list
			 * @param data
			 */
			public void insert(int data) {
				Node newNode = new Node(data);
				head = newNode; //storing data in head
				System.out.print(head.data+" -> ");//printing elements
			}
}

