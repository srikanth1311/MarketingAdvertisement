import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class MarketingAdvertisement {
    
    // Main function to start the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        
        // Setting up a timer task to display the ad every 10 seconds
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                displayAd();
            }
        }, 0, 10000); // 10000ms = 10 seconds

        // Interaction to stop the ad loop
        System.out.println("Welcome to the Marketing Advertisement System!");
        System.out.println("Press 'q' to quit or any other key to continue receiving advertisements.");
        
        // Wait for user input
        String input = scanner.nextLine();
        
        while (!input.equalsIgnoreCase("q")) {
            System.out.println("Advertisement is playing... press any key to continue or 'q' to quit.");
            input = scanner.nextLine();
        }
        
        // Stop the timer and exit
        System.out.println("Thank you for using our system. Goodbye!");
        timer.cancel();
        scanner.close();
    }
    
    // Function to display an advertisement
    private static void displayAd() {
        // Simple ad text (You can replace this with dynamic content)
        System.out.println("\n--- Special Offer! ---");
        System.out.println("50% OFF on All Products! Limited Time Offer!");
        System.out.println("Hurry up, visit our website and grab the deal NOW!");
        System.out.println("----------------------\n");
    }
}
