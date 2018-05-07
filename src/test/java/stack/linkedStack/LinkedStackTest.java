package stack.linkedStack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedStackTest {

    LinkedStack linkedStack;

    @Before
    public void setUp() throws Exception {
        linkedStack = new LinkedStack();
        linkedStack.push(123);
    }

    @Test
    public void isEmpty() {
        LinkedStack linkedStack1 = new LinkedStack();
        assertTrue( linkedStack1.isEmpty());
    }

    @Test
    public void size() {
        LinkedStack linkedStack1 = new LinkedStack();
        assertEquals(0, linkedStack1.size());
    }

    @Test
    public  <T> void push() {
        linkedStack.push("abcd");
        T data  = (T) linkedStack.peek();
        assertEquals(data,linkedStack.pop());
    }

    @Test
    public void pop() {
        linkedStack.push("qw");
        assertNotNull(linkedStack.pop());
    }

    @Test
    public void peek() {
        assertEquals(123,linkedStack.pop());
    }
}