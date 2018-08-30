/*

Program to implement stack using java

*/

import java.util.Scanner;

class Stack {
	private int top;			// indicated the current top of stack
    	int items[];				// stack datastructer

	Stack(int length) {
        	this.items = new int[length]; 	// initializing the stack with user defined size
		top = -1;			// intializing the top of stack (empty)
    	}

	private boolean isFull() {
		if(top==items.length-1) { 		// if the top = | items |
			return true;
		}
		return false;
	}

	private boolean isEmpty() {
		if(top==-1) {		// if stack has not elements
			return true;
		} 
		return false;
	}

	public void push(int x) {
		if(!isFull()) { 		// if stack is not full
			top++;			// increment the top of stack
			items[top] = x; 	// assign the new value to current top of stack
		} else {
			System.out.println("Stack is full! cannot be pushed");
		}
	}
	
	public int pop() {
		if(!isEmpty()) { 
			int x = items[top];
			top--;
			return x;
		} else {
			System.out.println("Stack is empty! cannot be popped");
			return -1; 		// stack is empty
		}
	}

	public void printStack() {
		if(!isEmpty()) {
			for(int i=top;i>=0;i--) {
				System.out.println(items[i]);
			}
		} else {
			System.out.println("Stack is empty");
		}
	}
}

class StackExp {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);

		System.out.println("What should be the length of the stack");
		int length = src.nextInt();

		Stack s = new Stack(length);

		int choice = 0;

		do {
			System.out.println("Enter a choice\n1. push\n2. pop\n3. display stack\n 4. Exit");
			choice = src.nextInt();
			
			switch(choice) {
				case 1: System.out.println("enter an element to be pushed");
					int x = src.nextInt();
					s.push(x);
					break;
				case 2: int poppedElement = s.pop();
					if(poppedElement!=-1) {
						System.out.println("Popped element is:"+poppedElement);
					}
					break;
				case 3: s.printStack();
					break;
				case 4: break;
	
				default: System.out.println("enter a valid choice");

			}

		} while(choice!=4);
	}
}