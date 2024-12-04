package oop_mostenire;

public class Sportiv extends Persoana implements SportivInterface {

    private String sport;
    private boolean sportEchipa;
    private boolean perfomanta;
    private int medali;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa,
                   boolean sportEchipa, String sport, boolean perfomanta, int medali) {
        super(nume, prenume, varsta, sex, adresa);
        this.sportEchipa = sportEchipa;
        this.sport = sport;
        this.perfomanta = perfomanta;
        this.medali = medali;
    }

    public void infoSportiv() {
        infoPersoana();
        System.out.println("Sportul pe care il practica este " + sport);
        System.out.println("Sportivul face parte dintr-o echipa? " + sportEchipa);
        System.out.println("Practica sport de performanta? " + perfomanta);
        System.out.println("Cate medalii a castigat sportivul " + medali);
    }

    public void mananca(){
        System.out.println("Sportivul mananca dupa antrenament ");
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public boolean isPerfomanta() {
        return perfomanta;
    }

    public void setPerfomanta(boolean perfomanta) {
        this.perfomanta = perfomanta;
    }

    public int getMedali() {
        return medali;
    }

    public void setMedali(int medali) {
        this.medali = medali;
    }

    @Override
    public void saMeargaLaAntrenament() {

    }

    @Override
    public void saNuLipseasca() {

    }

    @Override
    public void saMananceSanatos() {

    }

    @Override
    public void saMeargaLaConcursuri() {

    }
}

