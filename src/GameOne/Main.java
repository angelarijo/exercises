package GameOne;

/**
 * Created by angela on 08/05/16.
 */
public class Main {

    public static void main(String[] args) {

        int games = 0;
        Game game = new Game();
        Boolean winner = false;

        while ( winner != true ) {
            games++;
            System.out.println("----------- Game " + games + " -----------");

            winner = game.run();
        }
    }
}
