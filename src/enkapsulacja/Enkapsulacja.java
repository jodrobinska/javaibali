package enkapsulacja;

public class Enkapsulacja {
    public static void main(String[] args) {

        //enkapsulacja - hermetyzacja

        KontoBankowe oszczednosciowe = new KontoBankowe();
        oszczednosciowe.wplac(7000);

        if (oszczednosciowe.wyplac(20)) {
            System.out.println("wyplacono");
        }
        else
            System.out.println("niewystarczajace srodki na koncie");


        System.out.println(oszczednosciowe.getSaldo());
    }
}
class KontoBankowe
{
    public KontoBankowe(){
        saldo = 1000;
    }
    private int saldo;

    int getSaldo()
    {
        return saldo;
    }
    private boolean setSaldo(int saldo)
    {
        /*
        WARUNKI
         */
        this.saldo = saldo;

        return true;
    }
    boolean wyplac(int ile)
    {
        if (saldo < ile)
            return false;
        else
            setSaldo(saldo - ile);
        return true;
    }
    boolean wplac(int ile){
        setSaldo(saldo + ile);
        return true;
    }
}
