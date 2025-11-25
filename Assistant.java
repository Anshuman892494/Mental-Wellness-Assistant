import java.util.Scanner;

public class Assistant {
    private User user; // Reference to the User object
    private CalmActivity ca;
    private QuoteProvider qp;
    private MoodTracker mt;

    // Constructor
    public Assistant(User user) {
        this.user = user;
        ca = new CalmActivity();
        qp = new QuoteProvider();
        mt = new MoodTracker();
    }

    // Method to start a session
    public void startSession(Scanner sc) {
        String mood = mt.askMood(sc, user);
        System.out.println("Logging the mood history");
        user.addMoodHistory(mood);

        String quote = qp.getRandomQuote();
        System.out.println("Here's a quote for you: " + quote);

        System.out.println("Would you like to do some exercise? (yes/no):");
        String ans = sc.nextLine().trim().toLowerCase();

        if (ans.equals("yes")) {
            ca.breathingExercise();
        }
        System.out.println("Thank you for initiating this session");
    }

    // Method to display mood history
    public void showMoodHistory() {
        for (String mood : user.getMoodHistory()) {
            System.out.println(mood);
        }
    }
}