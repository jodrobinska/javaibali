public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            if (i == 17)
                continue;
            System.out.println(i);
        }


        System.out.println();


        for (int j = 100 ; j < 120; j++) {
            if (j == 118)
                break;
            System.out.println(j);
        }

    }
}
