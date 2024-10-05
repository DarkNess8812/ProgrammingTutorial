package tema;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public double motorizare;
    public String motorizare2;
    public int kilometraj;
    public String kilometraj2;
    public int an;
    public int caiPutere;
    public String caiPutere2;
    public int vitezaMaxima;
    public String vitezaMaxima2;
    public double acceleratie;
    public String accelaratie2;
    public boolean areAccidente;
    public boolean esteInmatriculata;

    @Test
    public void PrezentareMasina () {
        marca = " Volkswagen";
        model = " Golf 5";
        motorizare = 1.9;
        motorizare2 = "tdi";
        kilometraj = 180000;
        kilometraj2 = "km";
        an = 2006;
        caiPutere = 105;
        caiPutere2 = "cai putere";
        vitezaMaxima = 187;
        vitezaMaxima2 = "kilometri/ora";
        acceleratie = 11.3;
        accelaratie2 = "secunde";
        areAccidente = false;
        esteInmatriculata = true;

        System.out.println("Marca masini este "+marca);
        System.out.println("Modelul masini este "+model);
        System.out.println("Motorizarea masini este "+ motorizare+""+motorizare2);
        System.out.println("Kilometrii masinii sunt "+ kilometraj+""+kilometraj2);
        System.out.println("Anul in care este masina fabricata este "+ an);
        System.out.println("Putere masinii este de "+ caiPutere +" "+caiPutere2);
        System.out.println("Viteza maxima a masinii este de " +vitezaMaxima +" "+vitezaMaxima2);
        System.out.println("Timpul in care face 0-100 este de " +acceleratie +" "+accelaratie2);
        System.out.println("Masina are accidente? "+ areAccidente);
        System.out.println("Masina este inmatriculata? "+esteInmatriculata);






    }


}
