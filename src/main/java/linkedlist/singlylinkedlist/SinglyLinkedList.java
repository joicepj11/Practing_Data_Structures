package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class SinglyLinkedList {

    private static Node head;

    public static <T> Boolean checkForNull(T reference){
        return reference == null;
    }

    private static <T> Node returnNewNode(T data) throws Exception {
        if(checkForNull(data)){
                throw new NullPointerException("Data value not provided");
        }else if(data instanceof Integer){
            return new Node<Integer>();
        }else if(data instanceof Float){
            return new Node<Integer>();
        }else if(data instanceof String){
            return new Node<String>();
        }else if(data instanceof Double){
            return new Node<Double>();
        }else if (data instanceof Character){
            return new Node<Character>();
        }
        throw new Exception("Data Type Not Supported");
    }

    public static <T> void insertFront(T data) throws Exception{
        Node node = returnNewNode(data);
        if(checkForNull(head)) {
            node.data = data;
            node.next = null;
        }else{
            node.data = data;
            node.next = head;
        }
        head = node;
    }

    public static <T> T removeFront(){
        T data ;
     if(checkForNull(head)){
         return (T) "Linked List is empty";
     }else{
         data = (T) head.data;
         head = head.next;
     }
     return data;
    }

    public static <T> void insertLast(T data) throws Exception{
        Node node = returnNewNode(data);
        if(checkForNull(head)) {
            node.data = data;
            node.next = null;
            head = node;
        }else{
            Node pointer = head;
            node.next = null;
            node.data = data;
            while (null != pointer.next){
                pointer = pointer.next;
            }
            pointer.next = node;
        }
    }

    public static <T> T removeLast(){
        Node temp = null;
        T data;
        if(checkForNull(head)){
            return (T) "Linked List is empty";
        }else{
            Node forward = head;

            while (forward.next != null){
                temp =forward;
                forward = forward.next;
            }
            data = (T) temp.next.data;
            temp.next = null;
        }
        return data;
    }

    public static <T> void insertInBetween(T data ,int atIndex) throws Exception {
        int count =0;
        if(atIndex == 0){
            Node forwardNode = head;
            Node temp = returnNewNode(data);
            temp.data =data;
            temp.next = forwardNode;
            head = temp;
        }else {
            Node previousNode = head, currentNode = head;
            while (currentNode !=null && atIndex != count){
                previousNode = currentNode;
                currentNode = currentNode.next;
                count++;
            }
            if(atIndex > count){
             throw new Exception("Actual Linked List Size is "+ count +" but your are trying to insert at "+ atIndex);
            }else if(count == atIndex && currentNode != null){
                Node temp = returnNewNode(data);
                temp.data =data;
                previousNode.next = temp;
                temp.next = currentNode ;
            }else {
                insertLast(data);
            }
        }
    }

    public static <T> T removeInBetween(int atIndex){
        if(atIndex < 0){
            return (T) "Index Cannot be negative number";
        }else if(atIndex == 0){
            return removeFront();
        }else{
            int count =0;
            Node previous = null,current = head;
            while (current!= null && count != atIndex){
                previous = current;
                current =current.next;
                count++;
            }
            if (checkForNull(current)) {
                return (T) " Index Out of Bound";
            }
            T data = (T) current.data;
            previous.next = current.next;
            return data;
        }

    }

    public static void traverse(){
        Node pointer = head;
        while (pointer!= null){
            System.out.print(pointer.data + "  ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}