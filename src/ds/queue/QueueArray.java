package ds.queue;

import java.util.*;

/**
 * This class is my implementation of a bounded queue, with the size of the queue array 
 * inputed at the creation of the queue. Since the queue is bounded, there is a new
 * isFull() function, which returns a boolean determining if the queue is full.
 * 
 * @author Seth Goodman
 *
 * @param <E>
 */
public class QueueArray <E> implements Queue <E> {
	
	private int maxSize;
	private int front;
	private int end;
	private int length;
	private E[] Queue;
	
	@SuppressWarnings("unchecked")
	public QueueArray(int size) {
		this.maxSize = size;
		this.length = 0;
		this.Queue = (E[]) new Object[maxSize];
		this.end = -1;
		this.front = -1;
	}
	
	public void enqueue(E item) {
		if (end == -1) {
			front = 0;
			end = 0;
			Queue[end] = item;
		} else if (isFull()) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		} else {
			Queue[++end] = item;
		}
		length++;
	}
	
	public E dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		} else {
			int oldFront = front;
			length--;
			Queue[front] = null;
			if (front == end) {
				front = -1;
				end = -1;
			} else
				front++;
			return Queue[oldFront];
		}
	}
	
	public boolean isFull() {
		return length == maxSize;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int getSize() {
		return length;
	}
	
	public E peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Underflow Exception");
		} else {
			return Queue[front];
		}
	}
	
	public void display() {
		int i;
		if (isEmpty()) {
			System.out.println("The queue is empty.");
		} else {
			System.out.print("Queue: ");
			for (i = 0; i < length; i++) {
				System.out.print(Queue[front + i] + " ");
			}
			System.out.println(" ");
		}
	}
}
