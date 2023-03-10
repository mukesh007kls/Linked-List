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
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        newList.appendNode(firstNode);
        newList.appendNode(thirdNode);
        newList.insertBetween(secondNode, firstNode, thirdNode);
        newList.printList();

        //first deletion
        newList.pop();
        newList.printList();
        boolean result1 = newList.head.getNext().equals(thirdNode);
        Assert.assertTrue(result1);

        //second deletion
        newList.pop();
        newList.printList();
        boolean result = newList.head.getNext() == null;
        Assert.assertTrue(result);
    }
}
