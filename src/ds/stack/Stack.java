package ds.stack;

public interface Stack <E> {
	
	/**
	 * Adds given integer to the top of the stack
	 * @exception java.util.IndexOutOfBoundsException if the stack is full
	 */
	void push(E item);
	
	/**
	 * Removes and returns the top integer on the stack
	 * @exception java.util.NoSuchElementException if the stack is empty
	 */
	E pop();
	
	/**
	 * Returns the top integer on the stack without removing it
	 * @exception if the stack is empty
	 */
	E peek();
	
	boolean isEmpty();
		
	void display();
	
	int getSize();
	
}
