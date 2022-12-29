class Node
{   //düğüm tanımlama düğümün solu, sağı, taşıyacağı veri bide yüksekliği
    Node left;
    Node right;
    int data;
    int height;
    public Node()//nodun yapıcı fonksiyonu
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }
    public Node(int n)//yeni eleman gelince node dönüşmesi
    {
        left = null;
        right = null;
        data = n;
        height = 0;
    }
}
