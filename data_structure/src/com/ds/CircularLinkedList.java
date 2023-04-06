package com.ds;

import com.ds.SingleLinkedList.Node;

public class CircularLinkedList {

	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addValues(int data)
	{
		Node newNode =  new Node(data);
		
		if(head==null) {
			
			head = newNode;
			tail = newNode;
			newNode.next = head; //circular
			
		}
		else {
			tail.next = newNode;
			tail =newNode;
			tail.next = head;
		}
	}
	
	public void ShowValues()
	{
		Node current = head;
		if(head==null)
			System.out.println("List is empty");
		else {
			System.out.println("Values from Circular Linked List");
			do{
				System.out.print(current.data + "\t");
				current = current.next;
			}while(current!=head);
		}
	}
}
