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

}
