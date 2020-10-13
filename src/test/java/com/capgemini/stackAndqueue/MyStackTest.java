package com.capgemini.stackAndqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> myNode = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}
	
	@Test
	public void given3NumbersInStack_WhenPopped_ShouldMatchWithLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> poppedNodeOne = myStack.pop();
		myStack.printStack();
		INode<Integer> poppedNodeTwo = myStack.pop();
		myStack.printStack();
		INode<Integer> poppedNodeThree = myStack.pop();
		Assert.assertEquals(myThirdNode, poppedNodeOne);
	}
}
