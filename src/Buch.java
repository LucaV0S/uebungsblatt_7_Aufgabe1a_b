public class Buch {

    // Instanzvariablen
    private String buchname;
    private int artikelnr;
    private double preis;
    private int bestand;
    // Konstruktor
    public Buch(String buchname, int artikelnr, double preis, int bestand){
        this.buchname = buchname;
        this.artikelnr  = artikelnr;
        this.preis = preis;
        this.bestand = bestand;
    }
    //getter und setter Methoden
    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public String getBuchname() {
        return buchname;
    }

    public int getArtikelnr() {
        return artikelnr;
    }

    public double getPreis() {
        return preis;
    }

    public int getBestand() {
        return bestand;
    }

    //Klassen Methoden

    public String toString(){
        String gut = "Buchname: " + buchname
                + ", " + "Artikelnummer: " + artikelnr
                + ", " + "Preis: " + preis
                + ", " + "Bestand: " + bestand;
        return gut;
    }

}
