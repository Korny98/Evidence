

/**
 * Záznam
 */
public class Zaznam {
    /**
     * Jméno pojištěného
     */
    private String jmeno;
    /**
     * Příjmení pojištěného
     */
    private String prijmeni;
    /**
     * Telefonní číslo pojištěného
     */
    private String telefonniCislo;
    private int vek;


    /**
     * Konstruktor
     *
     * @param jmeno          pojištěného
     * @param prijmeni       pojištěného
     * @param telefonniCislo pojištěného
     * @param vek            pojištěného
     */
    public Zaznam(String jmeno, String prijmeni, String telefonniCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefonniCislo = telefonniCislo;
        this.vek = vek;
    }

    /**
     * Vrátí jméno pojištěného typu String
     *
     * @return jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Vrátí příjmení pojištěného typu String
     *
     * @return prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrátí telefonní čílo pojištěného
     *
     * @return telefonni cislo typu String
     */
    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    /**
     * Vrátí věk pojištěného
     *
     * @return vek typu int
     */
    public int getVek() {
        return vek;
    }

    /**
     *
     * @return Vrátí jméno, přimení, telefonní číslo a věk pojištěného typu String
     */
    @Override
    public String toString() {
        return getJmeno() + " " + getPrijmeni() + "  " + getTelefonniCislo() + "   " + getVek();
    }
}
