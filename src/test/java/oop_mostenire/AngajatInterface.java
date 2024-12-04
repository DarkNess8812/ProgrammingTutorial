package oop_mostenire;

public interface AngajatInterface {

    //abstractizare = conceptul prin care putem defini comportamentul unei clase
    //abstractizarea se poate face prin 2 feluri: interfete si clase abstracte
    //interfata contine doar metode abstracte(metode care nu au body)
    //toate aceste metode abstracte sunt publice
    //intr-o interfata putem defini metode cu void sau return
    //intr-o interfata nu putem avea un constructor -> nu putem face um obiect
    //interfata se implementeaza
    //clasa care impleenteaza interfata trebuie sa implementeze toate metodele din ea
    //o clasa poate implementa mai multe interfete
    //o interfata poate mostenii o alta interfata

    void ajungeLaTimpLaBirou();
    void munceste();
    void absente();
    void respectaConduita();


}
