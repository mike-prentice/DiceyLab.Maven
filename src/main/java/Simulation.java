import java.util.Arrays;

public class Simulation {
    int numTosses;
public Simulation(int numberOfTosses) {
    Dice.tossAndSum(numberOfTosses);
    this.numTosses = numberOfTosses;



    
}

public void runSimulation(int numTosses, int numDice){
    for (int i = 1; i <numTosses; i++) {
    Dice.tossAndSum(numDice);
    Bins.bins[Dice.sum - 1]++;
    Dice.sum = 0;


    }


}

public void printResults() {
    for (int k = 1; k < Bins.bins.length-1; k++) {
        StringBuilder output = new StringBuilder(100*Bins.bins[k]/1000000);
        output.append("*".repeat(Math.max(0, Bins.bins[k])));
        System.out.println((k + 1) + ":" + output);
    }

}


}







