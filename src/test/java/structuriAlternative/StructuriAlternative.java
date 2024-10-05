package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //in programare exista 2 tipuri de structuri: alternative si repetitive
    //structuri alternative : if...then...else / switch...case

    @Test
    public void metodaTest () {
        //verificaPersoanaMajora(20);
        //verificaPersoanaMajora(17);
        //verificaPersoanaMajora(18);
        //verificNrPAr(6);
        //verificNrPAr(3);
        //verificNrPAr(0);
        //verificNrPAr(-2);
        //verificNrPAr(-3);
        //verificNrdivizibil(5);
        //verificNrdivizibil(6);
        zileSaptamana(8);




    }

    //facem o metoda care verifica daca o persoana este majora

    public void verificaPersoanaMajora (int varsta) {
        if (varsta >=18)
        {
            System.out.println("Persoana cu varsta de "+varsta+" este majora.");
        }
        else {
            System.out.println("Persoana cu varsta de "+varsta+" este minora");
        }
    }

    //verificam daca un numar este par si pozitiv
    //daca vrem catul unei impartiri => / (div)
    //daca vrem restul unei impartiri => % (mod)

    public void verificNrPAr (int nr) {
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este pozitiv si par");
            } else {
                System.out.println("Numarul " + nr + " este pozitiv si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este negativ si par");
            } else {
                System.out.println("Numarul " + nr + " este negativ si impar");
            }
        } else {
            System.out.println("Numarul " + nr + " este egal cu 0");
        }
    }

    //verificam daca un numar e pozitiv si divizibil cu 5
    public void verificNrdivizibil (int numar) {
        if (numar % 5 ==0 && numar > 0) {
            System.out.println("Numarul e divizbil si pozitiv");

        }
            else {
            System.out.println("Numarul nu este divizibil");

        }
    }

    //afisam zilele saptamanii
    public void zileSaptamana (int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi e luni");
                break;
            case 2:
                System.out.println("Astazi e marti");
                break;
            case 3:
                System.out.println("Astazi e miercuri");
                break;
            case 4:
                System.out.println("Astazi e joi");
                break;
            case 5:
                System.out.println("Astazi e vineri");
                break;
            case 6:
                System.out.println("Astazi e sambata");
                break;
            case 7:
                System.out.println("Astazi e duminica");
                break;
            default:
                System.out.println("Nu mai exista zile");

        }

    }

}



        //intrebari de interviu: diferenta intre IF si SWITCH case?
        //IF se focuseaza pe evaluarea conditiei
        //Switch se focuseaza pe evaluarea valorii - e mult mai simplu si la citit si la sintaxa
        //Care este mai performant dintre cele 2, care se executa mai repede? Switch case fiindca sare direct la numar cand IF-ul le ia pe toate
