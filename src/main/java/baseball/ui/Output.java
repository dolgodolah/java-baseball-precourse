package baseball.ui;

public class Output {

    private static String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String VICTORY_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public static void printInputNumberMessage() {
        System.out.println(INPUT_NUMBER_MESSAGE);
    }

    public static void printVictoryMessage() {
        System.out.println(VICTORY_MESSAGE);
    }

    public static void printRestartStatusMessage() {
        System.out.println(RESTART_MESSAGE);
    }
}
