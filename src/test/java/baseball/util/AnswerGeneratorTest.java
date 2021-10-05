package baseball.util;

import baseball.domain.Computer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnswerGeneratorTest {

    @Test
    void testGenerateAnswer_NotDuplicated() {
        String answer = AnswerGenerator.generateAnswer();

        List<String> list = Arrays.asList(answer.split(""));
        Set<String> set = new HashSet<>(list);

        assertEquals(list.size(), set.size());
    }
}