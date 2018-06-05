package tree.bst;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert( bst.getRoot(),50);
        bst.insert(bst.getRoot(),70);
        bst.insert(bst.getRoot(),30);
        bst.insert(bst.getRoot(),20);
        bst.insert(bst.getRoot(),40);
        bst.insert(bst.getRoot(),60);
        bst.insert(bst.getRoot(),80);
        bst.insert(bst.getRoot(),65);
        bst.insert(bst.getRoot(),85);
        bst.insert(bst.getRoot(),55);
        bst.insert(bst.getRoot(),75);
        bst.postOrder(bst.getRoot());
        bst.delete(bst.getRoot(),20);
        bst.inOrderSuccessorPredecessor(bst.getRoot(),50);
        bst.inOrder(bst.getRoot());
        System.out.println(bst.search(bst.getRoot(), 20));
    }
}
