package oop_mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest(){
     Angajat angajat = new Angajat("Popescu", "Andrei", 20,
             "masculin", "Timisoara", "Adresso", "tester",
             10000, "2 ani");
     angajat.infoAngajat();

        System.out.println();

        System.out.println(angajat.getVarsta());

        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());

        System.out.println();

        angajat.mananca();

        System.out.println();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("engineer");
        angajat.marire(10, "engineer");

        System.out.println();

        angajat.ajungeLaTimpLaBirou();
        angajat.respectaConduita();
        angajat.absente();
        angajat.munceste();

        System.out.println();


        Sportiv sportiv = new Sportiv("Ionescu", "Ion", 10, "masculin",
                "Timisoara", true, "fotbal", true,
                2);
        sportiv.infoSportiv();

        System.out.println();

        sportiv.saMeargaLaAntrenament();
        sportiv.saMananceSanatos();
        sportiv.saMeargaLaConcursuri();
        sportiv.saNuLipseasca();

        System.out.println();


        Student student = new Student("Mihailovici", "Andreas", 21, "masculin",
                "Bucuresti", "UTCB", "Constructii civile", 2,
                true, true);
        student.infoStudent();

       System.out.println();

        student.mergeLaCursuri();
        student.saNuAibeRestante();
        student.saStieSaCopieze();
        student.trebuieSaStudeze();
    }
}
