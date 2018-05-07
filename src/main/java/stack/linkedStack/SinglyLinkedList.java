package stack.linkedStack;

class SinglyLinkedList<E> {

    class Node<E> {
        private Node<E> next;
        private E element;

        Node(Node<E> next, E element) {
            this.next = next;
            this.element = element;
        }

        E getElement() {
            return element;
        }

        Node<E> getNext() {
            return next;
        }
    }

    private int size = -1;
    private Node<E> head = null;

    public boolean addFront(E data) {
        head = new Node<>(head, data);
        size++;
        return true;
    }

    public int getSize() {
        return size;
    }

    public E removeFront() {
        if (size != -1) {
            size--;
            E data = head.getElement();
            Node previous = head;
            head = head.getNext();
            previous = null; // dereference for garbage collection
            return data;
        } else {
            return (E) "Stack is Empty";
        }
    }

    public E peek() {
        if (size != -1) {
            return head.getElement();
        }
        return (E) "Stack is Empty";
    }
}