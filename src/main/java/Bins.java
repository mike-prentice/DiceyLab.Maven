import java.util.ArrayList;

public class Bins {
    private final int[] bins;
    private final int minRoll;

    public Bins(int min, int max) {
        minRoll = min;
        bins = new int[max - min + 1];
    }

    public void incrementBin(int binNum) {
        bins[binNum - minRoll]++;
    }


    public int getBin(int binNum) {
        return bins[binNum - minRoll];
    }


}


