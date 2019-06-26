package ds.singlyLinkedLiist;

public class SinglyLinkedList {
    private Node first;


    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    // use to insert at beginning
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void inserLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node current = first;
        while(current.next !=null){
            current = current.next;
        }
        current.next = newNode;

    }

    public Node deleteFirst() {
        Node temp = first;
        first = first .next;
        return temp;
    }

    public void displayList() {
        System.out.println("List 9first --> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
