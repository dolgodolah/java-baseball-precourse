package baseball.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @ParameterizedTest
    @CsvSource(value = {"0:false", "1:false", "2:false", "3:true"}, delimiter = ':')
    void isStrikeOut(int strikeCount, boolean expected) {
        Result result = new Result();

        for (int i = 0; i < strikeCount; i++) {
            result.countStrike();
        }

        boolean actualValue = result.isStrikeOut();
        assertEquals(expected, actualValue);
    }
}