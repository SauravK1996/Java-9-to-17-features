package com.example.collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
		Set<String> fruitsSet = new HashSet<String>();
		fruitsSet.add("Apple");
		fruitsSet.add("Mango");

		Map<String, String> map = new HashMap<String, String>();
		map.put("Lucknow", "Uttar Pradesh");
		map.put("Indore", "Madhya Pradesh");

		List<String> namesList = new ArrayList<String>();
		namesList.add("Sagar");
		namesList.add("Akash");

		List<String> fruitsList = Arrays.asList("Apple", "Mango");
		
		
		
		
		

		List<String> listOfFruits = List.of("Apple", "Mango");
		
		Set<String> setOfProg = Set.of("Java", "Python");
		
		Map<String, String> mapOfCity = Map.of("Lucknow", "Uttar Pradesh", "Indore", "Madhya Pradesh");
		
		Map<String, String> mapOfCity2 = Map.ofEntries(Map.entry("Ludhiana", "Punjab"),
				Map.entry("Bhopal", "Madhya Pradesh"));

	}

}
