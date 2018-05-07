package stack.linkedStack;

import stack.Stack;

public class LinkedStack<E> implements Stack<E> {

    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    @Override
    public boolean isEmpty() {
        return singlyLinkedList.getSize() == -1;
    }

    @Override
    public int size() {
        return singlyLinkedList.getSize()+1; // because size is -1
    }

    @Override
     public boolean push(E data) {
        return singlyLinkedList.addFront(data);
    }

    @Override
     public E pop() {
        return (E) singlyLinkedList.removeFront();
    }

    @Override
     public E peek() {
        return (E) singlyLinkedList.peek();
    }
}