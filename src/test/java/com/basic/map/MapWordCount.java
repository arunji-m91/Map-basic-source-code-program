package com.basic.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapWordCount {
	/*
	 * key value pair find how many words present in the paragraph each word how
	 * many times by using map concept we do it
	 */

	public static void main(String[] args) {
		String s = "Greens Technologies Selenium training class will make you you an expert in Selenium. In this best online Selenium training course, you will learn basics to advanced test automation using Selenium to the most advanced Selenium topics. We will also make sure to teach you Java, Python and SQL. You will also work on multiple real-time projects and assignments with this certified Selenium testing training.";

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		String[] split = s.split(" ");
		for (String string : split) {
			Integer integer = m.get(string);
			if (integer == null) {
				m.put(string, 1);
			} else {
				m.put(string, integer + 1);
			}

		}
		System.out.println(m);
	}
}
