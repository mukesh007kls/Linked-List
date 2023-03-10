package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList=new MyLinkedList<>();
        INode<Integer> firstNode=new MyNode<>();
        INode<Integer> secondNode=new MyNode<>();
        INode<Integer> thirdNode=new MyNode<>();
        firstNode.setKey(70);
        secondNode.setKey(30);
        thirdNode.setKey(56);
        newList.add(firstNode);
        newList.add(secondNode);
        newList.add(thirdNode);
        newList.printList();
    }
}