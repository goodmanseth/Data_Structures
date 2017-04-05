package ds.queue;

public interface Queue <E> {
	
	void enqueue(E item);
	
	E dequeue();
	
	boolean isEmpty();
	
	int getSize();
	
	E peek();
	
	void display();
	
}
