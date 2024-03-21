package org.example;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class test {
    public void testInvertirLista() {
        // Caso 1: Lista con tres elementos
        LinkedList<Integer> lista3 = new LinkedList<>();
        lista3.add(1);
        lista3.add(2);
        lista3.add(3);
        lista3.invertir();
        assertEquals(3, (int) lista3.obtener(0));
        assertEquals(2, (int) lista3.obtener(1));
        assertEquals(1, (int) lista3.obtener(2));

        // Caso 2: Lista con un solo elemento
        LinkedList<Integer> listaUnElemento = new LinkedList<>();
        listaUnElemento.add(1);
        listaUnElemento.invertir();
        assertEquals(1, (int) listaUnElemento.obtener(0));

        // Caso 3: Lista con múltiples elementos
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.invertir();
        assertEquals(4, (int) lista.obtener(0));
        assertEquals(3, (int) lista.obtener(1));
        assertEquals(2, (int) lista.obtener(2));
        assertEquals(1, (int) lista.obtener(3));
    }
    public void testInsertarLista_ListaNoVacia() {
        // Creamos dos listas enlazadas
        LinkedList<Integer> listaActual = new LinkedList<>();
        listaActual.add(1);
        listaActual.add(2);
        listaActual.add(3);

        LinkedList<Integer> listaAInsertar = new LinkedList<>();
        listaAInsertar.add(4);
        listaAInsertar.add(5);

        // Insertamos listaAInsertar en listaActual
        listaActual.insertarlista(listaAInsertar);

        // Verificamos si la listaActual se ha modificado correctamente
        assertEquals(1, (int) listaActual.obtener(0));
        assertEquals(2, (int) listaActual.obtener(1));
        assertEquals(3, (int) listaActual.obtener(2));
        assertEquals(4, (int) listaActual.obtener(3));
        assertEquals(5, (int) listaActual.obtener(4));
    }


    public void testInsertarLista_ListaVacia() {
        // Creamos dos listas enlazadas, una vacía y una con elementos
        LinkedList<Integer> listaActual = new LinkedList<>();
        LinkedList<Integer> listaAInsertar = new LinkedList<>();
        listaAInsertar.add(1);
        listaAInsertar.add(2);

        // Insertamos listaAInsertar en listaActual
        listaActual.insertarlista(listaAInsertar);

        // Verificamos si la listaActual se ha modificado correctamente
        assertEquals(1, (int) listaActual.obtener(0));
        assertEquals(2, (int) listaActual.obtener(1));
    }


    public void testInsertarLista_ListaActualVacia() {
        // Creamos dos listas enlazadas, una con elementos y otra vacía
        LinkedList<Integer> listaActual = new LinkedList<>();
        listaActual.add(1);
        listaActual.add(2);

        LinkedList<Integer> listaAInsertar = new LinkedList<>();

        // Insertamos listaAInsertar en listaActual
        listaActual.insertarlista(listaAInsertar);

        // Verificamos si la listaActual se ha modificado correctamente
        assertEquals(1, (int) listaActual.obtener(0));
        assertEquals(2, (int) listaActual.obtener(1));
    }


    public void testSublista_CasoGeneral() {
        // Creamos una lista enlazada
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Creamos una sublista de la lista original
        LinkedList<Integer> sublista = lista.Sublista(2, 4);

        // Verificamos si la sublista contiene los elementos esperados
        assertEquals(3, (int) sublista.obtener(0));
        assertEquals(5, (int) sublista.obtener(1));
    }


    public void testSublista_IndiceMayorQueElTamaño() {
        // Creamos una lista enlazada
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Creamos una sublista con un índice mayor que el tamaño de la lista
        LinkedList<Integer> sublista = lista.Sublista(5);

        // Verificamos si la sublista está vacía
        Assert.assertTrue(sublista.esVacia());
    }


    public void testSublista_IndiceNegativo() {
        // Creamos una lista enlazada
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Creamos una sublista con un índice negativo
        LinkedList<Integer> sublista = lista.Sublista(-1);

        // Verificamos si la sublista está vacía
        Assert.assertTrue(sublista.esVacia());
    }

    public void SubLista1CasoGeneral() {
        // Creamos una lista enlazada
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Creamos una sublista desde la posición 1 hasta la posición 3
        LinkedList<Integer> sublista = lista.subLista1(1, 4);

        // Verificamos si la sublista contiene los elementos esperados
        assertEquals(2, (int) sublista.obtener(0));
        assertEquals(3, (int) sublista.obtener(1));
        assertEquals(4, (int) sublista.obtener(2));
    }


    public void SubLista1PosicionInicialNegativa() {
        // Creamos una lista enlazada
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Creamos una sublista con posición inicial negativa
        LinkedList<Integer> sublista = lista.subLista1(-1, 3);

        // Verificamos si la sublista está vacía
        Assert.assertTrue(sublista.esVacia());
    }


    public void SubLista1PosicionFinalFueraDeRango() {
        // Creamos una lista enlazada
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Creamos una sublista con posición final fuera de rango
        LinkedList<Integer> sublista = lista.subLista1(2, 7);

        // Verificamos si la sublista está vacía
        Assert.assertTrue(sublista.esVacia());
    }
}
