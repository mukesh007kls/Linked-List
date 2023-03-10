package org.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();


        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);


        newList.add(firstNode);
        newList.add(secondNode);
        newList.add(thirdNode);
        newList.printList();

        //Add new node after 30
        INode<Integer> newNode=new MyNode<>();
        newNode.setKey(40);
        newList.insertAfterNode(newNode,secondNode);
        newList.printList();
        System.out.println("Size is:-"+newList.size());
        //delete node 40
        newList.deleteASpesificNode(newNode);
        newList.printList();
        System.out.println("Size is:-"+newList.size());
    }
}