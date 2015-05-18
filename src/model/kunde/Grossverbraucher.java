package model.kunde;

/**
 * Beschreibung:
 * Diese Klasse bilden das Kind-Objekt der Kundenklasse als Großverbraucher.
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
public class Grossverbraucher extends AKunde {

    private static int status = 0;
    private static double rabatt = 5.00;

    /**
     * Konstruktor
     */
    private Grossverbraucher() {
        this(rabatt, status);
    }

    /**
     * Konstruktor
     * @param rabatt Rabatt des Großverbracuhers.
     */
    private Grossverbraucher(double rabatt) {
        super(rabatt);
    }

    /**
     * Konstruktor
     * @param rabatt
     * @param status
     */
    private Grossverbraucher(double rabatt, int status) {
        super(rabatt);
        this.status = status;
    }
    
    /**
     * Konstruktor
     * @param anschrift
     * @param rabatt
     * @param status
     */
    public Grossverbraucher(Adresse anschrift, double rabatt, int status) {
        this(rabatt);
        this.anschrift = anschrift;
        this.status = status;
    }

    /**
     *
     * @return Der Status wird zurückgegeben.
     */
    public int getStatus() {
        return status;
    }

    /**
     *
     * @param status Der Status 
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     *
     * @return Die Adresse wird zurückgegeben.
     */
    @Override
    public Adresse getAnschrift() {
        return this.anschrift;
    }

    /**
     *
     * @param anschrift Die Adresse des Kunden
     */
    @Override
    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    /**
     *
     * @return Der Rabatt wird zurückgegeben.
     */
    @Override
    public double getRabatt() {
        return this.rabatt;
    }

    /**
     *
     * @param rabatt Der Rabatt
     */
    @Override
    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }

    /**
     *
     * @return Die Kundennummer wird zurückgegeben.
     */
    @Override
    public String getNummer() {
        return this.nummer;
    }

    /**
     *
     * @param nummer Die Kundennummer
     */
    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Grossverbraucher:" + "\n\tStatus = " + status + 
                                                               "\n\tRabatt = " + this.rabatt + 
                                                               "\n\tAnschrift = " + this.anschrift + 
                                                               "\n\tNummer = " + this.nummer;
    }
}
