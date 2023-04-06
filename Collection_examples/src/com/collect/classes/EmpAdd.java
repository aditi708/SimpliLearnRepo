package com.collect.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpAdd {

	public static void main(String[] args) {
		ArrayList<Employee> empLst= new ArrayList<Employee>();
		Employee emp = new Employee(1001, "Aditi", "Developer", 45000f);
		empLst.add(emp);
		emp = new Employee(1002, "Adi", "HR", 40000f);
		empLst.add(emp);
		emp = new Employee(1003, "Anj", "sales", 60000f);
		empLst.add(emp);
		
		System.out.println(empLst);
		
		//using foreach loop
		
		for(Employee e : empLst) {
			System.out.println(e);
			
		}
		System.out.println("----------------");
		
		Iterator itr = empLst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
