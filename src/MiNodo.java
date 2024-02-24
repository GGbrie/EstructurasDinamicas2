class MiNodo {
    public int dato;
    public MiNodo datosiguiente;
    public MiNodo datoanterior;

    public MiNodo(int dato) {
        this.dato = dato;
        this.datosiguiente = null;
        this.datoanterior = null;
    }
}