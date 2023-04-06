package com.collect;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
//delete process
	
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
		
		System.out.println("Enter search string: ");
		String s = sc.next();
		
		if(strLst.contains(s)==true) {
			strLst.remove(s);
			System.out.println("After Deleting :\n" + strLst);
			
			
		}else {
			System.out.println("String not existed");
			
		}
	}

}
