package stack;

import org.junit.Before;
import org.junit.Test;
import stack.arraystack.ArrayStack;

import static org.junit.Assert.*;

public class ArrayStackTest {

    private ArrayStack stack ;
    @Before
    public void setUp() {
        stack = new ArrayStack();
        stack.push("joice");
        stack.push("pj");
    }

    @Test
    public void isEmpty() {
        ArrayStack arrayStack = new ArrayStack();
        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void size() {
        ArrayStack arrayStack = new ArrayStack();
        assertEquals(0,arrayStack.size());
        int size = stack.size();
        assertEquals(size,stack.size());
    }

    @Test
    public void push() {
        assertTrue(stack.push(1234));
    }

    @Test
    public void pop() {
        stack.push(12);
        assertEquals(12,stack.pop());
    }
}