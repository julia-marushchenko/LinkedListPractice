package com.lists.main;

import java.util.Collections;
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
		System.out.println(list.peekFirst());
		
		// Getting the last element
		System.out.println(list.peekLast());
		
		// Index of first Blue, return index of the first found from the beginning
		System.out.println("Index of first met colour Blue is:" + list.indexOf("Blue")); //0
		
		// Poll the first element of the list
		System.out.println(list.pollFirst());
		
		// Showing all elements of the list, without the first one Blue
		System.out.println(list.toString());
		
		// Index of first Blue, return index of the first found from the beginning
		System.out.println("Index of first met colour Blue is:" + list.indexOf("Blue")); //4
		
		//Iterate all elements of the list
		for (String element : list) {
		System.out.println(element);
		}
		
		//Iterate all elements of the list
		for (String element : list) {
			System.out.println(list.peek()); // Works not appropriate, shows only the first element
		}
		
		// Printing to console true or false if the list is empty
		System.out.println("Is list empty: " + list.isEmpty());
		
		// Printing to console the size of the list
		System.out.println(list.size());
		
		// Sorting list in alphabetical order
		Collections.sort(list);
		
		// Showing all elements of the list
		System.out.println(list.toString());
		
		
		
	}
}
