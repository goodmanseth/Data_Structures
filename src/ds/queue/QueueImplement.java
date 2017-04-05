package ds.queue;

public class QueueImplement {
	
	public static void main(String[] args) {
		LinkedQueue newQueue = new LinkedQueue();
		int i = 0;
		while (i < 5){
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
