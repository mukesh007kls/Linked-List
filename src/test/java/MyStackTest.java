import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.linkedList.INode;
import org.linkedList.MyLinkedList;
import org.linkedList.MyNode;
import org.stack.Stack;

public class MyStackTest {
    @Test
    public void checkLatestNodeIsLastEnteredNode(){
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();

        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);

        Stack myStack=new Stack<>();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        myStack.printStack();
        INode<Integer> peak=myStack.peak();
        Assert.assertEquals(thirdNode,peak);
    }
}
