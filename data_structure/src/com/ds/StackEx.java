package com.ds;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
	
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(100);
		stk.push(120);
		stk.push(190);
		stk.push(300);
		System.out.println("Stack values: " + stk);
		
		int n = stk.pop();
		System.out.println("Deleted value : " + n);
		System.out.println("Stack value : " + stk);
		
		
	}

}
