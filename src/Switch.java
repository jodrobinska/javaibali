public class Switch {
    public static void main(String[] args) {
        int wagaRoweru = 21;
        switch(wagaRoweru)
        {
            case 9:
                System.out.println("Rower o wadze 9 KG to szosa");
                break;
            case 10:
                System.out.println("Rower o wadze 10 KG to gravel");
                break;
            case 14:
                System.out.println("Rower o wadze 14 KG to rower crossowy");
                break;
            case 20:
                System.out.println("Rower o wadze 20 KG to rower górski");
                break;
            default:
                System.out.println("Rower o podanej wadze - " + wagaRoweru + " KG - nie znajduje sie w systemie sklepu");
        }
    }
}
