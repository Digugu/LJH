import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void NodeTest(){
        Node node  =  new Node(2);
        Assert.assertEquals(2,node.data);

    }

    @Test
    public void SingleLinkedListTest(){
        Node head = new Node();
        Node node1 = new Node(1);
        SingleLinkedList singleList = new SingleLinkedList(head);
        singleList.addTail(node1);
        Assert.assertEquals(1,singleList.findlastnode().data);
    }
}