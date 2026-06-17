package ro.igor;

public abstract class DistrugereaBunurilor extends Amenda{ // in caz daca se strica si alt tip de bunuri

    public DistrugereaBunurilor(String cnp, String tipAmenda, float valoare) {
        super(cnp, tipAmenda, valoare*30);
    }
}
