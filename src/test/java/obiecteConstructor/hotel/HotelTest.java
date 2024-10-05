package obiecteConstructor.hotel;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelTest {

    @Test
    public void testMethod(){

        Map<String, String> oferta=new HashMap<>();
        oferta.put("Durata oferta", "15 zile");
        oferta.put("Perioda sedere", "7 nopti");
        oferta.put("Numar persoane", "4");
        oferta.put("Offseason", "Da");
        Hotel imperial = new Hotel();
        imperial.prezentareHotel();
        imperial.pretOferta(oferta);
    }

}
