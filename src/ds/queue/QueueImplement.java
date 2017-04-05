package ds.queue;

public class QueueImplement {
	
	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(5);
		int i = 0;
		while (!newQueue.isFull()){
			newQueue.enqueue(i++);
			newQueue.display();
			System.out.printf("%d\n", newQueue.getSize());
		}
		
		while (!newQueue.isEmpty()) {
			newQueue.dequeue();
			newQueue.display();
			System.out.printf("%d\n", newQueue.getSize());
		}
	}
}
