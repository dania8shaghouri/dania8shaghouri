
public class Stack {
    private int[] dizi;
    private int top;
    private int max;

    Stack(int size) {
        dizi = new int[size];
        top = -1;
        max = size;

    }

    public void push(int yeni) {
        if (!isFull()) {
            top++;
            dizi[top] = yeni;

        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("listeniz bostur ");
        } else {

            System.out.print(dizi[top] + " - ");
            top--;
        }

    }

    public int peek() {
        return dizi[top];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (top == (max - 1))
            return true;
        else
            return false;
    }

    // public int size() {
    // return top;
    // }

    public void List() {
        if (top == -1) {
            System.out.println("listeniz Bos  yazdiracagim bir sey yoktur yani ");
        }
        for (int i = (top); i >= 0; i--) {
            if (dizi[i] != 0)
                System.out.print(dizi[i] + " ");

        }
    }

}