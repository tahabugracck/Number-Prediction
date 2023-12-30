import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int random_number = random.nextInt(50) + 1;

        int guess_player_1 = 0;
        int guess_player_2 = 0;
        int player_1, player_2;

        do {
            System.out.print("Player-1, Guess a number between 1 and 50: ");
            player_1 = input.nextInt();
            guess_player_1++;

            if (player_1 > random_number) {
                System.out.println("Reduce the number.");
            } else if (player_1 < random_number) {
                System.out.println("Increase the number.");
            }

        } while (player_1 != random_number);

        random_number = random.nextInt(50) + 1;

        do {
            System.out.print("Player-2, Guess a number between 1 and 50: ");
            player_2 = input.nextInt();
            guess_player_2++;

            if (player_2 > random_number) {
                System.out.println("Reduce the number.");
            } else if (player_2 < random_number) {
                System.out.println("Increase the number.");
            }

        } while (player_2 != random_number);


        String congratulationMessage = "Player-1: " + guess_player_1 + " guessed the number in " + " guesses.\n" +
                "Player-2: " + guess_player_2 + " guessed the number in " + " guesses.";
        JOptionPane.showMessageDialog(null, congratulationMessage);
    }
}
