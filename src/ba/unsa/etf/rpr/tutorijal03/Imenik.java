package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

import java.util.*;

public class Imenik implements Comparable, Set {
    private Map<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();
    public final void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> value : imenik.entrySet()){
            if(value.getValue().equals(broj)) {return value.getKey();}
        }
        return "Nisam nasao";
    }
    public final String naSlovo(char s){
        String vrati = "";
        int k=1;
        for (Map.Entry<String, TelefonskiBroj> value :  imenik.entrySet()){
            if(value.getKey().charAt(0) ==  s) {vrati += "" + (k++) + ". " + value.getKey() + " - " + value.getValue().ispisi() + "\n";}
        }
        return vrati;
    }

    public final Set<String> izGrada(Grad g){
        FiksniBroj broj = new FiksniBroj(g, "1234");
        String pozivni = new String(broj.getPozivni());

        Set<String> set = new TreeSet<String>();
        for (Map.Entry<String, TelefonskiBroj> value :  imenik.entrySet()){
            if(value.getValue().getPozivni().equals(pozivni)) {set.add(value.getKey());}
        }
        return set;
    }

    public final Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        FiksniBroj broj = new FiksniBroj(g, "1234");
        String pozivni = new String(broj.getPozivni());

        Set<TelefonskiBroj> set = new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String, TelefonskiBroj> value : imenik.entrySet()){
            if(value.getValue().getPozivni().equals(pozivni)){
                set.add(value.getValue());
            }
        }
        return set;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
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
