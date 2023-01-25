package com.bridgelabz.stackqueue;

public class LinkedList {
	Node head; // head of list

	/*
	 * linked list node
	 */
	class Node {
		Object data;
		Node ref; // reference to next object in the sequence

		Node(Object data) {
			this.data = data;
		}
	}

	/*
	 * Adding to linked list
	 */
	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
		else if (head.ref == null)
			head.ref = newNode;
		else {
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}

	/*
	 * Display position no insertion will take place if list empty
	 */
	public void display() {
		Node temp = head;
		if (head == null)
			System.out.println("No elements to show.");
		else {
			while (temp != null) {
				if (temp.ref != null)
					System.out.print(temp.data + " > ");
				else
					System.out.println(temp.data);

				temp = temp.ref;
			}
		}
	}

}