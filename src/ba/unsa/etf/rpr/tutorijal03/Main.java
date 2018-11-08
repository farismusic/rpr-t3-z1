package ba.unsa.etf.rpr.tutorijal03;




public final class Main {
    private Main(){}

    public static void main(String[] args) {
        TelefonskiBroj med = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "61/358-331");
        TelefonskiBroj hak = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "62/961-200");
        TelefonskiBroj kk = new FiksniBroj(FiksniBroj.Grad.BIHAC, "34/889-000");
        Imenik imenik = new Imenik();
        imenik.dodaj("Faris", med);
        imenik.dodaj("Ferzet", hak);
        imenik.dodaj("haso", kk);
        //System.out.println(imenik.dajBroj("Faris"));
        //System.out.println(imenik.dajIme(med));
        System.out.println(imenik.naSlovo('F'));

    }
}
