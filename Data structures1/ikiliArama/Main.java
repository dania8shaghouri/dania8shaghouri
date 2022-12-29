public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Min degei : " + tree.findMinValue());
        System.out.println("Max degeeri : " + tree.findMaxValue());

        System.out.println("kucukten buyuge (inorder)");
        tree.inorder();

        boolean aranan = tree.search(5);
        System.out.println("\naranan deger nulundu mu : " + aranan);

        System.out.println("\nsilinen 20");
        tree.deleteKey(20);

        System.out.println("elemani sildikten sonra inordedr");
        tree.inorder();
    }
}
