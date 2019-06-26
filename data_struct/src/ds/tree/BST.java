package ds.tree;

public class BST {


    Node root;

    //add method

    public void addNode(int key, String name) {
        // creating new node
        Node newNode = new Node(key, name);

        //if tree is empty then root is set to newNode
        if( root == null) {
            root = newNode;
        } else {
            //set root as the Node we will start
            //with as we traverse the tree
            Node focusNode = root;

            Node parent;

            while(true) {
                //root is the top parent se we start there
                parent = focusNode;

                if(key < focusNode.key) {
                    //Switch to left child
                    parent = parent.leftchild;

                    //if the leftchild has no children
                    if(parent == null) {
                        //then place the new node to the left of it
                        parent.leftchild = newNode;
                    }
                } else { // if we are here then node onthe right
                    parent = parent.rightchild;

                    // if the right chils has no children
                    if (parent == null) {
                        // then place the new node on the right of it
                        parent.rightchild = newNode;
                        return;
                    }



                }
            }
        }

    }

    public boolean remove(int key) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = false;
        while(current.key !=key) {
            parent = current;
            if(key < current.key) {
                    isLeftChild = true;
                    current = current.leftchild;
            }else {
                current = current.rightchild;
                isLeftChild = false;
            }

        }// found the node

        Node nodeToDelete = current;

        // if node is leaf
        if(nodeToDelete.leftchild == null && nodeToDelete.rightchild == null) {
            if(nodeToDelete == root) {
                root = null;
            }else if(isLeftChild) {
                parent.leftchild = null;
            }else {
                parent.rightchild = null;
            }
        }

        // if the node has a one child
        else if(nodeToDelete.rightchild == null){
            if(nodeToDelete == root) {
                root = nodeToDelete.leftchild;
            }else if(isLeftChild) {
                parent.leftchild = nodeToDelete.leftchild;
            }else{
                parent.rightchild =nodeToDelete.leftchild;
            }
        }

        // trying to delete a children try to tekect1<

        return true;


    }

}
