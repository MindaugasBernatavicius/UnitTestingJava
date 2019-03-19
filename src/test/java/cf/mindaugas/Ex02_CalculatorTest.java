package cf.mindaugas;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ex02_CalculatorTest {

    Ex02_Calculator calc;

    @Before
    public void setup(){
        calc = new Ex02_Calculator();
    }

    @After
    public void teardown(){
        calc = null;
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_twoPositiveIntegers_correctPositiveSum(){
        // given
        int firstNum = 1;
        int secondNum = 2;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        // assert result == 3;
        assertEquals(3, result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_givenTwoNegativeIntegers_correctNegativeSum(){
        // given, when
        int result = calc.add(-1, -2);

        // then
        // assert result == -3;
        assertEquals(-3, result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_givenOneNegativeOnePossitive_correctSum(){
        // given
        int firstNum = -1;
        int secondNum = 2;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        // assert result == 1;
        assertEquals(1, result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_givenOneNegativeOneZero_outputsSameNegativeNumber(){
        // given
        int firstNum = -1;
        int secondNum = 0;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        // assert result == firstNum;
        assertEquals(firstNum, result);
        assertTrue(firstNum == result);
        assertTrue("Our results when zero is added to the input is not equal to input", firstNum == result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMaxAndZero_outputsIntegerMax(){
        // given
        int firstNum = Integer.MAX_VALUE;
        int secondNum = 0;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        assert result == firstNum;
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMinAndZero_outputsIntegerMin(){
        // given
        int firstNum = Integer.MIN_VALUE;
        int secondNum = 0;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        assert result == firstNum;
    }

    /*
    *  NEGATIVE PATH
    */
    @Ignore
    // then
    @Test(expected = ArithmeticException.class)
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMaxPlusIntegerMax_raisesException(){
        // given
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;

        // when
        int result = calc.add(firstNum, secondNum);
    }


    // Testing for exceptions using a different methodology
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Ignore
    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMaxPlus1_raisesException(){
        // then
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("Can't add possitive numbers to int.MAX_VALUE");

        // given
        int firstNum = Integer.MAX_VALUE;
        int secondNum = 1;
    }
}