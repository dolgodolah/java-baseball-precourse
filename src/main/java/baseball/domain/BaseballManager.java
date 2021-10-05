package baseball.domain;

import baseball.ui.Input;
import baseball.ui.Output;

public class BaseballManager {

    private static final String RESTART = "1";
    private static final String EXIT = "2";

    private Player player;
    private Computer computer;

    public BaseballManager(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public void run() {
        player.play();
        computer.generateAnswer();

        while (player.isPlay()) {
            playBaseball();
        }
    }

    private void playBaseball() {
        String input = Input.inputNumber();
        Result result = computer.calculateResult(input);
        Output.printResult(result);
        checkVictory(result);
    }

    private void checkVictory(Result result) {
        if (result.isStrikeOut()) {
            player.victory();
            Output.printVictoryMessage();
            askRestartStatus();
        }
    }

    private void askRestartStatus() {
        while (player.isVictory()) {
            String input = Input.inputRestartStatus();
            checkRestartStatus(input);
        }
    }

    private void checkRestartStatus(String input) {
        if (input.equals(RESTART)) {
            player.ready();
        }

        if (input.equals(EXIT)) {
            player.exit();
        }
    }
}
