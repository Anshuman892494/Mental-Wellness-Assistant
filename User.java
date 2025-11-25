import java.util.ArrayList;

// Class to represent a user with name and mood history
public class User {
    private String name;
    private ArrayList<String> moodHistory;

    // Constructor
    public User(String name) {
        this.name = name;
        this.moodHistory = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    // Getter and adder for mood history
    public ArrayList<String> getMoodHistory() {
        return this.moodHistory;
    }

    // Method to add a mood to the history
    public void addMoodHistory(String currentMood) {
        this.moodHistory.add(currentMood);
    }
}