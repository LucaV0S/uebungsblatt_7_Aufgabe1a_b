public class BuchVerwaltung {
    public static void main(String[] args) {
        StdOut.print("Wie viele Bücher möchtest du einspeichern: ");
        int anzahlBuch = StdIn.readInt();
        Buch [] buch = new Buch[anzahlBuch];

        for(int loop = 0; loop< buch.length; ++loop){
            StdOut.print("Name des Buchs, " + loop + ": ");
            String buchname = StdIn.readString();

            StdOut.print("Artikelnummer von Buch, " + loop + ": ");
            int artikelNr = StdIn.readInt();

            StdOut.print("Preis vom Buch, " + loop + ": ");
            double preis = StdIn.readDouble();

            StdOut.print("Bestand des Buchs, " + loop + ": ");
            int bestand = StdIn.readInt();

            buch[loop] = new Buch(buchname, artikelNr, preis, bestand);
            StdOut.println("----------------------------------------------");

        }
        for(int ausgaben = 0; ausgaben< buch.length; ++ausgaben){
            StdOut.println(buch[ausgaben]);
        }
        Buch buch1 = new Buch("Gutes Buch", 12345, 12.68, 8);



    }


}