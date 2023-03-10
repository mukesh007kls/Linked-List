package org.stack;

import org.linkedList.INode;
import org.linkedList.MyLinkedList;

public class Stack<K> {
    private MyLinkedList<K> myLinkedList;
    public Stack(){
        myLinkedList=new MyLinkedList<>();
    }

    public void push(INode<K> node){
        myLinkedList.add(node);
    }

    public void printStack() {
        myLinkedList.printList();
    }

    public INode<K> peak(){
        return myLinkedList.head;
    }
}
