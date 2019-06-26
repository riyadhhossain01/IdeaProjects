package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null; //not required because its automatically generated as null
        this.last = null;//not required because its automatically generated as null
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst (int data) {
        Node newNode = new Node();

        if(isEmpty()){
            last = newNode;
        } else {
            first.previous = newNode;

        }
        newNode.next = first; // new node point to the old
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;
            newNode.previous = last; // the old last will be the newNode's previous
        }
        last = newNode; // the linkedlists last field point to the newNode;

    }
    public Node deleteFirst() {
        Node temp = first;
        if(first.next == null) { // thereis only one item in the list
            last = null;
        }else {
            first.next.previous = null; // the lists first node will point to null
        }
        first = first.next; // assigning the reference of the node following  the old first node to the
        return temp; // return the deleted old node
    }
    public Node deleteLast() {
        Node temp = last;
        if(first.next == null) {
            first = null;
        }else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;

    }

    public boolean inserAfter(int key, int data) {
        Node current = first; // start from beginning
        while(current.data != key) {
            current = current.next;
            if(current == null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if(current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next; // new node next field point ahead tothe current one
            current.next.previous = newNode;// node aheadof current should point to the new node

        }
        newNode.previous = current;
        current.next = newNode;
        return  true;

    }

    public Node deleteKey(int key) {
        Node current = first; // start from begginning
        while(current.data != key) {
            current = current.next;
            if(current == null) {
                return null;
            }


        }
        if(current == first) {
            first = current.next;
            first.previous = null;
        }else if(current == last){
            current.previous.next = null;
            last = current.previous;

        }else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }

        return current;
    }
    public void displayForward(){
        System.out.print("List(first--> Last): ");
        Node current = new Node();
        while(current != null) {
            current.displayNode();
            current = current.next;

        }
        System.out.println();
    }


    public void displayBackward() {
        System.out.print("List(last-->first): ");
        Node current = last;
        while(current !=null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }









}
