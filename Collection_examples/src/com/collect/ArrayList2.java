package com.collect;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
//add process
	
	public static void main(String[] args) {
		ArrayList<String> strLst= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			System.out.println("Enter ur course name: ");
			String course = sc.next();
			strLst.add(course);
			
			System.out.println("One more course (Y/N) ");
			String ch = sc.next();
			if(ch.equals("N")|| ch.equals("n"))
				break;
			
			
		}
		System.out.println("List of Values: " + strLst);
		
	}

}
