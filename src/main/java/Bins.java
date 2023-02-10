
public class Bins {
    private final int[] bins;
    
    public Bins(int max) {
        bins = new int[max + 1];
    }

    public void incrementBin(int binNum) {
        bins[binNum]++;
    }

    public int getBin(int binNum) {
        return bins[binNum];
    }


}


