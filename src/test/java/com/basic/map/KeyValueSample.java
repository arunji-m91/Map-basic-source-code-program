package com.basic.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import java.util.Map;

public class KeyValueSample {
	public static void main(String[] args) {
		Map<String,ArrayList<String>> m = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList<String> userName = new ArrayList<String>();
		userName.add("Greens@123");
		userName.add("arunji.m91");
		
		ArrayList<String> password = new ArrayList<String>();
		userName.add("12345oij");
		userName.add("arunjinallalam");
		

		ArrayList<String> Location = new ArrayList<String>();
		userName.add("London");
		userName.add("Sydney");
		
		
		m.put("Username",userName);
		m.put("Password",password);
		
		ArrayList<String> arrayList = m.get("Username");
		for (String string : arrayList) {
			System.out.println(string);
		}

		
		
		
	}

}
