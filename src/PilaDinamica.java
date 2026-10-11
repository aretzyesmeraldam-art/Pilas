public class PilaDinamica {

    // Clase interna para representar el Nodo
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cima; // Referencia al nodo superior de la pila

    // Constructor
    public PilaDinamica() {
        this.cima = null;
    }

    // push: Insertar un nodo en la cima (clase)
    public void push(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Nodo con " + x + " insertado en la cima dinámicamente.");
    }

    // pop: Extraer el nodo de la cima (clase)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Subdesbordamiento: La pila dinámica está vacía.");
            return -1;
        } else {
            int valor = cima.dato;
            cima = cima.siguiente; // Desvincula el nodo superior
            System.out.println("Nodo con " + valor + " extraído de la cima.");
            return valor;
        }
    }

    // mostrar: Recorrer e imprimir los elementos (clase)
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila dinámica está vacía.");
        } else {
            Nodo actual = cima;
            System.out.print("Estado de la Pila Dinámica (Cima -> Fondo): ");
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("NULL");
        }
    }

    // isEmpty (A agregar): Verificar si la cima no contiene nodos
    public boolean isEmpty() {
        return cima == null;
    }

    // peek (A agregar): Consultar el valor en la cima sin desvincular el nodo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1;
        } else {
            return cima.dato;
        }
    }
}