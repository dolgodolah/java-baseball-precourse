package baseball.domain;

public class Computer {

    private static int ANSWER_LENGTH = 3;

    private String answer;

    public Computer(String answer) {
        this.answer = answer;
    }

    public Result calculateResult(String input) {
        Result result = new Result();

        for (int i = 0; i < ANSWER_LENGTH; i++) {
            compare(i, input.charAt(i), result);
        }

        return result;
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
}
