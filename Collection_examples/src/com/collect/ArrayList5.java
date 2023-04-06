package com.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList5 {
// traversing of elements
	
	public static void main(String[] args) {
		ArrayList<String> strLst= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		strLst.add("java");
		strLst.add("python");
		strLst.add("c#");
		strLst.add("C++");
		strLst.add("html");
		strLst.add(1,"css");
		System.out.println(strLst);
		
		// using foreach loop
		
		for(String st : strLst)
		{
			System.out.println(st);
		}
		
		System.out.println("........................................................");
		
		// using iterator interface
		
		Iterator itr = strLst.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
