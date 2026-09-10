public class Main {
    public static void main(String[] args) {

        MiListaCircular lista = new MiListaCircular();

        System.out.println("¿La lista está vacía? " + lista.isEmpty());

        lista.add(30);
        lista.add(10);
        lista.add(20);

        System.out.println("Lista después de agregar elementos:");
        mostrarLista(lista);

        lista.insertHead(5);

        System.out.println("\nDespués de insertar 5 al inicio:");
        mostrarLista(lista);

        lista.insertTail(40);

        System.out.println("\nDespués de insertar 40 al final:");
        mostrarLista(lista);

        System.out.println("\nTamaño de la lista: " + lista.getSize());

        System.out.println("Head: " + lista.getHead());
        System.out.println("Tail: " + lista.getTail());

        Node encontrado = lista.search(20);

        if (encontrado != null) {
            System.out.println("\nElemento 20 encontrado: " + lista.get(encontrado));
        } else {
            System.out.println("\nElemento 20 no encontrado.");
        }

        System.out.println("¿La lista contiene 30? " + lista.contains(30));
        System.out.println("¿La lista contiene 100? " + lista.contains(100));

        if (encontrado != null) {
            lista.set(encontrado, 25);
        }

        System.out.println("\nDespués de cambiar 20 por 25:");
        mostrarLista(lista);

        lista.insert(25, 27);

        System.out.println("\nDespués de insertar 27 después de 25:");
        mostrarLista(lista);

        Node nodoEliminar = lista.search(10);

        if (nodoEliminar != null) {
            lista.remove(nodoEliminar);
        }

        System.out.println("\nDespués de eliminar 10:");
        mostrarLista(lista);

        Object[] arreglo = lista.toArray();

        System.out.println("\nLista convertida a arreglo:");
        for (Object elemento : arreglo) {
            System.out.print(elemento + " ");
        }

        MiListaCircular listaOrdenada = lista.sortList();

        System.out.println("\n\nLista ordenada:");
        mostrarLista(listaOrdenada);

        Node desde = lista.search(5);
        Node hasta = lista.search(27);

        MiListaCircular subLista = lista.subList(desde, hasta);

        System.out.println("\nSublista desde 5 hasta 27:");
        mostrarLista(subLista);

        lista.clear();

        System.out.println("\nDespués de limpiar la lista:");
        System.out.println("¿Está vacía? " + lista.isEmpty());
        System.out.println("Tamaño: " + lista.getSize());
    }

    public static void mostrarLista(MiListaCircular lista) {
        Object[] elementos = lista.toArray();

        System.out.print("[ ");

        for (Object elemento : elementos) {
            System.out.print(elemento + " ");
        }

        System.out.println("]");
    }
}