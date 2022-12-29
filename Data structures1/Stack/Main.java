import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stack yigin = new Stack(10);

        yigin.push(10);
        yigin.push(15);
        yigin.push(24);
        // yigin.pop ile print yazma icinde var
        yigin.push(43);
        yigin.push(65);
        yigin.push(12);
        yigin.push(50);

        System.out.print("\nsilinecek elemanlar");
        yigin.pop();
        yigin.pop();
        yigin.pop();

        yigin.push(75);

        System.out.print("\nlisteniz:");
        yigin.List();

        System.out.println("\npeek :" + yigin.peek());

    }
}