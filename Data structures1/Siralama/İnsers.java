class İnsers {
    void İnsert(int dizi[]) {
        int i, k, y;
        int n = dizi.length;
        for (k = 1; k < n; k++) {
            y = dizi[k];

            for (i = k - 1; i >= 0 && y < dizi[i]; i--)
                dizi[i + 1] = dizi[i];
            dizi[i + 1] = y;
            for (int m = 0; m < n; m++)
                System.out.print(dizi[m] + " ");
            System.out.println();
        }
    }

    void diziyiYazdir(int dizi[]) {
        int n = dizi.length;
        for (int i = 0; i < n; ++i)
            System.out.print(dizi[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        İnsers ob = new İnsers();
        int dizi[] = { 2, 34, 17, 5, 0, 99, 1 };
        ob.İnsert(dizi);
        System.out.println("insertion olarak siralamasi: ");
        ob.diziyiYazdir(dizi);
    }
}
