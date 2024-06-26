package butelka;

public class Butelka {
    private double ileLitrow;

    //Butelka() {}
    // --- bo zadekralowalismy jaka pojemnosc maja butelki
    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow(){
        return ileLitrow;
    }

    boolean wlej(double ilosc)
    {
        if (ilosc <= ileLitrow)
            this.ileLitrow += ilosc;
        else
            return false;
        return true;

        /**/
    }

    boolean wylej(double ilosc)
    {
        if (ilosc <= ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;

        return true;
    }

    void przelej (double ilosc, Butelka gdziePrzelac){
        if (this.wylej(ilosc))
        {
            gdziePrzelac.wlej(ilosc);
        }
        else
            System.out.println("za malo litrow");

    }



    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];

        /* for (int i = 0; i < butelka.length; i++){
            System.out.println(i);
            */

        butelka[0] = new Butelka(5);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);

        butelka[0].wlej(4); // wlewamy dodatkowo 4 litry do butelki 0, wiec mamy 9 litrow

        butelka[0].przelej(4, butelka[1]); //przelewamy 4 litry z butelki 0 do butelki 1
        butelka[0].przelej(6, butelka[1]); //nie mozna wykonac poniewaz w butelce 0 jest 5 litrow, a chcemy przelac 6 litrow
        butelka[0].przelej(5, butelka[1]);
        butelka[0].wlej(7); //nie mozemy wlac 7 litrow do butelki 0, poniewaz jej maksymalna pojemnosc to 5 litrow

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());
    }
}
