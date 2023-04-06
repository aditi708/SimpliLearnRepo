package com.ds;

public class SingleLinkedList {

	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next =null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode =  new Node(data);
		
		if(head==null) {
			
			head = newNode;
			tail = newNode;
			
		}
		else {
			tail.next = newNode;
			tail =newNode;
		}
	}
	
	public void ShowValues()
	{
		Node current = head;
		if(head==null)
			System.out.println("List is empty");
		else {
			System.out.println("Values from Linked List");
			while(current!=null) {
				System.out.print(current.data + "\t");
				current = current.next;
			}
		}
	}
}
