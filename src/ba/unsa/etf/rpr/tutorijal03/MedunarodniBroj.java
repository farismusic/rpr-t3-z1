package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {
    private String pozivni;
    private String bez_pozivnog;
    MedunarodniBroj(String drzava, String broj){
        pozivni = drzava;
        bez_pozivnog = broj;
    }
    public String ispisi(){
        return pozivni +bez_pozivnog;
    }

    public String getPozivni() {
        return pozivni;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(pozivni, that.pozivni) &&
                Objects.equals(bez_pozivnog, that.bez_pozivnog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pozivni, bez_pozivnog);
    }
}
