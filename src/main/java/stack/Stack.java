package stack;

public interface Stack<E> {
    boolean isEmpty();
    int size();
    boolean push(E data);
    E pop();
    E peek();
}