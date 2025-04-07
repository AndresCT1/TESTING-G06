package main;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateBags {
    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxes = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxes * 5);
        if(small < total)
            return -1;
        return total;
    }
}
