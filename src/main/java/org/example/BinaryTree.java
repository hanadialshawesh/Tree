package org.example;

public class BinaryTree<E> {

    public Node<E> root;
    public int size = 0;

    // There is no head since tail is connected back to head
    public BinaryTree(Node<E> root) {
        this.root = root;
        this.size++;
    }

    public int length() { // how many nodes

        return this.size;
    }

    public boolean isEmpty() {

        return this.size == 0; // return true if size is 0 (LinkedList is empty)+ no root
    }



    public Node  insert (Node node, int value ){
        if(node==null){
            Node m = new Node(value,null,null);
            this.size++;

            return  m;
        }
        if(value< node.data){
            node.left=  insert(node.left,value);

        }else if(value>= node.data){
            node.right=insert(node.right,value);

        }
        return node;
    }

  public boolean Search(Node node, int data){
        if(node==null)
            return false;

        if(data==node.data)
            return true;

        if(data<node.data)
            return Search(node.left,data);
        else
            return Search(node.right,data);


  }

    public void inorderPrintTree(Node root) {
        if (root.left != null)
            inorderPrintTree(root.left);
        System.out.print(root.data + " ");

        if (root.right != null)
            inorderPrintTree(root.right);

    }

    public int MinmumOne(Node root) {
        if (root.left != null) {
            System.out.print(root.data + " ");
        }

        return root.data;

    }

    public Node deleteRecursively(Node root, int value) {
        if (root == null)
            return null;

        if (value < root.data) {
            root.left = deleteRecursively(root.left, value);
        } else if (value > root.data) {
            root.right = deleteRecursively(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int temp = findSmallestValue(root.right);
                root.data = temp;
                root.right = deleteRecursively(root.right, temp);
            }
        }
        return root;
    }

    public int findSmallestValue(Node root) {
        if (root.left == null) {
            return root.data;
        } else
            return findSmallestValue(root.left);

    }

    public void preorderPrint(Node root) {
        System.out.println(root.data);
        if (root.left != null)
            preorderPrint(root.left);
        if (root.right != null)
            preorderPrint(root.right);
    }

    public void postorderPrint(Node root) {
        if (root.left != null)
            preorderPrint(root.left);
        if (root.right != null)
            preorderPrint(root.right);
        else
            System.out.println(root.data);
    }

}
