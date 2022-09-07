/*
 * Diese Datei kann als einstiegspunkt der applikation betrachtet werden. Sie kann aber auch umbenannt oder gelöscht und neu erzeugt werden
 */

public class MeineZeichnung extends Zeichnung
{
    public Leinwand leinwand;

    public MeineZeichnung() {
        leinwand = new Leinwand(500, 500, this, "Meine Zeichnung");
    }

    public void aufbau() {
        leinwand.kontext.size(500, 500);
        /*
         * Hier wird alles getan was ihr vor dem rendern gebraucht wird wie z.b. die größe des fensters wird hier wie zu sehen mir size gesetzt 
         */
    }
    
    public void zeichnen() {
        /*
         * Hier wird die rendering Loop reingeschrieben 
         * Wenn elemente dargestellt/verändert werden sollen wird die logik dafür hier definiert
         * diese methode wird nach jedem frame aufgerufen. Sobald ein neues bild gezeichnet werden soll wird diese funktion aufgerufen
         */
    }
    /*
     * Methoden zum abfangen von tastertur und mauseingaben
    public void mausDruck() {
        
    }
    
    public void tastenDruck() {
        
    }
    */
    // Mit dem ausführen dieser funktion wird das program ausgeführt 
    public void starten() {
        leinwand.runSketch();
    }
}
