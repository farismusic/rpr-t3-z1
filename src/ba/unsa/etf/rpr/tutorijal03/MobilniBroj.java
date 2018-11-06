package ba.unsa.etf.rpr.tutorijal03;

import javax.lang.model.element.NestingKind;
import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    private String pozivni;
    private String bez_pozivnog;
    MobilniBroj(int mobilnaMreza, String broj){
        pozivni = "0" + mobilnaMreza;
        bez_pozivnog = broj;
    }
    public String ispisi(){
        return pozivni + "/" + bez_pozivnog;
    }

    @Override
    public String getPozivni() {
        return pozivni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return Objects.equals(pozivni, that.pozivni) &&
                Objects.equals(bez_pozivnog, that.bez_pozivnog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pozivni, bez_pozivnog);
    }
}
