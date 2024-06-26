public class ProgramowanieObiektowe1 {
    public static void main(String[] args) {

        Test a = new Test();
        a.wypisz("Judyta", "pomaranczowy");
        Test b = new Test();
        b.wypisz("Magda", "niebieski");


        int wynik = a.dodaj(13,73);
        System.out.println(wynik);

        double wynik1 = a.dodaj(13.50,73.87);
        System.out.println(wynik1);
    }
}

class Test {
    void wypisz(String imie, String kolor) {
        System.out.println(imie + " " + kolor);
    }

    int dodaj(int a, int b) {
        return a + b;
    }

    double dodaj(double a, double b) {
        return a + b;
    }
}