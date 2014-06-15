package com.arjun.sqb;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
	
	private Node first;
	private int N;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		--N;
		return item;
		
	}
	
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
