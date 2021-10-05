package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void generateAnswer_NotDuplicated() {
        Computer computer = new Computer();
        computer.generateAnswer();
        String answer = computer.getAnswer();

        List<String> list = Arrays.asList(answer.split(""));
        Set<String> set = new HashSet<>(list);

        assertEquals(list.size(), set.size());
    }
}