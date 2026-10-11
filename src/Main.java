public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      PRUEBA DE PILA ESTÁTICA           ");
        System.out.println("========================================");

        PilaSimple pilaEstatica = new PilaSimple(5);

        System.out.println("¿La pila estática está vacía? " + pilaEstatica.isEmpty());

        pilaEstatica.push(10);
        pilaEstatica.push(20);
        pilaEstatica.push(30);

        System.out.println("Elemento en el tope (peek): " + pilaEstatica.peek());
        pilaEstatica.mostrar();

        pilaEstatica.pop();
        pilaEstatica.mostrar();
        System.out.println("¿La pila estática está llena? " + pilaEstatica.isFull());

        System.out.println("\n========================================");
        System.out.println("      PRUEBA DE PILA DINÁMICA           ");
        System.out.println("========================================");

        PilaDinamica pilaDinamica = new PilaDinamica();

        System.out.println("¿La pila dinámica está vacía? " + pilaDinamica.isEmpty());

        pilaDinamica.push(100);
        pilaDinamica.push(200);
        pilaDinamica.push(300);

        System.out.println("Cima actual (peek): " + pilaDinamica.peek());
        pilaDinamica.mostrar();

        pilaDinamica.pop();
        pilaDinamica.mostrar();
        System.out.println("¿La pila dinámica está vacía? " + pilaDinamica.isEmpty());
    }
}