package dziedziczenie;

import dziedziczeniePotwory.Potwor;
import dziedziczeniePotwory.Szkielet;
import dziedziczeniePotwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);

        Szkielet s = new Szkielet(20, 50, "Łuk");
        s.atakuj();

        System.out.println(s.predkoscChodzenia);

        Zombie z = new Zombie();

    }
}
