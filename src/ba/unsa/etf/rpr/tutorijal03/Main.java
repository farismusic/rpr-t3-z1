package ba.unsa.etf.rpr.tutorijal03;

public class Main {

    public static void main(String[] args) {
	    FiksniBroj tel = new FiksniBroj(Grad.TRAVNIK, "123-456");
        System.out.println(tel.ispisi());
	    MobilniBroj mob = new MobilniBroj(61, "358-331");
        System.out.println(mob.ispisi());
        TelefonskiBroj med = new MedunarodniBroj("+387", "61/358-331");
        System.out.println(med.ispisi());
    }
}
