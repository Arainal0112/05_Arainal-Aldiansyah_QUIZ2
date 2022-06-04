public class DoubleLinkedList_05{
    Node_05 head;
    int size;
    Pembeli_05 [] arraybl;

    DoubleLinkedList_05(){
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Pembeli_05 pembeli){
        if(isEmpty()){
            head = new Node_05(null, pembeli, null);
        } else {
            Node_05 newNode = new Node_05(null, pembeli, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Pembeli_05 pembeli){
        if(isEmpty()){
            addFirst(pembeli);
        }else{
            Node_05 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_05 newNode = new Node_05(current, pembeli, null);
            current.next = newNode;
            size++;
        }
    }
    public int size(){
        return size;
    }
    public void print() {
        if (!isEmpty()) {
            Node_05 tmp = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("DATA Antrian");
            System.out.println("+++++++++++++++++++++++");
            while (tmp != null) {
                System.out.println("NO. : " + tmp.pembeli.no_antri+"\tNama : "+tmp.pembeli.nama_pembeli+"\tNo HP : "+tmp.pembeli.no_hp);
                tmp = tmp.next;
        }
        
        System.out.println("\nJumlah Antrian Pembeli : " + size);
        } else {
            System.out.println("Linked List Queue Masih Kosong");
        }
    }

    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println("Data Pembeli "+head.pembeli.nama_pembeli+" Telah Dihapus");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih Kosong!");
        }else if (head.next == null){
            System.out.println("Data Pembeli "+head.pembeli.nama_pembeli+" Telah Dihapus");
            head=null;
            size--;
            return;
        }
        Node_05 current = head;
        while(current.next.next != null){
            current = current.next;
        }
        System.out.println("Data pembeli "+current.next.pembeli.nama_pembeli+" Telah Dihapus");
        current.next = null;
        size--;
    }
    


}