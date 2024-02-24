class ListaEnlazada {
    private MiNodo cabeza;
    private MiNodo cola;
    private int tamaño;

    public ListaEnlazada() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }
    public boolean estaVacia() {
        return cabeza == null;
    }
    public void insertarAlInicio(int dato) {
        MiNodo nuevoNodo = new MiNodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.datosiguiente = cabeza;
            cabeza.datoanterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
        tamaño++;
    }
    public void insertarAlFinal(int dato) {
        MiNodo nuevoNodo = new MiNodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.datosiguiente = nuevoNodo;
            nuevoNodo.datoanterior = cola;
            cola = nuevoNodo;
        }
        tamaño++;
    }
    public void recorrerHaciaAdelante() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        MiNodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.datosiguiente;
        }
        System.out.println();
    }
    public void recorrerHaciaAtras() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        MiNodo temp = cola;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.datoanterior;
        }
        System.out.println();
    }
    public int obtenerTamaño() {
        return tamaño;
    }
    public boolean buscarPorValor(int valor) {
        MiNodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == valor) {
                return true;
            }
            temp = temp.datosiguiente;
        }
        return false;
    }
    public Integer obtenerPorIndice(int indice) {
        if (indice < 0 || indice >= tamaño) {
            return null;
        }
        MiNodo temp = cabeza;
        int contador = 0;
        while (contador < indice) {
            temp = temp.datosiguiente;
            contador++;
        }
        return temp.dato;
    }
    public boolean borrarElemento(int valor) {
        if (estaVacia()) {
            return false;
        }
        MiNodo actual = cabeza;
        while (actual != null && actual.dato != valor) {
            actual = actual.datosiguiente;
        }
        if (actual == null) {
            return false;
        }
        if (actual == cabeza) {
            cabeza = actual.datosiguiente;
            if (cabeza != null) {
                cabeza.datoanterior = null;
            }
            tamaño--;
            return true;
        }
        if (actual == cola) {
            cola = actual.datoanterior;
            cola.datosiguiente = null;
            tamaño--;
            return true;
        }
        actual.datoanterior.datosiguiente = actual.datosiguiente;
        actual.datosiguiente.datoanterior = actual.datoanterior;
        tamaño--;
        return true;
    }
}