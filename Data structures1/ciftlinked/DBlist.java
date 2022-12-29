
public class DBlist {

    Node head;
    Node tail;

    public DBlist() {
        head = null;
        tail = null;
    }

    // basa ekle
    public void add(Node yeni) {
        if (head == null) {
            head = yeni;
            tail = yeni;
        } else {
            yeni.next = head;
            head.prev = yeni;
            head = yeni;

        }

    }
    // sona ekle

    public void sonaekle(Node yeni) {
        if (tail == null) {
            head = yeni;
            tail = yeni;
        } else {
            yeni.prev = tail;
            tail.next = yeni;
            tail = yeni;

        }

    }

    // stack te son giren ilk çikan
    // bastan silme

    public void sil() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

        } else {
            System.out.println("bostur");
        }
    }
//sondan silme
    public void sondansil() {
        if (tail == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }


    // public void ortayaEkle(int b,int yeni){
    //     Node tmp=head;
    //     if(tmp.data==b){
    //         yeni.prev=tmp;
    //         yeni.next=tmp.next;
    //         yeni.next.prev=yeni;
    //         yeni.prev.next=yeni;
            


    //     }
    // }

    public void yazdir() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print("   ");
            System.out.print(tmp.data);
            System.out.print("-");

            tmp = tmp.next;

        }
        System.out.println(" ");

    }

}
