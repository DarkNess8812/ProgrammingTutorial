package tema;

import org.testng.annotations.Test;

public class Parametrii {

    public String marca;
    public String model;
    public double motorizare;
    public int an;
    public boolean esteInmatriculata;

    @Test
    public void PrezentareMasina() {


        metodaParametrii("Volkswagen", "Golf 5", 1.9, 2006, true);
        metodaParametrii("Honda", "Civic", 2.4, 2022, true);
        metodaParametrii("Mitsubishi", "Lancer", 2.0, 2010, true);
    }


    public void metodaParametrii(String param1, String param2, double param3, int param4, boolean param5) {
        System.out.println("Marca masini este " + param1);
        System.out.println("Modelul masini este " + param2);
        System.out.println("Motorizarea masini este " + param3);
        System.out.println("Anul in care este masina fabricata este " + param4);
        System.out.println("Masina este inmatriculata? " + param5);
        System.out.println();



    }

}
