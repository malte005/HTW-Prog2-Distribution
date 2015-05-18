package model.verpackung;

/**
 * Beschreibung:
 * Diese Klasse bilden das Kind-Objekt der Verpackungseinheit-Klasse als Karton.
 *
 * @author Malte Dammann
 * E-Mail: s0549309@htw-berlin.de
 * Bearbeitungszeitraum: 05.05.15 - 23.05.2015
 *
 * Modul: Programmierung 2
 *
 * Dateiname: Engine.java
 * IDE: NetBeans IDE 8.0.2
 * Java: 1.8.0_20; Java HotSpot(TM) 64-Bit
 *
 * @since 2015-05-05
 * @version 0.1
 *
 */
public class Karton extends AVerpackungseinheit {

    private int anzahlFlaschen = 12;

    /**
     * Konstruktor
     */
    public Karton() {
    }

    /**
     * Konstruktor
     * @param anzahlFlaschen
     */
    public Karton(int anzahlFlaschen) {
        this.anzahlFlaschen = anzahlFlaschen;
    }

    /**
     *
     * @return Die Anzahl der Flaschen wird zurückgegeben.
     */
    @Override
    public int getAnzahlFlaschen() {
        return this.anzahlFlaschen;
    }

    /**
     *
     * @param anzahlFlaschen Anzahl der Flaschen
     */
    @Override
    public void setAnzahlFlaschen(int anzahlFlaschen) {
        this.anzahlFlaschen = anzahlFlaschen;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Karton{" + "anzahlFlaschen=" + this.anzahlFlaschen + '}';
    }

}
