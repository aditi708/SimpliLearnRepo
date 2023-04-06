package com.maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SearchKeyEx {

	public static void main(String[] args) {
		Map<Integer, String> mapHttpsErrors = new TreeMap<Integer, String>();
		mapHttpsErrors.put(200, "Ok");
		mapHttpsErrors.put(204, "Page not found");
		mapHttpsErrors.put(500, "Internal server Error");
		mapHttpsErrors.put(303, "Server");
		
		System.out.println(mapHttpsErrors);
		
		//Search key
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search ");
		int k = sc.nextInt();
		
		if(mapHttpsErrors.containsKey(k)==true) {
			System.out.println("Value is : " + mapHttpsErrors.get(k));
		}else {
			System.out.println("Key not existed in map");
		}
		
		
	}

}
