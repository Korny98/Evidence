
import java.util.ArrayList;


/**
 * Databáze
 * Simulace databáze kolekcí ArrayList
 */
public class Databaze {

    /**
     * Záznamy
     * Místo uložení všech záznamů
     */
    private ArrayList<Zaznam> zaznamy;

    /**
     * Konstruktor
     */
    public Databaze() {
        zaznamy = new ArrayList<>();
    }

    /**
     * Přidání záznamu do databáze
     *
     * @param jmeno          Jméno pojištěného typu String
     * @param prijmeni       Příjmení pojištěného typu String
     * @param telefonniCislo Telefonní číslo pojištěného typu String
     * @param vek            Věk pojištěného typu int
     */
    public void pridejZaznam(String jmeno, String prijmeni, String telefonniCislo, int vek) {
        zaznamy.add(new Zaznam(jmeno, prijmeni, telefonniCislo, vek));
    }

    /**
     * Vyhledání záznamu podle jména přijmení pojištěného
     *
     * @param jmeno    Jméno pojištěného typu String
     * @param prijmeni Příjmení pojištěného typu String
     * @return nalezene Vrátí nalezený záznam
     */

    public ArrayList<Zaznam> najdiZaznamy(String jmeno, String prijmeni) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy) {
            if (jmeno.equals(zaznam.getJmeno()) && prijmeni.equals(zaznam.getPrijmeni())) {
                nalezene.add(zaznam);
            }
        }
        return nalezene;
    }

    /**
     * Vrátí všechny záznamy z databáze
     *
     * @return zaznamy
     */
    public ArrayList<Zaznam> getZaznamy() {
        return zaznamy;
    }
}
