import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node e;
        String isim;
        // int number;
        int c; // case i secmek icin
        List listemiz = new List();

        do {
            System.out.println("istedigin islemi sec");
            Scanner input = new Scanner(System.in);
            c = input.nextInt();

            switch (c) {
                case 1:
                    System.out.println("eklenecek ograncinin adi");
                    Scanner ad = new Scanner(System.in);
                    isim = ad.nextLine();
                    e = new Node(isim, isim, null);
                    listemiz.add(e);
                    listemiz.yazdir();
                    break;

                case 2:
                    System.out.println("sona eklenecek ogrencinin adi");
                    Scanner ad2 = new Scanner(System.in);
                    isim = ad2.nextLine();
                    e = new Node(isim, isim, null);
                    listemiz.sonaEkle(e);
                    listemiz.yazdir();
                    break;

                case 3:
                    listemiz.silme();
                    listemiz.yazdir();
                    break;

                case 4:
                    listemiz.sondansil();
                    listemiz.yazdir();
                    break;

                case 5:
                    System.out.println("aranan ogrencinin ismini gir");
                    Scanner key = new Scanner(System.in);
                    String x = key.nextLine();
                    listemiz.arama(x);
                    System.out.println(listemiz.arama(x));
                    listemiz.yazdir();
                    break;

            }

        } while (c != 8);

    }

}
