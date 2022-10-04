import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Växter> växterPåHotellet = new ArrayList<>();
        Kaktus igge = new Kaktus("Igge", 0.2, "Rund");
        växterPåHotellet.add(igge);
        Palm laura = new Palm("Laura", 5, true);
        växterPåHotellet.add(laura);
        Köttätande meatloaf = new Köttätande("Meatloaf", 0.7, 28);
        växterPåHotellet.add(meatloaf);
        Palm putte = new Palm("Putte", 1, false);
        växterPåHotellet.add(putte);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Programmet avbrutet!");
                System.exit(0);
            }
            if (input.equals("")) {
                JOptionPane.showMessageDialog(null, "Felaktig inmatning.");
                continue;
            }

            input = input.toLowerCase();
            for (int i = 0; i < växterPåHotellet.size(); i++) {
                if (input.equals(växterPåHotellet.get(i).getNamn().toLowerCase())) {
                    JOptionPane.showMessageDialog(null, växterPåHotellet.get(i).skrivUtTillString());
                    break;
                } else if (i == växterPåHotellet.size() -1) {
                    JOptionPane.showMessageDialog(null, "Finns ingen växt på hotellet med det namnet.");

                }

            }
        }
    }
}