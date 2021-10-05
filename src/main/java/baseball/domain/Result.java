package baseball.domain;

import baseball.ui.Output;

public class Result {

    private static final int ZERO = 0;
    private static final int STRIKE_OUT_COUNT = 3;

    private int strike;
    private int ball;

    public Result() {
        this.strike = ZERO;
        this.ball = ZERO;
    }

    public void countStrike() {
        this.strike++;
    }

    public void countBall() {
        this.ball++;
    }

    public boolean isStrike(int index, int indexOfTarget) {
        return index == indexOfTarget;
    }

    public boolean isBall(int index, int indexOfTarget) {
        return index != indexOfTarget && indexOfTarget != -1;
    }

    public boolean isStrikeOut() {
        return strike == STRIKE_OUT_COUNT;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (strike == ZERO && ball == ZERO) {
            return Output.NOTHING;
        }
        if (strike != ZERO) {
            sb.append(strike).append(Output.STRIKE);
        }
        if (ball != ZERO) {
            sb.append(ball).append(Output.BALL);
        }
        return sb.toString();
    }
}
