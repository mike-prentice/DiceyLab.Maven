import java.util.Arrays;
import java.util.stream.IntStream;

public class Simulation {
    private final Dice dice;
    private final Bins bins;
    private final int numTosses;
    private final int numDie;
    private final int min;
    private final int max;


    public Simulation(int numberOfTosses, int numDice) {
        dice = new Dice(numDice);
        min = numDice;
        max = numDice * 6;
        bins = new Bins(min, max);
        numDie = numDice;
        numTosses = numberOfTosses;


    }

    public void runSimulation() {
        for (int i = 1; i < numTosses; i++) {
            bins.incrementBin(dice.tossAndSum());


        }


    }

    public void printResults() {
        for (int i = 0; i < max - min; i++) {
            System.out.println(bins.getBin(i + 2));
        }


    }


}







