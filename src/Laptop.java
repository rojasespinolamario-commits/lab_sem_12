public abstract class Laptop {

    protected String nombreLaptop;
    protected String marcaModelo;
    protected int añoFabricacion;
    protected String procesador;
    protected double tamañoPantalla;

    public Laptop(String nombreLaptop, String marcaModelo, int añoFabricacion, String procesador, double tamañoPantalla) {
        this.nombreLaptop = nombreLaptop;
        this.marcaModelo = marcaModelo;
        this.añoFabricacion = añoFabricacion;
        this.procesador = procesador;
        this.tamañoPantalla = tamañoPantalla;
    }

    public void mostrarDatos() {
        System.out.println(nombreLaptop);
        System.out.println("Marca y Modelo: " + marcaModelo);
        System.out.println("Año de Fabricacion: " + añoFabricacion);
        System.out.println("Procesador: " + procesador);
        System.out.println("Tamaño de la Pantalla: " + tamañoPantalla);
    }

    public abstract void ejecutarPrueba();

}
