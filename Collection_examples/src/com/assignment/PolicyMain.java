package com.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PolicyMain {

	public static void main(String[] args) throws Exception {
		Policy pol = new Policy();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many policies need");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Policy Id: ");
			int pid = sc.nextInt();
			System.out.println("Policy Name: ");
			String pname = br.readLine();
			
			pol.addPolicyDetails(pid, pname);
		}
		System.out.println("All Policies ");
		
//		Map<Integer, String> test = pol.ViewAllPolicies();
		
		for(Map.Entry m : pol.ViewAllPolicies().entrySet()) {
			System.out.println(m.getKey() + "  |  " +m.getValue());
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println("Enter the policy type");
		String ps = br.readLine();
		
		
		List<Integer> pids = pol.searchBasedOnPolicyType(ps);
		System.out.println(pids);
		
	}

}
