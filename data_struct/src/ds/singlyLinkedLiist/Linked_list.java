package ds.singlyLinkedLiist;

public class Linked_list {
     Node1 head;

    public void display() {
        Node1 n = head;

        while( n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void insertNode(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int key) {
        //store head node

        Node1 temp = head;
        Node1 prev = null;

        // head itself holds the key to be deleted
        if(temp !=null && temp.data == key) {
            head = temp.next; // changed the head
            return;
        }
        // search for the key to be deleted, keep track of the
        //previos node as we need to change the temp.next
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

    }




}
