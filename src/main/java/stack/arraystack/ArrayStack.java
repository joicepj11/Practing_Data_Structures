package stack.arraystack;

import stack.Stack;

public class ArrayStack<E> implements Stack<E> {

    private E data[];
    private int top = -1;

    public ArrayStack() {
        this(100);
    }

    public ArrayStack(int size) {
        data = (E[]) new Object[size];
    }


    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean push(E data) {
        // here i could have increased size of array, using System.arrayCopy() but there is no gaurentee in size
        if(size() == this.data.length){
            return false;
        }else{
            this.data[++top] = data; // increment top before storing new item
            return true;
        }
    }

    @Override
    public E pop() {
        if(isEmpty()){
            return (E) "Stack is Empty";
        }
        E answer = data[top];
        data[top] = null; // dereference to help garbage collection
        top--;
        return answer;
    }

    @Override
    public E peek() {
       if(isEmpty()){
           return (E) "Stack is Empty";
       }else{
           return data[top];
       }
    }
}