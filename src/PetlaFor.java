public class PetlaFor {
    public static void main(String[] args) {

        int[] wielokrotnosc100 = new int[]{100, 200, 300, 400, 500, 600, 700};

        for (int i = 0; i < wielokrotnosc100.length; i++) {
            if(wielokrotnosc100[i] > 300)
            System.out.println(wielokrotnosc100[i]);
        }
//-----------------------

        String[] ksiazkiPrzeczytane = {
                "Harry Potter i kamien filozoficzny - J.K. Rowling",
                "Cien wiatru - Carlos Ruiz Zafon",
                "Certyfikowany tester ISTQB - A.Roman, L.Stapp, M.Pilaeten",
                "Genialna przyjaciolka - E.Ferrante",
                "Oskar i Pani Roza - E.E. Schmitt"
        };
        for (int j = 0; j < ksiazkiPrzeczytane.length; j++) {
            System.out.println(ksiazkiPrzeczytane[j]);
        }

//--------------------

        String[] ksiazkiNiePrzeczytane = {
                "Kod Leonarda da Vinci - Dan Brown",
                "Hrabia Monte Christo - Aleksander Dumas",
                "Hobbit - J.R.R. Tolkien",
                "Imie rozy - Umberto Eco"
        };
        for(String myValue: ksiazkiNiePrzeczytane) {
            System.out.println(myValue);
        }
    }
}
