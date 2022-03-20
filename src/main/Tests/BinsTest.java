import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest extends TestCase {


    @Test
    public void binTest() {
        Bins bins = new Bins( 2, 12);
        bins.incrementBin(4);
        int expected = 1;
        int actual = bins.getBin(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binTest1() {
        Bins bins = new Bins( 2, 12);
        bins.incrementBin(8);
        int expected = 1;
        int actual = bins.getBin(8);
        Assert.assertEquals(expected, actual);
    }

}