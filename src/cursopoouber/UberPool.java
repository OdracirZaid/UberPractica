package cursopoouber;

public class UberPool  extends Car{
String brand;
String model;

    public UberPool(Integer id, String license, Account driver, Integer passegenger, String brand, String model) {
        super(id, license, driver, passegenger);
        this.brand = brand;
        this.model = model;
    }
@Override
  void printDateCar(){
  System.out.println("Brand: " + brand + " Modelo: "+ model );
  }
}