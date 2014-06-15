/**
 * 
 */
package com.linkedlist.src;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author arjunflex
 * 
 */
public class LinkedList<Item> implements Iterable<Item> {

	private Node first_element;
	private Node last_element;
	private int length;

	@Override
	public Iterator<Item> iterator() {
		return new LinkedListIterator<Item>();
	}

	public void add(Item item) {
		Node node = new Node();
		node.item = item;
		node.next = null;

		/*
		 * Check for the first element 
		 * It's the first element 
		 */

		if (length == 0 
				&& first_element == null 
				&& last_element == null) {
			first_element = node;
			last_element = node;
		} else {
			last_element.next = node;
			last_element = node;
		}
		
		length++;
	}
	
	public boolean isListEmpty() {
		if(length == 0 && first_element == null && last_element == null) {
			return true;
		}
		
		return false;
	}
	
	
	public void reverseLinks() {
		reverseList();
	}
	
	/*
	 * This programming logic has complexity of O(n)
	 */
	
	private void reverseList() {
		/*
		 * If the list is empty or list contains
		 * only one element return early
		 */
		
		if(first_element == null ||first_element.next == null ) {
			return ;
		}
		
		/*
		 * If the list contains only two elements
		 * reverse the link and return early
		 */
		
		if(first_element.next.next == null) {
			Node s = first_element.next;
			s.next =first_element;
			first_element.next = null;
			last_element = first_element;
			first_element = s;
			return ;
		}else {
			
			/*
			 * If the list contains more than two elements
			 * loop thru all the elements and reverse the
			 * links
			 * 
			 * And after last loop went thru,
			 * update head and tail pointers
			 */
			
			Node f = first_element;
			Node s = first_element.next;
			Node t = first_element.next.next;
			f.next = null;
			
			while(t != null) {
				
				s.next = f;
				f = s;
				s = t;
				t = t.next;
				
			}
			
			s.next = f;
			last_element = first_element;
			first_element = s;
		}
		
		
		
	}
	
	
	private class LinkedListIterator<Item> implements Iterator<Item> {
		
		private Node current_element = first_element;
		
		public void reset() {
			current_element = first_element;
		}

		@Override
		public boolean hasNext() {
			if(current_element != null) {
				return true;
			}
			return false;
		}

		@Override
		public Item next() {
			Item item = null;
			if(hasNext()) {
				item = (Item) current_element.item;
				current_element = current_element.next;
			}
			
			return item;
		}

		@Override
		public void remove() {
			
		}
		
	}

}
