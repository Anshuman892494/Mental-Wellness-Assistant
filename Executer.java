import java.util.Scanner;

// Main class to execute the program
public class Executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = sc.nextLine();

        User user = new User(name);
        Assistant assistant = new Assistant(user);

        // Main interaction loop
        while (true) {
            System.out.println("\n*** Check-in Menu ***");
            System.out.println("1. Start a session");
            System.out.println("2. Show mood history");
            System.out.println("3. Terminate the session");
            System.out.print("Your choice: ");

            String ch = sc.nextLine();
            // Handle user choice
            switch (ch) {
                case "1":
                    assistant.startSession(sc);
                    break;
                case "2":
                    assistant.showMoodHistory();
                    break;
                case "3":
                    System.out.println("I hope you had a great session!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input! Please try again.");
                    break;
            }
        }
    }
}