package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Policy {
	
	Map<Integer, String> insurence = new HashMap<Integer, String>();
	
	void addPolicyDetails(Integer pid, String pname) {
		insurence.put(pid, pname);
	}
	
	Map<Integer, String> ViewAllPolicies(){
		return insurence;
	}
	
	List<Integer> searchBasedOnPolicyType(String pname){
		List<Integer> pids = new ArrayList<Integer>();
		for(Map.Entry m : insurence.entrySet()) {
			String strPname = (String)m.getValue();
			if(strPname.contains(pname)) {
				pids.add((Integer)m.getKey());
				
			}
		}
		return pids;
	}

}
