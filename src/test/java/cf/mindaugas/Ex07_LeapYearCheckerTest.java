package cf.mindaugas;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.DateTimeException;

public class Ex07_LeapYearCheckerTest {

    @Test
    // [name tested method]_[expected input / tested state]_[expected behavior]
    public void isLeapYear_givenALeapYearThatsNotCentenial_returnTrue(){
        // given
        int knownLeapYear = 2020;

        // when
        boolean isLeap = Ex07_LeapYearChecker.isLeapYear(knownLeapYear);

        // then
        Assert.assertTrue(isLeap);
    }

    @Test
    public void isLeapYear_givenCommonYearCentenial_returnFalse(){
        // given
        int knownLeapYear = 1900;

        // when
        boolean isLeap = Ex07_LeapYearChecker.isLeapYear(knownLeapYear);

        // then
        Assert.assertFalse(isLeap);
    }

    @Test
    public void isLeapYear_givenLeapYearDivisableBy400_returnTrue(){
        // given
        int knownLeapYear = 1600;

        // when
        boolean isLeap = Ex07_LeapYearChecker.isLeapYear(knownLeapYear);

        // then
        Assert.assertTrue(isLeap);
    }


    @Test
    public void isLeapYear_givenACommonYear_returnFalse(){
        // given
        int knownLeapYear = 2021;

        // when
        boolean isLeap = Ex07_LeapYearChecker.isLeapYear(knownLeapYear);

        // then
        Assert.assertFalse(isLeap);
    }

    // PATH OF SORROW / NEGATIVE TESTS

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void isLeapYear_givenBCYear_throwException(){
        // given
        int year = -1;
        expectedException.expect(DateTimeException.class);
        expectedException.expectMessage("Can't determine leap years for years below 1581!");

        // when
        Ex07_LeapYearChecker.isLeapYear(year);
    }
}
