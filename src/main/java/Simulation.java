import java.util.Arrays;
import java.util.stream.IntStream;

public class Simulation {
    public int numTosses;
    public int numDie;
    public int min, max;





public Simulation(int numberOfTosses, int numDice) {
    this.numDie = numDice;
    this.numTosses = numberOfTosses;

    
}

public void runSimulation(int numTosses, int numDice){
    min =  numDice;
    max = numDice * 6;
    Dice dice = new Dice(2);
    Bins bins = new Bins(min, max);
    for (int i = 1; i <numTosses; i++) {
    bins.incrementBin(dice.tossAndSum(2));



    }


}

public void printResults() {
    IntStream.iterate(1, k -> k < 100, k -> k + 1).forEach(k -> {
        StringBuilder output = new StringBuilder(100 * Bins.getBin(k) / 1000000);
        output.append("*".repeat(Math.max(0, Bins.getBin(k + 1))));
        System.out.println((k + 1) + ":" + output);
    });

}


}







