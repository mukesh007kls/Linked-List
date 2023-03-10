package org.example;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.tail = null;
        this.head = null;
    }

    public void add(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void appendNode(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void printList() {
        StringBuffer myNodes = new StringBuffer("My nodes:-");
        INode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void insertBetween(INode<K> secondNode, INode<K> firstNode, INode<K> thirdNode) {
        INode<K> tempNode = head;
        while (tempNode != firstNode) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
    }

    public INode<K> pop() {
        INode<K> tempNode = head;
        head = head.getNext();
        tempNode.setNext(null);
        return tempNode;
    }
    public INode<K> popTail(){
        INode<K> tempNode=tail;
        INode<K> node=head;
        while (!node.getNext().equals(tail)){
            node=node.getNext();
        }
        tail=node;
        tail.setNext(null);
        return tempNode;
    }
    public INode<K> searchForNode(K key){
        INode<K> tempNode=head;
        while (!tempNode.getKey().equals(key)){
            tempNode=(tempNode.getNext());
            if(tempNode.getNext()==null)
                return null;
        }
        return tempNode;
    }
    public void insertAfterNode(INode<K> newNode, INode<K> previousNode){
        INode<K> tempNode=head;
        while (tempNode!=previousNode){
            tempNode=tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }
    public void deleteASpesificNode(INode<K> node){
        INode<K> tempNode=head;
        while(tempNode.getNext()!=node){
            tempNode=tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }
    public int size(){
        int size=0;
        INode<K> tempNode=head;
        while (tempNode!=null){
            tempNode=tempNode.getNext();
            size++;
        }
        return size;
    }
    public void sort(){
        INode<K> tempNode1=head;
        INode<K> tempNode2;
        while (tempNode1!=null){
            tempNode2=tempNode1.getNext();
            while (tempNode2!=null){
                if(tempNode1.getKey() tempNode2.getKey()){

                }
            }
        }
    }
}
