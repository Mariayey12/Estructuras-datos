import jdk.dynalink.beans.StaticClass;

public class Main {
    public static void main(String[] args) {
        // Agregar elementos al principio (agregarHead)

        LinkedList linkedList = new LinkedList();
        linkedList.agregarHead(5);
        linkedList.agregarHead(3);
        linkedList.agregarHead(0);

        // Agregar elementos al final (agregarTail)
        linkedList.agregarTail(10);
        linkedList.agregarTail (20);
        linkedList.agregarTail (30);

        // Agregar elemento en posición específica (agregarPorPosicion)
        linkedList.agregarPorPosicion(2, 99);
        linkedList.agregarPorPosicion(2, 15); // Insertar 15 en la posición 2

        // Buscar y mostrar elementos por posición
        System.out.println("Elemento en posición 0: " + linkedList.buscarPorPosicion(0));
        System.out.println("Elemento en posición 3: " + linkedList.buscarPorPosicion(3));
        // Verificar si la lista contiene ciertos valores
        System.out.println("¿Contiene el valor 10? " + linkedList.contieneValor(10));
        System.out.println("¿Contiene el valor 25? " + linkedList.contieneValor(25));
        // Eliminar elementos por posición
        linkedList.eliminarPorPosicion(1); // Eliminar el elemento en la posición 1


        // Eliminar al inicio
        linkedList.eliminarAlInicio();
        // Eliminar al final
        linkedList.eliminarAlFinal();

      // Llamar a la función para reemplazar un nodo (por ejemplo, reemplazar 5 con 25)
        linkedList.reemplazarNodo (linkedList,5,25);
        // Recorrer e imprimir la lista completa
    linkedList.recorrerYImprimir(linkedList);

        // Mostrar la lista completa con un bucle for
        LinkedList.Node nodoActual = linkedList.head;
        for (; nodoActual != null; nodoActual = nodoActual.next) {
            System.out.print(nodoActual.value + " -> ");
        }
    }
}




// [7] -> [6] -> [5]
// [7] -> [0] -> [5] -> [10]
// [7] -> [0] -> [1] ->  [5] -> [10]
// [7] -> [0] -> [1] ->  [5] -> [10] -> [6] -> [8]
// [7] -> [0] -> [1] ->  [5] -> [10] -> [8] ->  [6] -> [8]
//agrege un nodo en la posicion  = 5;
// head                 //tail



