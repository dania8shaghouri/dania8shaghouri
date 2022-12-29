
//import javax.swing.text.DefaultEditorKit.InsertBreakAction;
//import java.io.*;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int deger) {
        root = new Node(deger);
    }

    public int findMinValue() {

        return minDeger(this.root);
    }

    public int findMaxValue() {
        return maxDeger(this.root);

    }

    public void insert(int yeni) {
        root = insertRec(root, yeni);
    }

    // eleman ekleme
    Node insertRec(Node root, int yeni) {

        if (root == null) {
            root = new Node(yeni);
            return root;
        } else if (yeni < root.yeni) {
            root.left = insertRec(root.left, yeni);
        } else if (yeni > root.yeni) {
            root.right = insertRec(root.right, yeni);
        }
        return root;

    }

    // kucukten buyuge siralama
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.yeni + " ");
            inorderRec(root.right);
        }
    }

    // arama

    boolean search(int key) {
        root = searchRec(root, key);
        if (root != null)
            return true;
        else
            return false;
    }

    Node searchRec(Node root, int key) {
        if (root == null || root.yeni == key)
            return root;

        if (root.yeni > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    // silmek

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {

        if (root == null)
            return root;

        if (key < root.yeni)
            root.left = deleteRec(root.left, key);
        else if (key > root.yeni)
            root.right = deleteRec(root.right, key);

        else {
            // node un tek ya da hic cocugu olmayinca
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // iki cocugu varsa inorder kullanarak
            // successor (sag alt agactaki en kuvugu bulmak)
            root.yeni = min(root.right);

            // inorder
            root.right = deleteRec(root.right, root.yeni);
        }
        return root;
    }

    int min(Node root) {
        int minv = root.yeni;
        while (root.left != null) {
            minv = root.left.yeni;
            root = root.left;
        }
        return minv;
    }

    // min degerini bulmak
    private int minDeger(Node deger) {

        if (deger.left != null) {
            return minDeger(deger.left);
        }
        return deger.yeni;
    }

    // max degerini bulmak
    private int maxDeger(Node deger) {

        if (deger.right != null) {
            return maxDeger(deger.right);
        }
        return deger.yeni;
    }

}
