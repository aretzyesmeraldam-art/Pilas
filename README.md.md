# Práctica: Pilas Estáticas y Dinámicas en Java

Este proyecto contiene la implementación en Java de la estructura de datos lineal **Pila (Stack)** utilizando dos enfoques de memoria: almacenamiento estático (arreglos) y almacenamiento dinámico (nodos enlazados).

---

## 1. Estructura y Diferencias Conceptuales

* **Pila Estática (`PilaSimple.java`):**
    * **Estructura:** Se basa en un arreglo de tamaño fijo con asignación de memoria contigua.
    * **Comportamiento:** Requiere definir su capacidad máxima desde el inicio. Si se intenta insertar un elemento cuando la pila está llena, ocurre un **desbordamiento** (*Overflow*).
    * **Uso de Memoria:** Memoria fija reservada desde el momento de la instanciación.

* **Pila Dinámica (`PilaDinamica.java`):**
    * **Estructura:** Se basa en **nodos enlazados** (*Linked Nodes*) dispersos en la memoria RAM.
    * **Comportamiento:** Crece y se reduce de forma flexible en tiempo de ejecución conforme se agregan o eliminan elementos. No utiliza el método `isFull()`, ya que su capacidad depende de la memoria RAM disponible en el sistema.
    * **Uso de Memoria:** Memoria bajo demanda; cada nodo guarda el dato y un puntero/referencia al siguiente nodo.

---

## 2. Pasos para Compilar y Ejecutar

### Opción A: Desde la Terminal (Línea de comandos)
1. Abre la terminal en la carpeta raíz del proyecto (`src`).
2. Compila todas las clases Java:
   ```bash
   javac Main.java PilaSimple.java PilaDinamica.java
   ```
3. Ejecuta la clase principal:
   ```bash
   java Main
   ```

### Opción B: Desde IntelliJ IDEA
1. Abre la clase `Main.java`.
2. Presiona el botón verde de **Play** (▶) situado a la izquierda del método `main` o en la barra superior del IDE.

---

## 3. Ejemplo de Prueba de Ejecución (Salida por Consola)

A continuación se muestra el resultado real obtenido al ejecutar las pruebas en consola:

```text
========================================
      PRUEBA DE PILA ESTÁTICA           
========================================
¿La pila estática está vacía? true
Elemento 10 insertado correctamente.
Elemento 20 insertado correctamente.
Elemento 30 insertado correctamente.
Elemento en el tope (peek): 30
Estado de la Pila Estática (desde el tope hacia la base): 30 20 10 
Elemento 30 extraído de la pila.
Estado de la Pila Estática (desde el tope hacia la base): 20 10 
¿La pila estática está llena? false

========================================
      PRUEBA DE PILA DINÁMICA           
========================================
¿La pila dinámica está vacía? true
Nodo con 100 insertado en la cima dinámicamente.
Nodo con 200 insertado en la cima dinámicamente.
Nodo con 300 insertado en la cima dinámicamente.
Cima actual (peek): 300
Estado de la Pila Dinámica (Cima -> Fondo): 300 -> 200 -> 100 -> NULL
Nodo con 300 extraído de la cima.
Estado de la Pila Dinámica (Cima -> Fondo): 200 -> 100 -> NULL
¿La pila dinámica está vacía? false
```