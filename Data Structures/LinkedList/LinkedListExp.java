import java.util.Scanner;

/**
 * Each node of the linked list is represented by class Node
 */
class Node {
	Node next;
	int item;
}

/**
 * class Linked List is where all the operations on linked list can be performed
 */

class LinkedList {
	Node first;

	boolean isEmpty() {
		if (first==null) {
			return true;
		} return false;
	}

	int size() {
		if(isEmpty()) {
			return 0;
		} else {
			Node current = first;
			int sizeCounter = 0;

			while(current!=null) {
				current = current.next;
				sizeCounter++;
			}
			return sizeCounter;
		}
	}

	void insertAtBeginning(int x) {
		Node naya = new Node();
		naya.item = x;
		naya.next = first;
		first = naya;
	}

	void insertAtEnd(int x) {
		Node naya = new Node();
		naya.item = x;
		Node current = first;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = naya;
	}

	void insertAtPosition(int position, int x) {
		int listSize = size();
		if(listSize>=position && position>0) {
			if(position==1) {
				insertAtBeginning(x);
			} else {

				Node naya = new Node();
				naya.item = x;

				Node current = first;
				for (int i = 2; i < position && current!=null; i++) { // index starts from 2 bz Node first is itself at index 1
					current = current.next;
				}
				if(current !=null) {
					naya.next = current.next;
					current.next = naya;
				} else {
					System.out.println("invalid position entered");
				}
			}
		} else {
			if (position==0) {
				System.out.println("position 0 is invalid. Position starts from 1");
			} else {
				System.out.println("invalid position entered");
				System.out.println("size of list is only "+size());
			}
		}
	}

	void deleteFromBeginning() {
		first = first.next;
	}

	void deleteFromEnd() {
		Node current = first;
		while(current.next.next!=null) {
			current = current.next;
		}
		current.next = null;
	}

	void deleteFromPosition(int position) {
		int listSize = size();
		if (position>listSize || position==0) {
			System.out.println("invalid position! Position cannot be zero or greater than the Size of the list i.e. "+listSize);
		} else if(position==1) {
			deleteFromBeginning();
		} else if(position==listSize) {
			deleteFromEnd();
		} else {
			Node current = first;
			Node previous  = null;
			for (int i = 1; i < position; i++) {
				previous = current;
				current = current.next;				
			}
			previous.next = current.next;
		}
	}

	void deleteElement(int x) {
		// still to be coded
	}

	void printList() {
		Node current = first;
		if(!isEmpty()) {
			while (current!=null) {
				System.out.print(current.item+" ");
				current = current.next;
			}
			System.out.println();
		} else {
			System.out.println("list is empty");
		}
	}
}

class LinkedListExp {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Scanner src = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Menu\n1. Insert in the beginning\n2. insert at the end\n3. insert at a specified position\n4. delete from beginning\n5. delete from end\n6. delete from a specified position\n7. delete a specific element\n8. display the contents of the list\n9. display the size of the list\n10. exit\n");

			choice  = src.nextInt();

			switch (choice) {
				case 1: System.out.println("Enter an integer to be inserted in the beginning");
						int x = src.nextInt();
						list.insertAtBeginning(x);
						break;

				case 2: System.out.println("Enter an integer to be inserted at the end");
						x = src.nextInt();
						list.insertAtEnd(x);
						break;

				case 3: System.out.println("Enter an integer to be inserted");
						x = src.nextInt();
						System.out.println("Enter the position at which the integer has to be inserted");
						int position = src.nextInt();
						list.insertAtPosition(position,x);	
						break;

				case 4: list.deleteFromBeginning();
						break;

				case 5: list.deleteFromEnd();
						break;

				case 6: System.out.println("What's the position of the element to be deleted?");
						position = src.nextInt();
						list.deleteFromPosition(position);
						break;

				case 7: // to be coded

				case 8: list.printList();
						break;

				case 9: System.out.println(list.size());
						break;

				case 10: System.out.println("Thanks for using the linked list"); 
						break;
				default : break;
			}

		} while (choice!=10);

	}
}