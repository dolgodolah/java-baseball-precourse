package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void testGenerateAnswer_NotDuplicated() {
        Computer computer = new Computer("");
        computer.generateAnswer();
        String answer = computer.getAnswer();

        List<String> list = Arrays.asList(answer.split(""));
        Set<String> set = new HashSet<>(list);

        assertEquals(list.size(), set.size());
    }

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