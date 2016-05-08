package GameOne;

/**
 * Created by angela on 08/05/16.
 */
public class Game {

    public static boolean run() {

        Boolean winner;
        RandomGenerator generator = new RandomGenerator();
        Player player = new Player();

        // System random
        int system = generator.random();

        // Players guesses
        int player1 = player.Guess();
        int player2 = player.Guess();
        int player3 = player.Guess();

        if (system == player1) {
            System.out.println("Player 1 win!");
            winner = true;
        } else if (system == player2) {
            System.out.println("Player 2 win!");
            winner = true;
        } else if (system == player3) {
            System.out.println("Player 3 win!");
            winner = true;
        } else {
            System.out.println("[X] No one won.");
            winner = false;
        }

        return winner;
    }
}
