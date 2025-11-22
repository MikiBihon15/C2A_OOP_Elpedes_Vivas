import java.util.ArrayList;
import java.util.Scanner;

// Main
public class ParkPalApp {

    private static ArrayList<ParkingSpot> spots = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // CREATE PARKING SPOTS
        spots.add(new ParkingSpot("A1"));
        spots.add(new ParkingSpot("A2"));
        spots.add(new ParkingSpot("A3"));

        // USER LOGIN 
        String email = inputValidEmail();
        String role  = inputValidRole();
        String id    = inputValidId();

        User user = new User(email, role, id);
        user.login();

        // MENU 
        int choice;
        do {
            System.out.println("\n===== PARKPAL MENU =====");
            System.out.println("1. View Parking Spots");
            System.out.println("2. Claim a Spot");
            System.out.println("3. Release a Spot");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> viewSpots();
                case 2 -> claimSpot();
                case 3 -> releaseSpot();
                case 4 -> System.out.println("Thank you for using ParkPal!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
