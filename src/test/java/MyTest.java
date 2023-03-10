import org.example.INode;
import org.example.MyLinkedList;
import org.example.MyNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void myFirstTest() {
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(70);
        secondNode.setKey(30);
        thirdNode.setKey(56);
        newList.add(firstNode);
        newList.add(secondNode);
        newList.add(thirdNode);
        newList.printList();
        boolean result = newList.head.equals(thirdNode) &&
                newList.head.getNext().equals(secondNode) &&
                newList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }
}
