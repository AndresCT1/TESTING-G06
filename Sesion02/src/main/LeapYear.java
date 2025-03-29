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
    public void test01() {
        LeapYear ly = new LeapYear();
        boolean leap = ly.isLeapYear(2016);
        Assertions.assertTrue(leap);
    }
}
