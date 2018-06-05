package tree.bst;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {

    BST bst = new BST();
    @Test
    public void insert() {
        bst.insert( bst.getRoot(),50);
        assertTrue(bst.search(bst.getRoot(),50));
    }

    @Test
    public void getRoot() {
    bst.insert(bst.getRoot(),70);
    assertNotNull(bst.getRoot());

    BST bst1 = new BST();
    assertNull(bst1.getRoot());
    }

    @Test
    public void delete() {
        bst.insert(bst.getRoot(),10);
        bst.delete(bst.getRoot(),10);
        assertFalse(bst.search(bst.getRoot(),10));
    }

    @Test
    public void search() {
        bst.insert(bst.getRoot(),20);
        assertTrue(bst.search(bst.getRoot(),20));
        assertFalse(bst.search(bst.getRoot(),100000));
    }
}