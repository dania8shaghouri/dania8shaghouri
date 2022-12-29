import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DBlist d = new DBlist();
        int c;
        int n1;
        Node e;
        do {
            System.out.println("istedigin islemi sec");
            Scanner input = new Scanner(System.in);
            c = input.nextInt();

            switch (c) {
                case 1:
                    System.out.println("eklenecek elemanlar");
                    Scanner num = new Scanner(System.in);
                    n1 = num.nextInt();
                    e = new Node(n1);
                    d.add(e);
                    d.yazdir();
                    break;

                case 2:
                    System.out.println("sona eklenecek elemanlari gir");
                    Scanner num2 = new Scanner(System.in);
                    n1 = num2.nextInt();
                    e = new Node(n1);
                    d.sonaekle(e);
                    d.yazdir();
                    break;

                case 3:
                    d.sil();
                    d.yazdir();
                    break;

                case 4:
                    d.sondansil();
                    d.yazdir();
                    break;

                    
            }

        } while (c != 6);

    }
}

// Node x = new Node(41);
// Node y = new Node(4);
// Node z = new Node(5);
// Node x1 = new Node(3);

// d.sonaekle(x);
// d.yazdir();

// d.sonaekle(y);
// d.yazdir();

// d.sonaekle(z);
// d.yazdir();

// d.sonaekle(x1);
// d.yazdir();

// d.sonaekle(y);
// d.yazdir();

// d.sil();
// d.yazdir();

// d.sondansil();
// d.yazdir();
