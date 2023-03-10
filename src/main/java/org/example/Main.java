package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        INode<Integer> fifthNode = new MyNode<>();
        INode<Integer> sixthNode = new MyNode<>();

        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);


        newList.add(firstNode);
        newList.add(secondNode);
        newList.add(thirdNode);
        newList.printList();

        //search for a node
        System.out.println(newList.searchForNode(30));
    }
}