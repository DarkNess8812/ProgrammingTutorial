package obiecteConstructor;

import java.util.List;

public class Masina {

    //constructor = are ca rol sa initializeze variabilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acesteuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constructori care se diferentiaza prin numarul/tipul de parametri
    //o clasa contine intotdeauna un constructor default (nu are parametri)

    //obiect = instanta unei clase
    //dintr-o clasa putem sa definim mai multe oniecte care sa aiba valori diferite pentru proprietati
    //in momentul cand avem un obiect de tipul unei clasea putem accesa variabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"
    //structura: tipObiect numeObiect = new tipObiect(); (Ex: Masina Dacia = new Masina()


    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> datoriInterioare;
    public String motorizare;
    public int pret;
    public int pretfinal;



    //constructor cu 6 parametri
    public Masina(String marca, String model, int an, String culoare, List<String> datoriInterioare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.datoriInterioare = datoriInterioare;
        this.motorizare = motorizare;
    }

    //constructor cu 7 parametri
    public Masina(String marca, String model, int an, String culoare, List<String> datoriInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.datoriInterioare = datoriInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul este: " + model);
        System.out.println("Anul fabricatiei este: " + an);
        System.out.println("Culoarea " + culoare);
        System.out.println("Datorile interioare sunt: ");
        for (int i = 0; i < datoriInterioare.size(); i++) {
            System.out.println(datoriInterioare.get(i));
        }
        System.out.println("Motorizarea: " + motorizare);
        calculPret();
    }

    //determinam impozitul in functie de anul de fabricatie
    //<2000--500 Ron
    //2005<x<2015--300Ron
    //2020<--100Ron

    public void calculImpozit() {
        if (an<=2000) {
            System.out.println("Impozitul pe masina este 500 Ron");
        }
        else if (an>=2005 &&an<=2015){
            System.out.println("Impozitul este 300 ron");
        }
        else if (an>=2020){
            System.out.println("Impozitul este 100 Ron");
        }

    }

    //determinam pretul standard si pretul final in functie de dotarile masini

    public void calculPret(){
        if (pret!=0){
            System.out.println("Pretul de pornire: "+pret);
        }
        if (datoriInterioare.isEmpty()){
            System.out.println("Pretul final este: "+pret);
        }
        else {
            int dotari=0;
            for(int i=0; i<datoriInterioare.size(); i++){
                switch (datoriInterioare.get(i)){
                    case "-Radio":
                        dotari=dotari+1000;
                        break;
                    case "-Airbag":
                        dotari=dotari+800;
                        break;
                    case "-Aer conditionat":
                        dotari=dotari+1500;
                        break;
                    case "-Scaune incalzite":
                        dotari=dotari+3000;
                        break;
                    case "-Navigatie":
                        dotari=dotari+400;
                        break;
                }
            }
            System.out.println("Pretul dotarilor este: "+dotari);
            pretfinal=pret+dotari;
            System.out.println("Pretul final: "+pretfinal);

        }
    }

    public void calculReducere(int procenteReducere){
       pretfinal=((100-procenteReducere)*pretfinal)/100;
        //int reducere = (pretfinal*procenteReducere)/100;
        //pretfinal=pretfinal-reducere;
        System.out.println("S-a aplicat o reducere de "+procenteReducere+ " din pretul final");
        System.out.println("Pretul final cu reducere este:"+pretfinal);

    }
}



