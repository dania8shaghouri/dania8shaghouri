
//1 klavyeden girilen decimal olarak iki sayinin BCD karsiligi
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         Scanner s2 = new Scanner(System.in);

//         System.out.println(" decimal olarak iki sayi gir");
//         int n = s.nextInt();
//         int n2 = s2.nextInt();

//         String bcd = "";
//         while (n != 0) {
//             int r = n % 10;
//             String tmp = Integer.toBinaryString(r);
//             while (tmp.length() < 4) {
//                 tmp = "0" + tmp;
//             }
//             bcd = tmp + bcd;
//             n = n / 10;
//         }

//         String bcd2 = "";
//         while (n2 != 0) {
//             int r = n2 % 10;
//             String tmp = Integer.toBinaryString(r);
//             while (tmp.length() < 4) {
//                 tmp = "0" + tmp;
//             }
//             bcd2 = tmp + bcd2;
//             n2 = n2 / 10;
//         }

//         System.out.println("bcd karsiligi :" + bcd);
//         System.out.println("bcd karsiligi :" + bcd2);
//     }
// }

//2  binary olarak iki sayinin toplanmasi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("1.sayiyi gir: ");
        binary1 = in.nextLong();
        System.out.print("2.sayiyi gir: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("sayilarin toplami binary olarak: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

    }

}
