package linkedlist;

import linkedlist.singlylinkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        SinglyLinkedList.insertFront(0);
        SinglyLinkedList.insertInBetween(1,1);
        SinglyLinkedList.insertInBetween(2,2);
        SinglyLinkedList.insertInBetween(3,3);
        SinglyLinkedList.insertInBetween(4,4);
        SinglyLinkedList.insertLast("last");
        SinglyLinkedList.traverse();
        System.out.println("removed from list at index 6 value "+SinglyLinkedList.removeInBetween(6));
        System.out.println("removed from list at index 0 value "+SinglyLinkedList.removeInBetween(0));
        SinglyLinkedList.traverse();
        System.out.println("removed at index 4 value "+SinglyLinkedList.removeInBetween(4));
        SinglyLinkedList.traverse();
        System.out.println("remove from front "+SinglyLinkedList.removeFront());
        System.out.println("remove from end "+SinglyLinkedList.removeLast());
    }
}