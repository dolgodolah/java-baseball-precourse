package baseball.ui;

import baseball.domain.Result;

public class Output {

    private static String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String VICTORY_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public static final String NOTHING = "낫싱";
    public static final String STRIKE = "스트라이크 ";
    public static final String BALL = "볼";

    public static void printInputNumberMessage() {
        System.out.println(INPUT_NUMBER_MESSAGE);
    }

    public static void printVictoryMessage() {
        System.out.println(VICTORY_MESSAGE);
    }

    public static void printRestartStatusMessage() {
        System.out.println(RESTART_MESSAGE);
    }

    public static void printResult(Result result) {
        System.out.println(result.toString());
    }
}
