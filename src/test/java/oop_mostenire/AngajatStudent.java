package oop_mostenire;

public class AngajatStudent extends Persoana implements  AngajatInterface,StudentInterface{

    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    private String facultate;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;


    public AngajatStudent(String nume, String prenume, int varsta, String sex, String adresa,
                          String firma, String pozitie, int salar, String facultate,
                          String experienta, String domeniu, int an, boolean bursa, boolean restante) {

        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salar = salar;
        this.facultate = facultate;
        this.experienta = experienta;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void absente() {

    }

    @Override
    public void respectaConduita() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudeze() {

    }

    @Override
    public void saNuAibeRestante() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}
