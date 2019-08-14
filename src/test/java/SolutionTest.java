import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int input;
    private int expected;
    private Solution soln = new Solution1();

    public  SolutionTest(int input, int output) {
        this.input = input;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {3, 5}
        });
    }

    @Test
    public void testNumTrees() {
        assertEquals(expected, soln.numTrees(input));
    }
}