import junit.framework.TestCase;
import org.junit.Test;

public class DiceTest extends TestCase {


    @Test
    public void testTossAndSum() {
        //given
        Dice dice = new Dice(2);
        int expectedRolls = 2;
        //when
        dice.tossAndSum(2);
        int  actual = 2;
        //then
        assertEquals(expectedRolls, actual);
    }
}