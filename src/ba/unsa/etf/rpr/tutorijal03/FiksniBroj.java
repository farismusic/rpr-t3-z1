package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable<TelefonskiBroj> {


    @Override
    public int compareTo(TelefonskiBroj o) {
        return ispisi().compareTo(o.ispisi());
    }

    public enum Grad {
        BRCKO, BIHAC, ORASJE, TUZLA, ZENICA, GORAZDE, TRAVNIK, MOSTAR, SIROKI_BRIJEG, SARAJEVO, LIVNO, MRKONJIC_GRAD, BANJA_LUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE;
    }
    private String pozivni;
    private String bezPozivnog;
    FiksniBroj(Grad grad, String broj){
        bezPozivnog=broj;
        switch(grad){
            case BRCKO:
                pozivni = "049";
                break;
            case BIHAC:
                pozivni = "037";
                break;
            case ORASJE:
                pozivni = "031";
                break;
            case TUZLA:
                pozivni = "035";
                break;
            case ZENICA:
                pozivni = "032";
                break;
            case GORAZDE:
                pozivni = "038";
                break;
            case TRAVNIK:
                pozivni = "030";
                break;
            case MOSTAR:
                pozivni = "036";
                break;
            case SIROKI_BRIJEG:
                pozivni = "039";
                break;
            case SARAJEVO:
                pozivni = "033";
                break;
            case LIVNO:
                pozivni = "034";
                break;
            case MRKONJIC_GRAD:
                pozivni = "050";
                break;
            case BANJA_LUKA:
                pozivni = "051";
                break;
            case PRIJEDOR:
                pozivni = "052";
                break;
            case DOBOJ:
                pozivni = "053";
                break;
            case SAMAC:
                pozivni = "054";
                break;
            case BIJELJINA:
                pozivni = "055";
                break;
            case ZVORNIK:
                pozivni = "056";
                break;
            case PALE:
                pozivni = "057";
                break;
            case FOCA:
                pozivni = "058";
                break;
            case TREBINJE:
                pozivni = " 059";
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        FiksniBroj that = (FiksniBroj) o;
        return Objects.equals(pozivni, that.pozivni) &&
                Objects.equals(bezPozivnog, that.bezPozivnog);
    }

    public String getPozivni() {
        return pozivni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pozivni, bezPozivnog);
    }

    public final String ispisi() {
        return new String(pozivni+"/"+bezPozivnog);
    }

}
