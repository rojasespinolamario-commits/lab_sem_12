public class LaptopFactory {

    public Laptop crearLaptopGamer() {
        return new LaptopGamer("Macbook Air", 2017, "Silicon M1", 13);
    }

    public Laptop crearLaptopBasica() {
        return new LaptopBasica("Dell Latitude", 2020, "Intel Core i7", 14);
    }

    public Laptop crearLaptopProfesional() {
        return new LaptopProfesional("Macbook Pro", 2022, "Apple Silicon M2", 16);
    }
}
