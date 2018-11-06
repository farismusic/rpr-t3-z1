package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

import java.util.*;

public class Imenik implements Comparable {
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
            if(value.getKey().charAt(0) ==  s) vrati += "" + (k++) + ". " + value.getKey() + " - " + value.getValue().ispisi() + "\n";
        }
        return vrati;
    }

    Set<String> izGrada(Grad g){
        FiksniBroj broj = new FiksniBroj(g, "1234");
        String pozivni = new String(broj.getPozivni());

        Set<String> set = new TreeSet<String>();
        for (Map.Entry<String, TelefonskiBroj> value :  imenik.entrySet()){
            if(value.getValue().getPozivni().equals(pozivni)) set.add(value.getKey());
        }
        return set;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        FiksniBroj broj = new FiksniBroj(g, "1234");
        String pozivni = new String(broj.getPozivni());

        Set<TelefonskiBroj> set = new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String, TelefonskiBroj> value : imenik.entrySet()){
            if(value.getValue().getPozivni().equals(pozivni));
        }
        return set;
    }


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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
