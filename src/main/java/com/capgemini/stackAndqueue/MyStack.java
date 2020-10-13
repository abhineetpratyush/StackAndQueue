package com.capgemini.stackAndqueue;

public class MyStack {
	private MyLinkedList myLinkedList;
	public MyStack() {
		myLinkedList = new MyLinkedList();
	}
	
	public void push(INode element) {
		myLinkedList.add(element);
	}
	
	public INode peak() {
		return myLinkedList.head;
	}
	
	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public INode pop() {
		return myLinkedList.pop();
	}
}
