package ds.tree;

public class Node {
    int key;
    String name;
    Node leftchild, rightchild;

    public Node(int key, String name){
        this.key = key;
        this.name = name;

    }

    public String toString() {
        return (name + " has the key " + key);
    }
}
