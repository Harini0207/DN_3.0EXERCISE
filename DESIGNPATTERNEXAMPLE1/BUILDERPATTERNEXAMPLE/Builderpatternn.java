
public class Builderpatternn {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD").build();
        Computer officeComputer = new Computer.Builder("Intel i5", "16GB", "512GB SSD").build();

        System.out.println("Gaming Computer Configuration: " + gamingComputer);
        System.out.println("Office Computer Configuration: " + officeComputer);
    }
}
