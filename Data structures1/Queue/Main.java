import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c;
        int i;
        Kuyruk queue = new Kuyruk();
        do {
            System.out.println("istedginiz islemi gir");
            Scanner input = new Scanner(System.in);
            c = input.nextInt();

            switch (c) {
                case 1: {
                    System.out.println("listenin boyutunu gir");
                    int a = input.nextInt();
                    for (i = 0; i < a; i++) {
                        Random rnd = new Random();
                        int randomSayi = rnd.nextInt(100);
                        Node isim = new Node(randomSayi);
                        queue.ekle(isim);
                    }
                    queue.yazdir();
                    break;
                }

                case 2:
                    queue.silme();
                    queue.yazdir();
                    break;

                case 3:
                    System.out.println("aranacak sayiyi gir");
                    int key = input.nextInt();
                    System.out.println(queue.arama(key));
                    queue.yazdir();
                    break;

            }

        } while (c != 5);

    }

}
