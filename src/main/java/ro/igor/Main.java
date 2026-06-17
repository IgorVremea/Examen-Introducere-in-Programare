package ro.igor;

import java.util.HashSet;
import java.util.Set;

// Intrebarea din examen: Să se explice care sunt avantajele folosirii polimorfismului în cadrul acestei aplicații.
// Datorita polimorfizumului pot calcula pret, sa caut si sa afisez amenzile indiferent de tip.

public class Main {
    public static void main(String[] args) {
        AmenziManager amenziManager = new AmenziManager(new HashSet<>(Set.of(
                new ParcareaIlegalaMasinii("1234567890123"),
                new ParcareaIlegalaMasinii("0987654321123"),
                new AruncareaGunoiuluiPeJos("1234567890123", 2),
                new AruncareaGunoiuluiPeJos("1231231231234", 4),
                new AruncareaGunoiuluiPeJos("0987654321123", 1),
                new DistrugereaBunurilorPark("1231231231234", 200),
                new DistrugereaBunurilorPark("1234567890123", 1000),
                new ParcareaIlegalaMasinii("1031274456709"),
                new AruncareaGunoiuluiPeJos("1031274456709", 1),
                new DistrugereaBunurilorPark("1031274456709", 258)


        )));

        // Am pus in comentarii ca consola sa nu fie prea aglomerata
        amenziManager.showAllAmenzi();
//        amenziManager.showListaAmenzilor(amenziManager.amenziByCNP("1234567890123"));
//        amenziManager.showListaAmenzilor(amenziManager.amenziByType("ParcareaIlegalaMasinii"));
        System.out.println("Cetatean cu CNP: 1031274456709\n" +
                "Trebuie sa achite: " + amenziManager.calculateAmenzi(amenziManager.amenziByCNP("1031274456709")) + " RON\n" +
                "Pentru:\n" + amenziManager.listaAmenzilorToString(amenziManager.amenziByCNP("1031274456709")) + "\n");
    }
}