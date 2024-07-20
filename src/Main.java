import java.util.ArrayList;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }

    /**
     *
     * @param zoneManagers
     * @param codes - codes of damaged shipments
     * @return all postmen that delivered damaged shipments.
     */
    public static ArrayList<Postman> getSloppyPostmen(ZoneManager[] zoneManagers, String[] codes)
    {
        ArrayList<Postman> postmen = new ArrayList<>();
        ArrayList<Shipment> shipments;
        for (int i = 0; i < zoneManagers.length;i++)
        {
            shipments = zoneManagers[i].getShipments();
            for (Shipment s:shipments)
            {
                for(int j=0; j<codes.length;j++)
                {
                    if( codes[j].equals(s.getCode()))
                    {
                        postmen.add(s.getPostman());
                    }
                }
            }
        }
        return postmen;
    }
}