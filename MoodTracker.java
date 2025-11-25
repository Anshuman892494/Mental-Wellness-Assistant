
import java.util.Scanner;

// Class to track and ask user's mood
public class MoodTracker {
    public String askMood(Scanner sc, User User) {
        System.out.println("Hey! " + User.getName() + ", How are you feeling today?");
        System.out.println("Options: Happy, Sad, Anxious, Angry, Tired, Excited, Okay");
        System.out.println("You mood : ");
        String mood = sc.nextLine();
        return mood;
    }
}
