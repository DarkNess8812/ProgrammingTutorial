package oop_mostenire;

public class AngajatStudentSportiv extends Persoana implements AngajatInterface, SportivInterface, StudentInterface{

    private String firma;
    private String pozitie;
    private int salar;
    private String experienta;

    private String sport;
    private boolean sportEchipa;
    private boolean perfomanta;
    private int medali;

    private String facultate;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public AngajatStudentSportiv(String nume, String prenume, int varsta, String sex,
                                 String adresa, String firma, boolean restante, boolean bursa,
                                 int an, String domeniu, String facultate, int medali,
                                 boolean perfomanta, boolean sportEchipa, String sport,
                                 String experienta, int salar, String pozitie) {

        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.restante = restante;
        this.bursa = bursa;
        this.an = an;
        this.domeniu = domeniu;
        this.facultate = facultate;
        this.medali = medali;
        this.perfomanta = perfomanta;
        this.sportEchipa = sportEchipa;
        this.sport = sport;
        this.experienta = experienta;
        this.salar = salar;
        this.pozitie = pozitie;
    }

    @Override
    public void ajungeLaTimpLaBirou() {
        System.out.println("Angajatul trebuie sa ajunga la birou intre 8:00 si 17:00 ");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul trebuie sa munceasca in intervalul specificat ");
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
}
