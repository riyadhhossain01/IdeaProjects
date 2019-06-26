package ds.hashmap;
import com.sun.jdi.Value;

import java.util.ArrayList;

public class Has_Map<K, V> {
    // bucketArraylist is used to store array of chains
    private ArrayList<hashNode<K, V>> bucketArray;

    //Current capacity of array list
    private int numBuckets;

    //Current size of array list
    private int size;

    //Constructor(Initializes capacity, size and
    //empty chains
    public Has_Map() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;


        //Create empty chains
        for(int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }

    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //hash function to find index fo a key
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }

    //Returns value for a key
    public V get (K key) {
        //Find head of chain for a given key
        int bucketIndex = getBucketIndex(key);
        //confused need clarification
        hashNode<K, V> head = bucketArray.get(bucketIndex);

        //search key in chian
        while(head != null) {

            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        //if key not found
        return null;
    }


    //remove method for a given key
    public V remove( K key) {
        //Appy has function to find index for a given key
        int bucketIndex = getBucketIndex(key);

        //get heah of chain
        hashNode<K, V> head = bucketArray.get(bucketIndex);

        //search for key in its chain
        hashNode<K, V> prev = null;
        while(head != null) {
            //if key found
            if(head.key.equals(key)){
                break;
            }

            //Else keep moving in chain
            prev = head;
            head = head.next;
        }

        //if the key found
        if( head == null){
            return null;
        }

        //Reduce size
        size--;

        //Remove key
        if(prev != null){
            prev.next = head.next;//need clarification
        }else{
            bucketArray.set(bucketIndex, head.next);
        }

        return head.value;
    }


    //Adds a key value pair to hash
    public void add(K key, V value) {
        //Find head of the chain for a given key
        int bucketIndex = getBucketIndex(key);
        hashNode<K, V> head = bucketArray.get(bucketIndex);

        //check if the key is already present
        while(head != null) {
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        //Insert key in the chain
        size++;
        head = bucketArray.get(bucketIndex);
        hashNode<K, V> newNode = new hashNode<K, V>(key, value);
        bucketArray.set(bucketIndex, newNode);

        //if load factor goes beyond threshold, then
        //double has table size


    }


}
