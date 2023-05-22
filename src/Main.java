import java.util.Scanner;

public class Main {
    private static ClothesDeliveryService ClothesDeliveryService = new ClothesDeliveryService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            displayMenu();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    viewMagazin();
                    break;
                case 2:
                    addTolistaProduse();
                    break;
                case 3:
                    removeFromlistaProduse();
                    break;
                case 4:
                    addUser();
                    break;
                case 5:
                    viewComanda();
                    break;
                case 6:
                    updatestare();
                    break;
                case 7:
                    viewScor();
                    break;
                case 8:
                    searchProduse();
                    break;
                case 9:
                    viewlistaProduse();
                    break;
                case 10:
                    removeSofer();
                    break;
                case 0:
                    exit = true;
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Te rog selectează o opțiune validă.");
            }
        }

        scanner.close();
    }

    private static void updatestare() {
    }

    private static void removeSofer() {
    }

    private static void addUser() {
    }

    private static void viewlistaProduse() {
    }

    private static void viewScor() {
    }

    private static void searchProduse() {
    }

    private static void addTolistaProduse() {
    }

    private static void viewComanda() {
    }

    private static void removeFromlistaProduse() {
    }

    private static void viewMagazin() {
    }

    private static void displayMenu() {
        System.out.println("=== Meniu ===");
        System.out.println("1. Vizualizează Magazine");
        System.out.println("2. Adaugă produs în Lista Produse");
        System.out.println("3. Elimină produs din Lista Produse");
        System.out.println("4. Adauga User");
        System.out.println("5. Vizualizează detalii comandă");
        System.out.println("6. Actualizează starea unei comenzi");
        System.out.println("7. Vizualizează scor");
        System.out.println("8. Caută un produs");
        System.out.println("9. Vizualizează Lista Produse");
        System.out.println("10. Elimina Sofer");
        System.out.println("0. Ieși");
        System.out.print("Selectează o opțiune dorita: ");

    }

}
