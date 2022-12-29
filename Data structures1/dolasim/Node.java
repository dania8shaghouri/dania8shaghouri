public class Node {
    int data;
    Node left;
    Node right;

    public Node(int x) {
        this.data = x;
        this.left = null;
        this.right = null;
    }

    public void displayNode() {
        System.out.print(" " + data + " ");
    }
}