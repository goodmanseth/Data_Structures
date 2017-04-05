package ds.stack;

public class StackImplement {
	
	public static void main(String[] args) {
		Stack<Integer> newStack = new LinkedStack<Integer>();
		int i = 0;
		while (i < 5) {
			newStack.push(i++);
			newStack.display();
			System.out.printf("Size: %d\n", newStack.getSize());
		}
				
		while (!newStack.isEmpty()) {
			newStack.pop();
			newStack.display();
			System.out.printf("Size: %d\n", newStack.getSize());
			i--;
		}
	}
}
