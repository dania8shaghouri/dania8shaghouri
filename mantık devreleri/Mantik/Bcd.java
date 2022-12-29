import java.util.Scanner;

// public class Bcd {
//     // Get valid value
//     public char getValue(int num) {
//         if (num >= 0 && num <= 9) {
//             return (char) (num + '0');
//         } else {
//             return (char) (num - 10 + 'A');
//         }
//     }

//     // Get 4 bit binary value of a digit
//     public String binaryValue(int num, boolean extra) {
//         String result = "";
//         int n = num;
//         while (n > 0) {
//             result = (getValue(n % 2)) + result;
//             n /= 2;
//         }
//         if (extra == true) {
//             // When need to include extra bit
//             n = result.length();
//             while (n < 4) {
//                 result = "0" + result;
//                 n++;
//             }
//         }
//         return result;
//     }

//     // Find BCD addition of given x and y
//     public void bcdAddition(int x, int y) {
//         int sum = x + y;
//         if (sum < 0) {
//             return;
//         }
//         String ans = "";
//         while (sum > 9) {
//             ans = binaryValue(sum % 10, true) + ans;
//             sum = sum / 10;
//         }
//         // Add a first bit
//         ans = binaryValue(sum % 10, false) + ans;
//         // Display calculated result
//         System.out.print("\n (" + x + " + " + y + ")");
//         System.out.print(" : " + ans);
//     }

//     public static void main(String[] args) {
//         Bcd task = new Bcd();

//         task.bcdAddition(5, 5);

//         task.bcdAddition(1, 2);

//         task.bcdAddition(5, 3);

//         task.bcdAddition(111, 132);

//     }
// }

public class Bcd {
    public static void main(String[] args) {
        String bOne, bTwo, sum;
        int iOne, iTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Binary Number");
        bOne = scanner.next();

        System.out.println("Enter Second Binary Number");
        bTwo = scanner.next();
        // Convert Binary numbers to decimal
        iOne = Integer.parseInt(bOne, 2);
        iTwo = Integer.parseInt(bTwo, 2);
        sum = Integer.toHexString(iOne + iTwo);

        System.out.println("Sum = " + Integer.toBinaryString(iOne + iTwo));
        // System.out.println("Difference = " + Integer.toBinaryString(iOne - iTwo));
        // System.out.println("Product = " + Integer.toBinaryString(iOne * iTwo));
        // System.out.println("Quotient = " + Integer.toBinaryString(iOne / iTwo));

    }
}