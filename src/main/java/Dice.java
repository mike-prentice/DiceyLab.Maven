public class Dice {
    public static int numDie;
    public static int sum;

    public Dice(int numDice) {
        numDie = numDice;
    }

    public static int tossAndSum(int numDie) {

        for (int i = 0; i < numDie; i++) {
            sum += Math.floor(Math.random() * 6 + 1);



        }
        return sum;
    }
}
