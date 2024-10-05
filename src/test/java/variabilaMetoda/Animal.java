package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    public String rasa;
    public boolean esteManifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest () {


        PrezentareAnimal("caine", true, "maro", 2, 20.1);
        PrezentareAnimal("pisica", true, "alb", 3, 4.5);
        //PrezentareAnimal("soarece", true, "gri", 1, 1.5);


    }

    public void PrezentareAnimal (String param1, boolean param2, String param3, int param4, double param5) {

        int pret = 50;
        System.out.println("Pretul animalului este de " +pret);
        System.out.println("Rasa acestui animal este " +param1);
        System.out.println("Este manifer? " +param2);
        System.out.println("Culoarea este " +param3);
        System.out.println("Varsta este " +param4);
        System.out.println("Greutatea este de " +param5);
        System.out.println();


    }

}
