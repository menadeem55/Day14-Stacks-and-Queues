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
	 * Crate new node to be added
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}

	/*
	 * Adding to linked list if the linked list empty then make the new node as head
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

	// Delete position
	public void deleteFirst() {
		head = head.ref;
	}

	/*
	 * Display position no insertion will take place if list empty
	 */
	public void display() {
		if (head == null)
			System.out.println("No elements in list");
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.ref != null)
					System.out.print(temp.data + " > ");
				else
					System.out.println(temp.data);

				temp = temp.ref;
			}
		}
	}

	// delete method
	public void deleteLast() {
		if (head == null)
			System.out.println("List is Empty");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;
			// we need to go till 2nd last element to delete last node
			while (temp.ref.ref != null) {
				temp = temp.ref;
			}
			temp.ref = null;
		}
	}

	// search method
	public Object searchData(Object input) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == input) {
				return temp.data;
			}

			temp = temp.ref;
		}
		return null;
	}

	public void addNodeAtPosition(Object data, int position) {
		Node newNode = new Node(data);
		int index = 0;
		Node left = head;
		Node right = left.ref;
		while (index < position) { // initializing position
			index++;
			left = left.ref;
			right = right.ref;
		}
		newNode.ref = right;
		left.ref = newNode;
	}

	// delete node position
	public void deleteNodeAtPosition(int position) {
		int index = 0;
		Node left = head;
		Node right = left.ref;
		while (index < position - 1) {
			left = left.ref;
			right = right.ref;
			index++;
		}
		left.ref = right.ref;
	}

}