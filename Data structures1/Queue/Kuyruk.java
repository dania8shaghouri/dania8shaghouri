public class Kuyruk {
    Node front;
    Node rear;

    public Kuyruk() {
        this.front = null;
        this.rear = null;
    }

    // fifo da ekleme sondan yapiliyor

    void ekle(Node yeni) {
        if (front == null && rear == null) {
            front = rear = yeni;
        } else {
            rear.next = yeni;
            rear = yeni;
        }
    }

    // fifoda kuyrugun basindaki eleman silinir
    void silme() {
        if (front == null) {
            System.out.println("liste bostur");
        } else {
            front = front.next;
        }
    }

    String arama(int j) {
        String yazd;

        Node tmp = front;
        while (tmp != null) {
            if (tmp.sayi == j) {
                yazd = "eleman bulunduuu";
                return yazd;
            }
            tmp = tmp.next;
        }
        yazd = "eleman bulunmadiiii";
        return yazd;
    }

    void yazdir() {
        Node tmp = front;
        while (tmp != null) {
            System.out.print(tmp.sayi + "  ");
            tmp = tmp.next;
        }
    }

}
