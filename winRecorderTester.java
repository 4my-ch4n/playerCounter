import java.util.Scanner;

/**
 * The GameTester class tests the functionality of the Game class.
 * It allows adding player names and recording wins through a menu-based interface.
 */
public class GameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Welcome to the Game Tester!");

        // Loop to add player names
        while (true) {
            System.out.println("Options: 1 - Add Player, 2 - Finish Adding Players");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                // Prompt user to enter the player's name
                System.out.print("Enter the player's name: ");
                String playerName = scanner.nextLine();
                game.addPlayer(playerName); // Add player to the game
            } else if (choice == 2) {
                // Exit the loop if finished adding players
                System.out.println("Finished adding players.");
                break;
            } else {
                // Handle invalid input
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Loop for game actions
        while (true) {
            System.out.println("Options: 1 - Record Win, 2 - Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                // Record a win
                game.recordWin();
            } else if (choice == 2) {
                // Exit the program
                System.out.println("Exiting the game.");
                break;
            } else {
                // Handle invalid input
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
