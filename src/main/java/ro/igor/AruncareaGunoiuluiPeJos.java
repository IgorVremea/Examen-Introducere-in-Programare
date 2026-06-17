package ro.igor;

public class AruncareaGunoiuluiPeJos extends Amenda{
    private int factorZonal;
    public AruncareaGunoiuluiPeJos(String cnp, int factorZonal) {
        super(cnp, "Aruncarea gunoilor pe jos", 200*factorZonal);
        this.factorZonal = factorZonal;
    }

    public int getFactorZonal() {
        return factorZonal;
    }
}
