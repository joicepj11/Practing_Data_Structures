package linkedlist.doublylinkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {

    DoublyLinkedList doublyLinkedList;

    @Before
    public void setUp() throws Exception {
        doublyLinkedList = new DoublyLinkedList();
    }

    @Test
    public void size() {
     assertEquals(0, doublyLinkedList.size());
    }

    @Test
    public void isEmpty() {
        assertTrue(doublyLinkedList.isEmpty());
    }

    @Test
    public void first() {
        doublyLinkedList.addFirst("joice");
        assertEquals("joice",doublyLinkedList.first());
        doublyLinkedList.removeFirst();
    }

    @Test
    public void last() {
        doublyLinkedList.addLast("PJ");
        assertEquals("PJ",doublyLinkedList.last());
        doublyLinkedList.removeLast();
    }

    @Test
    public void addFirst() {
        doublyLinkedList.addFirst("joice");
        assertEquals("joice",doublyLinkedList.removeFirst());
    }

    @Test
    public void addLast() {
        doublyLinkedList.addLast("PJ");
        assertEquals("PJ",doublyLinkedList.removeLast());
    }

    @Test
    public void removeFirst() {
        doublyLinkedList.addFirst("joice");
        doublyLinkedList.addFirst("joice");
        doublyLinkedList.addFirst("joi");
        assertEquals("joi",doublyLinkedList.removeFirst());
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
    }

    @Test
    public void removeLast() {
        doublyLinkedList.addFirst("joice");
        doublyLinkedList.addLast("PJ");
        assertEquals("PJ",doublyLinkedList.removeLast());
        doublyLinkedList.removeLast();
    }

    @Test
    public void traverse() {
        doublyLinkedList.traverse();
    }
}