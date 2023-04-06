package com.ds;
import java.util.*;


public class SingleMain2 {

	public static void main(String[] args) {
		
		SingleLinkedList sll = new SingleLinkedList();
		Scanner sc =new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter any value (-99 to stop)");
			int n = sc.nextInt();
			
			if(n!=-99)
				sll.addNode(n);
			else
				break;
		}
		sll.ShowValues();
	}

}
