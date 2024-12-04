package oop_mostenire;

public class Sportiv extends Persoana{

    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private boolean perfomanta;
    private int medali;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa, int experienta,
                   boolean sportEchipa, String sport, boolean perfomanta, int medali) {
        super(nume, prenume, varsta, sex, adresa);
        this.experienta = experienta;
        this.sportEchipa = sportEchipa;
        this.sport = sport;
        this.perfomanta = perfomanta;
        this.medali = medali;
    }

    public void infoSportiv(){
        infoPersoana();
        System.out.println("Sportul pe care il practica este "+ sport);
        System.out.println("Sportivul face parte dintr-o echipa? "+ sportEchipa);
        System.out.println("De cati ani practica sportul "+ experienta);
        System.out.println("Practica sport de performanta? "+ perfomanta);
        System.out.println("Cate medalii a castigat sportivul "+ medali);
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getMedali() {
        return medali;
    }

    public void setMedali(int medali) {
        this.medali = medali;
    }

    public boolean isPerfomanta() {
        return perfomanta;
    }

    public void setPerfomanta(boolean perfomanta) {
        this.perfomanta = perfomanta;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }
}

