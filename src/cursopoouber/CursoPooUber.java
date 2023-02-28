package cursopoouber;

public class CursoPooUber {


    public static void main(String[] args) {
      UberX uberX = new UberX(1, "QWE-134", new Account(1, "Ricardo Diaz",
              "1073655", "ric@gmail.com", "1234"), 4, "Nissan", "2023");
      uberX.printDateCar();
      
     // Car car1 = new Car(2, "QWR-123", new Account(2, "Odracir Zaid", 
     //"109876", "Odra@gmail.com", "4321"), 4);
      //car1.printDateCar();
    }
    
}
