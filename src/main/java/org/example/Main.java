package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner san = new Scanner(System.in);
        System.out.print("Please enter the size of the node ");
        int size = san.nextInt();
        System.out.print("please enter the root:");
        int r= san.nextInt();


        Node<Integer> root = new Node<Integer>(r, null, null);
        BinaryTree sll = new BinaryTree(root);
        for (int i = 1; i <= size; i++) {

            sll.insert(root,i);

        }

        boolean exitCode = true;
        while (exitCode) {
            int mainchoice;

            System.out.println(" ");
            System.out.println("Please enter the service");
            System.out.println(" 1. Size 2. isEmpty 3.AddNode 4.search 5. Exit");
            mainchoice = san.nextInt();
            switch (mainchoice) {
                case 1 -> {
                    System.out.println(sll.length());
                }
                case 2 -> sll.isEmpty();
                case 3 -> {
                    int key;
                    System.out.println("please enter the Node to add it ");
                    key = san.nextInt();
                    Node <Integer> NewNode = new Node(key, null, null);
                    sll.insert(root, key);
                      System.out.println("these are the numbers after add it");
                     sll.inorderPrintTree(root);
                }
                case 4 -> {
                    System.out.println("please enter the Node to search it ");
                    int key;
                    key=san.nextInt();
                    System.out.print(sll.Search(root,key));


                }
                case 5 -> {
                    System.out.println("Thank you. Code exit done");
                    exitCode = false;
                }
            }
            }
    }
}