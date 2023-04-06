package com.collect.sets;

import java.util.LinkedHashSet;

public class SetEx2 {

	public static void main(String[] args) {
		LinkedHashSet<String> strSet = new LinkedHashSet<String>();
		
		strSet.add("java");
		strSet.add("php");
		strSet.add("python");
		strSet.add("css");
		strSet.add("php");
		
		System.out.println(strSet);
	}

}
