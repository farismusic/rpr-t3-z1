package ba.unsa.etf.rpr.tutorijal03;

import javax.lang.model.element.NestingKind;

public class Main {

    public static void main(String[] args) {
        TelefonskiBroj med = new MedunarodniBroj("+387", "61/358-331");
        TelefonskiBroj hak = new MedunarodniBroj("+387", "62/961-200");
        TelefonskiBroj kk = new MedunarodniBroj("+387", "34/889-000");
        Imenik imenik = new Imenik();
        imenik.dodaj("Faris", med);
        imenik.dodaj("Ferzet", hak);
        imenik.dodaj("haso", kk);
        //System.out.println(imenik.dajBroj("Faris"));
        //System.out.println(imenik.dajIme(med));
        System.out.println(imenik.naSlovo('F'));
    }
}
