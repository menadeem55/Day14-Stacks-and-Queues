package com.bridgelabz.stackqueue;

public class Stack {

	LinkedList list = new LinkedList(); // declaring linked list

	// add method
	public void push(Object data) {
		list.addLast(data);
	}

	// display method
	public void display() {
		list.display();
	}

	// Pop method
	public void pop() {
		list.deleteFirst();
	}

	public static void main(String[] args) {
		System.out.println("welcome to stack program");

		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}

}
