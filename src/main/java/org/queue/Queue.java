package org.queue;

import org.linkedList.INode;
import org.linkedList.MyLinkedList;

public class Queue<K> {
    private MyLinkedList<K> myLinkedList;

    Queue() {
        myLinkedList = new MyLinkedList<K>();
    }

    public void enqueue(INode<K> node) {
        myLinkedList.appendNode(node);
    }

    public void printQueue() {
        myLinkedList.printList();
    }

}
