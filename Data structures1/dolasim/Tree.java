public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void preorder(Node localroot) {
        if (localroot != null) {
            localroot.displayNode();
            preorder(localroot.left);
            preorder(localroot.right);
        }
    }

    public void inorder(Node localroot) {
        if (localroot != null) {
            inorder(localroot.left);
            localroot.displayNode();
            inorder(localroot.right);
        }
    }

    public void postorder(Node localroot) {
        if (localroot != null) {
            postorder(localroot.left);
            postorder(localroot.right);
            localroot.displayNode();
        }
    }

    public void insert(int newdata) {
        Node newNode = new Node(newdata);
        newNode.data = newdata;
        if (root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (newdata < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

}
