package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        newList.appendNode(firstNode);
        newList.appendNode(thirdNode);
        newList.insertBetween(secondNode, firstNode, thirdNode);
        newList.printList();

        //first node deleted
        newList.popTail();
        newList.printList();

        //second node deleted
        newList.popTail();
        newList.printList();
    }
}