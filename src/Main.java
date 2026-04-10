import java.util.LinkedList;

class trainconsistManagementapp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=======================================\n");

        // Create LinkedList
        LinkedList<String> bogies = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Bogies : " + bogies);

        // ---- INSERT at specific position ----
        bogies.add(1, "General"); // insert at index 1

        System.out.println("\nAfter Inserting 'General' at position 1:");
        System.out.println("Bogies : " + bogies);

        // ---- REMOVE from front ----
        bogies.removeFirst();

        System.out.println("\nAfter Removing First Bogie:");
        System.out.println("Bogies : " + bogies);

        // ---- REMOVE from rear ----
        bogies.removeLast();

        System.out.println("\nAfter Removing Last Bogie:");
        System.out.println("Bogies : " + bogies);

        // ---- FINAL OUTPUT ----
        System.out.println("\nFinal Train Bogie Consist:");
        System.out.println(bogies);

        System.out.println("\nUC4 operations completed successfully...");
    }
}