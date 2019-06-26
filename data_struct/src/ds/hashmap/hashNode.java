package ds.hashmap;
/* a generic map without putting any restrictions on the data
type of the key and the value. Also every hashNode needs to
know the next node it is pointing to in the linked list so
a next pointer is also required.

 */



//A node of chains
public class hashNode<K, V> {
    K key;
    V value;

    //reference to next node
    hashNode<K, V> next;

    //Constructor
    public hashNode(K key,V value) {
        this.key = key;
        this. value = value;
    }


}
