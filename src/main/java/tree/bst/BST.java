package tree.bst;

import tree.Node;

public class BST {

    private Node root = null;

    void insert(Node root, int data) {
        if (root == null) {
            this.root = createNewNode(data);
        } else {
            Node temp = createNewNode(data);
            if (root.getData() < data) {
                if (root.getRight() == null) {
                    root.setRight(temp);
                    temp.setParent(root);
                } else {
                    insert(root.getRight(), data);
                }
            } else {
                if (root.getLeft() == null) {
                    root.setLeft(temp);
                    temp.setParent(root);
                } else {
                    insert(root.getLeft(), data);
                }
            }
        }
    }

    private Node createNewNode(int data) {
        return new Node(null, null, null, data);
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }

    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    Node getRoot() {
        return root;
    }

    Node pre,suc;
    void inOrderSuccessorPredecessor(Node root, int key) {

        //case 1: If root is NULL then return
        if (root == null) {
            return;
        }
        //case 2. if key is found then
        if (root.getData() == key) {

            if (root.getLeft() != null) {
                // a. If its left subtree is not null
                //  Then predecessor will be the right most
                //  child of left subtree or left child itself.
                Node temp = root.getLeft();
                while (temp.getRight() != null)
                    temp = temp.getRight();
                pre = temp;
            }
            if (root.getRight() != null) {
                // b. If its right subtree is not null
                //  The successor will be the left most child
                //  of right subtree or right child itself.
                Node temp = root.getRight();
                while (temp.getLeft() != null)
                    temp = temp.getLeft();
                suc = temp;
            }
            System.out.println("Predecessor " + pre.getData() + " key =" + key + "  successor " + suc.getData());
            return;
        }

        //case 3. If key is smaller then root node
        else if (root.getData() > key) {
            // set the successor as root
            // search recursively into left subtree
            suc = root;
            inOrderSuccessorPredecessor(root.getLeft(), key);
        } else {
            // set the predecessor as root
            // search recursively into right subtree
            pre = root;
            inOrderSuccessorPredecessor(root.getRight(), key);
        }
    }

    Node delete(Node root, int key) {

        //precondition check for key if key exists then follow the below steps
        if (root == null) {
            return root;
        } else if (key < root.getData()) {
            root.setLeft(delete(root.getLeft(), key));
        } else if (key > root.getData()) {
            root.setRight(delete(root.getRight(), key));
        } else if (key == root.getData()) {
            // 1) Node to be deleted is leaf: Simply remove from the tree.
            if (root.getLeft() == null && root.getRight() == null) {
                root = null;
                // 2) Node to be deleted has only one child: Copy the child to the node and delete the child
            } else if (root.getRight() != null && root.getLeft() == null) {
                root.setData(root.getRight().getData());
                root.setRight(null);
            } else if (root.getRight() == null && root.getLeft() != null) {
                root.setData(root.getLeft().getData());
                root.setLeft(null);
            } else {
                //3) Node to be deleted has two children: Find inorder successor of the node. Copy contents
                // of the in-order successor to the node and delete the inorder successor. Note that inorder
                // predecessor can also be used.
                Node temp = root.getRight();
                while (temp.getLeft() != null)
                    temp = temp.getLeft();
                root.setData(temp.getData());
                temp.getParent().setLeft(null);
            }
        }
        this.root = root;
        return root;
    }

    boolean search (Node root,int key){
        while (root!= null) {
            if (root == null) {
                return false;
            } else if (key == root.getData()) {
                return true;
            }else if (key < root.getData()) {
               root = root.getLeft();
            } else if (key > root.getData()) {
                root = root.getRight();
            }
        }
        return  false;
    }
}