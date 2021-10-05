package baseball.domain;

import baseball.ui.Input;
import baseball.ui.Output;

public class BaseballManager {

    private static final String RESTART = "1";
    private static final String EXIT = "2";
    private static final String INPUT_NUMBER_FORMAT = "^[1-9]{3}$";

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

        try {
            validateInputNumber(input);
            Result result = computer.calculateResult(input);
            Output.printResult(result);
            checkVictory(result);
        } catch (IllegalArgumentException e) {
            Output.printErrorMessage();
        }
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
        try {
            validateInputRestartStatus(input);
        } catch (IllegalArgumentException e) {
            Output.printErrorMessage();
        }

        if (input.equals(RESTART)) {
            player.ready();
        }
        if (input.equals(EXIT)) {
            player.exit();
        }
    }

    private void validateInputNumber(String input) {
        if (!input.matches(INPUT_NUMBER_FORMAT)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateInputRestartStatus(String input) {
        if (!input.equals(RESTART) && !input.equals(EXIT)) {
            throw new IllegalArgumentException();
        }
    }
}
