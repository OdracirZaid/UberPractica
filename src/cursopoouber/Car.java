package cursopoouber;


public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Integer getPassegenger() {
        return passegenger;
    }

    public void setPassegenger(Integer passegenger) {
        if(passegenger == 4){
                    this.passegenger = passegenger;
        }else{
            System.out.println("Este carro solo acepta maximo 4 pasajeros");
        }
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Car(Integer id, String license, Account driver, Integer passegenger) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passegenger = passegenger;
    }
   
    void printDateCar(){
        if (passegenger != null){
            System.out.println( "ID: " + id + " License: " + license + " Driver:  " + driver.name + " Passegener: " + passegenger);
        }
        driver.printDataAccount();
    }

}
