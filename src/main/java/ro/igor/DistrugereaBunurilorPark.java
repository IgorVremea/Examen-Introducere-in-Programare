package ro.igor;

public class DistrugereaBunurilorPark extends DistrugereaBunurilor{

    public DistrugereaBunurilorPark(String cnp, float valoare) {
        super(cnp, "Distrugerea bunurilor din parcuri", valoare*30);
    }
}
