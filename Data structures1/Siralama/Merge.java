
public class Merge {
    private int[] dizi;

    public Merge(int[] diziToSort) {
        dizi = diziToSort;
    }

    public int[] getList() {
        return dizi;
    }

    public void sort() {
        dizi = sort(dizi);
    }

    private int[] sort(int[] dizi) {
        if (dizi.length == 1)
            return dizi;
        else {
            int[] left = new int[dizi.length / 2];
            System.arraycopy(dizi, 0, left, 0, left.length);

            for (int i = 0; i < dizi.length; i++)
                System.out.print(dizi[i] + " ");
            System.out.println("");

            int[] right = new int[dizi.length - left.length];
            System.arraycopy(dizi, left.length, right, 0, right.length);

            for (int i = 0; i < dizi.length; i++)
                System.out.print(dizi[i] + " ");
            System.out.println("");

            left = sort(left);
            right = sort(right);

            for (int i = 0; i < dizi.length; i++)
                System.out.print(dizi[i] + " ");
            System.out.println("");
            merge(left, right, dizi);

            return dizi;
        }
    }

    private void merge(int[] left, int[] right, int[] risulte) {
        int x = 0;
        int y = 0;
        int k = 0;
        while (x < left.length && y < right.length) {
            if (left[x] < right[y]) {
                risulte[k] = left[x];
                x++;
            } else {
                risulte[k] = right[y];
                y++;
            }
            k++;
        }
        int[] rest;
        int restIndex;
        if (x >= left.length) {
            rest = right;
            restIndex = y;
        } else {
            rest = left;
            restIndex = x;
        }
        for (int i = restIndex; i < rest.length; i++) {
            risulte[k] = rest[i];
            k++;
        }
    }

    public static void main(String[] args) {
        int[] dizi = { 22, 5, 12, 13, 88, 7, 9, 13, 17, 55, 15, 33 };
        System.out.println("Sirasiz:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        Merge sira = new Merge(dizi);
        sira.sort();
        System.out.println("");
        System.out.println("merge olarak siralamasi:");
        int[] sirali = sira.getList();
        for (int i = 0; i < sirali.length; i++) {
            System.out.print(sirali[i] + " ");
        }
    }
}
