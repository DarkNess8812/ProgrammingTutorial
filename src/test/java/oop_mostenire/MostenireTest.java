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

        Sportiv sportiv = new Sportiv("Ionescu", "Ion", 10, "masculin",
                "Timisoara", 2, true, "fotbal",
                true, 2);
        sportiv.infoSportiv();

        System.out.println();

        Student student = new Student("Mihailovici", "Andreas", 21, "masculin",
                "Bucuresti", "UTCB", "Constructii civile", 2,
                true, true);
        student.infoStudent();
    }
}
