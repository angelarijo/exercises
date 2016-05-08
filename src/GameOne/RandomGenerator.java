package GameOne;

/**
 * Created by angela on 08/05/16.
 */
public class RandomGenerator {

        public static int random() {

            int maxN = 10;
            int randomChoice = (int) (Math.random()*maxN);

            return randomChoice;

        }

}

