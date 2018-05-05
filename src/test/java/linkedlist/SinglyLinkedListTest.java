package linkedlist;

import linkedlist.singlylinkedlist.SinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void removeFront() throws Exception {
        SinglyLinkedList.insertFront(78);
        SinglyLinkedList.insertLast(2345);
        SinglyLinkedList.insertFront(9);
        int data = SinglyLinkedList.removeFront();
        Assert.assertEquals(9, data);
    }

    @Test
    public <T> void removeLast() throws Exception{
        SinglyLinkedList.insertFront(67.00);
        SinglyLinkedList.insertFront("joice");
        SinglyLinkedList.insertLast(9);
        T data = SinglyLinkedList.removeLast();
        Assert.assertEquals(9, data);
    }

    @Test
    public  <T> void removeInBetween() throws Exception {
        SinglyLinkedList.insertInBetween(0,0);
        SinglyLinkedList.insertInBetween(1,1);
        SinglyLinkedList.insertInBetween(2,2);
        T data = SinglyLinkedList.removeInBetween(0);
        Assert.assertEquals(0, data);
        data = SinglyLinkedList.removeInBetween(1);
        Assert.assertEquals(2, data);
        data = SinglyLinkedList.removeInBetween(0);
        Assert.assertEquals(1, data);
    }

    @Test
    public void isReferenceNull() {
        Assert.assertTrue(SinglyLinkedList.checkForNull(null));
    }

    @Test
    public void isReferenceNotNull() {
        Assert.assertFalse(SinglyLinkedList.checkForNull(1));
    }
}