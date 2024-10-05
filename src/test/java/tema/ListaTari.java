package tema;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaTari {

    @Test
    public void tariOrase () {
        Map<String, List<String>> orase=new HashMap<>();
        Map<String, String> capitala=new HashMap();

        List<String> oraseRomania= Arrays.asList("Cluj", "Timisoara", "Bucuresti, Oradea");
        List<String> oraseJaponia= Arrays.asList("Tokyo", "Kyoto", "Osaka");
        List<String> oraseGermania= Arrays.asList("Hamburg", "Berlin", "Bremen", "Stuttgart");
        List<String> oraseCanada= Arrays.asList("Quebec", "Vancouver", "Toronto", "Ottawa");
        List<String> oraseGrecia= Arrays.asList("Atena", "Salonic", "Kavala");

        orase.put("Romania", oraseRomania);
        orase.put("Japonia", oraseJaponia);
        orase.put("Germania", oraseGermania);
        orase.put("Canada", oraseCanada);
        orase.put("Grecia", oraseGrecia);

        capitala.put("Romania", "Bucuresti");
        capitala.put("Japonia", "Tokyo");
        capitala.put("Germania", "Berlin");
        capitala.put("Canada", "Ottawa");
        capitala.put("Grecia", "Atena");



        for (String key: orase.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Capitala este " + capitala.get((key)));
            System.out.println("Orasele sunt " + orase.get((key)));

        }

    }
}
