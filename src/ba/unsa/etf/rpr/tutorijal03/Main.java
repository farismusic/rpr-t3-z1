package ba.unsa.etf.rpr.tutorijal03;

import javax.lang.model.element.NestingKind;

public class Main {

    public static void main(String[] args) {
        TelefonskiBroj med = new MedunarodniBroj("+387", "61/358-331");
        Imenik imenik = new Imenik();
        imenik.dodaj("Faris", med);
        //System.out.println(imenik.dajBroj("Faris"));
        //System.out.println(imenik.dajIme(med));
        System.out.println(imenik.naSlovo('F'));
    }
}
