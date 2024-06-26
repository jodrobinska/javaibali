package referencje;

public class Referencje {
    public static void main(String[] args) {

        String imie = "Piotr";
        String imie2 = "Piotr";

        // if (imie == imie2)
        // bo zmienne referencyjne przechowuja adres!
        if (imie.equals(imie2))
            System.out.println("sa rowne");

    }
}