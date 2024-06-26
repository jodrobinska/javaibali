public class sumaWartosci {
    public static void main(String[] args) {
        int[] liczby = {14, 12, 120, 225, 3, 7};

        int suma = 0;

        for (int i = 0; i < liczby.length; i++) {
            suma = suma + liczby[i];
        }
        System.out.println("Suma: " + suma);


        //-----------------------------------


        int[] liczby1 = {2,4,7,10,325,17,9};

        int suma1 = 0;

        for(int sumaLiczb: liczby1) {

            suma1 += sumaLiczb;
        }
        System.out.println("Suma1: " + suma1);


        //----------------------------------

    }
}
