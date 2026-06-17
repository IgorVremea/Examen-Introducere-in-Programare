package ro.igor;

public abstract class ParcareaIlegala extends Amenda { // in caz dac vor fi si alte mijloace de transport: motocicleta, trotineta, cal etc.

    public ParcareaIlegala(String cnp, String tipAmenda, float valoare) {
        super(cnp, tipAmenda, valoare);
    }
}
