package org.example;

public class LinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertarlista(LinkedList Alist) {
        Node currentA = Alist.head;
        Node<T> current = head;
        if (head != null) {
            while (current.next != null) {
                current = current.next;
            }
            while (currentA != null) {
                current.next = currentA;
                currentA = currentA.next;
                current = current.next;
            }
        }
        else {
            head = currentA;
            currentA = currentA.next;
            while (currentA != null) {
                current = currentA;
                currentA = currentA.next;
                current = current.next;
            }

        }


    }
    public void imprimir(){
        if ( head == null){
            System.out.println("Lista sin datos");
        }
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int tamaño() {
        int tamaño = 0;
        Node<T> current = head;
        while (current != null) {
            tamaño++;
            current = current.next;
        }
        return tamaño;
    }

    public void Sublista(int... nums){
        LinkedList<T> sublist = new LinkedList<>();
        for (int num : nums){
            Node currentA = sublist.head;
            Node current = head;
            if (num < tamaño()) {
                if (currentA == null) {
                    int i = 0;
                    while (i < num) {
                        current = current.next;
                        i += 1;
                    }
                    sublist.add((T) current.data);
                } else {
                    int i = 0;
                    while (i < num) {
                        current = current.next;
                        i += 1;
                    }
                    sublist.add((T) current.data);

                }

            }
        }
        sublist.imprimir();
    }




        public static void main (String[]args){
            LinkedList<String> list = new LinkedList<>();
            list.add("Hello");
            list.add("World");
            list.add("Java");
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(1);
            numbers.add(2);
            LinkedList<Double> decimals = new LinkedList<>();
            decimals.add(3.14);
            decimals.add(2.71);
            LinkedList<Double> dec = new LinkedList<>();



            dec.insertarlista(list);
            decimals.insertarlista(dec);
            numbers.insertarlista(decimals);
            //numbers.imprimir();
            System.out.println("<-------------------------------------------><------------------------------------------->");
            numbers.Sublista(1, 5, 8);
        }


}

