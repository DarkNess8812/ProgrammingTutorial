package obiecteConstructor.hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDejun;
    public int nrEtaje;
    public List<String> facilitati;
    public int pretPornire;

    public Hotel() {
        nume = "Imperial House";
        adresa = "Strada Mamaia";
        tara = "Romania";
        oras = "Constanta";
        stele = "***";
        numarCamere = 60;
        micDejun = true;
        nrEtaje = 6;
        facilitati = Arrays.asList("Wifi", "Hartie igienica", "TV", "Frigider", "Loc parcare");
        pretPornire = 1000;
    }

    public void prezentareHotel() {
        System.out.println("Numeke hotelului este:" + nume);
        System.out.println("Strada hotelului este:" + adresa);
        System.out.println("Tara hotelului este:" + tara);
        System.out.println("Orasul hotelului este:" + oras);
        System.out.println("Numarul stelelor hotelului este:" + stele);
        System.out.println("Numarul de camere al hotelului este:" + numarCamere);
        System.out.println("Mic dejun inclus?:" + micDejun);
        System.out.println("Numarul de etaje al hotelului este:" + nrEtaje);
        System.out.println("Facilitatile hotelului sunt:" + facilitati);


    }

    public void pretOferta(Map<String, String> oferta) {
        System.out.println("Pretul de pornire este "+pretPornire);
        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //clientul are dorinta de a avea oferta cu valabilitate mai mare
                //se calculeaza pretul pe baza unor internale

                String[] parts = oferta.get(optiune).split(" ");

                //Extragem prima parte (numarul) si o convertim in interger

                int number = Integer.parseInt(parts[0]);
                if (number < 5) {
                    pretPornire = pretPornire + 200;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 800;
                } else {
                    pretPornire = pretPornire + 850;
                }
                if (optiune.equals("Perioada sedere")) {

                    parts = oferta.get(optiune).split(" ");
                    number = Integer.parseInt(parts[0]);
                    if (number < 5) {
                        pretPornire = pretPornire + 100;
                    }
                    if (number < 5 && number < 10) {
                        pretPornire = pretPornire + 2000;
                    } else {
                        pretPornire = pretPornire + 1750;
                    }
                    if (optiune.equals("Numar persoane")) {

                        parts = oferta.get(optiune).split(" ");
                        number = Integer.parseInt(parts[0]);
                        if (number < 3) {
                            pretPornire = pretPornire + 800;
                        }
                        if (number == 3) {
                            pretPornire = pretPornire + 1000;
                        } else {
                            pretPornire = pretPornire + 2500;
                        }
                    }
                    if (optiune.equals("Offseason")) {

                        parts = oferta.get(optiune).split(" ");
                        number = Integer.parseInt(parts[0]);
                        if(oferta.get(optiune).equals("Da")) {
                            pretPornire = pretPornire - 1000;
                        }
                        else {
                            pretPornire = pretPornire + 500;
                        }
                    }
                }
                System.out.println("Pretul final este "+pretPornire);
            }
        }
    }


}

