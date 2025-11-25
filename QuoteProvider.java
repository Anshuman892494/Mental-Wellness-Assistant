import java.util.Random;

// Class to provide random motivational quotes
public class QuoteProvider {
    public static String quotes[] = {
            "You are stronger than you think.",
            "Every day is a new beginning.",
            "Stay positive, work hard, and make it happen.",
            "Good things take time—be patient.",
            "Your energy introduces you before you speak.",
            "Choose kindness, always.",
            "One small positive thought can change your whole day.",
            "You’re doing better than you think.",
            "Let your light shine bright.",
            "Be proud of how far you’ve come." };

    public String getRandomQuote() {
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}
