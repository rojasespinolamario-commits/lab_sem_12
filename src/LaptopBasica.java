public class LaptopBasica extends Laptop {

    public LaptopBasica(String marcaModelo, int añoFabricacion, String procesador, double tamañoPantalla) {
        super("Laptop Basica", marcaModelo, añoFabricacion, procesador, tamañoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
    }
}
