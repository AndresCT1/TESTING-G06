package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateBagsTest {

    @ParameterizedTest
    @CsvSource({ "4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0" })
    public void totalIsTooBig(int small, int big, int total, int expected) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({ "4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0" })
    public void onlyBigBars(int small, int big, int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({ "4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1" })
    public void onlySmallBars(int small, int big, int total, int expected) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({ "1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,8,-1" })
    public void totalIsBigger(int small, int big, int total, int expected) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({ "0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2" })
    public void bigAndSmallBars(int small, int big, int total, int expected) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        assertEquals(expected, result);
    }
}
