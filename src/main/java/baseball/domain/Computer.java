package baseball.domain;

import nextstep.utils.Randoms;

public class Computer {

    private static int START_NUMBER = 1;
    private static int END_NUMBER = 9;

    private static int ANSWER_LENGTH = 3;

    private String answer;

    public void generateAnswer() {
        answer = "";
        while (answer.length() < ANSWER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            appendNumber(randomNumber);
        }
    }

    private void appendNumber(int randomNumber) {
        if (!isDuplicateNumber(randomNumber)) {
            answer += randomNumber;
        }
    }

    private boolean isDuplicateNumber(int randomNumber) {
        return answer.contains(String.valueOf(randomNumber));
    }

    public String getAnswer() {
        return answer;
    }
}
