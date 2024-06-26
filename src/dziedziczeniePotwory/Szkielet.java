package dziedziczeniePotwory;

public class Szkielet extends Potwor {

    public void atakuj()
    {
        super.atakuj();
        /*
            DODATKOWE INSTRUKCJE ATAKUJACE
         */
        System.out.println("To jest metoda atakuj z klasy Szkielet");
    }
    String typBroni;
    public Szkielet()
    {
        System.out.println("Domyslny konstruktor z klasy Szkielet");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni) {

        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("NieDomyslny konstruktor z klasy Szkielet");

    }
}
