package com.lists.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListPractice {
	
	public static void main(String [] str){
		
		// LinkedList created
		LinkedList<String> list = new LinkedList<>();
		
		// Adding elements
		list.add("Blue");
		list.add("Red");
		list.add("Braun");
		list.add("Green");
		list.add("Braun");
		list.add("Blue");
		list.add("Yellow");
		list.add("Grau");
		
		// Showing all elements of the list
		System.out.println(list.toString());
		
		// Getting the first element
		System.out.println("The first element: " + list.peekFirst());
		
		// Getting the last element
		System.out.println("The last element: " + list.peekLast());
		
		// Index of first Blue, return index of the first found from the beginning
		System.out.println("Index of first met colour Blue is:" + list.indexOf("Blue")); //0
		
		// Poll the first element of the list
		System.out.println(list.pollFirst());
		
		// Showing all elements of the list, without the first one Blue
		System.out.println("List after poll() method " + list.toString());
		
		// Index of first Blue, return index of the first found from the beginning
		System.out.println("Index of first met colour Blue is:" + list.indexOf("Blue")); //4
		
		//Iterate all elements of the list
		for (String element : list) {
			System.out.println(element);
		}
		
		// Printing to console true or false if the list is empty
		System.out.println("Is list empty: " + list.isEmpty());
		
		// Printing to console the size of the list
		System.out.println("Size of the is: " + list.size());
		
		// Sorting list in alphabetical order
		Collections.sort(list);
		
		// Showing all elements of the list
		System.out.println("All elements after sorting " + list.toString());
		
		Comparator<String> comparator = new Comparator<String>(){
			
			@Override
			public int compare(String str, String str1) {
				if (str.length() > str1.length()) {
						return 1;
				} else {
					return 0;
				}
			}		
		};
		
		// Sorting list in alphabetical order and with length descending order
		Collections.sort(list, comparator);
		
		// Printing list
		System.out.println("After sorting with comparator: " + list);	
		
			
	}
}
