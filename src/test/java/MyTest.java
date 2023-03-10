import org.example.INode;
import org.example.MyLinkedList;
import org.example.MyNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void testToCreateNode() {
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        firstNode.setNext(secondNode);
        secondNode.setKey(30);
        secondNode.setNext(thirdNode);
        thirdNode.setKey(70);
        System.out.println(firstNode);
        boolean result = firstNode.getNext().equals(secondNode) &&
                firstNode.getNext().getNext().equals(thirdNode) &&
                firstNode.getNext().getNext().getNext() == null;
        Assert.assertTrue(result);
    }

    @Test
    public void testToAddAtHead(){
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
        boolean result = newList.head.equals(thirdNode) && newList.head.getNext().equals(secondNode) && newList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void testToAppend(){
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        newList.appendNode(firstNode);
        newList.appendNode(secondNode);
        newList.appendNode(thirdNode);
        newList.printList();
        boolean result = newList.head.equals(firstNode) &&
                newList.head.getNext().equals(secondNode) &&
                newList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void testToInsertInBetween(){
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        newList.appendNode(firstNode);
        newList.appendNode(thirdNode);
        newList.insertBetween(secondNode,firstNode,thirdNode);
        newList.printList();
        boolean result = newList.head.equals(firstNode) &&
                newList.head.getNext().equals(secondNode) &&
                newList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void testToDeleteHead() {
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

        //first deletion
        newList.pop();
        newList.printList();
        boolean result1 = newList.head.getNext().equals(firstNode);
        Assert.assertTrue(result1);

        //second deletion
        newList.pop();
        newList.printList();
        boolean result = newList.head.getNext() == null;
        Assert.assertTrue(result);
    }

    @Test
    public void testToDeleteTail() {
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

        //first deletion
        newList.popTail();
        newList.printList();
        boolean result1 = newList.head.getNext().equals(secondNode) &&
                newList.head.getNext().getNext() == null;
        Assert.assertTrue(result1);

        //second deletion
        newList.popTail();
        newList.printList();
        boolean result = newList.head.getNext() == null;
        Assert.assertTrue(result);
    }
}
