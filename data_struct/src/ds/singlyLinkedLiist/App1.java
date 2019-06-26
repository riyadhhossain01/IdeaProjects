package ds.singlyLinkedLiist;

public class App1 {

    public static void main(String[] args) {
        Linked_list list = new Linked_list();

        list.head = new Node1(1);
        Node1 second = new Node1(2);
        Node1 third = new Node1(3);



        list.head.next = second;
        second.next = third;
        list.display();
    }
}
