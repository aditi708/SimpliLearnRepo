package com.ds;

import com.ds.SingleLinkedList.Node;

public class DoubleLinkedList {
	
	public class Node{
		int data;
		Node pre;
		Node next;
		
		public Node(int data) {
			this.data = data;	
		}	
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			tail = newNode;
			head.pre = null;
			tail.next = null;
		}
		else {
			tail.next = newNode;
			newNode.pre = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void ShowValuesWithForward()
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
	
	public void ShowValuesWithBackward()
	{
		Node current = tail;
		if(tail==null)
			System.out.println("List is empty");
		else {
			System.out.println("Values from Linked List");
			while(current!=null) {
				System.out.print(current.data + "\t");
				current = current.pre;
			}
		}
	}
	
	public boolean searchAnElement(int val) {
		boolean b = false;
		Node current = head;
		if(head==null)
			System.out.println("List is empty");
		else {
//			System.out.println("Values from Linked List");
			while(current!=null) {
				if(current.data == val)
					{
						b = true;
						break;
					}
//				System.out.print(current.data + "\t");
				current = current.next;
			}
		}
		return b;
	}
	
}
