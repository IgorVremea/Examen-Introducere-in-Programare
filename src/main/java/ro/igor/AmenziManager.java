package ro.igor;

import java.util.HashSet;

public class AmenziManager {
    HashSet<Amenda> amenzi;

    public AmenziManager(){
        this.amenzi = new HashSet<>();
    }

    public AmenziManager(HashSet<Amenda> amenzi){
        this.amenzi = amenzi;
    }

    public void adaugaAmenda(Amenda amenda){
        this.amenzi.add(amenda);
    }

    public HashSet<Amenda> amenziByType(String type){
        HashSet<Amenda> resAmenzi = new HashSet<>();
        for(Amenda amenda : this.amenzi){
            try{
                // Verificarea comenzilor dupa tip
                // Am copiat conditie din curs la care am mai povestit cu dvs despre asta
                // ca sa pot verifica si clase abstracte pe care le-am adaugat.
                // Class.forName(String name) - creeaza instanta temporara
                if(Class.forName("ro.igor."+type).isAssignableFrom(amenda.getClass())){
                    resAmenzi.add(amenda);
                }
            } catch(Exception e) {
                System.out.println("Problem:" + e.getMessage());
            }
        }
        return resAmenzi;
    }

    public HashSet<Amenda> amenziByCNP(String cnp){
        HashSet<Amenda> resAmenzi = new HashSet<>();
        for(Amenda amenda : this.amenzi){
            if(amenda.getCnp().equals(cnp)){
                resAmenzi.add(amenda);
            }
        }
        return resAmenzi;
    }
    public void showListaAmenzilor(HashSet<Amenda> amenzi){
        System.out.println(listaAmenzilorToString(amenzi));
    }
    public String listaAmenzilorToString(HashSet<Amenda> amenzi){
        StringBuilder res = new StringBuilder(); // Stiu ca nu am lucrat cu el, dar am auzit ca functioneaza mai bine cand adaugam multe randuri
        for(Amenda amenda : amenzi){
            res.append(amenda);
            res.append("\n");
        }
        return res.toString();
    }
    public void showAllAmenzi(){
        showListaAmenzilor(amenzi);
    }
    public float calculateAmenzi(HashSet<Amenda> amenzi){
        float res = 0;
        for(Amenda amenda : amenzi){
            res += amenda.getValoare();
        }
        return res;
    }
    public String amenziPentruCpn(String cnp){
        return "Cetatean cu CNP: "+cnp+"\n" +
                "Trebuie sa achite: " + this.calculateAmenzi(this.amenziByCNP(cnp)) + " RON\n" +
                "Pentru:\n" + this.listaAmenzilorToString(this.amenziByCNP(cnp)) + "\n";
    }
}
