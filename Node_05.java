public class Node_05{
    Pembeli_05 pembeli;

    Node_05 prev, next;

    Node_05 (Node_05 prev, Pembeli_05 pembeli, Node_05 next){
        this.prev =prev;
        this.pembeli = pembeli;
        this.next = next;
    }
}