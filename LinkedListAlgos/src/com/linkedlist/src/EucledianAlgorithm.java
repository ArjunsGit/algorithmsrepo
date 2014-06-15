/**
 * 
 */
package com.linkedlist.src;

/**
 * @author arjunflex
 *
 */
public class EucledianAlgorithm {
	
	public static int  findGCD(int a, int b) {
		while( b != 0) {
		    int remainder = a % b;
		    a = b;
		    b = remainder;
	 	}
		
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(findGCD(345,11));
		System.out.println(findGCD(345,12));
	}

}
