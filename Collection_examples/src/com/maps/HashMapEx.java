package com.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer, String> mapHttpsErrors = new HashMap<Integer, String>();
		mapHttpsErrors.put(200, "Ok");
		mapHttpsErrors.put(204, "Page not found");
		mapHttpsErrors.put(500, "Internal server Error");
		mapHttpsErrors.put(303, "Server");
		
		System.out.println(mapHttpsErrors);
		
		//Traverse map pairs
		
		for(Map.Entry m : mapHttpsErrors.entrySet()) {
			System.out.println("Key: " + m.getKey()  + "    value: " + m.getValue());
		}
		
	}

}
