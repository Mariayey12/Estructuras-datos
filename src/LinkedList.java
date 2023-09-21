public class LinkedList {
    class  Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }
    protected Node  head = null;
    protected Node tail = null;

    // [5] ->  next null  , head [5] tail [5]
    public void agregarHead(int valor) {
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next == null){
            tail = nuevoNodo;
        }
    }

    public void agregarTail(int valor) {
        Node nuevoNodo = new Node(valor);
        if (tail == null){
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            agregarHead(valor);
        }else {
            Node node = new Node(valor);
            Node actual = head;
            for (int i= 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            //[0] -> [3] -> [5] -> [10]
            if(actual.next == null) {
                agregarTail(valor);
            } else {
                //[0] -> [3] -> [99]->[5]  -> [10]
                node.next = actual.next;
                actual.next = node;
            }
        }
    }

    //1- Buscar por posición //  [5] -> [10] -> Null//  [25] -> [10] -> Null
    public int buscarPorPosicion(int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException("La posición no puede ser negativa");
        } else if (head == null) {
            throw new IndexOutOfBoundsException("La lista está vacía");
        } else {
            Node actual = head;
            for (int i = 0; i < posicion; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException("La posición está fuera de rango");
                }
                actual = actual.next;
            }
            if (actual == null) {
                throw new IndexOutOfBoundsException("La posición está fuera de rango");
            }
            return actual.value;
        }
    }
    // 2- Eliminar por posición
    public void eliminarPorPosicion(int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException("La posición no puede ser negativa");
        } else if (head == null) {
            throw new IndexOutOfBoundsException("La lista está vacía");
        } else if (posicion == 0) {
            head = head.next;
            if (head == null) {
                tail = null; // Si la lista queda vacía, también actualizamos la cola.
            }
        } else {
            Node actual = head;
            Node anterior = null;
            for (int i = 0; i < posicion; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException("La posición está fuera de rango");
                }
                anterior = actual;
                actual = actual.next;
            }
            if (actual == null) {
                throw new IndexOutOfBoundsException("La posición está fuera de rango");
            }
            anterior.next = actual.next;
            if (anterior.next == null) {
                tail = anterior; // Si eliminamos el último elemento, actualizamos la cola.
            }
        }
    }

    //3- Contiene un valor
    public boolean contieneValor(int valor) {
        Node actual = head;
        while (actual != null) {
            if (actual.value == valor) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }
    //4- Función para reemplazar un nodo con un valor específico
    public static void reemplazarNodo(LinkedList linkedList, int valorAntiguo, int valorNuevo) {
        LinkedList.Node nodoActual = linkedList.head;
        while (nodoActual != null) {
            if (nodoActual.value == valorAntiguo) {
                nodoActual.value = valorNuevo; // Reemplazar el valor antiguo con el nuevo valor
                break; // Terminar la búsqueda una vez que se haya realizado el reemplazo
            }
            nodoActual = nodoActual.next;
        }
    }

    // 5-Función para recorrer e imprimir la lista completa con un ciclo for
    public static void recorrerYImprimir(LinkedList linkedList) {
        LinkedList.Node nodoActual = linkedList.head;
        for (; nodoActual != null; nodoActual = nodoActual.next) {
            System.out.print(nodoActual.value + " -> ");
        }
        System.out.println("null"); // Agregar "null" al final para indicar el final de la lista
    }



    //6- Eliminar al Inicio
    public void eliminarAlInicio() {
     if (head != null) {
        head = head.next;
     if (head == null) {
        tail = null; // Si la lista queda vacía, también actualizamos la cola.
       }
     }
    }

    //-7 Eliminar al Final
    public void eliminarAlFinal() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null; // Si solo hay un elemento en la lista, eliminamos tanto la cabeza como la cola.
            } else {
                Node nodoActual = head;
                while (nodoActual.next != tail) {
                    nodoActual = nodoActual.next;
                }
                nodoActual.next = null;
                tail = nodoActual; // Actualizamos la cola para que apunte al último nodo restante.
            }
        }
}
}




