package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if ( year % 400 == 0)
            return true;
        if ( year % 100 == 0)
            return false;
        return ( year % 4 == 0 ) ? true : false;
    }

    @Test
    public void leapYearsThatAreNonCenturialYears() {
        LeapYear ly = new LeapYear();
        boolean leap = ly.isLeapYear(2016);
        Assertions.assertTrue(leap);
    }

    @Test
    public void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }
    @Test
    public void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }
    @Test
    public void nonLeapYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
