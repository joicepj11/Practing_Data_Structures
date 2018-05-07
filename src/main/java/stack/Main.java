package stack;

import stack.arraystack.ArrayStack;

public class Main {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        System.out.println("aaray stack is empty "+arrayStack.isEmpty());
        arrayStack.push("joice");
        arrayStack.push("pj");
        System.out.println("array stack pop "+arrayStack.pop());
        System.out.println("array stack peek "+arrayStack.peek());
        System.out.println("array stack is empty "+ arrayStack.isEmpty());

    }
}
