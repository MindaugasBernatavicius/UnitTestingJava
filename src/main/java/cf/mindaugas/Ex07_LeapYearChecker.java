package cf.mindaugas;

import java.time.DateTimeException;

public class Ex07_LeapYearChecker {

    public static boolean isLeapYear(int yearToTest) {

        // year 1581 is the year
        // leap years were invented
        if(yearToTest < 1581){
            String excpMsg = "Can't determine leap years for years below 1581!";
            throw new DateTimeException(excpMsg);
        }

        // init to false
        boolean isLeap = false;

        // leapTears are years which are multiples of four
        // with the exception of centennial years not divisible by 400
        if (yearToTest % 4 == 0) {
            isLeap = true;
            if(yearToTest % 100 == 0
                && yearToTest % 400 != 0) {
                isLeap = false;
            }
        }

        return isLeap;
    }
}
