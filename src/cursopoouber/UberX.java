package cursopoouber;

public class UberX extends Car {

    String brand;
    String model;

    public UberX(Integer id, String license, Account driver, Integer passegenger, String brand, String model) {
        super(id, license, driver, passegenger);
        this.brand = brand;
        this.model = model;
    }
@Override
    void printDateCar() {
         System.out.println( "Model: " + model + " Brand: " + brand);
    }
}
