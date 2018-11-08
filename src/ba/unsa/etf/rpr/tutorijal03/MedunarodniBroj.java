package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj implements Comparable{
    private String pozivni;
    private String bezPozivnog;
    MedunarodniBroj(String drzava, String broj){
        pozivni = drzava;
        bezPozivnog = broj;
    }
    public String ispisi(){
        return pozivni +bezPozivnog;
    }

    public String getPozivni() {
        return pozivni;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(pozivni, that.pozivni) &&
                Objects.equals(bezPozivnog, that.bezPozivnog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pozivni, bezPozivnog);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
