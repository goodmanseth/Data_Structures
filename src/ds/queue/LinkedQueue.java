package ds.queue;

public class LinkedQueue <E> implements Queue <E> {
	private class Node {
		public E data;
		public Node next;
		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public Node front = null;
	private int size = 0;

	@Override
	public void enqueue(E item) {
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	
}
