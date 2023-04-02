package com.javaTest;

import java.util.Iterator;
import java.util.Set;
import java.util.*;    

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> h = new HashSet<>();
		h.add("Apple");
		h.add("Mango");
		h.add("Orange");
		h.add("Banana");
		h.add("Grapes");
		
		Iterator<String> i = h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Set<Integer> h1 = new TreeSet<>();
		
		h1.add(1);
		h1.add(30);
		h1.add(45);
		h1.add(500);
		
		System.out.println(h1);
		
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(null, "Cycle");
		mp.put(1, "Car");
		mp.put(2, "Truck");
		
		System.out.println("Iterating Hashmap...");  
		
		for(Map.Entry m : mp.entrySet()){    
		  System.out.println(m.getKey()+" "+m.getValue());    
		  }  
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Maths");
        tm.put(10, "English");
        tm.put(25, "Physics");
        
        System.out.println("TreeMap: " + tm);
        
        /*
         * Difference between HashMap and HashTable:
        	1. In Hahsmap No method is Synchronized while in hashtable every method is Synchronized
        	2. Null is allowed for both key and value whule Null is not allowed for both key and value.
        */
	}

}
