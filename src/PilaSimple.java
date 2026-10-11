public class PilaSimple {
    private int[] datos;
    private int tope;

    // Constructor
    public PilaSimple(int capacidad) {
        datos = new int[capacidad];
        tope = -1; // -1 indica que la pila está vacía
    }

    // push: Insertar elemento controlando desbordamiento (clase)
    public void push(int x) {
        if (isFull()) {
            System.out.println("Desbordamiento (Overflow): La pila está llena.");
        } else {
            datos[++tope] = x;
            System.out.println("Elemento " + x + " insertado correctamente.");
        }
    }

    // pop: Extraer elemento controlando subdesbordamiento (clase)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Subdesbordamiento (Underflow): La pila está vacía.");
            return -1; // Valor centinela de error
        } else {
            int eliminado = datos[tope--];
            System.out.println("Elemento " + eliminado + " extraído de la pila.");
            return eliminado;
        }
    }

    // mostrar: Imprimir el contenido de la pila (clase)
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Estado de la Pila Estática (desde el tope hacia la base): ");
            for (int i = tope; i >= 0; i--) {
                System.out.print(datos[i] + " ");
            }
            System.out.println();
        }
    }

    // isEmpty (A agregar): Verificar si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // isFull (A agregar): Verificar si el arreglo alcanzó su límite
    public boolean isFull() {
        return tope == datos.length - 1;
    }

    // peek (A agregar): Consultar el elemento en el tope sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no hay elementos en el tope.");
            return -1;
        } else {
            return datos[tope];
        }
    }
}