import java.util.ArrayList;

public class Bins {
    public static int min;
    public static int [] bins;

 public Bins(int min, int max) {
    bins = new int [max - min + 1];
 }
    
public static int getBin(int binNum) {
    return bins[binNum - (min)];
}


public void incrementBin(int binNum) {bins[binNum-(min)]++;
}
}


