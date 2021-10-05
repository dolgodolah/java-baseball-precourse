package baseball.domain;

import nextstep.utils.Randoms;

public class Computer {

    private static final int ZERO = 0;
    private static int START_NUMBER = 1;
    private static int END_NUMBER = 9;

    private static int ANSWER_LENGTH = 3;

    private String answer;

    public Computer(String answer) {
        this.answer = answer;
    }

    public void generateAnswer() {
        while (answer.length() < ANSWER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            appendNumber(randomNumber);
        }
    }

    public Result calculateResult(String input) {
        Result result = new Result();

        for (int i = 0; i < ANSWER_LENGTH; i++) {
            compare(i, input.charAt(i), result);
        }

        return result;
    }

    private void appendNumber(int randomNumber) {
        if (!isDuplicateNumber(randomNumber)) {
            answer += randomNumber;
        }
    }

    private boolean isDuplicateNumber(int randomNumber) {
        return answer.contains(String.valueOf(randomNumber));
    }

    private void compare(int i, char target, Result result) {
        int indexOf = answer.indexOf(target);

        if (result.isStrike(i, indexOf)) {
            result.countStrike();
        }

        if (result.isBall(i, indexOf)) {
            result.countBall();
        }
    }

    public String getAnswer() {
        return answer;
    }
}
