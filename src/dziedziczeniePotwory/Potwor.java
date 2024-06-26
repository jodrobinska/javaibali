package dziedziczeniePotwory;

public class Potwor {
    public double predkoscChodzenia;
    public double zywotnosc;

    public void atakuj()
    {
        /*
            BAZOWE INSTRUKCJE ATAKUJ
         */
        System.out.println("To jest metoda atakuj z klasy Potwor");
    }

    public Potwor(){
        System.out.println("Domyslny konstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("NieDomyslny konstruktor z klasy Potwor");
    }
}
