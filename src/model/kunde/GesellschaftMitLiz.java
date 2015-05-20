package model.kunde;

/**
 * Beschreibung:
 * Diese Klasse bilden das Kind-Objekt der Kundenklasse als Gesellschaft mit 
 * Lizenzvertrieb.
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
public class GesellschaftMitLiz extends AKunde {

    private static double rabatt = 0.07;
    private static int vertrieb = 0;

    /**
     * Default Kontruktor
     */
    private GesellschaftMitLiz() {
        super(rabatt);
    }

//    /**
//     * Konstruktor
//     * @param rabatt
//     */
//    private GesellschaftMitLiz(double rabatt) {
//        super(rabatt);
//    }

    /**
     * Kontruktor
     * @param rabatt
     * @param vertrieb
     */
    private GesellschaftMitLiz(double rabatt, int vertrieb) {
        super(rabatt);
        this.vertrieb = vertrieb;
    }
    
    /** 
     * Kontruktor
     * @param anschrift
     * @param rabatt
     * @param vertrieb
     */
    public GesellschaftMitLiz(Adresse anschrift, double rabatt, int vertrieb) {
        super(rabatt);
        this.anschrift = anschrift;
        this.vertrieb = vertrieb;
    }

    /**
     *
     * @return Die Vertriebsnummer wird zurückgegeben.
     */
    public int getVertrieb() {
        return vertrieb;
    }

    /**
     * 
     * @param vertrieb Die Vertriebsnummer
     */
    public void setVertrieb(int vertrieb) {
        this.vertrieb = vertrieb;
    }

    /**
     *
     * @return Die Adresse der Gesellschaft wird zurückgegeben.
     */
    @Override
    public Adresse getAnschrift() {
        return this.anschrift;
    }

    /**
     *
     * @param anschrift Die Adresse der Gesellschaft
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
     * @param rabatt Der Rabatt der Gesellschaft
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
     * @param nummer Die Kundennummer der Gesellschft
     */
    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
    
    @Override
    public String toString() {
        return //super.toString() + "\n" + 
                "Gesellschaft Mit Lizenzvertrieb:" + "\n\tVertrieb = " + vertrieb + 
                                                                 "\n\tRabatt = " + this.rabatt + " %" +
                                                                 "\n\tAnschrift = " + this.anschrift + 
                                                                 "\n\tNummer = " + this.nummer;
    }

}
