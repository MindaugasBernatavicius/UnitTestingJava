package cf.mindaugas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Ex04_CalculatorParametrizedTests {

    @Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
            {1, 1, 2},
            {2, 4, 6},
            {1, 6, 7},
            {4, 1, 5}
        });
    }

    @Parameter(0)
    public int argument1;

    @Parameter(1)
    public int argument2;

    @Parameter(2)
    public int expectedResult;

    @Test
    public void testAdd() {
        // given
        Ex02_Calculator calculator = new Ex02_Calculator();
        // when
        int result = calculator.add(argument1, argument2);
        // then
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAdd2() {
        // given
        Ex02_Calculator calculator = new Ex02_Calculator();
        // when
        int result = calculator.add(argument1, argument2);
        // then
        assertEquals(expectedResult, result);
    }
}
