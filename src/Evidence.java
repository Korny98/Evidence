
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Evidence
 */
public class Evidence {


    /**
     * Databáze
     */
    private Databaze databaze;
    /**
     * Scanner
     */
    private Scanner scanner = new Scanner(System.in, "UTF-8");

    /**
     * Konstruktor
     */
    public Evidence() {
        databaze = new Databaze();
    }

    /**
     * Vypíše všechny záznamy z databáze
     */

    public void hledejZaznamy() {
        ArrayList<Zaznam> zaznamy = databaze.getZaznamy();
        for (Zaznam zaznam : zaznamy) {
            System.out.println(zaznam);
        }
    }

    /**
     * Přidá záznam do databáze ze vstupu
     */
    public void pridejZaznam() {
        System.out.println("Zadej jméno pojištěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej příjmení pojištěného:");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadej telefonní číslo pojištěného:");
        String telefonniCislo = scanner.nextLine();
        System.out.println("Zadej věk pojištěného:");
        int vek = Integer.parseInt(scanner.nextLine());
        databaze.pridejZaznam(jmeno, prijmeni,telefonniCislo, vek);
    }

    /**
     * Vyhledá záznamy dle vstupu
     */
    public void vyhledejZaznam() {
        // Zadání jména pojištěného
        System.out.println("Zadej jméno pojištěného:");
        String jmeno = scanner.nextLine();
        // Zadání příjmení pojištěného
        System.out.println("Zadej příjmení pojištěného:");
        String prijmeni = scanner.nextLine();

        // Vyhledání záznamů
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(jmeno, prijmeni);
        // Výpis záznamů
        if (zaznamy.size() > 0) {
            System.out.println("Nalezeny tyto záznamy: ");
            for (Zaznam zaznam : zaznamy) {
                System.out.println(zaznam);
            }
        } else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
    }


    /**
     * Vypíše úvodní obrazovku
     */
    public void vypisUvodniObrazovku() {
        System.out.println("_____________________");
        System.out.println("Evidence pojištěných");
        System.out.println("_____________________");
        System.out.println();
    }
}
