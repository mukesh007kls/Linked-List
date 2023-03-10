package org.example;

public class Main {
    public static void main(String[] args) {
        INode<Integer> firstNode=new MyNode<>();
        INode<Integer> secondNode=new MyNode<>();
        INode<Integer> thirdNode=new MyNode<>();
        firstNode.setKey(56);
        firstNode.setNext(secondNode);
        secondNode.setKey(30);
        secondNode.setNext(thirdNode);
        thirdNode.setKey(70);
        System.out.println(firstNode);
    }
}