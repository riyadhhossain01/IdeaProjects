package ds.singlyLinkedLiist;

public class App {

    public static void main(String[] args){
        SinglyLinkedList mylist = new SinglyLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.inserLast(9999);


        mylist.displayList();
    }
}
