public class Node {
    String ogrAd;
    String derKod;
    Long ogrNo;
    Node next;
    Node prev;

    public Node(String x, String y, Long z) {
        this.ogrAd = x;
        this.derKod = y;
        this.ogrNo = z;
        this.next = null;
        this.prev=null;

    }
}