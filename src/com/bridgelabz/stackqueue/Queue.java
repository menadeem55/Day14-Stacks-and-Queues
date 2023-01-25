package com.bridgelabz.stackqueue;

public class Queue {

	LinkedList list = new LinkedList(); // Declaring linked list

	/*
	 * Creating Queue method
	 */
	public void enQueue(Object data) {
		list.addFirst(data);
	}

	public void deQueue() {
		list.deleteFirst();
	}

	// display method
	public void display() {
		list.display();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		Queue queue = new Queue();
		queue.enQueue(70);
		queue.enQueue(30);
		queue.enQueue(56);
		queue.display();
		queue.display();
		queue.deQueue();
		queue.display();
		queue.deQueue();
		queue.display();
		queue.deQueue();
		queue.display();
	}

}
