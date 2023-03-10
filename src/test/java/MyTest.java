import org.example.INode;
import org.example.MyNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void myFirstTest(){
        INode<Integer> firstNode=new MyNode<>();
        INode<Integer> secondNode=new MyNode<>();
        INode<Integer> thirdNode=new MyNode<>();
        firstNode.setKey(56);
        firstNode.setNext(secondNode);
        secondNode.setKey(30);
        secondNode.setNext(thirdNode);
        thirdNode.setKey(70);
        boolean result=firstNode.getNext().equals(secondNode)&&firstNode.getNext().getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }
}
