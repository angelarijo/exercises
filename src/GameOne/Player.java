package GameOne;

/**
 * Created by angela on 08/05/16.
 */
public class Player {

    public static int Guess() {

        RandomGenerator generator = new RandomGenerator();

        // Player guess
        int guess = generator.random();

        return guess;
    }
}
