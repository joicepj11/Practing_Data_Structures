package tree;

public class Node<T>{

    Node<T> parent;
    Node<T> right;
    Node<T> left;
    int data;

    public Node(Node<T> parent, Node<T> right, Node<T> left, int data) {
        this.parent = parent;
        this.right = right;
        this.left = left;
        this.data = data;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}