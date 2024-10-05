package Multimi;

import org.testng.annotations.Test;

import java.util.*;

public class TesteMultimi {
    //multimi : array, list, set, map

    @Test
    public void metodaTest () {
        //cursantiArray();
        //curstantiList();
        //listaMasini();
        //mapExample();
        //tariOrase();
        ingredienteReteta();
    }

    //afisam cursantii de la cursul de automation

    public void cursantiArray () {
        String[] cursanti = new String[10];
        cursanti[0]="Rares";
        cursanti[1]="Mihai";
        cursanti[2]="Cristina";
        cursanti[3]="Magda";
        cursanti[4]="Razvan";
        cursanti[5]="Andrei";

        for(int index=0; index < cursanti.length; index++){
            System.out.println("Numele cursantului este " + cursanti[index]);

        }
    }

    //v2-list
    public void curstantiList(){
        List<String> cursanti=new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Mihai");
        cursanti.add("Cristina");
        cursanti.add("Magda");
        cursanti.add("Razvan");
        cursanti.add("Andrei");

        for(int index=0; index < cursanti.size(); index++){
            System.out.println("Numele cursantului este " + cursanti.get(index));

        }
    }

    //definim o multime de masini din care afisam doar masinile de pe pozitii impare
    public void listaMasini () {
        List<String> masini=new ArrayList<>();
        masini.add("Dacia");
        masini.add("Peugeot");
        masini.add("Renault");
        masini.add("VW");
        masini.add("BMW");
         for (int index=0; index < masini.size(); index++) {

            if (index % 2!=1){
                System.out.println("Numele acestor masini este " + masini.get(index));
            }
        }

    }

    //map: key=value
    //parcurgerea se face pe baza cheilor(folosind un set)

    public void mapExample () {
        Map<String, String> elemente=new HashMap<>();
        elemente.put("Masina", "Peugeout");
        elemente.put("Persoana", "Rares");
        elemente.put("Telefon", "Samsung");
        for (String key: elemente.keySet()){
            System.out.println("Cheia este " +key);
            System.out.println("Valoarea este " +elemente.get(key));

        }
    }


    //afisam tara cu anumite orase

    public void tariOrase () {
        Map<String, List<String>> obiecte=new HashMap<>();

        List<String> oraseRomania= Arrays.asList("Cluj", "Timisoara", "Bucuresti");
        List<String> oraseItalia= Arrays.asList("Roma", "Milano", "Turin");
        List<String> oraseSpania= Arrays.asList("Barcelona", "Madrid", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String key: obiecte.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele este " + obiecte.get(key));
        }
    }

    //ingrediente pentru reteta, pentru 3 feluri
    public void ingredienteReteta () {
        Map<String, List<String>> reteta=new HashMap<>();

        List<String> ingredienteFelul1= Arrays.asList("ceapa", "morcovi", "rădăcină pătrunjel");
        List<String> ingredienteFelul2= Arrays.asList("bacon", "smantana", "3 oua");
        List<String> ingredienteFelul3= Arrays.asList("cartofi", "ceapa", "usturoi");

        reteta.put("Supa de Pui", ingredienteFelul1);
        reteta.put("Paste Carbonara", ingredienteFelul2);
        reteta.put("Musaca", ingredienteFelul3);
        for (String key: reteta.keySet()) {
            System.out.println("Felul 1 este " + key);
            System.out.println("Ingredientele sunt " + reteta.get(key));
        }
    }

    //exemplu complet tari orase, capitale, layere multiple - Tema

}
