package ds.stack;

/**
 * This is a stack interface, to be used with two stack classes - a bounded
 * stack and a singly-linked stack. The user can push and pop items to and 
 * off the stack, as well as peek at the top element, determine if the stack
 * is empty, get the size of the stack, and display the stack in the console.
 * 
 * @author Seth Goodman
 *
 * @param <E>
 */
public interface Stack <E> {
	
	/**
	 * This method adds the given item to the top of the stack.
	 * 
	 * @param  item   element to be added to the top of the stack.
	 * @exception     java.util.IndexOutOfBoundsException if the stack is full 
	 * 				  (only for array implementation).
	 */
	void push(E item);
	
	/**
	 * Removes and returns the top item on the stack.
	 * 
	 * @exception   	java.util.NoSuchElementException if the stack is empty.
	 * @return  item	the last element added to the stack (the top element) 
	 */
	E pop();
	
	/**
	 * This method returns the top item on the stack without removing it, allowing the 
	 * user to see which element will be popped off the stack next.
	 * 
	 * @exception 		java.util.IndexOutOfBoundsException if the stack is empty.
	 * @return  item	the last element added to the stack (the top element)
	 */
	E peek();
	
	/**
	 * This method returns a boolean to determine whether the stack is empty.
	 * 
	 * @return true,false
	 */
	boolean isEmpty();
		
	/**
	 * This method returns an integer the size of the stack.
	 * 
	 * @return int  the size (length) of the stack
	 */
	int getSize();
	
	/**
	 * This method prints the contents of the stack to the console.
	 */
	void display();
	
}
