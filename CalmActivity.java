// Class to handle calming activities like breathing exercises
public class CalmActivity {
    public void breathingExercise() {
        System.out.println("\nWe will start with a breathing exercise");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Breathe In... (3 seconds)");
                Thread.sleep(3000);
                System.out.println("Hold... (2 seconds)");
                Thread.sleep(2000);
                System.out.println("Breathe Out... (3 seconds)");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exercise was interrupted");
            Thread.currentThread().interrupt();
        }
        System.out.println("I hope you feel better now...\n");
    }
}