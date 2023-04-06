package com.ds;

import java.util.Stack;

public class StackEx2 {
	
	public void addValues(Stack stk, int n) {
		stk.push(n);
		System.out.println("Pushed value :" + n);
		System.out.println("Updated stack : " + stk);
		
	}
	
	public Stack RemoveValues(Stack stk) {
		int n = (Integer)stk.pop();
		return stk;
	}

	public static void main(String[] args) {
		StackEx2 se = new StackEx2();
		Stack<Integer> stk = new Stack<Integer>();
		
		System.out.println("Stack values: " + stk);
		
		int x[]= {12,45,67,89,65};
		for(int i = 0;i<x.length;i++) {
			se.addValues(stk, x[i]);
		}
		
		for(int i = 0;i<x.length;i++) {
			stk = se.RemoveValues(stk);
			System.out.println(stk);
		}
	}

}
