import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Tree agac = new Tree();

        System.out.print("agacin elemanlari: ");
        for (int i = 0; i <= 10; i++) {
            int sayi = (int) (Math.random() * 100);
            System.out.print("," + sayi);
            agac.insert(sayi);
        }
        ;

        System.out.println("\nsayilarin preorder olarak dolasmasini:");
        agac.preorder(agac.getRoot());

        System.out.println("\nsayilarin inorder olarak dolasmasini:");
        agac.inorder(agac.getRoot());

        System.out.println("\nsayilarin postorder olarak dolasmasini:");
        agac.postorder(agac.getRoot());

    }

}
