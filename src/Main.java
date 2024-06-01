
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Evidence evidence = new Evidence();
        String volba = "";


        // hlavní cyklus
        while (!volba.equals("4")) {
            evidence.vypisUvodniObrazovku();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    evidence.pridejZaznam();
                    break;
                case "2":
                    evidence.hledejZaznamy();
                    break;
                case "3":
                    evidence.vyhledejZaznam();
                    break;
                case "4":
                    // vyskočí z cyklu while a tím ukončí program
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }

}


