//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        int wiek = -1;

        if (wiek >= 0 && wiek <= 17) {
            System.out.println("Do 18 roku życia musisz sie uczyć");
        }
        else if (wiek >= 18 && wiek < 65) {
            System.out.println("Mozesz pracowac");
        }
        else if (wiek >= 65) {
            System.out.println("Mozesz przejsc na emeryture");
        }
        else {
            System.out.println("Nie spełniasz zadnego z wymagań");
        }
    }
}