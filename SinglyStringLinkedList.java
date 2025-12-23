package com.java.cci.practice;

public class SinglyStringLinkedList {

    private Node firstNode;
    private int size;

    private class Node {
        private String value;
        private Node node;

        public Node(String value, Node node) {
            this.value = value;
            this.node = node;
        }
    }


    public boolean prepend(String value) {

        Node  newNode = null;
        if (firstNode == null) {
            newNode = new Node(value, null);
        } else {
            newNode = new Node(value, firstNode.node);

        }
        firstNode = newNode;
        size++;
        return true;

    }

    public boolean append(String value) {

        Node newNode = new Node(value, null);


        while(firstNode !=null && firstNode.node != null) {
            if (firstNode.node == null){
                firstNode.node = newNode;
                size++;
            }
        }

        return true;


    }



        public static void  main(String args []) {

    }
}
