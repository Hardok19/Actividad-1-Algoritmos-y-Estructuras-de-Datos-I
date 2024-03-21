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

    // Método para agregar un elemento al final de la lista
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

    // Método para insertar todos los elementos de otra lista al final de la lista actual
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

    // Método para imprimir todos los elementos de la lista
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

    // Método para obtener el elemento en el índice especificado
    public T obtener(int indice) {
        if (indice < 0 || indice >= tamaño()) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista.");
        }

        Node<T> current = head;
        for (int i = 0; i < indice; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Método para obtener el tamaño de la lista
    public int tamaño() {
        int tamaño = 0;
        Node<T> current = head;
        while (current != null) {
            tamaño++;
            current = current.next;
        }
        return tamaño;
    }

    // Método para verificar si la lista está vacía
    public boolean esVacia() {
        return head == null;
    }

    // Método para obtener una sublista desde la posición de inicio hasta la posición de fin
    public LinkedList<T> subLista1(int inicio, int fin) {
        LinkedList<T> sublista = new LinkedList<>();
        Node<T> current = head;

        if (inicio < 0 || inicio >= tamaño() || fin <= 0 || fin > tamaño() || inicio >= fin) {
            return sublista;
        }

        for (int i = 0; i < inicio; i++) {
            current = current.next;
        }

        for (int i = inicio; i < fin; i++) {
            sublista.add(current.data);
            current = current.next;
        }

        return sublista;
    }

    // Método para obtener una sublista con elementos en los índices especificados (Fue un error por no leer :))
    public LinkedList<T> Sublista(int... nums){
        LinkedList<T> sublist = new LinkedList<>();
        for (int num : nums){
            Node currentA = sublist.head;
            Node current = head;
            if (0 <= num & num < tamaño()) {
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
        return sublist;
    }

    // Método para invertir el orden de los elementos en la lista
    public void invertir() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }







    public static void main (String[]args){
            System.out.println("<-------------------------------------------><------------------------------------------->");
            test test = new test();



            test.testInsertarLista_ListaVacia();
            test.testInsertarLista_ListaNoVacia();
            test.testInsertarLista_ListaActualVacia();

            //Sublista correcta
            test.SubLista1CasoGeneral();
            test.SubLista1PosicionFinalFueraDeRango();
            test.SubLista1PosicionInicialNegativa();



            //sublista de elementos (no es la correcta)
            test.testSublista_CasoGeneral();
            test.testSublista_IndiceMayorQueElTamaño();
            test.testSublista_IndiceNegativo();

            test.testInvertirLista(); // Son 3 también


        }


}

