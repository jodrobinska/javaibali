
public class Statycznosc {
    public static void main(String[] args) {
        // Matematyka test = new Matematyka();
        // double wynik = test.dodaj (10, 20);
        // System.out.println(wynik);

        double wynik = Matematyka.dodaj (10, 25);
        System.out.println(wynik);


        System.out.println(Matematyka.PI);


        Klient a = new Klient("Anna");
        Klient b = new Klient("Piotr");
        Klient c = new Klient("Jakub");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        System.out.println(Klient.nastepnyId);
    }
}

class Matematyka
{
    static double dodaj(double a, double b)
    {
        return a + b;
    }

    static final double PI = 3.14;
}

class Klient
{
    Klient(String imie)
    {
    this.imie = imie;
    id = nastepnyId;
    nastepnyId++;
    }
    String imie;
    int id = 0;
    static int nastepnyId = 1;
}

