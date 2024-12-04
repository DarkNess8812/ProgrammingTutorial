package oop_mostenire;

public class AngajatSportiv extends Persoana implements AngajatInterface, SportivInterface{

    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    private String sport;
    private boolean sportEchipa;
    private boolean perfomanta;
    private int medali;

    public AngajatSportiv(String nume, String prenume, int varsta, String sex,
                          String adresa, String firma, String pozitie, int salar, String experienta,
                          String sport, boolean sportEchipa, boolean perfomanta, int medali) {

        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salar = salar;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.perfomanta = perfomanta;
        this.medali = medali;
    }

    @Override
    public void ajungeLaTimpLaBirou() {
        System.out.println("Angajatul trebuie sa ajunga la birou intre 8:00 si 17:00 ");
    }

    @Override
    public void munceste() {
        System.out.println("Angajat System.out.println(\"Sportivul trebuie sa mearga la antrenamente \");ul trebuie sa munceasca in intervalul specificat ");
    }

    @Override
    public void absente() {
        System.out.println("Nu are absente ");
    }

    @Override
    public void respectaConduita() {
        System.out.println("Angajatul respecta conduita ");
    }

    @Override
    public void saMeargaLaAntrenament() {
        System.out.println("Sportivul trebuie sa mearga la antrenamente ");
    }

    @Override
    public void saNuLipseasca() {
        System.out.println("Trebuie sa nu lipseasca ");
    }

    @Override
    public void saMananceSanatos() {
        System.out.println("Sa manance sanatos ");
    }

    @Override
    public void saMeargaLaConcursuri() {
        System.out.println("Sa mearga la concursuri ");
    }
}
