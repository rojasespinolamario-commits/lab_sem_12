public class Main {
    public static void main(String[] args) {

        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS\n");

        LaptopFactory factory = new LaptopFactory();

        Laptop gamer = factory.crearLaptopGamer();

        gamer.ejecutarPrueba();
        System.out.println();
        gamer.mostrarDatos();

        System.out.println();

        Laptop basica = factory.crearLaptopBasica();

        basica.ejecutarPrueba();
        System.out.println();
        basica.mostrarDatos();

        System.out.println();

        Laptop profesional = factory.crearLaptopProfesional();

        profesional.ejecutarPrueba();
        System.out.println();
        profesional.mostrarDatos();
    }
}

