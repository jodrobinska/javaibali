public class PetlaWhile_PetlaDoWhile {
    public static void main(String[] args) {

        int[] tablicaLiczb = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int a = 0;
        while(a < tablicaLiczb.length) {
            System.out.println(tablicaLiczb[a]);
            a++;
        }
//-------------------

        int i = 0;
        while(i < 9) {
            System.out.println(i);

            i++;
        }

//-------------------

        String[] gryPlanszowe = {
                "Tyrants of the Underdark",
                "Nemesis",
                "Wladcy Ziemi",
                "ISS Vanguard",
                "Res Arcana"
        };
        int j = 0;
        while(j < gryPlanszowe.length) {
            System.out.println(gryPlanszowe[j++]);

        }

//--------------------

        //do while - jesli nie interesuje nas czy warunek na poczatku zostanie spelniony
        String[] gryLogiczne = {
                "Ubongo",
                "CatStax",
                "Coggy",
                "Hokito"
        };
        int k = 0;

        do {
            System.out.println(gryLogiczne[k]);
            k++;
        }
        while(k < gryLogiczne.length);
    }
}
