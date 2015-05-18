package control;

import java.util.Comparator;
import java.util.LinkedList;
import model.kunde.AKunde;

/**
 * Beschreibung:
 * Diese Klasse verwaltet die Kunden.
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
 * @version 0.8
 *
 */
public class Kundenverwaltung implements Comparator<AKunde> {

    public final LinkedList<AKunde> KUNDENLISTE = new LinkedList<AKunde>();

    /**
     * Konstruktor
     */
    public Kundenverwaltung() {
    }

    /**
     * Fügt ein Kunden-Objekt zur Kunden-Liste hinzu.
     * @param kunde Kundenobjekt
     */
    public void addKunde(AKunde kunde) {
        KUNDENLISTE.add(kunde);
    }

    /**
     * Löscht das gewünschte Kundenobjekt aus der Liste.
     * @param kunde Kundenobjekt
     */
    public void removeKunde(AKunde kunde) {
        KUNDENLISTE.remove(kunde);
    }

    /**
     * Legt einen Großverbraucher an, speichert ihn in der Kundenliste ab und 
     * gibt ein AKundenobjekt zurück.
     * @param gv Großverbraucher Objekt
     * @return AKunde-Objekt wird zurückgegeben.
     */
    public void neuGrossverbraucher(AKunde kunde) {
        addKunde(kunde);
    }

    /**
     * Legt einen Endverbracuher an, speichert ihn in der Kundenliste ab und 
     * gibt ein AKundenobjekt zurück.
     * @param ev Eindverbraucher Objekt
     * @return AKunde-Objekt wird zurückgegeben.
     */
    public void neuEndverbraucher(AKunde kunde) {
        addKunde(kunde);
    }

    /**
     * Legt einen Gesellschafter an, speichert ihn in der Kundenliste ab und 
     * gibt ein AKundenobjekt zurück.
     * @param gml Gesellschaft mit Lizenz - Objekt
     * @return AKunde-Objekt wird zurückgegeben.
     */
    public void neuGesellschaftMitLiz(AKunde kunde) {
        addKunde(kunde);
    }

    /**
     * Guckt ob Kundennummer schon in der Kundenliste vorhanden ist.
     *
     * @param kNr
     * @return Ob Kundennummer noch nicht vergeben wurde.
     */
    public boolean isKNrAvailable(String kNr) {
        boolean result = false;

        for (AKunde kunde : KUNDENLISTE) {
            if (!kunde.getNummer().equals(kNr)) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public int compare(AKunde k1, AKunde k2) {
        int temp = k1.getNummer().compareTo(k2.getNummer());
        return temp;
    }

}
