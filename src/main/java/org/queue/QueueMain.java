package org.queue;

import org.linkedList.INode;
import org.linkedList.MyLinkedList;
import org.linkedList.MyNode;

public class QueueMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();

        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);

        Queue myQueue = new Queue();
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);
        myQueue.printQueue();
        System.out.println(myQueue.size());

        myQueue.dequeue();
        myQueue.printQueue();
        System.out.println(myQueue.size());
        System.out.println(myQueue.checkForEmptyQueue());

        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println(myQueue.size() + "----" + myQueue.checkForEmptyQueue());
    }
}
