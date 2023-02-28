package cursopoouber;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
        Map<String, ArrayList<Object>> typeCarAccepted;
        ArrayList<String> seatMaterial;
        private Integer passenger;
    
    public UberVan(Integer id, String license, Account driver, Integer passegenger,
            Map<String, ArrayList<Object>> typeCarAccepted,
            ArrayList<String>seatMaterial) {
        super(id, license, driver, passegenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
        
    }
    public void setPassenger(Integer passenger){
        if(passenger == 6){
                    this.passenger = passenger;
        }else{
            System.out.println("Este carro solo acepta maximo 6 pasajeros");
        }
    }
    
}
