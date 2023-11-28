import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initializing the box location
        int[] boxLocation = new int[3];
        // Asking the user to input kilometer marks for each box location
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter kilometer mark for box location " + (i + 1) + ":");
            boxLocation[i] = scan.nextInt();
        }
        // Main loop for the game
        int attempts = 0;
        while (attempts < 5) {
            System.out.println("Attempts " + (attempts + 1) + ":");
            int correctMarks = checkMarks(scan, boxLocation);
            if (correctMarks == 3) {
                System.out.println("Well done! You have successfully located all the boxes.");
                break;
            } else {
                System.out.println("Number of correct guesses: " + correctMarks);
                System.out.println("The location of boxes has been changed.");
                attempts++;
            }
            if (attempts == 5) {
                System.out.println("Sorry, you have used all your attempts.");
                System.out.println("Boxes are still hidden and undiscovered.");
            }
        }
    }

    private static int checkMarks(Scanner scan, int[] boxLocation) {
        int correctMarks = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the kilometer mark for box location " + (i + 1) + ":");
            int guess = scan.nextInt();
            if (guess == boxLocation[i]) {
                correctMarks++;
            }
        }
        return correctMarks;
    }
}
