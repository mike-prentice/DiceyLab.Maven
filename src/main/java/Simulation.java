
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
        bins = new Bins(max);
        numDie = numDice;
        numTosses = numberOfTosses;
    }

    public void runSimulation() {
        for (int i = 0; i < numTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        int result = 0;
        double percent;
        String stars = "";
        System.out.println("The result of " + numDie + " dice being rolled " + numTosses + " times...");

        for (int i = 0; i < max - min + 1; i++) {
            result = bins.getBin(i + min);
            percent = ((double) result) / numTosses;
            for (int j = 0; j < Math.round(percent * 100); j++) {
                stars += "*";
            }
            System.out.println(String.format("%2d : %10d: %.2f %s", min + i, result, percent, stars));
            stars = "";
        }
    }
}
