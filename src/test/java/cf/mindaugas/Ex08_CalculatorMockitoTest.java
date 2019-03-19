package cf.mindaugas;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Ex08_CalculatorMockitoTest {

    Ex02_Calculator calc;

    @Before
    public void setup(){
        calc = new Ex02_Calculator();
    }

    // MOCKING

    @Test
    public void add_mockTest(){
        // given
        Ex02_Calculator mockCalculator = mock(Ex02_Calculator.class);

        // when
        when(mockCalculator.add(1, 3))
            .thenReturn(123);

        // then
        // simple verify
        System.out.println(mockCalculator.add(1, 3));
        verify(mockCalculator).add(anyInt(), anyInt());

        // other verification modes:
        // times(3)

        // never()
        // System.out.println(mockCalculator.divide(3, 6));
        verify(mockCalculator, never()).divide(anyInt(), anyInt());

        // atLeast()

        // atMost()
        // System.out.println(mockCalculator.add(555, 6));
        verify(mockCalculator, atMost(1))
                .add(anyInt(), anyInt());

        // atLeastOnce()
        verify(mockCalculator, atLeastOnce()).add(anyInt(), anyInt());

    }


    // SPYING

    @Test
    public void add_spyTest() {
        // given
//        Ex02_Calculator calculator = new Ex02_Calculator();
        Ex02_Calculator spyCalculator = spy(calc);
        // when
        when(spyCalculator.add(eq(4), eq(6))).thenReturn(55);

        // then
        System.out.println(spyCalculator.add(4,6));

        // verify
        verify(spyCalculator).add(anyInt(), anyInt());
    }
}
