package ds.stack;

import java.util.*;

/**
 * This class is my implementation of a linked stack. Since a singly-linked list is used
 * instead of an array, the size of the stack changes dynamically.
 * 
 * @author Seth Goodman
 *
 * @param <E>
 */
public class LinkedStack <E> implements Stack <E> {
	
	private class Node {
		public E data;
		public Node next;
		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node top = null;
	private int size = 0;

	public void push(E item) {
		top = new Node(item,top);
		size++;
	}

	public E pop() {
		if (isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		} else {
			E currData = top.data;
			Node temp = top.next;
			top = null;
			top = temp;
			size--;
			return currData;
		}
	}

	public E peek() {
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}


	public void display() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			System.out.print("Stack: (top -> bottom)");
			Node curr = top;
			while (curr != null) {
				System.out.print(" " + curr.data);
				curr = curr.next;
			}
			System.out.print("\n");
		}
	}

	public int getSize() {
		return size;
	}
}
