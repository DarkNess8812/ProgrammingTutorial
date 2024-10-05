package obiecteConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {
    @Test
    public void testMasinaMethod(){
//        Masina Dacia = new Masina("Dacia", "Logan", 2015, "Alb", Arrays.asList("-Aer conditionat", "-Airbag", "-Radio"), "benzina");
//        Dacia.prezentareMasina();
//        Dacia.calculImpozit();
//        System.out.println();
//
//
//        Masina viitoare = new Masina("Kia", "Sportage", 1997, "albastru", Arrays.asList("-Navigatie", "-Airbag", "-Scaun incalzite"), "benzina+electric");
//        viitoare.prezentareMasina();
//        viitoare.calculImpozit();
//        System.out.println();

        Masina viitoare1 = new Masina("Kia", "Sportage", 2021, "albastru", Arrays.asList("-Navigatie", "-Airbag", "-Scaun incalzite"), "benzina+electric", 25000);
        viitoare1.prezentareMasina();
        viitoare1.calculImpozit();
        viitoare1.calculReducere(10);
    }

}
