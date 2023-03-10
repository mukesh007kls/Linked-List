package org.example;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    public MyLinkedList(){
        this.tail=null;
        this.head=null;
    }

    public void add(INode<K> newNode) {
        if(this.tail==null)
            this.tail=newNode;
        if (this.head==null)
            this.head=newNode;
        else {
            INode<K> tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }

    public void appendNode(INode<K> newNode){
        if(this.tail==null)
            this.tail=newNode;
        if(this.head==null)
            this.head=newNode;
        else {
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
    public void printList() {
        StringBuffer myNodes=new StringBuffer("My nodes:-");
        INode<K> tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    public void insertBetween(INode<K> secondNode,INode<K> firstNode,INode<K> thirdNode){
        INode<K> tempNode=head;
        while (tempNode!=firstNode){
            tempNode=tempNode.getNext();
        }
        tempNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
    }
}
