package ds.stack;

public interface Stack <E> {
	
	/**
	 * Adds given integer to the top of the stack.
	 * @exception java.util.IndexOutOfBoundsException if the stack is full (only for array implementation).
	 */
	void push(E item);
	
	/**
	 * Removes and returns the top integer on the stack.
	 * @exception java.util.NoSuchElementException if the stack is empty.
	 */
	E pop();
	
	/**
	 * Returns the top integer on the stack without removing it.
	 * @exception java.util.NoSuchElementException if the stack is empty.
	 */
	E peek();
	
	/**
	 * Returns whether the stack is empty.
	 */
	boolean isEmpty();
		
	/**
	 * Returns an integer of the size of the stack.
	 */
	int getSize();
	
	/**
	 * Prints the contents of the stack to the console.
	 */
	void display();
	

	
}
