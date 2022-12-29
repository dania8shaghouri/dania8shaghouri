public class Bobble {

    void Bobble(int dizi[]) {
        int n = dizi.length;
        for (int i = 0; i < n - 1; ++i)
            for (int j = 0; j < n - i - 1; ++j)
                if (dizi[j] > dizi[j + 1]) {

                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;

                    for (int m = 0; m < n; m++) {
                        System.out.print(dizi[m] + " ");
                    }
                    System.out.println(i + 1 + ". aşama ");
                }
    }

    // void Yazdir(int dizi[]) {
    // int n = dizi.length;
    // for (int i = 0; i < n; i++)
    // System.out.print(dizi[i] + " ");
    // System.out.println();
    // }

    public static void main(String args[]) {
        Bobble s = new Bobble();
        int dizi[] = { 2, 99, 13, 0, 9, 80, 1 };
        s.Bobble(dizi);
        System.out.println("bubble olarak siralama: ");
        // s.Yazdir(dizi);
    }
}
