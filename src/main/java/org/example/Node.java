package org.example;

public class Node<E > {
    public int data;
    public Node<E> left;
    public Node<E> right;


    public Node(int data, Node<E> left, Node<E> right) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}