public class Dice {
    private final int numDie;
    int minCount = 0;

    public Dice(int numDice) {
        this.numDie = numDice;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numDie; i++) {
            sum += Math.floor(Math.random() * 6 + 1);
        }
        return sum;
    }
}
