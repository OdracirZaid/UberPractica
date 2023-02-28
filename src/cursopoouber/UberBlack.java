package cursopoouber;

import java.util.ArrayList;
import java.util.Map;

class UberBlack  extends Car {
        Map<String, ArrayList<Object>> typeCarAccepted;
        ArrayList<String> seatMaterial;
    
    public UberBlack(Integer id, String license, Account driver, Integer passegenger,
            Map<String, ArrayList<Object>> typeCarAccepted,
            ArrayList<String>seatMaterial) {
        super(id, license, driver, passegenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
        
    }
    
}
