package model.kunde;

/**
 * Beschreibung:
 * Diese Klasse bilden das Kind-Objekt der Kundenklasse als Endverbraucher.
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
 * @version 0.2
 *
 */
public class Endverbraucher extends AKunde {

    private static final double RABATT = 0.00;
    private static boolean bonitaet = false;

    /**
     * Konstruktor
     */
    private Endverbraucher() {
        super(RABATT);
    }

//    /**
//     * Konstruktor
//     * @param rabatt Der Rabatt des Endkunden
//     */
//    public Endverbraucher(double rabatt) {
//        super(rabatt);
//    }

    /**
     * Konstruktor
     * @param rabatt Der Rabatt des Endkunden
     * @param bonitaet Die Bonität des Endkunden
     */
    private Endverbraucher(double rabatt, boolean bonitaet) {
        super(rabatt);
        this.bonitaet = bonitaet;
    }
    
    /**
     * Konstruktor
     * @param anschrift Die Adersse des Endkunden
     * @param rabatt Der Rabatt des Endkunden
     * @param bonitaet Die Bonität des Endkunden
     */
    public Endverbraucher(Adresse anschrift, double rabatt, boolean bonitaet) {
        super(rabatt);
        this.anschrift = anschrift;
        this.bonitaet = bonitaet;
    }

    /**
     *
     * @return Ob der Endkunde eine Bonität hat.
     */
    public boolean isBonitaet() {
        return bonitaet;
    }

    /**
     *
     * @param bonitaet Die Bonität des Endkunden
     */
    public void setBonitaet(boolean bonitaet) {
        this.bonitaet = bonitaet;
    }

    /**
     *
     * @return Die Adresse des Endkunden wurd zurückgegeben.
     */
    @Override
    public Adresse getAnschrift() {
        return this.anschrift;
    }

    /**
     *
     * @param anschrift Die Adresse des Endkunden
     */
    @Override
    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    /**
     *
     * @return Der Rabatt des Endkunden wird zurückgegeben.
     */
    @Override
    public double getRabatt() {
        return this.RABATT;
    }

    /**
     *
     * @param rabatt Der Rabatt des Endkunden
     */
    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }
    
    /**
     *
     * @return Die Kundennummer wird zurückegeben.
     */
    @Override
    public String getNummer() {
        return this.nummer;
    }

    /**
     *
     * @param nummer Die Kundennummer des Endkunden
     */
    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + "Endverbraucher:" + "\n\tBonitaet = " + this.bonitaet + 
                                                             "\n\tRabatt = " + this.RABATT + 
                                                             "\n\tAnschrift = " + this.anschrift + 
                                                             "\n\tNummer = " + this.nummer;
    }

}
