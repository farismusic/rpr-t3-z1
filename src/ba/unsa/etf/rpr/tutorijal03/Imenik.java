package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

import java.util.*;

public class Imenik {
    private Map<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> value : imenik.entrySet()){
            if(value.getValue().equals(broj)) return value.getKey();
        }
        return new String("Nisam nasao");
    }
    String naSlovo(char s){
        String vrati = new String();
        int k=1;
        for (Map.Entry<String, TelefonskiBroj> value :  imenik.entrySet()){
<<<<<<< HEAD
            if(value.getKey().charAt(0) ==  s) vrati = "" + (k++) + ". " + value.getKey() + " - " + value.getValue().ispisi() + "\n";
=======
            if(value.getKey().charAt(0) ==  s) vrati = "" + (k++) + ". " + value.getKey() + " " + value.getValue().ispisi() + "\n";
>>>>>>> origin/master
        }
        return vrati;
    }

<<<<<<< HEAD
    Set<String> izGrada(Grad g){
        FiksniBroj broj = new FiksniBroj(g, "1234");
        String pozivni = new String(broj.getPozivni());

        Set<String> set = new TreeSet<String>();
        for (Map.Entry<String, TelefonskiBroj> value :  imenik.entrySet()){
            if(value.getValue().ispisi().equals(pozivni)) set.add(value.getKey());
        }
        return set;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        return new TreeSet<TelefonskiBroj>();
    }
=======
    /*Set<String> izGrada(Grad g){
        Set<String> set = new Set<String>();
        KORISTITI TREE SET

    }*/
>>>>>>> origin/master


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imenik imenik1 = (Imenik) o;
        return Objects.equals(imenik, imenik1.imenik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imenik);
    }
}