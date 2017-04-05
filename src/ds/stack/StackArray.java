package ds.stack;

import java.util.*;

public class StackArray <E> implements Stack <E> {
	
	private int maxSize;
	private E[] Stack;
	private int top;
	
	@SuppressWarnings("unchecked")
	public StackArray (int size) {
		this.maxSize = size;
		this.Stack = (E[]) new Object[maxSize];
		this.top = -1;
	}
	
	public void push(E item){
		if (isFull()) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		} else {
			/*int i;
			for (i = 0; i < word.toCharArray().length; i++) {
				topIndex++;
				stackArray[topIndex] = word.toCharArray()[i];
			}
			*/
			top++;
			Stack[top] = item;
		}
	}
	
	public E pop() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		} else {
			E oldTop = Stack[top];
			Stack[top] = null;
			top--;
			return oldTop;
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public int getSize() {
		return top + 1;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			int i;
			System.out.print("Stack: (bottom -> top)");
			for (i = 0; i <= top; i++){
				System.out.print(" " + Stack[i]);
			}
			System.out.print("\n");
		}
	}
	
	public E peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Underflow Exception");
		} else {
			return Stack[top];
		}
	}
}
