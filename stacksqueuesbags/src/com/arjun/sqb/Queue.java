package com.arjun.sqb;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
	
	private Node first;
	private Node last;
	private int N;
	
	private class Node {
		Item item;
		Node next;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void enqueue(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if(isEmpty()) {
			first = last;
		}else {
			oldlast.next = last;
		}
		
		N++;
	}
	
	public Item dequeue() {
		
		if(isEmpty()) {
			last = null;
			return null;
		}
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	

}
