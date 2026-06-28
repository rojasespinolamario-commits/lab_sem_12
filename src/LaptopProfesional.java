public class LaptopProfesional extends Laptop {

    public LaptopProfesional(String marcaModelo, int añoFabricacion, String procesador, double tamañoPantalla) {
        super("Laptop Profesional", marcaModelo, añoFabricacion, procesador, tamañoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
    }

}
