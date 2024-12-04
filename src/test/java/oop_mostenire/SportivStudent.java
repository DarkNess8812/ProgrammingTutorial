package oop_mostenire;

public class SportivStudent extends Persoana implements StudentInterface, SportivInterface{

    private String facultate;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    private String sport;
    private boolean sportEchipa;
    private boolean perfomanta;
    private int medali;

    public SportivStudent(String nume, String prenume, int varsta, String sex, String adresa,
                          String facultate, String domeniu, int an, boolean bursa,
                          boolean restante, String sport, boolean sportEchipa, boolean perfomanta, int medali) {

        super(nume, prenume, varsta, sex, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.perfomanta = perfomanta;
        this.medali = medali;
    }


    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri ");
    }

    @Override
    public void trebuieSaStudeze() {
        System.out.println("Studentul trebuie sa studieze ");
    }

    @Override
    public void saNuAibeRestante() {
        System.out.println("Studentul sa nu aiba restante ");
    }

    @Override
    public void saStieSaCopieze() {
        System.out.println("Studentul sa stie sa copieze ");
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
