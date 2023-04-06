package com.ds;
import java.util.*;

public class DoubleMain {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.addNode(100);
		dll.addNode(200);
		dll.addNode(300);
		dll.addNode(400);
		
		dll.ShowValuesWithForward();
		System.out.println("\n-----------------");
		dll.ShowValuesWithBackward();
		System.out.println("\n-----------------");

	}

}
