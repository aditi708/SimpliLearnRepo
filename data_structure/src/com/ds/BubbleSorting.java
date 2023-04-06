package com.ds;

public class BubbleSorting {

	public static void main(String[] args) {
		int x[]= {10,3,4,-9,8};
		System.out.println("Before Sorting");
		for(int n : x) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		System.out.println("After Sorting ascending order ");
		for(int n : x) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		//bubble sorting logic desending order
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]<x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		System.out.println("After Sorting desending order ");
		for(int n : x) {
			System.out.print(n + " ");
		}
		
	}

}
