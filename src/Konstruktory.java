public class Konstruktory {
    public static void main(String[] args) {

        Punkt p = new Punkt(10, 15, 20);
        Punkt p2 = new Punkt(15, 20, 25);

        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);
        System.out.println("p.z " + p.z);
        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);
        System.out.println("p2.z " + p2.z);
    }
}

class Punkt
{

    Punkt(int pierwszy, int drugi, int trzeci) {
        System.out.println("Wywolano konstruktor z trzema parametrami");
        x = pierwszy;
        y = drugi;
        z = trzeci;

    }
    int x;
    int y;
    int z;
}
