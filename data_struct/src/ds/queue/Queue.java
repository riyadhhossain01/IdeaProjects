package ds.queue;

public class Queue {

    private int maxSize; // initialize the set number of slots
    private long[] queArray; // slots of main the data
    private int front; // index position for thefront element
    private int rear; //index position of the back of the line
    private int nItems; // pointer to maintain the items in our queue

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; //index position of the first of the array
        rear = -1; // there is no item in the array as the last item.
        nItems = 0;// no elements in the array yet

    }

    public void insert(long j) {
        if(rear == maxSize - 1){
            rear = -1;
        }
        rear++;
        queArray[rear] = j;
        nItems++;

    }

    public long remove() { //remove item from the front
        long temp =  queArray[front];
        front++;
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty() {
        return  (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void view() {
        System.out.print("[");
        for(long i : queArray) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }




}
