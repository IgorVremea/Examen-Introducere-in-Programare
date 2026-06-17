package ro.igor;

public abstract class Amenda {
    private String cnp;
    private String tipAmenda;
    private float valoare;

    public Amenda(String cnp, String tipAmenda, float valoare) {
        this.cnp= cnp;
        this.tipAmenda = tipAmenda;
        this.valoare = valoare;
    }

    public String getCnp() {
        return cnp;
    }

    public String getTipAmenda() {
        return tipAmenda;
    }

    public float getValoare() {
        return valoare;
    }

    @Override
    public String toString() {
        return "==========================\n" +
                "|\tCetatean: " + this.cnp +
                "\n|\tEste amendat cu suma de: " + this.valoare + " RON" +
                "\n|\tPentru: " + this.tipAmenda +
                "\n==========================\n";
    }
}
