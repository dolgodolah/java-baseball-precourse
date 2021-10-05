package baseball.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @ParameterizedTest
    @CsvSource(value = {"123:3:0", "129:2:0", "189:1:0", "789:0:0", "312:0:3", "214:0:2", "245:0:1", "135:1:1", "132:1:2"}, delimiter = ':')
    void testCalculateResult(String input, int expectedStrike, int expectedBall) {
        String answer = "123";
        Computer computer = new Computer(answer);

        Result result = computer.calculateResult(input);
        assertEquals(result.getStrike(), expectedStrike);
        assertEquals(result.getBall(), expectedBall);
    }
}