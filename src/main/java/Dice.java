public class Dice {
    public  int numDie;
    public Dice(int numDice) {
        numDie = numDice;
    }

    

    public int tossAndSum(int numDie) {
        int sum = 0;
        for (int i = 0; i < numDie; i++) {
            sum += Math.floor(Math.random() * 6 + 1);

        }
        return sum;
    }
}
