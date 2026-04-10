import java.util.ArrayList;
import java.util.List;

class trainconsistManagementapp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC3 - Manage Passenger Bogies");
        System.out.println("=======================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // ---- ADD bogies (including duplicates) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("Sleeper");   // duplicate
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies (with duplicates):");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- REMOVE one occurrence ----
        passengerBogies.remove("Sleeper"); // removes first occurrence only

        System.out.println("\nAfter Removing one 'Sleeper':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- CHECK existence ----
        System.out.println("\nChecking if 'AC Chair' exists:");
        System.out.println("Contains AC Chair? : " + passengerBogies.contains("AC Chair"));

        // ---- FINAL OUTPUT ----
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC3 operations completed successfully...");
    }
}