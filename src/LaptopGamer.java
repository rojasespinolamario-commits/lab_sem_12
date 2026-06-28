public class LaptopGamer extends Laptop {

    public LaptopGamer(String marcaModelo, int añoFabricacion, String procesador, double tamañoPantalla) {
        super("Laptop Gamer", marcaModelo, añoFabricacion, procesador, tamañoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Gamer");
    }
}
