public class ProgramowanieObiektowe {
    public static void main(String[] args) {

        Drzwi porta = new Drzwi();
        porta.wysokosc = 200;
        porta.szerokosc = 90;
        Drzwi erkado = new Drzwi();
        erkado.wysokosc = 210;
        erkado.szerokosc = 95;

        System.out.println("Drzwi Porta, wysokosc: " + porta.wysokosc + "; szerokosc: " + porta.szerokosc);
        System.out.println("Drzwi Erkado, wysokosc: " + erkado.wysokosc + "; szerokosc: " + erkado.szerokosc);

    }
}

class Drzwi
{
    int wysokosc;
    int szerokosc;

    void otworz() {

    }
    void zamknij() {

    }
}