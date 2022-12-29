public class List {
    Node head;
    Node tail;

    public List() {
        head = null;
        tail = null;
    }

    // basa ekleme
    public void add(Node yeni) {
        if (head == null) {
            head = yeni;
            tail = yeni;
        } else {
            yeni.next = head;
            head = yeni;

        }
    }

    // sona ekleme

    public void sonaEkle(Node yeni) {
        if (tail == null) {
            tail = yeni;
            head = yeni;
        } else {
            tail.next = yeni;
            tail = yeni;
        }
    }

    public void yazdir() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print("   ");
            System.out.print(tmp.ogrAd);
            System.out.print("-");
            tmp = tmp.next;
        }
        System.out.print(" ");

    }

    // bastan silme
    public void silme() {
        if (head == null) {
            System.out.println("liste bos");
        } else {
            head = head.next;
        }
    }

    // sondan silme

    public void sondansil() {
        Node tmp, prev;
        tmp = head;
        prev = null;

        while (tmp != tail) {
            prev = tmp;
            tmp = tmp.next;
        }
        if (prev == null) {
            head = null;
        } else {
            prev.next = null;
            tail = prev;
            return;
        }
    }

    // arama
    String arama(String aranan) {
        String yazdir;
        if (head == null && tail == null) {
            yazdir = "liste bostur";
            return yazdir;
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (tmp.ogrAd == aranan) {
                    yazdir = " eleman bulunduuuuuuuu";

                    return yazdir;

                }
                tmp = tmp.next;
            }

            yazdir = "bulunmadiiii";
            return yazdir;
        }

    }


    //belli elemandan sonra eleman ekleme

    void ekle(String b,String yeni){
        Node tmp=head;
        
        /*if(head==null){
            System.out.println("eleman bulunmadi");
        }

        else{*/
            if(tmp.ogrAd==b){
                
                

            }
            
        }
    }


