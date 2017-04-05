package ds.queue;

/**
 * This is a queue interface, to be used with two queue classes - a bounded
 * queue and a singly-linked queue. The user can enqueue and dequeue items to and 
 * from the queue, as well as peek at the first element, determine if the queue
 * is empty, get the size of the queue, and display the queue in the console.
 * 
 * @author Seth Goodman
 *
 * @param <E>
 */
public interface Queue <E> {
	
	/**
	 * This method adds the item to the back of the queue.
	 * 
	 * @param  	item 	element to be added to queue.
	 * @exception		java.util.IndexOutOfBoundsException if the queue is full (only for array implementation)
	 */
	void enqueue(E item);
	
	/**
	 * This method removes and returns the first item in the queue.
	 * 
	 * @exception   	java.util.NoSuchElementException if the queue is empty.
	 * @return 	item 	the first element in the queue. 
	 */
	E dequeue();
	
	/**
	 * This method returns a boolean determining whether the stack is empty.
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
	 * This method returns the first item in the queue without removing it, allowing the 
	 * user to see which element will be dequeued next.
	 * 
	 * @exception 		java.util.IndexOutOfBoundsException if the stack is empty.
	 * @return  item	the last element added to the stack (the top element)
	 */
	E peek();
	
	/**
	 * This method prints the contents of the queue to the console. 
	 */
	void display();
	
}
