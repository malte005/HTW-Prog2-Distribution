package model.kunde;

/**
 * Beschreibung:
 * Diese Klasse bildet das Objekt der Adresse ab.
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
 * @since 2015-05-06
 * @version 0.a
 *
 */
public class Adresse {

    private String name;
    private String strasse_hnr;
    private String plz;
    private String ort;

    /**
     * Konstruktor der Ardesse
     * @param name
     * @param strasse_hnr
     * @param plz
     * @param ort
     */
    public Adresse(String name, String strasse_hnr, String plz, String ort) {
        this.name = name;
        this.strasse_hnr = strasse_hnr;
        this.plz = plz;
        this.ort = ort;
    }

    /**
     * 
     * @return Namen des Kunden wird zurückgegeben.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Der Name des Kunden
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Straße und Hausnummer wird zurückgegeben.
     */
    public String getStrasse_hnr() {
        return strasse_hnr;
    }

    /**
     *
     * @param strasse_hnr Die Straße und Hausnummer
     */
    public void setStrasse_hnr(String strasse_hnr) {
        this.strasse_hnr = strasse_hnr;
    }

    /**
     *
     * @return Postleitzahl wird zurückgegeben.
     */
    public String getPlz() {
        return plz;
    }

    /**
     *
     * @param plz Die Postleitzahl
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     *
     * @return Der Ort wird zurückgegeben.
     */
    public String getOrt() {
        return ort;
    }

    /**
     *
     * @param ort Der Ort des Kunden
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" + "name=" + name + ", strasse_hnr=" + strasse_hnr + ", plz=" + plz + ", ort=" + ort + '}';
    }

}
