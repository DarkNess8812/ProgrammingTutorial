package variabilaMetoda;

import org.testng.annotations.Test;

import javax.xml.namespace.QName;

public class Student {
    //acesta este un comentariu
    //clasa = sablou care defineste comportamentul unei entitati din viata reala
    //intr-un fisier Java, recunoaste o clasa dupa cuvantul cheie "Class"
    //este obligatoriu ca o clasa sa aiba un nume
    //intr-un fisier Java putem avea mai multe clase diferentiate prin numele acestora (nu se face asa ceva nicioadata)
    //o clasa contine variabile si metode
    //variabile = propietatea unei clase
    //variabila este de doua feluri : globala si locala
    //variabila globala = variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    //variabila locala = variabila pe care o definesti intr-o metoda ce are vizibilitate doar in metoda respectiva
    //variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //metoda = actiunea unei clase
    //o clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //metodele pot fi de 2 feluri: void si return
    //o metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebuie sa contina: access control (public) void numemetoda () {}

    @Test
    public void PrezentareStudent() {
        nume = "Maroiu";
        prenume = "Mihail";
        varsta = 23;
        inaltime = 1.70;
        greutate = 58f;
        adresa = "Bucuresti nr.8";
        sex = 'm';
        areRestante = true;

        //concantenare = lipirea a unu sau mai multe stringuri +
        //print = afiseaza valoarea si ramane pe randul curent
        //println = afiseaza valoarea si sare la randul urmator = System.out.print(nume+" "+prenume+" "+varsta);

        System.out.println("Numele studentului este "+nume);
        System.out.println("Prenumele studentului este "+prenume);
        System.out.println("Varsta studentului este "+varsta);
        System.out.println("Greutatea studentului este "+greutate);
        System.out.println("Inaltimea studentului este "+inaltime);
        System.out.println("Adresa studentului este "+adresa);
        System.out.println("Sex-ul studentului este "+sex);
        System.out.println("Studentul are restante? "+areRestante);




    }

}









