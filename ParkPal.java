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

    // email
    public static String inputValidEmail() {
        String email;
        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (email.contains("@")) break;
            System.out.println("Invalid email! Must contain '@'. Try again.");
        }
        return email;
    }
    
       // role
    public static String inputValidRole() {
        String role;
        while (true) {
            System.out.print("Enter role (Student/Staff): ");
            role = scanner.nextLine();
            if (role.equalsIgnoreCase("Student") || role.equalsIgnoreCase("Staff")) break;
            System.out.println("Invalid role! Type Student or Staff.");
        }
        return role;
    }

     // ID valid
    public static String inputValidId() {
        String id;
        while (true) {
            System.out.print("Enter 10-digit ID number: ");
            id = scanner.nextLine();
            if (id.matches("\\d{10}")) break;  // regex = 10 digits
            System.out.println("Invalid ID! It must be EXACTLY 10 digits. Try again.");
        }
        return id;
    }

