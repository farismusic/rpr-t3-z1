package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj implements Comparable{
    private String pozivni;
    private String bezPozivnog;
    MobilniBroj(int mobilnaMreza, String broj){
        pozivni = "0" + mobilnaMreza;
        bezPozivnog = broj;
    }
    public String ispisi(){
        return pozivni + "/" + bezPozivnog;
    }

    @Override
    public String getPozivni() {
        return pozivni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        MobilniBroj that = (MobilniBroj) o;
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
