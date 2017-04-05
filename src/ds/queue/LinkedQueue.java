package ds.queue;

import java.util.*;

public class LinkedQueue <E> implements Queue <E> {
	private Node first;
	private Node last;
	private int size;
	
	private class Node {
		public E data;
		public Node next;
		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public LinkedQueue() {
		first = null;
		last = null;
		size = 0;
	}

	public void enqueue(E item) {
		Node temp = last;
		last = new Node(item, null);
		if (isEmpty()) {
			first = last;
		} else {
			temp.next = last;
		}
		size++;
	}

	public E dequeue() {
		if (isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		} else {
			E currData = first.data;
			first = first.next;
			size--;
			return currData;
		}
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int getSize() {
		return size;
	}

	public E peek() {
		return first.data;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("The queue is empty.");
		} else {
			System.out.print("Queue: (first -> last)");
			Node curr = first;
			while (curr != null) {
				System.out.print(" " + curr.data);
				curr = curr.next;
			}
			System.out.print("\n");
		}		
	}

	
}
