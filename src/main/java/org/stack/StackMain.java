package org.stack;

import org.linkedList.INode;
import org.linkedList.MyLinkedList;
import org.linkedList.MyNode;

public class StackMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();

        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);

        Stack myStack=new Stack<>();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        myStack.printStack();
        myStack.peak();
    }
}
