package com.linkedlist.src;

import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println("Before Link reversal:  ");
		printlist(list);
		list.reverseLinks();
		System.out.println("After link reversal: ");
		printlist(list);
		
	}
	
	private static void printlist(LinkedList list) {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.print("\n");
	}


}
