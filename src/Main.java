import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        while (true) {
            System.out.println("\nLista Doblemente enlazada");
            System.out.println("1. Inserta un elemento al inicio de la lista");
            System.out.println("2. Inserta un elemento al final de la lista");
            System.out.println("3. Recorrer la lista de inicio a fin");
            System.out.println("4. Recorrer la lista de fin a inicio");
            System.out.println("5. Mostrar el número de elementos en la lista actual");
            System.out.println("6. Verificar si la lista está vacía");
            System.out.println("7. Buscar un elemento en la lista por su valor");
            System.out.println("8. Buscar un elemento en la lista por su posición");
            System.out.println("9. Eliminar un elemento de la lista actual");
            System.out.println("10. Salir del programa");
            System.out.print("Por favor, ingresa el número de la opción que deseas: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Por favor, ingresa el elemento que deseas insertar al inicio de la lista: ");
                    int inicio = scanner.nextInt();
                    lista.insertarAlInicio(inicio);
                    break;
                case 2:
                    System.out.print("Por favor, ingresa el elemento que deseas insertar al final de la lista: ");
                    int fin = scanner.nextInt();
                    lista.insertarAlFinal(fin);
                    break;
                case 3:
                    System.out.print("Los elementos de la lista en orden de inicio a fin son: ");
                    lista.recorrerHaciaAdelante();
                    break;
                case 4:
                    System.out.print("Los elementos de la lista en orden de fin a inicio son: ");
                    lista.recorrerHaciaAtras();
                    break;
                case 5:
                    System.out.println("El número de elementos en la lista es: " + lista.obtenerTamaño());
                    break;
                case 6:
                    if (lista.estaVacia()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("La lista contiene elementos.");
                    }
                    break;
                case 7:
                    System.out.print("Por favor, ingresa el valor del elemento que deseas buscar en la lista: ");
                    int buscarValor = scanner.nextInt();
                    if (lista.buscarPorValor(buscarValor)) {
                        System.out.println("El elemento con valor " + buscarValor + " se encuentra en la lista.");
                    } else {
                        System.out.println("No se encontró un elemento con valor " + buscarValor + " en la lista.");
                    }
                    break;
                case 8:
                    System.out.print("Por favor, ingresa la posición del elemento que deseas buscar en la lista: ");
                    int buscarIndice = scanner.nextInt();
                    Integer valor = lista.obtenerPorIndice(buscarIndice);
                    if (valor != null) {
                        System.out.println("El elemento en la posición " + buscarIndice + " tiene el valor: " + valor);
                    } else {
                        System.out.println("La posición ingresada está fuera del rango de la lista.");
                    }
                    break;
                case 9:
                    System.out.print("Por favor, ingresa el valor del elemento que deseas eliminar de la lista: ");
                    int borrar = scanner.nextInt();
                    if (lista.borrarElemento(borrar)) {
                        System.out.println("El elemento con valor " + borrar + " ha sido eliminado de la lista.");
                    } else {
                        System.out.println("No se encontró un elemento con valor " + borrar + " en la lista.");
                    }
                    break;
                case 10:
                    System.out.println("Gracias por usar el programa. ¡Hasta la próxima!");
                    System.exit(0);
                default:
                    System.out.println("La opción que ingresaste no es válida. Por favor, intenta de nuevo.");

            }
        }
    }
}