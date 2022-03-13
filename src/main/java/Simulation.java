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
    Bins.bins[Dice.sum]++;
    Dice.sum = 0;


    }


}

public void  printResults() {
    for (int i = 1; i < Bins.bins[i]; i++) {
        StringBuffer output = new StringBuffer(100*Bins.bins[i]/numTosses);
        for (int j = 0; j < Bins.bins[i]; j++) {
            output.append("*");
        }
        System.out.println((i + 1) + ":" + output);
    }

}


}







